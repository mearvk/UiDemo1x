package system.ui;

import system.memory.References;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class CustomJPanel_Bottom extends JPanel
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) References.pull(new Name("//jframe"));

        int width = jframe.getWidth();

        int height = jframe.getHeight() * 9 / 10;

        return new Dimension(width, height);
    }

    @Override
    public Dimension getMinimumSize()
    {
        return new Dimension(800,500);
    }

    @Override
    public Dimension getMaximumSize()
    {
        return new Dimension(1920,1200);
    }
}
