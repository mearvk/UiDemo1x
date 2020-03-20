package system.ui;

import system.memory.References;
import system.naming.Name;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.*;

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

            Integer index =  source.getSelectedIndex();

            String selected_index =  source.getTitleAt(index);

            if(selected_index.equalsIgnoreCase("+"))
            {
                CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) References.pull(new Name("//jtabbedpane"));

                jtabbedpane.addTab("TODO", new CustomJPanel_homepage());

                jtabbedpane.setTabComponentAt(index+1, new CustomJButton_closetab());

                jtabbedpane.remove(index);

                jtabbedpane.addTab("+", new JPanel());
            }
        }
    }
}
