package system.memory;

import system.naming.Address;

public class Memory
{
    public Address address;

    public static Memory ref;

    public MemoryInstance instance = new MemoryInstance( new Address("//memory/instance"));

    public Memory(Address address)
    {
        this.address = address;

        Memory.ref = this;
    }

    public static Memory push(Address address, Object object)
    {
        Memory.ref.instance.push(address,object);

        return ref;
    }

    public static Object pull(Address address)
    {
        return Memory.ref.instance.pull(address);
    }

    public static Memory free(Address address)
    {
        Memory.ref.instance.free(address);

        return ref;
    }
}
