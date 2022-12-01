package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

public class Test implements ActionListener {
    static JFrame cardGameFrame;
    JPanel deckPanel;
    JPanel playerCardPanel;
    JButton cardDeck;
    JButton playerCardButton;
    ImageIcon cardImage;


    public void cardGameFrame() {
        cardGameFrame = new JFrame();
        cardGameFrame.setSize(1000, 1200);
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

    public void playerCardsPanel() {
        playerCardPanel = new JPanel();
       playerCardPanel.setLayout(new FlowLayout());
        cardGameFrame.add(playerCardPanel, BorderLayout.SOUTH);
        playerCardPanel.setBackground(Color.black);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cardDeck) {

            File cardImagePath = new File("cardImages");
            String[] jpgCard = cardImagePath.list();
            Random randomCard = new Random();
            assert jpgCard != null;
            int randomIndex = randomCard.nextInt(jpgCard.length);
            String selectedCard = jpgCard[randomIndex];
            cardImage = new ImageIcon("cardImages\\" + selectedCard);
            playerCardButton = new JButton(cardImage);
            playerCardPanel.add(playerCardButton);
            playerCardButton.addActionListener(this);
            playerCardButton.setPreferredSize(new Dimension(125, 175));
            cardGameFrame.repaint();
            cardGameFrame.setVisible(true);

            System.out.println(selectedCard);

        }
    }
}







