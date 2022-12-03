package bugtrackingsystem;

import bugtrackingsystem.forms.Login1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BugTrackingSystem {

    public static void main(String[] args) throws SQLException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }
}
