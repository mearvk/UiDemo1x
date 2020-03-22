package system.ui;

import system.memory.Bodhi;
import system.naming.Name;
import system.ui.custom.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class Builder
{
    public static Builder ref;

    public JFrame jframe;

    public JMenuBar jmenubar;

    public JMenu jmenu_file;

    public JMenuItem jmenuitem_file_1;

    public JMenuItem jmenuitem_file_2;

    public JMenu jmenu_edit;

    public JMenuItem jmenuitem_edit_1;

    public JMenuItem jmenuitem_edit_2;

    public JMenu jmenu_view;

    public JMenuItem jmenuitem_view_1;

    public JMenuItem jmenuitem_view_2;

    public CustomJPanel_Top jpanel_top;

    public JTextField jtextfield_url;

    public CustomJButton_Back jbutton_back;

    public CustomJButton_Forward jbutton_forward;

    public JButton jbutton_reload;

    public JButton jbutton_halt;

    public CustomJPanel_Bottom jpanel_bottom;

    public JTabbedPane jtabbedpane;

    public CustomJEditorPane jeditorpane;

    //

    public BuildStep_001 buildstep_001;

    public BuildStep_002 buildstep_002;

    public BuildStep_003 buildstep_003;

    public BuildStep_004 buildstep_004;

    public BuildStep_005 buildstep_005;

    public Builder()
    {
        Builder.ref = this;

        Bodhi.push(new Name("//build"), this);
    }

    public static class BuildStep_001
    {
        public BuildStep_001(String description)
        {
            Bodhi.push(new Name("//jframe"), new JFrame());

            Bodhi.push(new Name("//jpanel/top"), new CustomJPanel_Top());

            Bodhi.push(new Name("//jpanel/bottom"), new CustomJPanel_Bottom());

            Bodhi.push(new Name("//jmenubar"), new JMenuBar());

            Bodhi.push(new Name("//jmenu/file"), new JMenu("File"));

            Bodhi.push(new Name("//jmenu/file/jmenuitem/1"), new JMenuItem("Item 1"));

            Bodhi.push(new Name("//jmenu/file/jmenuitem/2"), new JMenuItem("Item 2"));

            Bodhi.push(new Name("//jmenu/edit"), new JMenu("Edit"));

            Bodhi.push(new Name("//jmenu/edit/jmenuitem/1"), new JMenuItem("Item 1"));

            Bodhi.push(new Name("//jmenu/edit/jmenuitem/2"), new JMenuItem("Item 2"));

            Bodhi.push(new Name("//jmenu/view"), new JMenu("View"));

            Bodhi.push(new Name("//jmenu/view/jmenuitem/1"), new JMenuItem("Item 1"));

            Bodhi.push(new Name("//jmenu/view/jmenuitem/2"), new JMenuItem("Item 2"));

            Bodhi.push(new Name("//jtextfield/url"), new CustomJTextField_Url());

            Bodhi.push(new Name("//jbutton/back"), new CustomJButton_Back(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\back-12.png")));

            Bodhi.push(new Name("//jbutton/forward"), new CustomJButton_Forward(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\forward-12.png")));

            //References.push(new Name("//jbutton/reload"), new JButton(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\reload-16.png")));

            //References.push(new Name("//jbutton/halt"), new JButton(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\halt-16.png")));

            Bodhi.push(new Name("//jtabbedpane"), new CustomJTabbedPane());

            Bodhi.push(new Name("//jeditorpane/html"), new CustomJEditorPane());
        }

    }

    public static class BuildStep_002
    {

        public BuildStep_002(String description)
        {
            Builder.ref.jframe = (JFrame) Bodhi.pull(new Name("//jframe"));

            Builder.ref.jmenubar = (JMenuBar) Bodhi.pull(new Name("//jmenubar"));

            Builder.ref.jmenu_file = (JMenu) Bodhi.pull(new Name("//jmenu/file"));

            Builder.ref.jmenuitem_file_1 = (JMenuItem) Bodhi.pull(new Name("//jmenu/file/jmenuitem/1"));

            Builder.ref.jmenuitem_file_2 = (JMenuItem) Bodhi.pull(new Name("//jmenu/file/jmenuitem/2"));

            Builder.ref.jmenu_edit = (JMenu) Bodhi.pull(new Name("//jmenu/edit"));

            Builder.ref.jmenuitem_edit_1 = (JMenuItem) Bodhi.pull(new Name("//jmenu/edit/jmenuitem/1"));

            Builder.ref.jmenuitem_edit_2 = (JMenuItem) Bodhi.pull(new Name("//jmenu/edit/jmenuitem/2"));

            Builder.ref.jmenu_view = (JMenu) Bodhi.pull(new Name("//jmenu/view"));

            Builder.ref.jmenuitem_view_1 = (JMenuItem) Bodhi.pull(new Name("//jmenu/view/jmenuitem/1"));

            Builder.ref.jmenuitem_view_2 = (JMenuItem) Bodhi.pull(new Name("//jmenu/view/jmenuitem/2"));

            Builder.ref.jpanel_top = (CustomJPanel_Top) Bodhi.pull(new Name("//jpanel/top"));

            Builder.ref.jtextfield_url = (JTextField) Bodhi.pull(new Name("//jtextfield/url"));

            Builder.ref.jbutton_back = (CustomJButton_Back) Bodhi.pull(new Name("//jbutton/back"));

            Builder.ref.jbutton_forward = (CustomJButton_Forward) Bodhi.pull(new Name("//jbutton/forward"));

            Builder.ref.jbutton_reload = (JButton) Bodhi.pull(new Name("//jbutton/reload"));

            Builder.ref.jbutton_halt = (JButton) Bodhi.pull(new Name("//jbutton/halt"));

            Builder.ref.jpanel_bottom = (CustomJPanel_Bottom) Bodhi.pull(new Name("//jpanel/bottom"));

            Builder.ref.jtabbedpane = (JTabbedPane) Bodhi.pull(new Name("//jtabbedpane"));

            Builder.ref.jeditorpane = (CustomJEditorPane) Bodhi.pull(new Name("//jeditorpane/html"));
        }
    }

    public static class BuildStep_003
    {

        public BuildStep_003(String description)
        {
            JFrame jframe  = (JFrame) Bodhi.pull(new Name("//jframe"));

            jframe.add(Builder.ref.jpanel_top);

            jframe.add(Builder.ref.jpanel_bottom);

            jframe.setJMenuBar(Builder.ref.jmenubar);

            //

            JMenuBar jmenubar = (JMenuBar) Bodhi.pull(new Name("//jmenubar"));

            jmenubar.add(Builder.ref.jmenu_file);

            jmenubar.add(Builder.ref.jmenu_edit);

            jmenubar.add(Builder.ref.jmenu_view);

            //

            JMenu jmenu_file = (JMenu) Bodhi.pull(new Name("//jmenu/file"));

            jmenu_file.add(Builder.ref.jmenuitem_file_1);

            jmenu_file.add(Builder.ref.jmenuitem_file_2);

            //

            JMenu jmenu_edit = (JMenu) Bodhi.pull(new Name("//jmenu/edit"));

            jmenu_edit.add(Builder.ref.jmenuitem_edit_1);

            jmenu_edit.add(Builder.ref.jmenuitem_edit_2);

            //

            JMenu jmenu_view = (JMenu) Bodhi.pull(new Name("//jmenu/view"));

            jmenu_view.add(Builder.ref.jmenuitem_view_1);

            jmenu_view.add(Builder.ref.jmenuitem_view_2);

            //

            CustomJPanel_Top jpanel_top = (CustomJPanel_Top) Bodhi.pull(new Name("//jpanel/top"));

            jpanel_top.add(Builder.ref.jbutton_back);

            jpanel_top.add(Builder.ref.jbutton_forward);

            jpanel_top.add(Builder.ref.jtextfield_url);

            //

            CustomJPanel_Bottom jpanel_bottom = (CustomJPanel_Bottom) Bodhi.pull(new Name("//jpanel/bottom"));

            jpanel_bottom.add(Builder.ref.jtabbedpane);

            //

            CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) Bodhi.pull(new Name("//jtabbedpane"));

            jtabbedpane.addTab("Text Label", new CustomJPanel___HomePageJPanel()); //add button with index == SELECTED INDEX in static workaround

            jtabbedpane.addTab("+", new CustomJPanel___EmptyPageJPanel());

            jtabbedpane.setTabComponentAt(0, new CustomJButton___CloseTabJButton());
        }
    }

    public static class BuildStep_004
    {

        public BuildStep_004(String description)
        {
            JFrame jframe = (JFrame) Bodhi.pull(new Name("//jframe"));

            jframe.setSize(new Dimension(1200, 800));

            jframe.setLayout(new FlowLayout());

            jframe.setMinimumSize(new Dimension(1200, 800));

            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            jframe.setVisible(true);

            //

            JPanel jpanel_top = (JPanel) Bodhi.pull(new Name("//jpanel/top"));

            jpanel_top.setBackground(Color.WHITE);

            //

            CustomJTextField_Url jtextfield_url = (CustomJTextField_Url) Bodhi.pull(new Name("//jtextfield/url"));

            jtextfield_url.setBorder(new BevelBorder(1,Color.WHITE.darker(),Color.WHITE.darker(),Color.GRAY,Color.GRAY));

            //

            JPanel jpanel_bottom = (JPanel) Bodhi.pull(new Name("//jpanel/bottom"));

            jpanel_bottom.setBackground(Color.WHITE);

            //

            JEditorPane jeditorpane = (JEditorPane) Bodhi.pull(new Name("//jeditorpane/html"));

            jeditorpane.setContentType("text/html");

            jeditorpane.setText("<html>\n" +
                    "   <head>\n" +
                    "      <title>Swing Tester</title>\n" +
                    "   </head>\n" +
                    "   <body>\n" +
                    "      <p>Swing API is a set of extensible GUI Components \n" +
                    "         to ease the developer's life to create JAVA based Front End/GUI\n" +
                    "         Applications. It is build on top of AWT API and acts as a replacement of \n" +
                    "         AWT API, since it has almost every control corresponding to AWT controls.\n" +
                    "         Swing component follows a Model-View-Controller architecture to \n" +
                    "         fulfill the following criterias.</p>\n" +
                    "      <ul>\n" +
                    "         <li><p>A single API is to be sufficient to support multiple look and feel.</p></li>\n" +
                    "         <li><p>API is to be model driven so that the highest level API is not required to have data.</p></li>\n" +
                    "         <li><p>API is to use the Java Bean model so that Builder Tools and IDE can provide better services to the developers for use.</p></li>\n" +
                    "      </ul>\n" +
                    "      <h2>MVC Architecture</h2>\n" +
                    "      <p>Swing API architecture follows loosely based MVC architecture in the following manner.</p>\n" +
                    "      <ul>\n" +
                    "         <li><p>Model represents component's data.</p></li>\n" +
                    "         <li><p>View represents visual representation of the component's data.</p></li>\n" +
                    "         <li><p>Controller takes the input from the user on the view and reflects the changes in Component's data.</p></li>\n" +
                    "         <li><p>Swing component has Model as a seperate element, while the View and Controller part are clubbed in the User Interface elements. Because of which, Swing has a pluggable look-and-feel architecture.</p></li>\n" +
                    "      </ul>\n" +
                    "      <h2>Swing Features</h2>\n" +
                    "      <ul>\n" +
                    "         <li><p><b>Light Weight</b> − Swing components are independent of native Operating System's API as Swing API controls are rendered mostly using pure JAVA code instead of underlying operating system calls.</p></li>\n" +
                    "         <li><p><b>Rich Controls</b> − Swing provides a rich set of advanced controls like Tree, TabbedPane, slider, colorpicker, and table controls.</p></li>\n" +
                    "         <li><p><b>Highly Customizable</b> − Swing controls can be customized in a very easy way as visual apperance is independent of internal representation.</p></li>\n" +
                    "         <li><p><b>Pluggable look-and-feel</b> − SWING based GUI Application look and feel can be changed at run-time, based on available values.</p></li>\n" +
                    "      </ul>\n" +
                    "   </body>\n" +
                    "</html>");
        }
    }

    public static class BuildStep_005
    {
        public BuildStep_005(String description)
        {
            CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) Bodhi.pull(new Name("//jtabbedpane"));

            jtabbedpane.addChangeListener(new CustomJTabbedPane.CustomChangeListener());



            //
        }
    }
}
