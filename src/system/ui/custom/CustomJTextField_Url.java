package system.ui.custom;

import system.memory.Bodhi;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class CustomJTextField_Url extends JTextField
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Bodhi.pull(new Name("//jframe"));

        return new Dimension(jframe.getWidth()-140, 25);
    }

    @Override
    protected void paintBorder(Graphics g)
    {
        g.setColor(getForeground());

        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 10, 5);
    }
}
