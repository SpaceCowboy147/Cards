package cardGameUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardsUI implements ActionListener{

  static   JFrame cardFrame;
   static JPanel deckPanel;
  static   JPanel playerCardPanel;
 static    JButton cardDeck;
 static    JButton playerCard;

    public void cardFrame()  {

        cardFrame = new JFrame();
        cardFrame.setSize(700, 500);
        cardFrame.setVisible(true);
        cardFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cardFrame.getContentPane().setBackground(Color.DARK_GRAY);


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
        cardFrame.setLayout(new BorderLayout());
        cardFrame.add(deckPanel, BorderLayout.NORTH);

        playerCardPanel = new JPanel();
        playerCard = new JButton();
        playerCardPanel.setLayout(new GridLayout());

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cardDeck) {

            


        }
    }
}
