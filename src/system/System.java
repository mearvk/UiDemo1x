package system;


import system.instance.SystemInstance;
import system.memory.Memory;
import system.naming.Reference;
import system.ui.Build;
import system.ui.Prebuild;

public class System
{
    public Reference reference;

    public static System ref;

    public SystemInstance instance;

    public static void main(String...args)
    {
        System system = new System(new Memory(new Reference("//memory")), new Reference("//system"));

        Prebuild main = new Prebuild();

        Build build = new Build();
    }

    public System(Memory memory, Reference reference)
    {
        System.ref = this;

        System.ref.instance = new SystemInstance(new Reference("//system/instance"));

        System.ref.reference = reference;

        //

        Memory.ref.instance.push(memory.reference, memory);

        Memory.ref.instance.push(reference,this);
    }
}

