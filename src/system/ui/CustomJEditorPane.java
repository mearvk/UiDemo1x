package system.ui;

import system.memory.References;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class CustomJEditorPane extends JEditorPane
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) References.pull(new Name("//jframe"));

        int height = jframe.getHeight() - 150;

        int width = jframe.getWidth() - 36;

        return new Dimension(width, height);
    }
}
