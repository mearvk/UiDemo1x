package system.memory;

import system.naming.Name;

import java.util.HashMap;

public class MemoryInstance
{
    public Name name;

    public HashMap<String, Object> map = new HashMap<String, Object>();

    public MemoryInstance(Name name)
    {
        this.name = name;
    }

    public MemoryInstance push(Name name, Object object)
    {
        Memory.ref.instance.map.put(name.value, object);

        return this;
    }

    public Object pull(Name name)
    {
        return Memory.ref.instance.map.get(name.value);
    }

    public MemoryInstance free(Name name)
    {
        Memory.ref.instance.map.put(name.value, null);

        return this;
    }
}
