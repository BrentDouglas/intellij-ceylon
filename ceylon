#!/bin/bash
#
# @author Brent Douglas <brent.n.douglas@gmail.com>
#

path=$PATH
source /etc/init.d/functions
export PATH="${path}"

GREEN="\033[32m"
RED="\033[31m"
RESET="\033[00m"

WORK_DIR="${WORK_DIR-${HOME}/work}"
CEYLON_REPO="${CEYLON_REPO-${HOME}/.ceylon/repo}"

checkout() {
  local VERSION=${1}
  shift

  echo -e "${GREEN}Checking out ${VERSION}${RESET}"

  cd ${WORK_DIR}

  [ -d ceylon-common ] || {
    git clone git://github.com/ceylon/ceylon-common.git ceylon-common
  }

  [ -d ceylon.language ] || {
    git clone git://github.com/ceylon/ceylon.language.git ceylon.language
  }

  [ -d ceylon-module-resolver ] || {
    git clone git://github.com/ceylon/ceylon-module-resolver.git ceylon-module-resolver
  }

  [ -d ceylon-spec ] || {
    git clone git://github.com/ceylon/ceylon-spec.git ceylon-spec
  }

  [ -d ceylon-runtime ] || {
    git clone git://github.com/ceylon/ceylon-runtime.git ceylon-runtime
  }

  [ -d ceylon-compiler ] || {
    git clone git://github.com/ceylon/ceylon-compiler.git ceylon-compiler
  }

  [ -d ceylon-js ] || {
    git clone git://github.com/ceylon/ceylon-js.git ceylon-js
  }

  [ -d ceylon-dist ] || {
    git clone git://github.com/ceylon/ceylon-dist.git ceylon-dist
  }

  cd ${WORK_DIR}/ceylon-common
  git checkout ${VERSION}

  cd ${WORK_DIR}/ceylon.language
  git checkout ${VERSION}

  cd ${WORK_DIR}/ceylon-module-resolver
  git checkout ${VERSION}

  cd ${WORK_DIR}/ceylon-spec
  git checkout ${VERSION}

  cd ${WORK_DIR}/ceylon-runtime
  git checkout ${VERSION}

  cd ${WORK_DIR}/ceylon-compiler
  git checkout ${VERSION}

  cd ${WORK_DIR}/ceylon-js
  git checkout ${VERSION}

  cd ${WORK_DIR}/ceylon-dist
  git checkout ${VERSION}
}

run-single() {
  local MODULE="${1}"
  shift
  local TARGETS="${@}"

  [ ${RETVAL} -eq 0 ] && {
    echo -e "${GREEN}Running \"ant ${TARGETS}\" for ${MODULE}${RESET}"
    cd ${WORK_DIR}/${MODULE}
    ant ${TARGETS}
    RETVAL=${?}
  }
  [ ${RETVAL} -eq 0 ] || echo -e "${RED}Failed running \"ant ${TARGETS}\" for ${MODULE}${RESET}"
}

build() {
  local LAST=
  echo -e "${GREEN}Building${RESET}"

  run-single ceylon-common clean publish

  run-single ceylon.language clean publish

  run-single ceylon-module-resolver clean publish

  run-single ceylon-spec clean publish

  run-single ceylon-runtime clean publish

  run-single ceylon-compiler clean publish

  run-single ceylon-js clean publish

  run-single ceylon-dist publish-all

  if [ $RETVAL -eq 0 ]; then
    success
  else
    failure
  fi
  return $RETVAL
}

test() {
  echo -e "${GREEN}Testing${RESET}"

  run-single ceylon-common test

  run-single ceylon.language test

  run-single ceylon-module-resolver test

  run-single ceylon-spec test

  run-single ceylon-runtime test

  run-single ceylon-compiler test

  run-single ceylon-js test

  run-single ceylon-dist test

  if [ $RETVAL -eq 0 ]; then
    success
  else
    failure
  fi
  return $RETVAL
}

