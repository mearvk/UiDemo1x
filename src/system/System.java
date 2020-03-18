package system;


import system.instance.SystemInstance;
import system.memory.Memory;
import system.naming.Address;
import system.ui.Build;

public class System
{
    public Address address;

    public static System ref;

    public SystemInstance instance;

    public static void main(String...args)
    {
        System system = new System(new Address("//system"));

        //

        Build build = new Build();

        build.prebuild();

        build.build();

        build = null;
    }

    public System(Address address)
    {
        Memory memory = new Memory(new Address("//memory"));

        //

        System.ref = this;

        System.ref.instance = new SystemInstance(new Address("//system/instance"));

        Memory.push(address, this);

        //

        Memory.push(memory.address, memory);

        Memory.push(address,this);
    }
}

