package system.memory;

import system.naming.Reference;

import java.util.HashMap;

public class MemoryInstance
{
    public HashMap<Reference, Object> map = new HashMap<Reference,Object>();

    public MemoryInstance(Reference pointer)
    {

    }

    public void push(Reference name, Object object)
    {
        Memory.ref.instance.map.put(name, object);
    }

    public Object pull(Reference name)
    {
        return Memory.ref.instance.map.get(name);
    }
}
