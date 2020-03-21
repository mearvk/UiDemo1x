package system.ui;

import system.memory.Bodhi;
import system.naming.Name;
import system.ui.listeners.mouse.CustomMouseListener_CloseTabOnClick;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomJButton___CloseTabJButton extends JButton
{
    public MouseListener listener = new MouseListener();

    public CustomJButton___CloseTabJButton()
    {
        this.addMouseListener(listener);
    }

    public static class MouseListener implements java.awt.event.MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent mouseEvent)
        {
            CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) Bodhi.pull(new Name("//jtabbedpane"));

            int selected_index = jtabbedpane.getSelectedIndex();

            jtabbedpane.remove(selected_index);
        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {

        }
    }
}
