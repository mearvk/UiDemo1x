package system.ui.custom;

import system.memory.Bodhi;
import system.naming.Name;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomJButton___CloseTabJButton extends JButton
{
    public Integer index;

    public CustomActionListener listener = new CustomActionListener();

    public CustomJButton___CloseTabJButton()
    {
        this.addActionListener(listener);
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
