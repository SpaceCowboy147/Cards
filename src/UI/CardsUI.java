package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class CardsUI implements ActionListener {
    static JFrame cardGameFrame;
    static JPanel deckPanel;
    static JPanel playerCardPanel;
    static JButton cardDeck;
    static JButton playerCardButton;

    static ImageIcon cardImage;


    public void cardGameFrame() {
        cardGameFrame = new JFrame();
        cardGameFrame.setSize(700, 500);
        cardGameFrame.setVisible(true);
        cardGameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cardGameFrame.getContentPane().setBackground(Color.DARK_GRAY);
    }


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
        cardGameFrame.setLayout(new BorderLayout());
        cardGameFrame.add(deckPanel, BorderLayout.NORTH);

    }


    public void playerCards() {
        playerCardPanel = new JPanel();
        playerCardPanel.setLayout(new FlowLayout());
        cardGameFrame.add(playerCardPanel, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cardDeck) {


            File cardImagePath = new File("cardImages");
                String[] jpgCard = cardImagePath.list();
                Random randomCard = new Random();
                int randomIndex = randomCard.nextInt(jpgCard.length);
                String selectedCard = jpgCard[randomIndex];
            Icon cardImg = new ImageIcon("cardImages\\" + selectedCard);
                playerCardButton = new JButton(cardImg);
               playerCardPanel.add(playerCardButton);

                System.out.println(selectedCard);
                playerCardButton.addActionListener(this);
                playerCardButton.setPreferredSize(new Dimension(125, 175));
            }
        }
    }




