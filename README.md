# Maven CI-Friendly library management

## Context

The simple calculator library is intended to be built and released using ci/pipelines.

## Maven builds

The Maven CI-Friendly approach is to delegate versioning and releasing to the CI/orchestrator using parameters set in the version property. This approach is not compatible with the maven release plugin.

Semver information is saved and tracked using git tags.

Build the artifact and package it as a snapshot as defined by default in the pom.xml
```shell
$ ./mvnw clean package
```

Build the artifact and package it as a specific SNAPSHOT revision
```shell
$ ./mvnw clean package -Drevision=2.0.0
```

Build the artifact and package it as a specific RELEASE revision
```shell
$ ./mvnw clean package -Drevision=1.0.1 -Dchangelist=
```

Build and Publish (locally) the artifact and package it as a specific RELEASE revision
```shell
$ ./mvnw clean install -Drevision=1.0.1 -Dchangelist=
...
[INFO] --- maven-install-plugin:2.4:install (default-install) @ ci-friendly-lib ---
[INFO] Installing /home/kev/IdeaProjects/ci-friendly-lib/target/ci-friendly-lib-1.0.1.jar to /home/kev/.m2/repository/org/kevvlvl/cifriendly/ci-friendly-lib/1.0.1/ci-friendly-lib-1.0.1.jar
[INFO] Installing /home/kev/IdeaProjects/ci-friendly-lib/.flattened-pom.xml to /home/kev/.m2/repository/org/kevvlvl/cifriendly/ci-friendly-lib/1.0.1/ci-friendly-lib-1.0.1.pom

```
