package monolithjre.cli.processor;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import monolithjre.cli.parser.Options;
import monolithjre.core.handler.DataHandler;

public final class OptionsProcessor {

    private static final Logger LOG = LoggerFactory.getLogger(OptionsProcessor.class);

    public static void process(Options options) {
        if (options.getDataForCalcStat() != null) {
            String[] stringData = options.getDataForCalcStat().split(",");
            double[] convertedData = Arrays.stream(stringData)
                    .map(element -> element.strip())
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            LOG.info("=cli= :\n" + DataHandler.calculateStat(convertedData));
        } else if (options.isCalcRandomStat()) {
            LOG.info("=cli= :\n" + DataHandler.calculateStatForRandom());
        } else if (options.isHelp()) {
            LOG.info(options.getOptionsInfo());
        } else {
            throw new IllegalArgumentException("Unsupported case");
        }
    }

    private OptionsProcessor() {
    }
}
