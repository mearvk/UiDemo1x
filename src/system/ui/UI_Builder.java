package system.ui;

import system.memory.Memory;
import system.naming.Name;

import javax.swing.*;
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

    public TopPane jpanel_top;

    public JTextPane jtextpane_url;

    public JButton jbutton_back;

    public JButton jbutton_forward;

    public JButton jbutton_reload;

    public JButton jbutton_halt;

    public BottomPane jpanel_bottom;

    public HTMLPane jeditorpane;

    //

    public BuildStep_001 buildstep_001;

    public BuildStep_002 buildstep_002;

    public BuildStep_003 buildstep_003;

    public BuildStep_004 buildstep_004;

    public UI_Builder()
    {
        UI_Builder.ref = this;

        Memory.push(new Name("//build"), this);
    }

    public static class BuildStep_001
    {
        public BuildStep_001()
        {
            Memory.push(new Name("//jframe"), new JFrame());

            Memory.push(new Name("//jpanel/top"), new TopPane());

            Memory.push(new Name("//jpanel/bottom"), new BottomPane());

            Memory.push(new Name("//jmenubar"), new JMenuBar());

            Memory.push(new Name("//jmenu/file"), new JMenu("File"));

            Memory.push(new Name("//jmenu/file/jmenuitem/1"), new JMenu("Item 1"));

            Memory.push(new Name("//jmenu/file/jmenuitem/2"), new JMenu("Item 2"));

            Memory.push(new Name("//jmenu/edit"), new JMenu("Edit"));

            Memory.push(new Name("//jmenu/edit/jmenuitem/1"), new JMenu("Item 1"));

            Memory.push(new Name("//jmenu/edit/jmenuitem/2"), new JMenu("Item 2"));

            Memory.push(new Name("//jmenu/view"), new JMenu("View"));

            Memory.push(new Name("//jmenu/view/jmenuitem/1"), new JMenu("Item 1"));

            Memory.push(new Name("//jmenu/view/jmenuitem/2"), new JMenu("Item 2"));

            Memory.push(new Name("//jtextpane/url"), new JTextPaneURL());

            Memory.push(new Name("//jbutton/back"), new JButton(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\back-16.png")));

            Memory.push(new Name("//jbutton/forward"), new JButton(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\forward-16.png")));

            Memory.push(new Name("//jbutton/reload"), new JButton(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\reload-16.png")));

            Memory.push(new Name("//jbutton/halt"), new JButton(new ImageIcon("C:\\Users\\Mr. Max Rupplin\\Desktop\\halt-16.png")));

            Memory.push(new Name("//jeditorpane/html"), new HTMLPane());
        }

    }

    public static class BuildStep_002
    {

        public BuildStep_002()
        {
            UI_Builder.ref.jframe = (JFrame)Memory.pull(new Name("//jframe"));

            UI_Builder.ref.jmenubar = (JMenuBar)Memory.pull(new Name("//jmenubar"));

            UI_Builder.ref.jmenu_file = (JMenu)Memory.pull(new Name("//jmenu/file"));

            UI_Builder.ref.jmenuitem_file_1 = (JMenuItem)Memory.pull(new Name("//jmenu/file/jmenuitem/1"));

            UI_Builder.ref.jmenuitem_file_2 = (JMenuItem)Memory.pull(new Name("//jmenu/file/jmenuitem/2"));

            UI_Builder.ref.jmenu_edit = (JMenu)Memory.pull(new Name("//jmenu/edit"));

            UI_Builder.ref.jmenuitem_edit_1 = (JMenuItem)Memory.pull(new Name("//jmenu/edit/jmenuitem/1"));

            UI_Builder.ref.jmenuitem_edit_2 = (JMenuItem)Memory.pull(new Name("//jmenu/edit/jmenuitem/2"));

            UI_Builder.ref.jmenu_view = (JMenu)Memory.pull(new Name("//jmenu/view"));

            UI_Builder.ref.jmenuitem_view_1 = (JMenuItem)Memory.pull(new Name("//jmenu/view/jmenuitem/1"));

            UI_Builder.ref.jmenuitem_view_2 = (JMenuItem)Memory.pull(new Name("//jmenu/view/jmenuitem/2"));

            UI_Builder.ref.jpanel_top = (TopPane)Memory.pull(new Name("//jpanel/top"));

            UI_Builder.ref.jtextpane_url = (JTextPane)Memory.pull(new Name("//jtextpane/url"));

            UI_Builder.ref.jbutton_back = (JButton)Memory.pull(new Name("//jbutton/back"));

            UI_Builder.ref.jbutton_forward = (JButton)Memory.pull(new Name("//jbutton/forward"));

            UI_Builder.ref.jbutton_reload = (JButton)Memory.pull(new Name("//jbutton/reload"));

            UI_Builder.ref.jbutton_halt = (JButton) Memory.pull(new Name("//jbutton/halt"));

            UI_Builder.ref.jpanel_bottom = (BottomPane) Memory.pull(new Name("//jpanel/bottom"));

            UI_Builder.ref.jeditorpane = (HTMLPane) Memory.pull(new Name("//jeditorpane/html"));
        }
    }

    public static class BuildStep_003
    {

        public BuildStep_003()
        {

            UI_Builder.ref.jframe.add(UI_Builder.ref.jpanel_top);

            UI_Builder.ref.jframe.add(UI_Builder.ref.jpanel_bottom);

            UI_Builder.ref.jframe.setJMenuBar(UI_Builder.ref.jmenubar);

            //

            UI_Builder.ref.jmenubar.add(UI_Builder.ref.jmenu_file);

            UI_Builder.ref.jmenubar.add(UI_Builder.ref.jmenu_edit);

            UI_Builder.ref.jmenubar.add(UI_Builder.ref.jmenu_view);

            //

            UI_Builder.ref.jmenu_file.add(UI_Builder.ref.jmenuitem_file_1);

            UI_Builder.ref.jmenu_file.add(UI_Builder.ref.jmenuitem_file_2);

            //

            UI_Builder.ref.jmenu_edit.add(UI_Builder.ref.jmenuitem_edit_1);

            UI_Builder.ref.jmenu_edit.add(UI_Builder.ref.jmenuitem_edit_2);

            //

            UI_Builder.ref.jmenu_view.add(UI_Builder.ref.jmenuitem_view_1);

            UI_Builder.ref.jmenu_view.add(UI_Builder.ref.jmenuitem_view_2);

            //

            UI_Builder.ref.jpanel_top.add(UI_Builder.ref.jbutton_back, BorderLayout.NORTH);

            UI_Builder.ref.jpanel_top.add(UI_Builder.ref.jbutton_halt, BorderLayout.EAST);

            UI_Builder.ref.jpanel_top.add(UI_Builder.ref.jbutton_reload);

            UI_Builder.ref.jpanel_top.add(UI_Builder.ref.jbutton_forward);

            UI_Builder.ref.jpanel_top.add(UI_Builder.ref.jtextpane_url);

            //

            UI_Builder.ref.jpanel_bottom.add(UI_Builder.ref.jeditorpane);

        }
    }

    public static class BuildStep_004
    {

        public BuildStep_004()
        {
            UI_Builder.ref.jframe.setSize(new Dimension(1000, 600));

            UI_Builder.ref.jframe.setLayout(new FlowLayout());

            UI_Builder.ref.jframe.setMinimumSize(new Dimension(800, 600));

            UI_Builder.ref.jframe.setVisible(true);

            //

            UI_Builder.ref.jpanel_top.setSize(new Dimension(800, 200));

            UI_Builder.ref.jpanel_top.setBackground(Color.GRAY.darker());

            UI_Builder.ref.jtextpane_url.setPreferredSize(new Dimension(600, 20));

            UI_Builder.ref.jpanel_bottom.setSize(new Dimension(800, 400));

            UI_Builder.ref.jpanel_bottom.setBackground(Color.GRAY.brighter());

            //

            UI_Builder.ref.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //this.jeditorpane.setContentType();

            UI_Builder.ref.jeditorpane.setContentType("text/html");

            UI_Builder.ref.jeditorpane.setText("<html>\n" +
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
