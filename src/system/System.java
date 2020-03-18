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

        Memory.ref.instance.push(new Reference("//build"), new Build());

        //

        Build build = (Build)Memory.ref.instance.pull(new Reference("//build"));

        build.prebuild();

        build.build();

        //

        Memory.ref.instance.free(new Reference("//build"));


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

