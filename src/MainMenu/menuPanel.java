package MainMenu;

import javax.swing.*;
import java.awt.*;

import static MainMenu.GuiFrame.guiFrame;

public class menuPanel {
    static JPanel buttonPanel;
    static String buttonName;

    public static void menuPanel() {
        JPanel menuTitlePanel = new JPanel();
        guiFrame.add(menuTitlePanel, BorderLayout.NORTH);
        JLabel menuTitle = new JLabel("Cards: Java Edition");
        menuTitlePanel.add(menuTitle);
    }
}