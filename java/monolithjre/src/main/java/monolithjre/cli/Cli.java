package monolithjre.cli;

import monolithjre.cli.parser.ArgsParser;
import monolithjre.cli.parser.Options;
import monolithjre.cli.processor.OptionsProcessor;

public final class Cli {

    public static void start(String[] args) {
        // args = new String[] { "--calc-stat", "10.5,12.0,15.2,10.5,18.0,20.1,14.7" };
        // args = new String[] { "--calc-random-stat" };
        // args = new String[] { "--help" };

        Options options = ArgsParser.parse(args);
        OptionsProcessor.process(options);
    }
}
