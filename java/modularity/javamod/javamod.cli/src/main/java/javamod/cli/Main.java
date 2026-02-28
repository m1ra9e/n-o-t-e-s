package javamod.cli;

import javamod.cli.parser.ArgsParser;
import javamod.cli.parser.Options;
import javamod.cli.processor.OptionsProcessor;

public final class Main {

    public static void main(String[] args) {
        // args = new String[] { "--calc-stat", "10.5,12.0,15.2,10.5,18.0,20.1,14.7" };
        // args = new String[] { "--calc-random-stat" };
        // args = new String[] { "--help" };

        Options options = ArgsParser.parse(args);
        OptionsProcessor.process(options);
    }
}
