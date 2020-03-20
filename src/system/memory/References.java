package system.memory;

import system.naming.Name;

public class References
{
    public Name name;

    public static References ref;

    public MemoryInstance instance = new MemoryInstance( new Name("//memory/instance"));

    public References(Name name)
    {
        this.name = name;

        References.ref = this;
    }

    public static References push(Name name, Object object)
    {
        References.ref.instance.push(name,object);

        return ref;
    }

    public static Object pull(Name name)
    {
        return References.ref.instance.pull(name);
    }

    public static References free(Name name)
    {
        References.ref.instance.free(name);

        return ref;
    }
}
