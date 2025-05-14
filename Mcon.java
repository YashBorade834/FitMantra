import java.sql.*;

public class Mcon {

    Connection con;
    Statement stmt;
    ResultSet rs;

    Mcon() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/workout", "postgres",
                    "yash");
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//create table information(name varchar(50),username varchar(50) primary key,
//password varchar(10),mail varchar(30) UNIQUE,question varchar(50), answer
//varchar(50));
