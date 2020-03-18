import system.memory.Memory;
import system.naming.Reference;
import system.System;

import javax.swing.*;

public class Main
{
    JFrame jFrame = new JFrame();

    public static void main(String...args)
    {
        Main main = new Main();
    }

    public Main()
    {
        Memory.ref.instance.push(new Reference("//jframe"), new JFrame());

        Memory.ref.instance.push(new Reference("//jpanel/top"), new JPanel());

        Memory.ref.instance.push(new Reference("//jpanel/bottom"), new JPanel());

        Memory.ref.instance.push(new Reference("//jmenubar"), new JMenuBar());

        Memory.ref.instance.push(new Reference("//jmenu/file"), new JMenu("file"));

            Memory.ref.instance.push(new Reference("//jmenu/file/jmenuitem/1"), new JMenu("item1"));

            Memory.ref.instance.push(new Reference("//jmenu/file/jmenuitem/2"), new JMenu("item2"));

        Memory.ref.instance.push(new Reference("//jmenu/edit"), new JMenu("edit"));

            Memory.ref.instance.push(new Reference("//jmenu/edit/jmenuitem/1"), new JMenu("item1"));

            Memory.ref.instance.push(new Reference("//jmenu/edit/jmenuitem/2"), new JMenu("item2"));

        Memory.ref.instance.push(new Reference("//jmenu/view"), new JMenu("view"));

            Memory.ref.instance.push(new Reference("//jmenu/view/jmenuitem/1"), new JMenu("item1"));

            Memory.ref.instance.push(new Reference("//jmenu/view/jmenuitem/2"), new JMenu("item2"));

        Memory.ref.instance.push(new Reference("//jtextpane/url"), new JTextPane());

        Memory.ref.instance.push(new Reference("//jbutton/back"), new JButton("back"));

        Memory.ref.instance.push(new Reference("//jbutton/forward"), new JButton("forward"));

        Memory.ref.instance.push(new Reference("//jbutton/reload"), new JButton("reload"));

        Memory.ref.instance.push(new Reference("//jbutton/halt"), new JButton("halt"));
    }
}