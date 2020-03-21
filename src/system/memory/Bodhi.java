package system.memory;

import system.naming.Name;

public class Bodhi
{
    public Name name;

    public static Bodhi ref;

    public MemoryInstance instance = new MemoryInstance( new Name("//memory/instance"));

    public Bodhi(Name name)
    {
        this.name = name;

        Bodhi.ref = this;
    }

    public static Bodhi push(Name name, Object object)
    {
        Bodhi.ref.instance.push(name,object);

        return ref;
    }

    public static Object pull(Name name)
    {
        return Bodhi.ref.instance.pull(name);
    }

    public static Bodhi free(Name name)
    {
        Bodhi.ref.instance.free(name);

        return ref;
    }
}
