package system.instance;

import system.memory.Memory;
import system.naming.Reference;

public class SystemInstance
{
    public Reference name;

    public SystemInstance(Reference name)
    {
        this.name = name;
    }

    public void push(Reference name, Object object)
    {
        Memory.ref.instance.map.put(name,object);
    }

    public Object pull(Reference name)
    {
        return Memory.ref.instance.map.get(name);
    }
}
