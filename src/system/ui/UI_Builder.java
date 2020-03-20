package system.ui;

import system.memory.Reference;
import system.naming.Name;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class UI_Builder
{
    public static UI_Builder ref;

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

    public JPanelTop jpanel_top;

    public JTextField jtextfield_url;

    public JButtonBack jbutton_back;

    public JButtonForward jbutton_forward;

    public JButton jbutton_reload;

    public JButton jbutton_halt;

    public JPanelBottom jpanel_bottom;

    public JTabbedPane jtabbedpane;

    public JEditorPaneHtml jeditorpane;

    //

    public BuildStep_001 buildstep_001;

    public BuildStep_002 buildstep_002;

    public BuildStep_003 buildstep_003;

    public BuildStep_004 buildstep_004;

    public UI_Builder()
    {
        UI_Builder.ref = this;

        Reference.push(new Name("//build"), this);
    }

    public static class BuildStep_001
    {
        public BuildStep_001()
        {
            Reference.push(new Name("//jframe"), new JFrame());

            Reference.push(new Name("//jpanel/top"), new JPanelTop());

            Reference.push(new Name("//jpanel/bottom"), new JPanelBottom());

            Reference.push(new Name("//jmenubar"), new JMenuBar());

            Reference.push(new Name("//jmenu/file"), new JMenu("File"));

            Reference.push(new Name("//jmenu/file/jmenuitem/1"), new JMenuItem("Item 1"));

            Reference.push(new Name("//jmenu/file/jmenuitem/2"), new JMenuItem("Item 2"));

            Reference.push(new Name("//jmenu/edit"), new JMenu("Edit"));

            Reference.push(new Name("//jmenu/edit/jmenuitem/1"), new JMenuItem("Item 1"));

            Reference.push(new Name("//jmenu/edit/jmenuitem/2"), new JMenuItem("Item 2"));

            Reference.push(new Name("//jmenu/view"), new JMenu("View"));

            Reference.push(new Name("//jmenu/view/jmenuitem/1"), new JMenuItem("Item 1"));

            Reference.push(new Name("//jmenu/view/jmenuitem/2"), new JMenuItem("Item 2"));

            Reference.push(new Name("//jtextfield/url"), new JTextFieldURL());

            Reference.push(new Name("//jbutton/back"), new JButtonBack(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\back-16.png")));

            Reference.push(new Name("//jbutton/forward"), new JButtonForward(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\forward-16.png")));

            Reference.push(new Name("//jbutton/reload"), new JButton(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\reload-16.png")));

            Reference.push(new Name("//jbutton/halt"), new JButton(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\Images\\halt-16.png")));

            Reference.push(new Name("//jtabbedpane"), new JTabbedPane());

            Reference.push(new Name("//jeditorpane/html"), new JEditorPaneHtml());
        }

    }

    public static class BuildStep_002
    {

        public BuildStep_002()
        {
            UI_Builder.ref.jframe = (JFrame) Reference.pull(new Name("//jframe"));

            UI_Builder.ref.jmenubar = (JMenuBar) Reference.pull(new Name("//jmenubar"));

            UI_Builder.ref.jmenu_file = (JMenu) Reference.pull(new Name("//jmenu/file"));

            UI_Builder.ref.jmenuitem_file_1 = (JMenuItem) Reference.pull(new Name("//jmenu/file/jmenuitem/1"));

            UI_Builder.ref.jmenuitem_file_2 = (JMenuItem) Reference.pull(new Name("//jmenu/file/jmenuitem/2"));

            UI_Builder.ref.jmenu_edit = (JMenu) Reference.pull(new Name("//jmenu/edit"));

            UI_Builder.ref.jmenuitem_edit_1 = (JMenuItem) Reference.pull(new Name("//jmenu/edit/jmenuitem/1"));

            UI_Builder.ref.jmenuitem_edit_2 = (JMenuItem) Reference.pull(new Name("//jmenu/edit/jmenuitem/2"));

            UI_Builder.ref.jmenu_view = (JMenu) Reference.pull(new Name("//jmenu/view"));

            UI_Builder.ref.jmenuitem_view_1 = (JMenuItem) Reference.pull(new Name("//jmenu/view/jmenuitem/1"));

            UI_Builder.ref.jmenuitem_view_2 = (JMenuItem) Reference.pull(new Name("//jmenu/view/jmenuitem/2"));

            UI_Builder.ref.jpanel_top = (JPanelTop) Reference.pull(new Name("//jpanel/top"));

            UI_Builder.ref.jtextfield_url = (JTextField) Reference.pull(new Name("//jtextfield/url"));

            UI_Builder.ref.jbutton_back = (JButtonBack) Reference.pull(new Name("//jbutton/back"));

            UI_Builder.ref.jbutton_forward = (JButtonForward) Reference.pull(new Name("//jbutton/forward"));

            UI_Builder.ref.jbutton_reload = (JButton) Reference.pull(new Name("//jbutton/reload"));

            UI_Builder.ref.jbutton_halt = (JButton) Reference.pull(new Name("//jbutton/halt"));

            UI_Builder.ref.jpanel_bottom = (JPanelBottom) Reference.pull(new Name("//jpanel/bottom"));

            UI_Builder.ref.jtabbedpane = (JTabbedPane) Reference.pull(new Name("//jtabbedpane"));

            UI_Builder.ref.jeditorpane = (JEditorPaneHtml) Reference.pull(new Name("//jeditorpane/html"));

            //


        }
    }

    public static class BuildStep_003
    {

        public BuildStep_003()
        {
            JFrame jframe  = (JFrame) Reference.pull(new Name("//jframe"));

            jframe.add(UI_Builder.ref.jpanel_top);

            jframe.add(UI_Builder.ref.jpanel_bottom);

            jframe.setJMenuBar(UI_Builder.ref.jmenubar);

            //

            JMenuBar jmenubar = (JMenuBar) Reference.pull(new Name("//jmenubar"));

            jmenubar.add(UI_Builder.ref.jmenu_file);

            jmenubar.add(UI_Builder.ref.jmenu_edit);

            jmenubar.add(UI_Builder.ref.jmenu_view);

            //

            JMenu jmenu_file = (JMenu) Reference.pull(new Name("//jmenu/file"));

            jmenu_file.add(UI_Builder.ref.jmenuitem_file_1);

            jmenu_file.add(UI_Builder.ref.jmenuitem_file_2);

            //

            JMenu jmenu_edit = (JMenu) Reference.pull(new Name("//jmenu/edit"));

            jmenu_edit.add(UI_Builder.ref.jmenuitem_edit_1);

            jmenu_edit.add(UI_Builder.ref.jmenuitem_edit_2);

            //

            JMenu jmenu_view = (JMenu) Reference.pull(new Name("//jmenu/view"));

            jmenu_view.add(UI_Builder.ref.jmenuitem_view_1);

            jmenu_view.add(UI_Builder.ref.jmenuitem_view_2);

            //

            JPanelTop jpanel_top = (JPanelTop) Reference.pull(new Name("//jpanel/top"));

            jpanel_top.add(UI_Builder.ref.jbutton_back);

            //jpanel_top.add(UI_Builder.ref.jbutton_halt);

            //jpanel_top.add(UI_Builder.ref.jbutton_reload);

            jpanel_top.add(UI_Builder.ref.jbutton_forward);

            jpanel_top.add(UI_Builder.ref.jtextfield_url);

            //

            JPanelBottom jpanel_bottom = (JPanelBottom) Reference.pull(new Name("//jpanel/bottom"));

            jpanel_bottom.add(UI_Builder.ref.jtabbedpane);

            //

            JTabbedPane jtabbededpane = (JTabbedPane) Reference.pull(new Name("//jtabbedpane"));

            jtabbededpane.add(UI_Builder.ref.jeditorpane);
        }
    }

    public static class BuildStep_004
    {

        public BuildStep_004()
        {
            JFrame jframe = (JFrame) Reference.pull(new Name("//jframe"));

            jframe.setSize(new Dimension(1200, 800));

            jframe.setLayout(new FlowLayout());

            jframe.setMinimumSize(new Dimension(1200, 800));

            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            jframe.setVisible(true);

            //

            JPanel jpanel_top = (JPanel) Reference.pull(new Name("//jpanel/top"));

            jpanel_top.setBackground(Color.WHITE);

            //

            JTextFieldURL jtextfield_url = (JTextFieldURL) Reference.pull(new Name("//jtextfield/url"));

            jtextfield_url.setBorder(new BevelBorder(1,Color.WHITE.darker(),Color.WHITE.darker(),Color.GRAY,Color.GRAY));

            //

            JPanel jpanel_bottom = (JPanel) Reference.pull(new Name("//jpanel/bottom"));

            jpanel_bottom.setBackground(Color.WHITE);

            //

            JEditorPane jeditorpane = (JEditorPane) Reference.pull(new Name("//jeditorpane/html"));

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
}
