package system.ui;

import system.memory.Memory;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class JPanelBottom extends JPanel
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Memory.pull(new Name("//jframe"));

        int width = jframe.getWidth();

        int height = jframe.getHeight() * 8 / 10;

        System.out.println("Parent: "+getParent());

        return new Dimension(width, height);
    }
}
