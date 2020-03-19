package system.ui;

import system.memory.Memory;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class BottomPane extends JPanel
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Memory.pull(new Name("//jframe"));

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
