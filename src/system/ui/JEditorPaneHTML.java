package system.ui;

import system.memory.Memory;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class JEditorPaneHTML extends JEditorPane
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Memory.pull(new Name("//jframe"));

        int height = jframe.getHeight() - 100;

        int width = jframe.getWidth() - 10;

        return new Dimension(width, height);
    }
}
