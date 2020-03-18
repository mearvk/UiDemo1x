package system.memory;

import system.naming.Reference;

public class Memory
{
    public Reference reference;

    public static Memory ref;

    public MemoryInstance instance = new MemoryInstance( new Reference("//memory/instance"));

    public Memory(Reference reference)
    {
        this.reference = reference;

        Memory.ref = this;
    }

    public static Memory push(Reference reference, Object object)
    {
        Memory.ref.instance.push(reference,object);

        return ref;
    }

    public static Object pull(Reference reference)
    {
        return Memory.ref.instance.pull(reference);
    }

    public static Memory free(Reference reference)
    {
        Memory.ref.instance.free(reference);

        return ref;
    }
}
