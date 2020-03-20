package system.ui;

import system.memory.Reference;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class JPanelTop extends JPanel
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Reference.pull(new Name("//jframe"));

        int width = jframe.getWidth();

        int height = 50;

        return new Dimension(width, height);
    }

    @Override
    public Dimension getMinimumSize()
    {
        return new Dimension(800,100);
    }

    @Override
    public Dimension getMaximumSize()
    {
        return new Dimension(1920,1200);
    }
}
