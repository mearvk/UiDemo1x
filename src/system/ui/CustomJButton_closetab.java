package system.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomJButton_closetab extends JButton
{

    public class ClickListener implements MouseListener,ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {

        }

        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            System.out.println("Mouse Clicked");
        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {
            System.out.println("Mouse Clicked");
        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {
            System.out.println("Mouse Clicked");
        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {
            System.out.println("Mouse Clicked");
        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {
            System.out.println("Mouse Clicked");
        }
    }
}
