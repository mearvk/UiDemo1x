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

        Memory.ref.instance.push(new Reference("//jtextpane"), new JFrame());

        Memory.ref.instance.push(new Reference("//button/back"), new JButton());

        Memory.ref.instance.push(new Reference("//button/forward"), new JButton());

        Memory.ref.instance.push(new Reference("//button/reload"), new JButton());

        Memory.ref.instance.push(new Reference("//button/stop"), new JButton());
    }
}