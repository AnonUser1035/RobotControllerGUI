import java.io.File;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Frame {
    JFrame frame;
    public Frame() {
        frame = new JFrame("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2770, 1440);
        try {
            ImageIcon img = new ImageIcon(ImageIO.read(new File("FRC 2020 Field Top.png")));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    } 

    public void updateFrame() {
        frame.setVisible(true);
    }
}
