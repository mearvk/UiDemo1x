package system.ui;

import system.memory.Memory;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class JPanelTop extends JPanel
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame)Memory.pull(new Name("//jframe"));

        int width = jframe.getWidth();

        int height = jframe.getHeight() * 1 / 10;

        System.out.println("Parent: "+getParent());

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
