package Week2;

import javax.swing.JOptionPane;

public class DialogEx2 {
    public static void main(String[] args) {
        //Prompts the user to enter name
        String name = JOptionPane.showInputDialog("What is your name?");
        // Creates a custom message
        String message = String.format("Welcome, %s, to Java programming",name);
        JOptionPane.showMessageDialog(null,message);
    }
}
