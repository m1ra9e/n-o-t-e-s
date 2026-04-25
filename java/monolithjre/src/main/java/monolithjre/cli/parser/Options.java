package monolithjre.cli.parser;

import com.beust.jcommander.Parameter;

public final class Options {

    @Parameter(names = { "-cs", "--calc-stat" }, description = "Calculates statistic")
    private String dataForCalcStat;

    @Parameter(names = { "-crs", "--calc-random-stat" }, description = "Calculates random statistic")
    private boolean isCalcRandomStat;

    @Parameter(names = { "-h", "--help" }, description = "Parameters information")
    private boolean isHelp;

    private String optionsInfo;

    public String getDataForCalcStat() {
        return dataForCalcStat;
    }

    public boolean isCalcRandomStat() {
        return isCalcRandomStat;
    }

    public boolean isHelp() {
        return isHelp;
    }

    public void setHelp(boolean isHelp) {
        this.isHelp = isHelp;
    }

    public String getOptionsInfo() {
        return optionsInfo;
    }

    public void setOptionsInfo(String optionsInfo) {
        this.optionsInfo = optionsInfo;
    }
}
