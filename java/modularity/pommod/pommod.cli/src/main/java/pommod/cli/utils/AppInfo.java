package pommod.cli.utils;

import java.util.function.BiFunction;

public enum AppInfo {

    INSTANCE;

    private static final String DEFAULT_APP_NAME = "=HOMMOD_CLI=";
    private static final String DEFAULT_APP_VERSION = "UNKNOWN";

    private static final String NAME_AND_VERSION_TEMPLATE = "%s v%s";

    private final String nameAndVersion;

    private AppInfo() {
        BiFunction<String, String, String> getSafeVal = (val, def) -> val != null ? val : def;
        Package pkg = getClass().getPackage();

        String name = getSafeVal.apply(pkg.getImplementationTitle(), DEFAULT_APP_NAME);
        String version = getSafeVal.apply(pkg.getImplementationVersion(), DEFAULT_APP_VERSION);

        nameAndVersion = NAME_AND_VERSION_TEMPLATE.formatted(name, version);
    }

    public static String getNameAndVersion() {
        return INSTANCE.nameAndVersion;
    }
}
