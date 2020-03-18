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

            JMenuBar jmenubar = (JMenuBar)Memory.ref.instance.pull(new Reference("//jmenubar"));

                JMenu jmenu_file = (JMenu)Memory.ref.instance.pull(new Reference("//jmenu/file"));

                    JMenuItem jmenuitem_file_1 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/file/jmenuitem/1"));

                    JMenuItem jmenuitem_file_2 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/file/jmenuitem/2"));

                JMenu jmenu_edit = (JMenu)Memory.ref.instance.pull(new Reference("//jmenu/edit"));

                    JMenuItem jmenuitem_edit_1 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/edit/jmenuitem/1"));

                    JMenuItem jmenuitem_edit_2 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/edit/jmenuitem/2"));

                JMenu jmenu_view = (JMenu)Memory.ref.instance.pull(new Reference("//jmenu/view"));

                    JMenuItem jmenuitem_view_1 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/view/jmenuitem/1"));

                    JMenuItem jmenuitem_view_2 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/view/jmenuitem/2"));

            JPanel jpanel_top = (JPanel)Memory.ref.instance.pull(new Reference("//jpanel/top"));

                JTextPane jtextpane_url = (JTextPane)Memory.ref.instance.pull(new Reference("//jtextpane/url"));

                JButton jbutton_back = (JButton)Memory.ref.instance.pull(new Reference("//jbutton/back"));

                JButton jbutton_forward = (JButton)Memory.ref.instance.pull(new Reference("//jbutton/forward"));

                JButton jbutton_reload = (JButton)Memory.ref.instance.pull(new Reference("//jbutton/reload"));

                JButton jbutton_halt = (JButton) Memory.ref.instance.pull(new Reference("//jbutton/halt"));

            JPanel jpanel_bottom = (JPanel)Memory.ref.instance.pull(new Reference("//jpanel/bottom"));

                JEditorPane jeditorpane = (JEditorPane)Memory.ref.instance.pull(new Reference("//jeditorpane/html"));
    }
}
