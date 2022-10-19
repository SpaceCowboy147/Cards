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

    static String cardImage;


    public void cardGameFrame() {
        cardGameFrame = new JFrame();
        cardGameFrame.setSize(700, 500);
        cardGameFrame.setVisible(true);
        cardGameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cardGameFrame.getContentPane().setBackground(Color.DARK_GRAY);
    }


    public void deck() {
        Icon cardBackImg = new ImageIcon("C:\\Users\\dylan\\Documents\\GitHub\\CardGame\\cardImages\\cardDeck-125x175.png");
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
        //  for (int i = 0; i < 5; i++) {
        //  playerCardPanel.add(playerCardButton = new JButton());
//            playerCardButton.addActionListener(this);
//            playerCardButton.setPreferredSize(new Dimension(125, 175));

        playerCardPanel.setLayout(new FlowLayout());
//            playerCardPanel.add(playerCardButton);
        cardGameFrame.add(playerCardPanel, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cardDeck) {
            File cardImagePath = new File("C:\\Users\\dylan\\Documents\\GitHub\\CardGame\\cardImages");
            String[] content = cardImagePath.list();
            System.out.println(content);
            Random randomCard = new Random();
            int randomIndex = randomCard.nextInt(content.length);

            System.out.println(Arrays.toString(content));

            System.out.println(randomIndex);
            playerCardPanel.add(playerCardButton = new JButton(String.valueOf(randomIndex)));
            playerCardButton.addActionListener(this);
            playerCardButton.setPreferredSize(new Dimension(125, 175));
            playerCardPanel.add(playerCardButton);
        }
    }
}




