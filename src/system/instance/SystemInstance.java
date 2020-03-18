package system.instance;

import system.memory.Memory;
import system.naming.Reference;
import system.ui.Build;

public class SystemInstance
{
    public Reference reference;



    public SystemInstance(Reference reference)
    {
        this.reference = reference;

        //

        Memory.ref.instance.push(new Reference("//build"), new Build());

        //

        Build build = (Build)Memory.ref.instance.pull(new Reference("//build"));
    }
}
