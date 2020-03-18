package system.ui;

import system.memory.Memory;
import system.naming.Reference;

import javax.swing.*;

public class Builder
{
    public static Builder ref;

    JFrame jframe;

        JMenuBar jmenubar;

            JMenu jmenu_file;

                JMenuItem jmenuitem_file_1;

                JMenuItem jmenuitem_file_2;

            JMenu jmenu_edit;

                JMenuItem jmenuitem_edit_1;

                JMenuItem jmenuitem_edit_2;

            JMenu jmenu_view;

                JMenuItem jmenuitem_view_1;

                JMenuItem jmenuitem_view_2;

        JPanel jpanel_top;

            JTextPane jtextpane_url;

            JButton jbutton_back;

            JButton jbutton_forward;

            JButton jbutton_reload;

            JButton jbutton_halt;

        JPanel jpanel_bottom;

            JEditorPane jeditorpane;

    public Builder()
    {
        Builder.ref = this;

        this.jframe = (JFrame)Memory.ref.instance.pull(new Reference("//jframe"));

        this.jmenubar = (JMenuBar)Memory.ref.instance.pull(new Reference("//jmenubar"));

        this.jmenu_file = (JMenu)Memory.ref.instance.pull(new Reference("//jmenu/file"));

        this.jmenuitem_file_1 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/file/jmenuitem/1"));

        this.jmenuitem_file_2 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/file/jmenuitem/2"));

        this.jmenu_edit = (JMenu)Memory.ref.instance.pull(new Reference("//jmenu/edit"));

        this.jmenuitem_edit_1 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/edit/jmenuitem/1"));

        this.jmenuitem_edit_2 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/edit/jmenuitem/2"));

        this.jmenu_view = (JMenu)Memory.ref.instance.pull(new Reference("//jmenu/view"));

        this.jmenuitem_view_1 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/view/jmenuitem/1"));

        this.jmenuitem_view_2 = (JMenuItem)Memory.ref.instance.pull(new Reference("//jmenu/view/jmenuitem/2"));

        this.jpanel_top = (JPanel)Memory.ref.instance.pull(new Reference("//jpanel/top"));

        this.jtextpane_url = (JTextPane)Memory.ref.instance.pull(new Reference("//jtextpane/url"));

        this.jbutton_back = (JButton)Memory.ref.instance.pull(new Reference("//jbutton/back"));

        this.jbutton_forward = (JButton)Memory.ref.instance.pull(new Reference("//jbutton/forward"));

        this.jbutton_reload = (JButton)Memory.ref.instance.pull(new Reference("//jbutton/reload"));

        this.jbutton_halt = (JButton) Memory.ref.instance.pull(new Reference("//jbutton/halt"));

        this.jpanel_bottom = (JPanel)Memory.ref.instance.pull(new Reference("//jpanel/bottom"));

        this.jeditorpane = (JEditorPane)Memory.ref.instance.pull(new Reference("//jeditorpane/html"));
    }

    public Builder build()
    {
        this.jframe.add(this.jpanel_top);

        this.jframe.add(this.jpanel_bottom);

        this.jframe.setJMenuBar(this.jmenubar);

        //

        this.jmenubar.add(this.jmenu_file);

        this.jmenubar.add(this.jmenu_edit);

        this.jmenubar.add(this.jmenu_view);

        //

        this.jmenu_file.add(this.jmenuitem_file_1);

        this.jmenu_file.add(this.jmenuitem_file_2);

        //

        this.jmenu_edit.add(this.jmenuitem_edit_1);

        this.jmenu_edit.add(this.jmenuitem_edit_2);

        return this;
    }
}
