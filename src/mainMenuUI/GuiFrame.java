package mainMenuUI;

import javax.swing.*;
import java.awt.*;

public class GuiFrame {
    public static JFrame guiFrame = new JFrame();;

   static public void cardGameFrame()  {

        guiFrame.setSize(1000, 1200);
        guiFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        guiFrame.getContentPane().setBackground(Color.DARK_GRAY);
        guiFrame.repaint();
        guiFrame.setVisible(true);

    }
}
