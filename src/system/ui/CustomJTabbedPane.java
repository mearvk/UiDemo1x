package system.ui;

import system.memory.References;
import system.naming.Name;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class CustomJTabbedPane extends JTabbedPane
{
    @Override
    public Dimension getPreferredSize()
    {
        JFrame jframe = (JFrame) References.pull(new Name("//jframe"));

        int width = jframe.getWidth();

        int height = jframe.getHeight();

        return new Dimension(width-30, height-140);
    }

    public static class CustomChangeListener implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent changeEvent)
        {
            JTabbedPane source = (JTabbedPane) changeEvent.getSource();

            String title =  source.getTitleAt(source.getSelectedIndex());

            if(title.equalsIgnoreCase("+"))
            {
                CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) References.pull(new Name("//jtabbedpane"));

                jtabbedpane.addTab("Home Page", new ImageIcon(""), new CustomJEditorPane(), "Tooltip TODO");

                jtabbedpane.addTab("+", new JPanel());
            }
        }
    }
}
