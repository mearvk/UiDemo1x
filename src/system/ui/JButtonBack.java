package system.ui;

import javax.swing.*;
import java.awt.*;

public class JButtonBack extends JButton
{
    public JButtonBack(ImageIcon imageicon)
    {
        super(imageicon);
    }

    @Override
    protected void paintBorder(Graphics g)
    {
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 5, 5);
    }
}
