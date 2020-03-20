package system.ui;

import javax.swing.*;
import java.awt.*;

public class CustomJButton_Forward extends JButton
{
    public CustomJButton_Forward(ImageIcon imageicon)
    {
        super(imageicon);
    }

    @Override
    protected void paintBorder(Graphics g)
    {
        g.setColor(getForeground());

        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 5, 5);
    }
}
