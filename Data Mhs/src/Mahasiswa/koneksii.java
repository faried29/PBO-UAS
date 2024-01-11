package Mahasiswa;
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksii {
    Connection mahaiswa;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection mahaiswa = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa","root","");
            return mahaiswa;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
