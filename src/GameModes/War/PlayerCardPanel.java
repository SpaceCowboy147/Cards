package GameModes.War;

import javax.swing.*;
import java.awt.*;

import static MainMenu.GuiFrame.guiFrame;

public class PlayerCardPanel {
    static JPanel playerCardPanel;
    static JPanel playerSelectedCardPanel;
    static JLabel playerScore;

    static public void playerCardsPanel() {
        playerCardPanel = new JPanel();
        playerCardPanel.setLayout(new FlowLayout());
        guiFrame.add(playerCardPanel, BorderLayout.SOUTH);
        playerCardPanel.setBackground(Color.darkGray);

        playerScore = new JLabel((Icon) playerScore);
        playerScore.setLayout(new BorderLayout());
       guiFrame.add(playerScore, BorderLayout.EAST);

    }

    static public void playerSelectedCardPanel() {
       playerSelectedCardPanel = new JPanel();
        playerSelectedCardPanel.setLayout(new GridLayout(2, 1));
        guiFrame.add(playerSelectedCardPanel, BorderLayout.CENTER);
        playerSelectedCardPanel.setBackground(Color.darkGray);


    }
}
