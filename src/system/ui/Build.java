package system.ui;

import system.memory.Memory;
import system.naming.Reference;

import javax.swing.*;

public class Build
{
    public static Build ref;

    public JFrame jframe;

    public JMenuBar jmenubar;

    public JMenu jmenu_file;

    public JMenuItem jmenuitem_file_1;

    public JMenuItem jmenuitem_file_2;

    public JMenu jmenu_edit;

    public JMenuItem jmenuitem_edit_1;

    public JMenuItem jmenuitem_edit_2;

    public JMenu jmenu_view;

    public JMenuItem jmenuitem_view_1;

    public JMenuItem jmenuitem_view_2;

    public JPanel jpanel_top;

    public JTextPane jtextpane_url;

    public JButton jbutton_back;

    public JButton jbutton_forward;

    public JButton jbutton_reload;

    public JButton jbutton_halt;

    public JPanel jpanel_bottom;

    public JEditorPane jeditorpane;

    public Build()
    {
        Build.ref = this;

        Memory.ref.instance.push(new Reference("//build"), this);
    }

    public Build prebuild()
    {
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

        return this;
    }

    public Build build()
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

        //

        this.jmenu_view.add(this.jmenuitem_view_1);

        this.jmenu_view.add(this.jmenuitem_view_2);

        //

        this.jpanel_top.add(this.jtextpane_url);

        this.jpanel_top.add(this.jbutton_back);

        this.jpanel_top.add(this.jbutton_halt);

        this.jpanel_top.add(this.jbutton_reload);

        this.jpanel_top.add(this.jbutton_forward);

        return this;
    }
}

