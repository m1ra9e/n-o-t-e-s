package javamod.app;

public final class Main {

    public static void main(String[] args) {
        if (System.console() != null) {
            startConsoleVersion(args);
        } else {
            startUiVersion(args);
        }
    }

    private static void startConsoleVersion(String[] args) {
        javamod.cli.Main.main(args);
    }

    private static void startUiVersion(String[] args) {
        javamod.gui.Main.main(args);
    }
}
