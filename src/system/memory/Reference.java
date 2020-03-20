package system.memory;

import system.naming.Name;

public class Reference
{
    public Name name;

    public static Reference ref;

    public MemoryInstance instance = new MemoryInstance( new Name("//memory/instance"));

    public Reference(Name name)
    {
        this.name = name;

        Reference.ref = this;
    }

    public static Reference push(Name name, Object object)
    {
        Reference.ref.instance.push(name,object);

        return ref;
    }

    public static Object pull(Name name)
    {
        return Reference.ref.instance.pull(name);
    }

    public static Reference free(Name name)
    {
        Reference.ref.instance.free(name);

        return ref;
    }
}
