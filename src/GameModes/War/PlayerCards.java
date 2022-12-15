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
import static GameModes.War.mainDeck.cardDeck;
import static GameModes.War.mainDeck.playerCardButton;
import static MainMenu.GuiFrame.guiFrame;

public class PlayerCards implements ActionListener {
    static ImageIcon cardImage;
    String[] jpgCard;
    List<String> deckOfCards = new ArrayList<>();
    ArrayList<String> playerCards = new ArrayList<>();
    public void warGameCardDeck() {
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
        if (e.getSource() == cardDeck) {
            Random randomCard = new Random();
            String selectedCard = null;

            for (int i = 0; i <= deckOfCards.size(); i++) {
                int randomIndex = randomCard.nextInt(deckOfCards.size());
                selectedCard = deckOfCards.get(randomIndex);

                playerCards.add(selectedCard);
                deckOfCards.remove(randomIndex);

            }
            cardImage = new ImageIcon("cardImages\\" + selectedCard);
            playerCardButton = new JButton(cardImage);
            playerCardPanel.add(playerCardButton);
            playerCardButton.addActionListener(this);
            playerCardButton.setPreferredSize(new Dimension(125, 175));
            guiFrame.repaint();
            guiFrame.setVisible(true);

          System.out.println(deckOfCards);

        }
    }
}