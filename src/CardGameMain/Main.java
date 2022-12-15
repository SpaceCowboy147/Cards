package CardGameMain;

import MainMenu.MenuButtons;

import static MainMenu.GuiFrame.cardGameFrame;

import static MainMenu.menuPanel.menuPanel;

public class Main {

    public static void main(String[] args) {
        cardGameFrame();
        menuPanel();
        MenuButtons m = new MenuButtons();
        m.buttons();


    }
}
