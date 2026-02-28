module javamod.cli {

    requires javamod.core;
    requires jcommander;
    requires org.slf4j;

    exports javamod.cli;

    opens javamod.cli.parser to jcommander;
}
