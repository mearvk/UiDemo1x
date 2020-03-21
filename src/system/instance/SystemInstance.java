package system.instance;

import system.memory.Bodhi;
import system.naming.Name;
import system.ui.Builder;

import javax.swing.*;

public class SystemInstance
{
    public Name name;

    public SystemInstance(Name name)
    {
        Bodhi.push(name,this);

        //

        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                system.ui.Builder builder = new Builder();

                builder.buildstep_001 = new Builder.BuildStep_001("references");

                builder.buildstep_002 = new Builder.BuildStep_002("singleton");

                builder.buildstep_003 = new Builder.BuildStep_003("hierarchy");

                builder.buildstep_004 = new Builder.BuildStep_004("miscellany");

                builder.buildstep_005 = new Builder.BuildStep_005("listeners");

                builder = null;
            }
        });




    }
}
