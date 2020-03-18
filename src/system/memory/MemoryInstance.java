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

    public void push(Reference name, Object object)
    {
        Memory.ref.instance.map.put(name.value, object);
    }

    public Object pull(Reference name)
    {
        return Memory.ref.instance.map.get(name.value);
    }
}
