package system.ui;

import system.memory.Memory;
import system.naming.Reference;

import javax.swing.*;

public class Builder
{
    public static Builder ref;

    public Builder()
    {
        Builder.ref = this;

        JFrame jframe = (JFrame)Memory.ref.instance.pull(new Reference("//jframe"));

            JPanel jpanel_top = (JPanel)Memory.ref.instance.pull(new Reference("//jpanel/top"));

                Memory.ref.instance.pull(new Reference("//jtextpane/url"));

                Memory.ref.instance.pull(new Reference("//jtextpane/url"));

                Memory.ref.instance.pull(new Reference("//jtextpane/url"));

                Memory.ref.instance.pull(new Reference("//jtextpane/url"));

                Memory.ref.instance.pull(new Reference("//jtextpane/url"));

                Memory.ref.instance.pull(new Reference("//jtextpane/url"));


        Memory.ref.instance.push(new Reference("//jtextpane/url"), new JTextPane());

        Memory.ref.instance.push(new Reference("//jbutton/back"), new JButton("back"));

        Memory.ref.instance.push(new Reference("//jbutton/forward"), new JButton("forward"));

        Memory.ref.instance.push(new Reference("//jbutton/reload"), new JButton("reload"));

        Memory.ref.instance.push(new Reference("//jbutton/halt"), new JButton("halt"));

            JPanel jpanel_bottom = (JPanel)Memory.ref.instance.pull(new Reference("//jpanel/bottom"));

        //

        JMenuBar jmenubar = (JMenuBar)Memory.ref.instance.pull(new Reference("//"));

            JMenu jmenu_file = (JMenu)Memory.ref.instance.pull(new Reference("//jmenu/file"));

                JMenuItem jmenuitem_file_1 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/file/jmenuitem/1"));

                JMenuItem jmenuitem_file_2 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/file/jmenuitem/2"));

            JMenu jmenu_edit = (JMenu)Memory.ref.instance.pull(new Reference("//jmenu/edit"));

                JMenuItem jmenuitem_edit_1 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/edit/jmenuitem/1"));

                JMenuItem jmenuitem_edit_2 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/edit/jmenuitem/2"));

            JMenu jmenu_view = (JMenu)Memory.ref.instance.pull(new Reference("//jmenu/view"));

                JMenuItem jmenuitem_view_1 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/view/jmenuitem/1"));

                JMenuItem jmenuitem_view_2 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/view/jmenuitem/2"));
    }
}
