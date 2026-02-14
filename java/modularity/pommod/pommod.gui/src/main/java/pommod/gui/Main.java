package pommod.gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import pommod.core.handler.DataHandler;

public final class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            var frame = new JFrame("pommod");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 200);

            var textArea = new JTextArea(DataHandler.calculateStatForRandom());
            textArea.setFont(new Font("SansSerif", Font.PLAIN, 20));
            textArea.setEditable(false);
            textArea.setOpaque(false);
            frame.add(new JScrollPane(textArea));

            frame.setLocationRelativeTo(null);

            frame.setVisible(true);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
