package GameModes.War;

import javax.swing.*;
import java.awt.*;

import static mainMenuUI.GuiFrame.guiFrame;

public class PlayerCardPanel {
    static JPanel playerCardPanel;
  static   public void playerCardsPanel() {
        playerCardPanel = new JPanel();
        playerCardPanel.setLayout(new FlowLayout());
        guiFrame.add(playerCardPanel, BorderLayout.SOUTH);
        playerCardPanel.setBackground(Color.black);
    }
}
