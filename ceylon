#!/bin/bash
#
# @author Brent Douglas <brent.n.douglas@gmail.com>
#

path=$PATH
source /etc/init.d/functions
export PATH="${path}"

WORK_DIR="${WORK_DIR-${HOME}/work}"
RETVAL=0

checkout() {
  local VERSION=${1}

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
}

build() {
  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon-common
    ant clean publish
    RETVAL=${?}
  }

  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon.language
    ant clean publish
    RETVAL=${?}
  }

  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon-module-resolver
    ant clean publish
    RETVAL=${?}
  }

  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon-spec
    ant clean publish
    RETVAL=${?}
  }

  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon-runtime
    ant clean publish
    RETVAL=${?}
  }

  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon-compiler
    ant clean publish
    RETVAL=${?}
  }

  if [ $RETVAL -eq 0 ]; then
    success
  else
    failure
  fi
  return $RETVAL
}

test() {
  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon-common
    ant test
    RETVAL=${?}
  }

  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon.language
    ant test
    RETVAL=${?}
  }

  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon-module-resolver
    ant test
    RETVAL=${?}
  }

  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon-spec
    ant test
    RETVAL=${?}
  }

  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon-runtime
    ant test
    RETVAL=${?}
  }

  [ ${RETVAL} -eq 0 ] && {
    cd ${WORK_DIR}/ceylon-compiler
    ant test
    RETVAL=${?}
  }

  if [ $RETVAL -eq 0 ]; then
    success
  else
    failure
  fi
  return $RETVAL
}

CMD="${1}"
shift

case ${CMD} in
  checkout)
    checkout ${1}
    ;;

  build)
    [ -z ${1} ] || checkout ${1}
    build
    ;;

  test)
    [ -z ${1} ] || checkout ${1}
    test
    ;;

  *)
    echo "Usage: $0 { checkout ref | build [ref] | test [ref] }"
    RETVAL=${INVALID_ARGUMENT}
    ;;
esac

echo ""

exit $RETVAL
