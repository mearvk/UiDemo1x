package system.ui.custom;

import system.memory.Bodhi;
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
        JFrame jframe = (JFrame) Bodhi.pull(new Name("//jframe"));

        int width = jframe.getWidth();

        int height = jframe.getHeight();

        return new Dimension(width-30, height-140);
    }

    public static class CustomChangeListener implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent changeEvent) {

            JTabbedPane source = (JTabbedPane) changeEvent.getSource();

            Integer index =  source.getSelectedIndex();

            String selected_index =  source.getTitleAt(index);

            if(selected_index.equalsIgnoreCase("+"))
            {
                CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) Bodhi.pull(new Name("//jtabbedpane"));

                jtabbedpane.addTab("Text goes here", new CustomJPanel___HomePageJPanel());

                jtabbedpane.setTabComponentAt(index+1, new CustomJButton___CloseTabJButton());

                jtabbedpane.setSelectedIndex(index);

                jtabbedpane.remove(index);

                jtabbedpane.addTab("+", new CustomJPanel___HomePageJPanel());
            }
        }
    }
}
