# pommod

An example of a modular Maven project.

# Build

```sh
mvn clean package
```

# Run

After build, open directory `pommod/pommod.app/target`

## Run cli version

```sh
java -jar pommod.app-1.0.0.jar
```

## Run gui version

Double click on `pommod.app-1.0.0.jar`

# Modules

The application consists of modules:
- `pommod.app` : contains logic of final application
- `pommod.cli` : contains logic of cli version of application
- `pommod.core` : contains core logic of application
- `pommod.gui` : contains logic of gui version of application
