package system.memory;

import system.naming.Reference;

public class Memory
{
    public Reference reference;

    public static Memory ref;

    public MemoryInstance instance;

    public Memory(Reference reference)
    {
        this.reference = reference;

        Memory.ref = this;
    }
}
