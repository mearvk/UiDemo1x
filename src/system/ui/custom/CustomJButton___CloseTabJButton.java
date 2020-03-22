package system.ui.custom;

import system.memory.Bodhi;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomJButton___CloseTabJButton extends JButton
{
    public Integer index;

    public CustomActionListener listener = new CustomActionListener();

    public CustomJButton___CloseTabJButton()
    {
        this.addActionListener(listener);

        setPreferredSize(new Dimension(17,17));

        setToolTipText("Close this tab");

        setContentAreaFilled(false);
    }

    //paint the cross
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        //shift the image for pressed buttons
        if (getModel().isPressed()) {
            g2.translate(1, 1);
        }
        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.BLACK);
        if (getModel().isRollover()) {
            g2.setColor(Color.MAGENTA);
        }
        int delta = 6;
        g2.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta - 1);
        g2.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta - 1);
        g2.dispose();
    }

    public class CustomActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent actionEvent)
        {
            CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) Bodhi.pull(new Name("//jtabbedpane"));

            int closureindex = jtabbedpane.indexOfTabComponent(CustomJButton___CloseTabJButton.this);

            int selectedtabindex = jtabbedpane.getSelectedIndex();

            int tabcount = jtabbedpane.getTabCount();

            //int tabcount2 = jtabbedpane.getTabRunCount();

            System.out.println("ClosureIndex "+closureindex);

            System.out.println("SelectedTabIndex "+selectedtabindex);

            //System.out.println("Tabcount 2"+tabcount2+"\n");

            if(closureindex != -1)
            {
                jtabbedpane.setSelectedIndex(closureindex);

                jtabbedpane.removeTabAt(closureindex);

                jtabbedpane.invalidate();

                jtabbedpane.revalidate();

                System.out.println("Tabcount "+tabcount);
            }
        }
    }
}
