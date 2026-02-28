package javamod.core.handler;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class DataHandler {

    private static final Logger LOG = LoggerFactory.getLogger(DataHandler.class);

    private static final String NL = System.lineSeparator();

    public static String calculateStatForRandom() {
        double min = 10.1;
        double max = 100.9;

        Supplier<Double> generateRandomDouble = () -> ThreadLocalRandom
                .current().nextDouble(min, max);

        var data = new double[7];
        for (int i = 0; i < 7; i++) {
            data[i] = generateRandomDouble.get();
        }

        return calculateStat(data);
    }

    public static String calculateStat(double[] data) {
        LOG.info("=core= : calculation starts ...");

        var stats = new DescriptiveStatistics();
        Arrays.stream(data).forEach(stats::addValue);

        var sb = new StringBuilder();
        String stringData = Arrays.stream(data)
                .mapToObj(element -> Double.toString(element))
                .collect(Collectors.joining(","));
        sb.append("Data: ").append(stringData).append(NL).append(NL);
        sb.append("Mean: ").append(stats.getMean()).append(NL);
        sb.append("Median: ").append(stats.getPercentile(50)).append(NL);
        sb.append("Standard deviation: ").append(stats.getStandardDeviation()).append(NL);
        sb.append("Minimum: ").append(stats.getMin()).append(NL);
        sb.append("Maximum: ").append(stats.getMax()).append(NL);

        LOG.info("=core= : calculation succesfully done");
        return sb.toString();
    }

    private DataHandler() {
    }
}
