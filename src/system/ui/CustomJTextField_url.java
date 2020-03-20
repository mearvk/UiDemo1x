package system.ui;

import system.memory.References;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class CustomJTextField_url extends JTextField
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) References.pull(new Name("//jframe"));

        return new Dimension(jframe.getWidth()-140, 25);
    }

    @Override
    protected void paintBorder(Graphics g)
    {
        g.setColor(getForeground());

        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 5, 5);
    }
}
