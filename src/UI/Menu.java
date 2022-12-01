package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    JFrame mainMenuFrame;
    static String[] buttonsNames;
    JButton button;
    JPanel buttonPanel;

    public void frame()  {

        mainMenuFrame = new JFrame();
        mainMenuFrame.setVisible(true);
        mainMenuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMenuFrame.setSize(700, 800);
        mainMenuFrame.getContentPane().setBackground(Color.DARK_GRAY);

        JPanel menuTitlePanel = new JPanel();
        mainMenuFrame.add(menuTitlePanel, BorderLayout.NORTH);
        JLabel menuTitle = new JLabel("Cards: Java Edition");
        menuTitlePanel.add(menuTitle);

    }
    public void buttons() {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.LINE_START;

        buttonsNames = new String[]{"Game modes", "Options", "End Game"};
        for (String s : buttonsNames) {
            buttonPanel.add(button = new JButton(s));
            button.addActionListener(this);
            button.setPreferredSize(new Dimension(150, 100));
        }
            buttonPanel.setBackground(Color.darkGray);
            buttonPanel.setPreferredSize(new Dimension(500, 500));

            mainMenuFrame.add(buttonPanel, BorderLayout.CENTER);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (button.toString().equals("Game modes")) {
    System.out.println("test");

}
    }
}