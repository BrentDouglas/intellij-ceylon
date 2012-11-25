Ceylon Intellij Plugin
======================

The start of an intellij IDEA plugin for the [Ceylon language](http://ceylon-lang.org/) based on
the excellent Groovy plugin supplied with the community edition of IDEA.

# Dependencies

You will need ant to build the ceylon repo's and to build the
intellij-community repo. You will also need maven to build this project.

## Local settings

Run `cp vars.default vars` and then edit the file `vars` so the
variables are correect for your enviroments.

## Ceylon

Before building you will probably want to checkout and build the ceylon
repositories. They are not needed currently but will be eventually. You
can checkout the various ceylon repo's and build them in various language
levels using the script `ceylon` which will checkout and install the
ceylon modules at tagged versions into your maven repository. e.g.

`./ceylon build install 0.4`

You will want to run this for 0.1, 0.2, 0.3 and 0.4. The provided
parameters should be altered to suit your system. The default values are
provided above.

## Idea

You then need to install the idea jars into your maven repo.

`./idea install 11.1.4`

This will install the nessesary jars pulled from `IDEA_HOME` with the version
provided.

## Lexer

Lastly you need to build the lexer. You will need a copy of the
intellij-community repository. Then run the script `lexer`.

`./lexer`

# Building

After instaling the above components you can build this plugin with
maven.

`mvn clean install`

# Tests

The following JVM arg needs to be added to run the parser tests

`-Didea.platform.prefix=Idea`

Which you can set in the idea test configuration section.
