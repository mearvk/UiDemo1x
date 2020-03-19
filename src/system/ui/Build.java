package system.ui;

import system.memory.Memory;
import system.naming.Name;

import javax.swing.*;
import java.awt.*;

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

        Memory.push(new Name("//build"), this);
    }

    public Build prebuild()
    {
        Memory.push(new Name("//jframe"), new JFrame());

        Memory.push(new Name("//jpanel/top"), new JPanelTop());

        Memory.push(new Name("//jpanel/bottom"), new JPanelBottom());

        Memory.push(new Name("//jmenubar"), new JMenuBar());

        Memory.push(new Name("//jmenu/file"), new JMenu("File"));

        Memory.push(new Name("//jmenu/file/jmenuitem/1"), new JMenu("Item 1"));

        Memory.push(new Name("//jmenu/file/jmenuitem/2"), new JMenu("Item 2"));

        Memory.push(new Name("//jmenu/edit"), new JMenu("Edit"));

        Memory.push(new Name("//jmenu/edit/jmenuitem/1"), new JMenu("Item 1"));

        Memory.push(new Name("//jmenu/edit/jmenuitem/2"), new JMenu("Item 2"));

        Memory.push(new Name("//jmenu/view"), new JMenu("View"));

        Memory.push(new Name("//jmenu/view/jmenuitem/1"), new JMenu("Item 1"));

        Memory.push(new Name("//jmenu/view/jmenuitem/2"), new JMenu("Item 2"));

        Memory.push(new Name("//jtextpane/url"), new JTextPane());

        Memory.push(new Name("//jbutton/back"), new JButton("back"));

        Memory.push(new Name("//jbutton/forward"), new JButton("forward"));

        Memory.push(new Name("//jbutton/reload"), new JButton("reload"));

        Memory.push(new Name("//jbutton/halt"), new JButton("halt"));

        //

        this.jframe = (JFrame)Memory.pull(new Name("//jframe"));

        this.jmenubar = (JMenuBar)Memory.pull(new Name("//jmenubar"));

        this.jmenu_file = (JMenu)Memory.pull(new Name("//jmenu/file"));

        this.jmenuitem_file_1 = (JMenuItem)Memory.pull(new Name("//jmenu/file/jmenuitem/1"));

        this.jmenuitem_file_2 = (JMenuItem)Memory.pull(new Name("//jmenu/file/jmenuitem/2"));

        this.jmenu_edit = (JMenu)Memory.pull(new Name("//jmenu/edit"));

        this.jmenuitem_edit_1 = (JMenuItem)Memory.pull(new Name("//jmenu/edit/jmenuitem/1"));

        this.jmenuitem_edit_2 = (JMenuItem)Memory.pull(new Name("//jmenu/edit/jmenuitem/2"));

        this.jmenu_view = (JMenu)Memory.pull(new Name("//jmenu/view"));

        this.jmenuitem_view_1 = (JMenuItem)Memory.pull(new Name("//jmenu/view/jmenuitem/1"));

        this.jmenuitem_view_2 = (JMenuItem)Memory.pull(new Name("//jmenu/view/jmenuitem/2"));

        this.jpanel_top = (JPanel)Memory.pull(new Name("//jpanel/top"));

        this.jtextpane_url = (JTextPane)Memory.pull(new Name("//jtextpane/url"));

        this.jbutton_back = (JButton)Memory.pull(new Name("//jbutton/back"));

        this.jbutton_forward = (JButton)Memory.pull(new Name("//jbutton/forward"));

        this.jbutton_reload = (JButton)Memory.pull(new Name("//jbutton/reload"));

        this.jbutton_halt = (JButton) Memory.pull(new Name("//jbutton/halt"));

        this.jpanel_bottom = (JPanel)Memory.pull(new Name("//jpanel/bottom"));

        this.jeditorpane = (JEditorPane)Memory.pull(new Name("//jeditorpane/html"));

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



        this.jpanel_top.add(this.jbutton_back, BorderLayout.NORTH);

        this.jpanel_top.add(this.jbutton_halt, BorderLayout.EAST);

        this.jpanel_top.add(this.jbutton_reload);

        this.jpanel_top.add(this.jbutton_forward);

        this.jpanel_top.add(this.jtextpane_url);

        return this;
    }

    public Build postbuild()
    {
        this.jframe.setSize(new Dimension(800,600));

        this.jframe.setLayout(new FlowLayout());

        this.jpanel_top.setSize(new Dimension(800, 200));

        this.jpanel_top.setBackground(Color.GRAY);

        this.jtextpane_url.setPreferredSize(new Dimension(600, 20));

        this.jpanel_bottom.setSize(new Dimension(800, 400));

        this.jpanel_bottom.setBackground(Color.GRAY);

        this.jframe.setVisible(true);

        this.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return this;


    }


}


