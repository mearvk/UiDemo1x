package system;


import system.instance.SystemInstance;
import system.memory.Reference;
import system.naming.Name;
import system.ui.UI_Builder;

public class System
{
    public Name name = new Name("//system");

    public static System ref;

    public SystemInstance instance;

    public static void main(String...args)
    {
        System system = new System(new Name("//system"));

        //

        UI_Builder build = new UI_Builder();

        build.buildstep_001 = new UI_Builder.BuildStep_001();

        build.buildstep_002 = new UI_Builder.BuildStep_002();

        build.buildstep_003 = new UI_Builder.BuildStep_003();

        build.buildstep_004 = new UI_Builder.BuildStep_004();

        build = null;
    }

    public System(Name name)
    {
        Reference reference = new Reference(new Name("//memory"));

        //

        System.ref = this;

        System.ref.instance = new SystemInstance(new Name("//system/instance"));

        Reference.push(name, this);

        //

        Reference.push(reference.name, reference);

        Reference.push(name,this);
    }
}



