package mainMenuUI;

import GameModes.War.PlayerCardPanel;
import GameModes.War.mainDeck;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static GameModes.War.PlayerCardPanel.playerCardsPanel;
import static mainMenuUI.GuiFrame.cardGameFrame;
import static mainMenuUI.GuiFrame.guiFrame;
import static mainMenuUI.menuPanel.buttonName;
import static mainMenuUI.menuPanel.buttonPanel;

public class MenuButtons implements ActionListener {
    static String[] buttonsNames;
   static JButton button;

   public void buttons() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());


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

                mainDeck mainDeck = new mainDeck();
                mainDeck.deck();
                cardGameFrame();
                playerCardsPanel();
                guiFrame.revalidate();
                guiFrame.repaint();
                guiFrame.repaint();
              //  guiFrame.setVisible(true);




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

