package javamod.cli.utils;

import java.util.Properties;

import org.slf4j.LoggerFactory;

public enum AppInfo {

    INSTANCE;

    private static final String PROPERTIES_FILE_PATH = "/app.properties";
    private static final String NAME_KEY = "app.name";
    private static final String VERSION_KEY = "app.version";

    private static final String DEFAULT_APP_NAME = "=JAVAMOD_CLI=";
    private static final String DEFAULT_APP_VERSION = "UNKNOWN";

    private static final String NAME_AND_VERSION_TEMPLATE = "%s v%s";

    private final String nameAndVersion;

    private AppInfo() {
        String name = DEFAULT_APP_NAME;
        String version = DEFAULT_APP_VERSION;

        try (var inputStream = getClass().getResourceAsStream(PROPERTIES_FILE_PATH)) {
            if (inputStream != null) {
                var props = new Properties();
                props.load(inputStream);
                name = props.getProperty(NAME_KEY, DEFAULT_APP_NAME);
                version = props.getProperty(VERSION_KEY, DEFAULT_APP_VERSION);
            }
        } catch (Exception e) {
            LoggerFactory.getLogger(AppInfo.class).error(e.getMessage());
        }

        nameAndVersion = NAME_AND_VERSION_TEMPLATE.formatted(name, version);
    }

    public static String getNameAndVersion() {
        return INSTANCE.nameAndVersion;
    }
}
