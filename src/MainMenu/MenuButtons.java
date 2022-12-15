package MainMenu;

import GameModes.War.mainDeck;
import GameModesMenu.GameModeButtons;
import GameModesMenu.gameMenuPanels;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static GameModes.War.PlayerCardPanel.playerCardsPanel;
import static MainMenu.GuiFrame.cardGameFrame;
import static MainMenu.GuiFrame.guiFrame;
import static MainMenu.menuPanel.buttonName;
import static MainMenu.menuPanel.buttonPanel;

public class MenuButtons extends Container implements ActionListener {
    static String[] buttonsNames;
   static JButton button;

   public void buttons() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));



        buttonsNames = new String[]{"Game modes", "Options", "End Game"};
        for (String s : buttonsNames) {
            buttonPanel.add(button = new JButton(s));
            button.addActionListener(this);
            button.setPreferredSize(new Dimension(150, 100));
        }
        buttonPanel.setBackground(Color.darkGray);
        buttonPanel.setPreferredSize(new Dimension(500, 500));

        guiFrame.add(buttonPanel, BorderLayout.CENTER);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        buttonName = ((JButton) e.getSource()).getText();
        switch (buttonName) {
            case "Game modes":

                guiFrame.getContentPane().removeAll();
                gameMenuPanels.menuPanel();
                GameModeButtons gameModeButtons = new GameModeButtons();
                gameModeButtons.buttons();
                guiFrame.revalidate();
                guiFrame.repaint();
                guiFrame.setVisible(true);


                break;
            case "Options":

                break;
            case "End Game":

                break;
        }
    }
}

