package system.instance;

import system.memory.Memory;
import system.naming.Name;
import system.ui.Build;

public class SystemInstance
{
    public Name name;



    public SystemInstance(Name name)
    {
        this.name = name;

        //

        Memory.ref.instance.push(new Name("//build"), new Build());

        //

        Build build = (Build)Memory.ref.instance.pull(new Name("//build"));
    }
}
