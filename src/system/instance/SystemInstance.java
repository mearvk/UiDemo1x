package system.instance;

import system.naming.Reference;
import system.ui.Build;

public class SystemInstance
{
    public Reference reference;

    public Build builder;

    public SystemInstance(Reference reference)
    {
        this.reference = reference;
    }
}
