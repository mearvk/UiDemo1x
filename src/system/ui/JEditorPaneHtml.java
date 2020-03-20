package system.ui;

import system.memory.Reference;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

public class JEditorPaneHtml extends JEditorPane
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) Reference.pull(new Name("//jframe"));

        int height = jframe.getHeight() - 150;

        int width = jframe.getWidth() - 36;

        return new Dimension(width, height);
    }
}
