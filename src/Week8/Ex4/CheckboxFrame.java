package Week8.Ex4;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckboxFrame extends JFrame {
    private final JTextField textField;
    private final JCheckBox boldJCheckBox;
    private final JCheckBox italicJCheckBox;

    public CheckboxFrame(){
        super("JCheckbox Test");
        setLayout(new FlowLayout());

        // Set up textfield
        textField = new JTextField("Watch the font style change",20);
        textField.setFont(new Font("Serif",Font.PLAIN,14));
        add(textField);

        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
        add(boldJCheckBox);
        add(italicJCheckBox);

        // Create our event handler for the checkboxes
        CheckboxHandler handler = new CheckboxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
    }

    private class CheckboxHandler implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e){
            Font font = null;
            int BOLD_ITALIC = Font.BOLD + Font.ITALIC;
            if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
                font = new Font("Serif", BOLD_ITALIC,14);
            else if (boldJCheckBox.isSelected())
                font = new Font("Serif", font.BOLD,14);
            else if (italicJCheckBox.isSelected())
                font = new Font("Serif", font.ITALIC,14);
            else
                font = new Font("Serif", font.PLAIN,14);
            textField.setFont(font);
        }
    }
}
