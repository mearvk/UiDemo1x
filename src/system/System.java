package system;


import system.instance.SystemInstance;
import system.memory.Memory;
import system.naming.Name;
import system.ui.Build;

public class System
{
    public Name name;

    public static System ref;

    public SystemInstance instance;

    public static void main(String...args)
    {
        System system = new System(new Name("//system"));

        //

        Build build = new Build();

        build.prebuild();

        build.build();

        build = null;
    }

    public System(Name name)
    {
        Memory memory = new Memory(new Name("//memory"));

        //

        System.ref = this;

        System.ref.instance = new SystemInstance(new Name("//system/instance"));

        Memory.push(name, this);

        //

        Memory.push(memory.name, memory);

        Memory.push(name,this);
    }
}

