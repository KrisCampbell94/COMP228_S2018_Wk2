package Week8.Ex6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboboxFrame extends JFrame {
    private final JComboBox<String> imagesJCombobox;
    private final JLabel label;

    private static final String[] names = {
            "bug1.gif","bug2.gif",
            "buganim.gif","travelbug.gif"
    };
    private final Icon[] icons={
            new ImageIcon(getClass().getResource(names[0])),
            new ImageIcon(getClass().getResource(names[1])),
            new ImageIcon(getClass().getResource(names[2])),
            new ImageIcon(getClass().getResource(names[3]))
    };

    public ComboboxFrame(){
        super("Testing JCombobox");
        setLayout(new FlowLayout());

        imagesJCombobox = new JComboBox<String>(names);
        imagesJCombobox.setMaximumRowCount(3);

        // Anonymous inner class
        imagesJCombobox.addItemListener(
                // Start of our anonymous inner class
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED)
                            label.setIcon(icons[imagesJCombobox.getSelectedIndex()]);
                    }
                } // End of anon inner class
        ); // End call to addItemListener

        add(imagesJCombobox);
        label = new JLabel(icons[0]);
        add(label);
    }
}
