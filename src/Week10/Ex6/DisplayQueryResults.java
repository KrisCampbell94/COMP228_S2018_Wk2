package Week10.Ex6;

// IMPORTS
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;

import javax.swing.*;


public class DisplayQueryResults extends JFrame {
    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String DATABASE_URL = "jdbc:sqlserver://localhost:1433;" +
            "database=Product;integratedSecurity=true";
    public static final String DEFAULT_QUERY = "SELECT * FROM Product";

    // public static final ResultSetTableModel table;
}
