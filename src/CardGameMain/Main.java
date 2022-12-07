package CardGameMain;

import mainMenuUI.MenuButtons;

import static mainMenuUI.GuiFrame.cardGameFrame;

import static mainMenuUI.menuPanel.menuPanel;

public class Main {

    public static void main(String[] args) {
        cardGameFrame();
        menuPanel();
        MenuButtons m = new MenuButtons();
        m.buttons();


    }
}
