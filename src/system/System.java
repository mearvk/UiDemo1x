package system;


import system.instance.SystemInstance;
import system.memory.References;
import system.naming.Name;
import system.ui.Builder;

public class System
{
    public Name name = new Name("//system");

    public static System ref;

    public SystemInstance instance;

    public static void main(String...args)
    {
        System system = new System(new Name("//system"));

        //

        system.ui.Builder build = new Builder();

        build.buildstep_001 = new Builder.BuildStep_001("references");

        build.buildstep_002 = new Builder.BuildStep_002("singleton");

        build.buildstep_003 = new Builder.BuildStep_003("hierarchy");

        build.buildstep_004 = new Builder.BuildStep_004("miscellany");

        build.buildstep_005 = new Builder.BuildStep_005("listeners");

        build = null;
    }

    public System(Name name)
    {
        References references = new References(new Name("//references"));

        References.push(name,this);

        //

        System.ref = this;

        System.ref.instance = new SystemInstance(new Name("//system/instance"));
    }
}



