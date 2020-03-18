package system.memory;

import system.naming.Reference;

public class Memory
{
    public Reference pointer;

    public static Memory ref;

    public MemoryInstance instance;

    public Memory(Reference pointer)
    {
        this.pointer = pointer;

        Memory.ref = this;
    }
}