install-single() {
  local MODULE="${1}"
  shift
  local MAVEN="mvn install:install-file ${@}"

  [ ${RETVAL} -eq 0 ] && {
    echo -e "${GREEN}Running \"${MAVEN}\" for ${MODULE}${RESET}"
    cd ${WORK_DIR}/${MODULE}
    ${MAVEN}
    RETVAL=${?}
  }
  [ ${RETVAL} -eq 0 ] || echo -e "${RED}Failed running \"${MAVEN}\" for ${MODULE}${RESET}"

  return ${RETVAL}
}

install() {
  local VERSION=${1}
  shift

  echo -e "${GREEN}Installing${RESET}"

  install-single ceylon.runtime -Dfile="${CEYLON_REPO}/ceylon/runtime/${VERSION}/ceylon.runtime-${VERSION}.jar" -DgroupId=ceylon -DartifactId=runtime -Dversion=${VERSION} -Dpackaging=jar

  install-single ceylon-common -Dfile="${CEYLON_REPO}/com/redhat/ceylon/common/${VERSION}/com.redhat.ceylon.common-${VERSION}.jar" -DgroupId=com.redhat.ceylon -DartifactId=common -Dversion=${VERSION} -Dpackaging=jar

  install-single ceylon-module-resolver -Dfile="${CEYLON_REPO}/com/redhat/ceylon/module-resolver/${VERSION}/com.redhat.ceylon.module-resolver-${VERSION}.jar" -DgroupId=com.redhat.ceylon -DartifactId=module-resolver -Dversion=${VERSION} -Dpackaging=jar

  install-single ceylon-spec -Dfile="${CEYLON_REPO}/com/redhat/ceylon/typechecker/${VERSION}/com.redhat.ceylon.typechecker-${VERSION}.jar" -DgroupId=com.redhat.ceylon -DartifactId=typechecker -Dversion=${VERSION} -Dpackaging=jar

  install-single ceylon-compiler -Dfile="${CEYLON_REPO}/com/redhat/ceylon/compiler/java/${VERSION}/com.redhat.ceylon.compiler-${VERSION}.jar" -DgroupId=com.redhat.ceylon -DartifactId=compiler -Dversion=${VERSION} -Dpackaging=jar

  install-single ceylon-compiler -Dfile="${CEYLON_REPO}/com/redhat/ceylon/ant/${VERSION}/com.redhat.ceylon.ant-${VERSION}.jar" -DgroupId=com.redhat.ceylon -DartifactId=ant -Dversion=${VERSION} -Dpackaging=jar

  if [ $RETVAL -eq 0 ]; then
    success
  else
    failure
  fi
  return $RETVAL
}

usage() {
  echo "Usage: $0 { [checkout] [build] [install] [test] [ref] }"
}

RETVAL=0

CHECKOUT=1
BUILD=1
INSTALL=1
TEST=1

REF=""

for CMD in "${@}"
do
  case ${CMD} in
    c|checkout)
      CHECKOUT=0
      shift
      ;;
    b|build)
      BUILD=0
      shift
      ;;
    i|install)
      INSTALL=0
      shift
      ;;
    t|test)
      TEST=0
      shift
      ;;
    --)
      shift
      break
      ;;
    *)
      REF=${1}
      shift
      [ -z ${1} ] || {
        usage
        RETVAL=64
        break
      }
      ;;
  esac
done

CHECKED_OUT=1

[ ${RETVAL} -eq 0 ] && [ ${CHECKOUT} -eq 0 ] && {
  [ -n "${REF}" ] || {
    usage
    exit 1
  }
  checkout ${REF}
  RETVAL=${?}
  CHECKED_OUT=0
}

[ ${RETVAL} -eq 0 ] && [ ${CHECKED_OUT} -eq 1 ] && [ -n "${REF}" ] && {
  checkout ${REF}
  RETVAL=${?}
}

[ ${RETVAL} -eq 0 ] && [ ${BUILD} -eq 0 ] && {
  build
  RETVAL=${?}
}

[ ${RETVAL} -eq 0 ] && [ ${TEST} -eq 0 ] && {
  test
  RETVAL=${?}
}

[ ${RETVAL} -eq 0 ] && [ ${INSTALL} -eq 0 ] && {
  [ -n "${REF}" ] || {
    usage
    exit 1
  }
  install ${REF}
  RETVAL=${?}
}

echo ""

exit $RETVAL
