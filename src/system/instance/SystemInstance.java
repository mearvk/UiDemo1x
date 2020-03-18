package system.instance;

import system.memory.Memory;
import system.naming.Address;
import system.ui.Build;

public class SystemInstance
{
    public Address address;



    public SystemInstance(Address address)
    {
        this.address = address;

        //

        Memory.ref.instance.push(new Address("//build"), new Build());

        //

        Build build = (Build)Memory.ref.instance.pull(new Address("//build"));
    }
}
