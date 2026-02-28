package javamod.cli.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import javamod.cli.utils.AppInfo;

public final class ArgsParser {

    private static final Logger LOG = LoggerFactory.getLogger(ArgsParser.class);

    public static Options parse(String[] inputDataArray) {
        var options = new Options();

        JCommander jCommander = JCommander.newBuilder()
                .programName(AppInfo.getNameAndVersion())
                .addObject(options)
                .build();

        String helpText = generateHelpText(jCommander);

        try {
            jCommander.parse(inputDataArray);
            options.setOptionsInfo(helpText);
            if (inputDataArray.length == 0) {
                options.setHelp(true);
            }
        } catch (ParameterException e) {
            LOG.error(e.getMessage() + helpText);
            // throw e;
            System.exit(1);
        }

        return options;
    }

    private static String generateHelpText(JCommander jCommander) {
        var sb = new StringBuilder();
        jCommander.usage(sb);
        return sb.toString();
    }

    private ArgsParser() {
    }
}
