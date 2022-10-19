package UI;

import javax.swing.*;
import java.awt.*;

public class Menu {
    JButton selectButtons;
    JPanel buttonPanel;

    public void MainMenu() {

        JFrame mainMenuFrame = new JFrame();
        mainMenuFrame.setVisible(true);
        mainMenuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMenuFrame.setSize(700, 800);

        buttonPanel = new JPanel();
        selectButtons = new JButton();
        buttonPanel.setLayout(new BorderLayout());

            buttonPanel.add(selectButtons);

        mainMenuFrame.add(buttonPanel, BorderLayout.SOUTH);


    }
}