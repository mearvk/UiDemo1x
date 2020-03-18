package system.ui;

import system.memory.Memory;
import system.naming.Name;

import javax.swing.*;

public class Prebuild
{
    public Prebuild()
    {
        Memory.ref.instance.push(new Name("//jframe"), new JFrame());

        Memory.ref.instance.push(new Name("//jpanel/top"), new JPanel());

        Memory.ref.instance.push(new Name("//jpanel/bottom"), new JPanel());

        Memory.ref.instance.push(new Name("//jmenubar"), new JMenuBar());

        Memory.ref.instance.push(new Name("//jmenu/file"), new JMenu("file"));

        Memory.ref.instance.push(new Name("//jmenu/file/jmenuitem/1"), new JMenu("item1"));

        Memory.ref.instance.push(new Name("//jmenu/file/jmenuitem/2"), new JMenu("item2"));

        Memory.ref.instance.push(new Name("//jmenu/edit"), new JMenu("edit"));

        Memory.ref.instance.push(new Name("//jmenu/edit/jmenuitem/1"), new JMenu("item1"));

        Memory.ref.instance.push(new Name("//jmenu/edit/jmenuitem/2"), new JMenu("item2"));

        Memory.ref.instance.push(new Name("//jmenu/view"), new JMenu("view"));

        Memory.ref.instance.push(new Name("//jmenu/view/jmenuitem/1"), new JMenu("item1"));

        Memory.ref.instance.push(new Name("//jmenu/view/jmenuitem/2"), new JMenu("item2"));

        Memory.ref.instance.push(new Name("//jtextpane/url"), new JTextPane());

        Memory.ref.instance.push(new Name("//jbutton/back"), new JButton("back"));

        Memory.ref.instance.push(new Name("//jbutton/forward"), new JButton("forward"));

        Memory.ref.instance.push(new Name("//jbutton/reload"), new JButton("reload"));

        Memory.ref.instance.push(new Name("//jbutton/halt"), new JButton("halt"));
    }
}