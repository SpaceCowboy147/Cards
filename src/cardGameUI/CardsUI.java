package cardGameUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class CardsUI implements ActionListener {

    static JFrame cardGameFrame;
    static JPanel deckPanel;
    static JPanel playerCardPanel;
    static JButton cardDeck;
    static JButton playerCardButton;

   ImageIcon[] cardImages;

    public void cardGameFrame() {
        cardGameFrame = new JFrame();
        cardGameFrame.setSize(700, 500);
        cardGameFrame.setVisible(true);
        cardGameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cardGameFrame.getContentPane().setBackground(Color.DARK_GRAY);
    }

    public void deck() {

        Icon cardBackImg = new ImageIcon("C:\\Users\\dylan\\Documents\\GitHub\\CardGame\\cardImages\\cardDeck.png");
        cardDeck = new JButton(cardBackImg);
        cardBackImg.getIconHeight();
        cardBackImg.getIconWidth();
        cardDeck.setPreferredSize(new Dimension(125, 175));
        cardDeck.addActionListener(this);
        deckPanel = new JPanel();
        deckPanel.setBackground(Color.darkGray);
        deckPanel.setPreferredSize(new Dimension(100, 200));
        deckPanel.add(cardDeck);
        cardGameFrame.setLayout(new BorderLayout());
        cardGameFrame.add(deckPanel, BorderLayout.NORTH);
    }

    public void playerCards() {
        playerCardPanel = new JPanel();
        for (int i = 0; i < 5; i++) {
            playerCardPanel.add(playerCardButton = new JButton());
            playerCardButton.addActionListener(this);
            playerCardButton.setPreferredSize(new Dimension(125, 175));
        }
        playerCardPanel.setLayout(new GridLayout(1, 5, 20, 20));
        playerCardPanel.add(playerCardButton);
        cardGameFrame.add(playerCardPanel, BorderLayout.SOUTH);

  //    cardImages = new ImageIcon[] ("C:\\Users\\dylan\\Documents\\GitHub\\CardGame\\cardImages\\");
        for (int i = 0; i < 52; i++) {
            cardImages = new ImageIcon[i];

        }

        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cardDeck) {
            playerCardButton.add(pla)
            Random randomCard = new Random();
            for (int i = 0; i < 52; i++) {

              int randomCardIndex = randomCard.nextInt();
                Icon playerCardImg = new ImageIcon("C:\\Users\\dylan\\Documents\\GitHub\\CardGame\\cardImages");

                playerCardButton = new JButton(playerCardImg);
            }
        }
    }
}
