package system.ui;

import system.memory.Bodhi;
import system.naming.Name;
import system.ui.listeners.mouse.CustomMouseListener_CloseTabOnClick;

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
        public void stateChanged(ChangeEvent changeEvent)
        {
            JTabbedPane source = (JTabbedPane) changeEvent.getSource();

            Integer index =  source.getSelectedIndex();

            String selected_index =  source.getTitleAt(index);

            if(selected_index.equalsIgnoreCase("+"))
            {
                CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) Bodhi.pull(new Name("//jtabbedpane"));

                jtabbedpane.addTab("TODO", new CustomJPanel___HomePage());

                CustomJButton___CloseTabJButton jbutton;

                jbutton = new CustomJButton___CloseTabJButton();

                //int quo = jtabbedpane.getSelectedIndex();

                //jbutton.addMouseListener(new CustomMouseListener_CloseTabOnClick(index));

                jtabbedpane.setTabComponentAt(index+1, jbutton);

                jtabbedpane.remove(index);

                jtabbedpane.invalidate();

                jtabbedpane.addTab("+", new JPanel());

                //


                //CustomJButton_closetab jbutton;

                //jbutton = new CustomJButton_closetab("");

                //jbutton.addMouseListener(new CustomMouseListener_CloseTabOnClick(jtabbedpane.indexOfTabComponent(jbutton)));

                //jtabbedpane.setTabComponentAt(0, jbutton);
            }
        }
    }
}
