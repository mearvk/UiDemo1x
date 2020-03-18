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

        //

        Memory.push(new Reference("//build"), new Build());

        //

        Build build = (Build)Memory.pull(new Reference("//build"));

        build.prebuild();

        build.build();

        //

        Memory.free(new Reference("//build"));


    }

    public System(Memory memory, Reference reference)
    {
        System.ref = this;

        System.ref.instance = new SystemInstance(new Reference("//system/instance"));

        Memory.push(reference, this);

        //

        Memory.push(memory.reference, memory);

        Memory.push(reference,this);
    }
}

