package system.memory;

import system.naming.Name;

public class Memory
{
    public Name name;

    public static Memory ref;

    public MemoryInstance instance = new MemoryInstance( new Name("//memory/instance"));

    public Memory(Name name)
    {
        this.name = name;

        Memory.ref = this;
    }

    public static Memory push(Name name, Object object)
    {
        Memory.ref.instance.push(name,object);

        return ref;
    }

    public static Object pull(Name name)
    {
        return Memory.ref.instance.pull(name);
    }

    public static Memory free(Name name)
    {
        Memory.ref.instance.free(name);

        return ref;
    }
}
