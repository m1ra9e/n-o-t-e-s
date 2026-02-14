package pommod.cli;

import pommod.cli.parser.ArgsParser;
import pommod.cli.parser.Options;
import pommod.cli.processor.OptionsProcessor;

public final class Main {

    public static void main(String[] args) {
        // args = new String[] { "--calc-stat", "10.5,12.0,15.2,10.5,18.0,20.1,14.7" };
        // args = new String[] { "--calc-random-stat" };
        // args = new String[] { "--help" };

        Options options = ArgsParser.parse(args);
        OptionsProcessor.process(options);
    }
}
