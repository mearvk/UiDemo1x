package system.ui;

import system.memory.References;
import system.naming.Name;

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

    public CustomJPanel_top jpanel_top;

    public JTextField jtextfield_url;

    public CustomJButton_back jbutton_back;

    public CustomJButton_forward jbutton_forward;

    public JButton jbutton_reload;

    public JButton jbutton_halt;

    public CustomJPanel_bottom jpanel_bottom;

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

        References.push(new Name("//build"), this);
    }

    public static class BuildStep_001
    {
        public BuildStep_001(String description)
        {
            References.push(new Name("//jframe"), new JFrame());

            References.push(new Name("//jpanel/top"), new CustomJPanel_top());

            References.push(new Name("//jpanel/bottom"), new CustomJPanel_bottom());

            References.push(new Name("//jmenubar"), new JMenuBar());

            References.push(new Name("//jmenu/file"), new JMenu("File"));

            References.push(new Name("//jmenu/file/jmenuitem/1"), new JMenuItem("Item 1"));

            References.push(new Name("//jmenu/file/jmenuitem/2"), new JMenuItem("Item 2"));

            References.push(new Name("//jmenu/edit"), new JMenu("Edit"));

            References.push(new Name("//jmenu/edit/jmenuitem/1"), new JMenuItem("Item 1"));

            References.push(new Name("//jmenu/edit/jmenuitem/2"), new JMenuItem("Item 2"));

            References.push(new Name("//jmenu/view"), new JMenu("View"));

            References.push(new Name("//jmenu/view/jmenuitem/1"), new JMenuItem("Item 1"));

            References.push(new Name("//jmenu/view/jmenuitem/2"), new JMenuItem("Item 2"));

            References.push(new Name("//jtextfield/url"), new CustomJTextField_url());

            References.push(new Name("//jbutton/back"), new CustomJButton_back(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\back-16.png")));

            References.push(new Name("//jbutton/forward"), new CustomJButton_forward(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\forward-16.png")));

            References.push(new Name("//jbutton/reload"), new JButton(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\reload-16.png")));

            References.push(new Name("//jbutton/halt"), new JButton(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\halt-16.png")));

            References.push(new Name("//jtabbedpane"), new CustomJTabbedPane());

            References.push(new Name("//jeditorpane/html"), new CustomJEditorPane());
        }

    }

    public static class BuildStep_002
    {

        public BuildStep_002(String description)
        {
            Builder.ref.jframe = (JFrame) References.pull(new Name("//jframe"));

            Builder.ref.jmenubar = (JMenuBar) References.pull(new Name("//jmenubar"));

            Builder.ref.jmenu_file = (JMenu) References.pull(new Name("//jmenu/file"));

            Builder.ref.jmenuitem_file_1 = (JMenuItem) References.pull(new Name("//jmenu/file/jmenuitem/1"));

            Builder.ref.jmenuitem_file_2 = (JMenuItem) References.pull(new Name("//jmenu/file/jmenuitem/2"));

            Builder.ref.jmenu_edit = (JMenu) References.pull(new Name("//jmenu/edit"));

            Builder.ref.jmenuitem_edit_1 = (JMenuItem) References.pull(new Name("//jmenu/edit/jmenuitem/1"));

            Builder.ref.jmenuitem_edit_2 = (JMenuItem) References.pull(new Name("//jmenu/edit/jmenuitem/2"));

            Builder.ref.jmenu_view = (JMenu) References.pull(new Name("//jmenu/view"));

            Builder.ref.jmenuitem_view_1 = (JMenuItem) References.pull(new Name("//jmenu/view/jmenuitem/1"));

            Builder.ref.jmenuitem_view_2 = (JMenuItem) References.pull(new Name("//jmenu/view/jmenuitem/2"));

            Builder.ref.jpanel_top = (CustomJPanel_top) References.pull(new Name("//jpanel/top"));

            Builder.ref.jtextfield_url = (JTextField) References.pull(new Name("//jtextfield/url"));

            Builder.ref.jbutton_back = (CustomJButton_back) References.pull(new Name("//jbutton/back"));

            Builder.ref.jbutton_forward = (CustomJButton_forward) References.pull(new Name("//jbutton/forward"));

            Builder.ref.jbutton_reload = (JButton) References.pull(new Name("//jbutton/reload"));

            Builder.ref.jbutton_halt = (JButton) References.pull(new Name("//jbutton/halt"));

            Builder.ref.jpanel_bottom = (CustomJPanel_bottom) References.pull(new Name("//jpanel/bottom"));

            Builder.ref.jtabbedpane = (JTabbedPane) References.pull(new Name("//jtabbedpane"));

            Builder.ref.jeditorpane = (CustomJEditorPane) References.pull(new Name("//jeditorpane/html"));
        }
    }

    public static class BuildStep_003
    {

        public BuildStep_003(String description)
        {
            JFrame jframe  = (JFrame) References.pull(new Name("//jframe"));

            jframe.add(Builder.ref.jpanel_top);

            jframe.add(Builder.ref.jpanel_bottom);

            jframe.setJMenuBar(Builder.ref.jmenubar);

            //

            JMenuBar jmenubar = (JMenuBar) References.pull(new Name("//jmenubar"));

            jmenubar.add(Builder.ref.jmenu_file);

            jmenubar.add(Builder.ref.jmenu_edit);

            jmenubar.add(Builder.ref.jmenu_view);

            //

            JMenu jmenu_file = (JMenu) References.pull(new Name("//jmenu/file"));

            jmenu_file.add(Builder.ref.jmenuitem_file_1);

            jmenu_file.add(Builder.ref.jmenuitem_file_2);

            //

            JMenu jmenu_edit = (JMenu) References.pull(new Name("//jmenu/edit"));

            jmenu_edit.add(Builder.ref.jmenuitem_edit_1);

            jmenu_edit.add(Builder.ref.jmenuitem_edit_2);

            //

            JMenu jmenu_view = (JMenu) References.pull(new Name("//jmenu/view"));

            jmenu_view.add(Builder.ref.jmenuitem_view_1);

            jmenu_view.add(Builder.ref.jmenuitem_view_2);

            //

            CustomJPanel_top jpanel_top = (CustomJPanel_top) References.pull(new Name("//jpanel/top"));

            jpanel_top.add(Builder.ref.jbutton_back);

            //jpanel_top.add(UI_Builder.ref.jbutton_halt);

            //jpanel_top.add(UI_Builder.ref.jbutton_reload);

            jpanel_top.add(Builder.ref.jbutton_forward);

            jpanel_top.add(Builder.ref.jtextfield_url);

            //

            CustomJPanel_bottom jpanel_bottom = (CustomJPanel_bottom) References.pull(new Name("//jpanel/bottom"));

            jpanel_bottom.add(Builder.ref.jtabbedpane);

            //

            CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) References.pull(new Name("//jtabbedpane"));

            jtabbedpane.add(new CustomJTabbedPane.ButtonTabComponent(jtabbedpane));

            jtabbedpane.addTab("Test", new CustomJTabbedPane.ButtonTabComponent(jtabbedpane));

            jtabbedpane.setTabComponentAt(1, new CustomJTabbedPane.ButtonTabComponent(jtabbedpane));

            //jtabbedpane.addTab("URL TODO", new ImageIcon(""), new CustomJTabbedPane.ButtonTabComponent(jtabbedpane), "Tooltip TODO");

            jtabbedpane.addTab("+", new CustomJTabbedPane.ButtonTabComponent(jtabbedpane));
        }
    }

    public static class BuildStep_004
    {

        public BuildStep_004(String description)
        {
            JFrame jframe = (JFrame) References.pull(new Name("//jframe"));

            jframe.setSize(new Dimension(1200, 800));

            jframe.setLayout(new FlowLayout());

            jframe.setMinimumSize(new Dimension(1200, 800));

            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            jframe.setVisible(true);

            //

            JPanel jpanel_top = (JPanel) References.pull(new Name("//jpanel/top"));

            jpanel_top.setBackground(Color.WHITE);

            //

            CustomJTextField_url jtextfield_url = (CustomJTextField_url) References.pull(new Name("//jtextfield/url"));

            jtextfield_url.setBorder(new BevelBorder(1,Color.WHITE.darker(),Color.WHITE.darker(),Color.GRAY,Color.GRAY));

            //

            JPanel jpanel_bottom = (JPanel) References.pull(new Name("//jpanel/bottom"));

            jpanel_bottom.setBackground(Color.WHITE);

            //

            JEditorPane jeditorpane = (JEditorPane) References.pull(new Name("//jeditorpane/html"));

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
            CustomJTabbedPane jtabbedpane = (CustomJTabbedPane) References.pull(new Name("//jtabbedpane"));

            jtabbedpane.addChangeListener(new CustomJTabbedPane.CustomChangeListener());

            //
        }
    }
}
