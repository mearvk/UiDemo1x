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
        System.ref.instance.push(new Reference("//jframe"), new JFrame());

        System.ref.instance.push(new Reference("//jpanel/top"), new JPanel());

        System.ref.instance.push(new Reference("//jpanel/bottom"), new JPanel());
    }
}

