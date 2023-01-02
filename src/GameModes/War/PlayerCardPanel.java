package GameModes.War;

import javax.swing.*;
import java.awt.*;

import static MainMenu.GuiFrame.guiFrame;

public class PlayerCardPanel {
    static JPanel playerCardPanel;
    static JPanel playerSelectedCardPanel;

    static public void playerCardsPanel() {
        playerCardPanel = new JPanel();
        playerCardPanel.setLayout(new FlowLayout());
        guiFrame.add(playerCardPanel, BorderLayout.SOUTH);
        playerCardPanel.setBackground(Color.darkGray);
    }

    static public void playerSelectedCardPanel() {
       playerSelectedCardPanel = new JPanel();
        playerCardPanel.setLayout(new GridLayout(2, 1));
        guiFrame.add(playerSelectedCardPanel, BorderLayout.CENTER);
        playerCardPanel.setBackground(Color.darkGray);

    }
}
