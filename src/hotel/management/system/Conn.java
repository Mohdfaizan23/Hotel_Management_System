package hotel.management.system;

import java.sql.*;

/**
 *
 * @author Mohd Faizan
 */
public class Conn {
    
    Connection c;
    Statement s;
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem", "root", "");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
