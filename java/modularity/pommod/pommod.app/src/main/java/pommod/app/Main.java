package pommod.app;

public final class Main {

    public static void main(String[] args) {
        if (System.console() != null) {
            startConsoleVersion(args);
        } else {
            startUiVersion(args);
        }
    }

    private static void startConsoleVersion(String[] args) {
        pommod.cli.Main.main(args);
    }

    private static void startUiVersion(String[] args) {
        pommod.gui.Main.main(args);
    }
}
