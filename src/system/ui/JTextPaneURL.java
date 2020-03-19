package system.ui;

import system.memory.Memory;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class JTextPaneURL extends JTextPane
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Memory.pull(new Name("//jframe"));

        return new Dimension(jframe.getWidth()-280, 20);
    }
}
