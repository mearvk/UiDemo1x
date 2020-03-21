package system;


import system.instance.SystemInstance;
import system.memory.Bodhi;
import system.naming.Name;

public class System
{
    public Name name = new Name("//system");

    public static System ref;

    public SystemInstance instance;

    public static void main(String...args)
    {
        System system = new System(new Name("//system"));
    }

    public System(Name name)
    {
        Bodhi referencing = new Bodhi(new Name("//references"));

        //

        Bodhi.push(name,this);

        //

        System.ref = this;

        System.ref.instance = new SystemInstance(new Name("//system/instance"));
    }
}



