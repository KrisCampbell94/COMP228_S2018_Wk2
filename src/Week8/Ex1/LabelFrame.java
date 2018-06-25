package Week8.Ex1;

// Provides basic window features
import javax.swing.JFrame;
// Specifies how components are arranged
import java.awt.FlowLayout;
// Display text and images
import javax.swing.JLabel;
// Common constant values used with SWING
import javax.swing.SwingConstants;
// Interface used to manipulate images
import javax.swing.Icon;
// Load images
import javax.swing.ImageIcon;

// Not good programming practice
// import javax.swing.*; // Imports everything

public class LabelFrame extends JFrame {

    // Variables
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public LabelFrame(){
        // Calls the JFrame constructor and sets the title of the window
        super("JLabel Demo");
        setLayout(new FlowLayout());

        // Create label1 and define its features
        label1 = new JLabel("Label with Text");
        label1.setToolTipText("Label1 tooltip text");
        add(label1);

        // Create label2 with a string, an image and alignment
        Icon bug = new ImageIcon(getClass().getResource("GUItip.gif"));
        label2 = new JLabel("Label with text and icon",bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);

        // Creating label3
        label3 = new JLabel();
        label3.setText("Label with icon and text AT THE BOTTOM");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Label 3 tooltip text");
        add(label3);
    }
}
