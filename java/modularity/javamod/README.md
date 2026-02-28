# javamod

An example of a modular Java-Maven project (Jigsaw + JLink).

# Build

```sh
mvn clean install
```

The `jlink` utility will build a minimal JRE containing only the modules needed by the application.

Result will be placed to the `javamod\javamod.app\target\app-dir`

For convenience, the result will also be packed into an archive `javamod\javamod.app\target\javamod.app-1.0.0-jlink.zip`

> Note: the build is not cross-platform; it will only work on the platform on which it was built.

# Run

After build, open directory `javamod/javamod.app/target/app-dir/bin`

## Run cli version (Windows)

```sh
run-app.bat
```

## Run gui version (Windows)

Double click on `run-app-gui.bat`

# Modules

The application consists of modules:
- `javamod.app` : contains logic of final application
- `javamod.cli` : contains logic of cli version of application
- `javamod.core` : contains core logic of application
- `javamod.gui` : contains logic of gui version of application
