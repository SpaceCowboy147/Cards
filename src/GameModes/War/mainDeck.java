package GameModes.War;

import mainMenuUI.GuiFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

import static GameModes.War.PlayerCardPanel.playerCardPanel;
import static mainMenuUI.GuiFrame.guiFrame;

public class mainDeck implements ActionListener {

    static JButton cardDeck;
    static JPanel deckPanel;
    static JButton playerCardButton;

    static ImageIcon cardImage;

   public void deck() {

        Icon cardBackImg = new ImageIcon("cardImages\\cardDeck-125x175.png");
        cardDeck = new JButton(cardBackImg);
        cardBackImg.getIconHeight();
        cardBackImg.getIconWidth();
        cardDeck.setPreferredSize(new Dimension(125, 175));
        cardDeck.addActionListener(this);
        deckPanel = new JPanel();
        deckPanel.setBackground(Color.darkGray);
        deckPanel.setPreferredSize(new Dimension(100, 200));
        deckPanel.add(cardDeck);

        guiFrame.setLayout(new BorderLayout());
        guiFrame.add(deckPanel, BorderLayout.NORTH);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cardDeck) {

            File cardImagePath = new File("cardImages");
            String[] jpgCard = cardImagePath.list();
            Random randomCard = new Random();
            int randomIndex = randomCard.nextInt(jpgCard.length);
            String selectedCard = jpgCard[randomIndex];
            cardImage = new ImageIcon("cardImages\\" + selectedCard);
            playerCardButton = new JButton(cardImage);
            playerCardPanel.add(playerCardButton);
            playerCardButton.addActionListener(this);
            playerCardButton.setPreferredSize(new Dimension(125, 175));
            guiFrame.repaint();
            guiFrame.setVisible(true);

            System.out.println(selectedCard);

        }
    }
}


