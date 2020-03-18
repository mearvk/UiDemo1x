package system.memory;

import system.naming.Reference;

import java.util.HashMap;

public class MemoryInstance
{
    public Reference reference;

    public HashMap<String, Object> map = new HashMap<String, Object>();

    public MemoryInstance(Reference reference)
    {
        this.reference = reference;
    }

    public MemoryInstance push(Reference name, Object object)
    {
        Memory.ref.instance.map.put(name.value, object);

        return this;
    }

    public Object pull(Reference name)
    {
        return Memory.ref.instance.map.get(name.value);
    }

    public MemoryInstance free(Reference name)
    {
        Memory.ref.instance.map.put(name.value, null);

        return this;
    }
}
