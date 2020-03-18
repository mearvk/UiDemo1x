package system;

import system.instance.SystemInstance;
import system.memory.Memory;
import system.naming.Reference;

public class System
{
    public static System ref;

    public SystemInstance instance;

    public static void main(String...args)
    {
        System system = new System(new Memory(new Reference("//memory")), new Reference("//system"));
    }

    public System(Memory memory, Reference pointer)
    {
        System.ref = this;

        System.ref.instance = new SystemInstance(new Reference("//system/instance"));

        //

        Memory.ref.instance.push(pointer,this);
    }
}
