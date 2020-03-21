package system.ui.listeners.mouse;

import system.memory.Bodhi;
import system.naming.Name;
import system.ui.custom.CustomJTabbedPane;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomMouseListener_CloseTabOnClick implements MouseListener
{
    public Integer tabindex;

    public CustomMouseListener_CloseTabOnClick(Integer tabindex)
    {
        this.tabindex = tabindex;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent)
    {
        CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) Bodhi.pull(new Name("//jtabbedpane"));

        //

        int tabcount = jtabbedpane.getTabCount();

        //

        if(tabindex==-1) return;

        else
        {
            System.out.println("Removing tab at index "+tabindex);

            //jtabbedpane.removeTabAt(this.tabindex);

            jtabbedpane.remove(this.tabindex);
        }
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
