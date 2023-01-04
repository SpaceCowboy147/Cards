package GameModes.War;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static GameModes.War.PlayerCardPanel.playerCardPanel;

import static GameModes.War.PlayerCardPanel.playerSelectedCardPanel;
import static MainMenu.GuiFrame.guiFrame;

public class warGame implements ActionListener {

    JButton cardDeck;
    JButton playerCardButton;
    JPanel deckPanel;
    JLabel playerSelectedCard;
    String[] jpgCardImagePath;
    ImageIcon cardImage;
    List<String> deckOfCards = new ArrayList<>();
    ArrayList<String> playerCards = new ArrayList<>();
    Random randomCard = new Random();

    public void deck() {
        Icon cardBackImg = new ImageIcon("cardImages\\cardDeck-125x175.png");
        cardDeck = new JButton(cardBackImg);
        cardBackImg.getIconHeight();
        cardBackImg.getIconWidth();
        cardDeck.setPreferredSize(new Dimension(125, 175));
        deckPanel = new JPanel();
        deckPanel.setBackground(Color.darkGray);
        deckPanel.setPreferredSize(new Dimension(100, 200));
        deckPanel.add(cardDeck);
        guiFrame.setLayout(new BorderLayout());
        guiFrame.add(deckPanel, BorderLayout.NORTH);
        File cardImagePath = new File("cardImages");
        jpgCardImagePath = cardImagePath.list();
        assert jpgCardImagePath != null;
        Collections.addAll(deckOfCards, jpgCardImagePath);
        deckOfCards.remove("cardDeck-125x175.png");
        deckOfCards.remove("black_joker-125x175.png");
        deckOfCards.remove("red_joker-125x175.png");
        cardDeck.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //SPLIT DECK BETWEEN TWO PLAYERS.
        if (e.getSource() == cardDeck) {
            String selectedCard = null;
            for (int i = 0; i <= deckOfCards.size(); i++) {
                if (playerCards.size() < 26) {
                    int randomIndex = randomCard.nextInt(deckOfCards.size());
                    selectedCard = deckOfCards.get(randomIndex);
                    playerCards.add(selectedCard);
                    deckOfCards.remove(selectedCard);
                }
            }

            cardImage = new ImageIcon("cardImages\\cardDeck-125x175.png");
            playerCardButton = new JButton(cardImage);
            playerCardPanel.add(playerCardButton);
            playerCardButton.addActionListener(this);
            playerCardButton.setPreferredSize(new Dimension(125, 175));
            guiFrame.repaint();
            guiFrame.setVisible(true);

        }

        //PLAYER CARD FUNCTIONALITY
        if (e.getSource() == playerCardButton) {

            String selectedCard = null;
            playerSelectedCardPanel();
            for (int i = playerCards.size(); i > 0; i--) {
                int randomIndex = randomCard.nextInt(playerCards.size());
                selectedCard = playerCards.get(randomIndex);
            }
            playerCards.remove(selectedCard);
            cardImage = new ImageIcon("cardImages\\" + selectedCard);
            playerSelectedCard = new JLabel(cardImage);
            playerSelectedCard.setPreferredSize(new Dimension(125, 175));
            playerSelectedCardPanel.remove(playerSelectedCard);
            playerSelectedCardPanel.add(playerSelectedCard);
            guiFrame.setVisible(true);

            System.out.println(selectedCard);
            System.out.println(playerCards.size());


            //AI SELECTCARD
         //   String selectedAICard = null;

            for (int i = deckOfCards.size(); i > 0; i--) {
                    int randomIndex = randomCard.nextInt(deckOfCards.size());
                    selectedCard = deckOfCards.get(randomIndex);
                }
            

            deckOfCards.remove(selectedCard);
            cardImage = new ImageIcon("cardImages\\" + selectedCard);
            playerSelectedCard = new JLabel(cardImage);
            playerSelectedCard.setPreferredSize(new Dimension(125, 175));
            playerSelectedCardPanel.remove(playerSelectedCard);
            playerSelectedCardPanel.add(playerSelectedCard);
            guiFrame.setVisible(true);

        }

    }
}






