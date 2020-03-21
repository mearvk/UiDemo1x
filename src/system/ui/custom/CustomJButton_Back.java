package system.ui.custom;

import javax.swing.*;
import java.awt.*;

public class CustomJButton_Back extends JButton
{
    public CustomJButton_Back(ImageIcon imageicon)
    {
        super(imageicon);
    }

    @Override
    protected void paintBorder(Graphics g)
    {
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 5, 5);
    }
}
