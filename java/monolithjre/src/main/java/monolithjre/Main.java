package monolithjre;

import monolithjre.cli.Cli;
import monolithjre.gui.Gui;

public final class Main {

    public static void main(String[] args) {
        if (System.console() != null) {
            Cli.start(args);
        } else {
            Gui.start(args);
        }
    }
}
