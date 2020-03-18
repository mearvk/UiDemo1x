package system.ui;

import system.memory.Memory;
import system.naming.Address;

import javax.swing.*;

public class Prebuild
{
    public Prebuild()
    {
        Memory.ref.instance.push(new Address("//jframe"), new JFrame());

        Memory.ref.instance.push(new Address("//jpanel/top"), new JPanel());

        Memory.ref.instance.push(new Address("//jpanel/bottom"), new JPanel());

        Memory.ref.instance.push(new Address("//jmenubar"), new JMenuBar());

        Memory.ref.instance.push(new Address("//jmenu/file"), new JMenu("file"));

        Memory.ref.instance.push(new Address("//jmenu/file/jmenuitem/1"), new JMenu("item1"));

        Memory.ref.instance.push(new Address("//jmenu/file/jmenuitem/2"), new JMenu("item2"));

        Memory.ref.instance.push(new Address("//jmenu/edit"), new JMenu("edit"));

        Memory.ref.instance.push(new Address("//jmenu/edit/jmenuitem/1"), new JMenu("item1"));

        Memory.ref.instance.push(new Address("//jmenu/edit/jmenuitem/2"), new JMenu("item2"));

        Memory.ref.instance.push(new Address("//jmenu/view"), new JMenu("view"));

        Memory.ref.instance.push(new Address("//jmenu/view/jmenuitem/1"), new JMenu("item1"));

        Memory.ref.instance.push(new Address("//jmenu/view/jmenuitem/2"), new JMenu("item2"));

        Memory.ref.instance.push(new Address("//jtextpane/url"), new JTextPane());

        Memory.ref.instance.push(new Address("//jbutton/back"), new JButton("back"));

        Memory.ref.instance.push(new Address("//jbutton/forward"), new JButton("forward"));

        Memory.ref.instance.push(new Address("//jbutton/reload"), new JButton("reload"));

        Memory.ref.instance.push(new Address("//jbutton/halt"), new JButton("halt"));
    }
}