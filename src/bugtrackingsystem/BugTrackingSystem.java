package bugtrackingsystem;

import bugtrackingsystem.forms.Login1;
import java.sql.*;

public class BugTrackingSystem {

    public static void main(String[] args) throws SQLException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }
}
