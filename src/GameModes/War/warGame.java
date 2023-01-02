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

    static JButton cardDeck;
    static JPanel deckPanel;
    static JButton playerCardButton;
    String[] jpgCard;

    static ImageIcon cardImage;
    static List<String> deckOfCards = new ArrayList<>();
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
        jpgCard = cardImagePath.list();
        assert jpgCard != null;
        Collections.addAll(deckOfCards, jpgCard);
        deckOfCards.remove("cardDeck-125x175.png");
        deckOfCards.remove("black_joker-125x175.png");
        deckOfCards.remove("red_joker-125x175.png");
        cardDeck.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //SPLIT DECK BETWEEN TWO PLAYERS.
        if (e.getSource() == cardDeck) {
           // Random randomCard = new Random();
            String selectedCard = null;
            for (int i = 0; i <= deckOfCards.size(); i++) {
                if (playerCards.size() < 26) {
                    int randomIndex = randomCard.nextInt(deckOfCards.size());
                    selectedCard = deckOfCards.get(randomIndex);
                    playerCards.add(selectedCard);
                    deckOfCards.remove(selectedCard);
                }
            }
            System.out.println(playerCards.toString());
            System.out.println(playerCards.size());
            System.out.println(deckOfCards.toString());
            System.out.println(deckOfCards.size());
            cardImage = new ImageIcon("cardImages\\cardDeck-125x175.png"); //+ selectedCard);
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
            for (int i = 0; i <= playerCards.size(); i++) {
                int randomIndex = randomCard.nextInt(playerCards.size());
                cardImage = new ImageIcon("cardImages\\" + selectedCard);
                playerCardButton = new JButton(cardImage);
                playerSelectedCardPanel();
                playerSelectedCardPanel.add(playerCardButton);
                guiFrame.repaint();
                guiFrame.setVisible(true);
                selectedCard = playerCards.get(randomIndex);
            }
            }
        }
    }

