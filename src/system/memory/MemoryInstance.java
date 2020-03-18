package system.memory;

import system.naming.Address;

import java.util.HashMap;

public class MemoryInstance
{
    public Address address;

    public HashMap<String, Object> map = new HashMap<String, Object>();

    public MemoryInstance(Address address)
    {
        this.address = address;
    }

    public MemoryInstance push(Address name, Object object)
    {
        Memory.ref.instance.map.put(name.value, object);

        return this;
    }

    public Object pull(Address name)
    {
        return Memory.ref.instance.map.get(name.value);
    }

    public MemoryInstance free(Address name)
    {
        Memory.ref.instance.map.put(name.value, null);

        return this;
    }
}
