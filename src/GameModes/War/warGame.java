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
    static JLabel playerSelectedCard;
    String[] jpgCardImagePath;
    ImageIcon cardImage;
    static List<String> deckOfCards = new ArrayList<>();

    ArrayList<String> playerCards = new ArrayList<>();
    Random randomCard = new Random();
    int aiCardValue;
    int playerCardValue;
    int playerScore;
    int aiScore;
    int turns;

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
            //    System.out.println(selectedCard);
            //  System.out.println(playerCards.size());


            //AI SELECT CARD
            String selectedAICard = null;
            for (int i = deckOfCards.size(); i > 0; i--) {
                int randomIndex = randomCard.nextInt(deckOfCards.size());
                selectedAICard = deckOfCards.get(randomIndex);
            }
            deckOfCards.remove(selectedAICard);
            cardImage = new ImageIcon("cardImages\\" + selectedAICard);
            playerSelectedCard = new JLabel(cardImage);
            playerSelectedCard.setPreferredSize(new Dimension(125, 175));
            playerSelectedCardPanel.remove(playerSelectedCard);
            playerSelectedCardPanel.add(playerSelectedCard);
            guiFrame.setVisible(true);

            assert selectedCard != null;

            if (selectedCard.contains("2_of")) {
                playerCardValue = 2;
            } else if (selectedCard.contains("3_of")) {
                playerCardValue = 3;
            } else if (selectedCard.contains("4_of")) {
                playerCardValue = 4;
            } else if (selectedCard.contains("5_of")) {
                playerCardValue = 5;
            } else if (selectedCard.contains("6_of")) {
                playerCardValue = 6;
            } else if (selectedCard.contains("7_of")) {
                playerCardValue = 7;
            } else if (selectedCard.contains("8_of")) {
                playerCardValue = 8;
            } else if (selectedCard.contains("9_of")) {
                playerCardValue = 9;
            } else if (selectedCard.contains("10_of")) {
                playerCardValue = 10;
            } else if (selectedCard.contains("jack_of")) {
                playerCardValue = 11;
            } else if (selectedCard.contains("king_of")) {
                playerCardValue = 12;
            } else if (selectedCard.contains("queen_of")) {
                playerCardValue = 12;
            } else if (selectedCard.contains("ace_of")) {
                playerCardValue = 13;

            }


            assert selectedAICard != null;
            if (selectedAICard.contains("2_of")) { //|| selectedAICard.contains("2_of")) {
                aiCardValue = 2;
            } else if (selectedAICard.contains("3_of")) {
                aiCardValue = 3;
            } else if (selectedAICard.contains("4_of")) {
                aiCardValue = 4;
            } else if (selectedAICard.contains("5_of")) {
                aiCardValue = 5;
            } else if (selectedAICard.contains("6_of")) {
                aiCardValue = 6;
            } else if (selectedAICard.contains("7_of")) {
                aiCardValue = 7;
            } else if (selectedAICard.contains("8_of")) {
                aiCardValue = 8;
            } else if (selectedAICard.contains("9_of")) {
                aiCardValue = 9;
            } else if (selectedAICard.contains("10_of")) {
                aiCardValue = 10;
            } else if (selectedAICard.contains("jack_of")) {
                aiCardValue = 11;
            } else if (selectedAICard.contains("king_of")) {
                aiCardValue = 12;
            } else if (selectedAICard.contains("queen_of")) {
                aiCardValue = 12;
            } else if (selectedAICard.contains("ace_of")) {
                aiCardValue = 13;
            }

           // System.out.println("\n" + "ai card value:" + " " + aiCardValue + " \n " + "player card" + " " + playerCardValue);
        }

        if (playerCardValue > aiCardValue) {
            playerScore++;
        } else if (playerCardValue < aiCardValue) {
            aiScore++;
        }
        if (playerCardValue == aiCardValue) {

        }
        System.out.println("ai score " + " " + aiScore + " \n" + "player score: " + playerScore);


        for (int turns = 0; turns <= 27; turns++ ) {

        }
        turns++;
        System.out.println(turns);
        if (turns == 27 && playerScore < aiScore) {
            System.out.println("You lost ya loser");
        }
        if (turns == 27 && playerScore > aiScore) {
            System.out.println("You beat a program. Congratulations!");

        }
        if (turns == 27 && playerScore == aiScore) {
            System.out.println("Draw! Guess we have to do a high noon showdown");
        }
    }
}



















