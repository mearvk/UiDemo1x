package system.ui;

import system.memory.Reference;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class JTextFieldURL extends JTextField
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Reference.pull(new Name("//jframe"));

        return new Dimension(jframe.getWidth()-320, 25);
    }

    @Override
    protected void paintBorder(Graphics g)
    {
        g.setColor(getForeground());

        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 5, 5);
    }
}
