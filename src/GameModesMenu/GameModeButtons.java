package GameModesMenu;


import GameModes.War.warGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GameModes.War.PlayerCardPanel.playerCardsPanel;
import static GameModes.War.PlayerCardPanel.playerSelectedCardPanel;
import static GameModesMenu.gameMenuPanels.buttonName;
import static GameModesMenu.gameMenuPanels.buttonPanel;
import static MainMenu.GuiFrame.cardGameFrame;
import static MainMenu.GuiFrame.guiFrame;

public class GameModeButtons implements ActionListener {
    static String[] gameButtonsNames;
    static JButton gameButton;

    public void buttons() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());


        gameButtonsNames = new String[]{"War", "Poker"};
        for (String s : gameButtonsNames) {
            buttonPanel.add(gameButton = new JButton(s));
            gameButton.addActionListener(this);
            gameButton.setPreferredSize(new Dimension(150, 100));
        }
        buttonPanel.setBackground(Color.darkGray);
        buttonPanel.setPreferredSize(new Dimension(500, 500));

        guiFrame.add(buttonPanel, BorderLayout.CENTER);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonName = ((JButton) e.getSource()).getText();
        switch (buttonName) {
            case "War":
                guiFrame.getContentPane().removeAll();
                warGame warGame = new warGame();
                warGame.deck();
                cardGameFrame();
                playerCardsPanel();
                playerSelectedCardPanel();
                warGame playerCards = new warGame();
                guiFrame.revalidate();
                guiFrame.repaint();
                guiFrame.setVisible(true);


                break;
            case "Poker":
        }
    }
}
