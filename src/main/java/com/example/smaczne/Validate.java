package com.example.smaczne;
import java.sql.*;

public class Validate {
    public static boolean checkUser(String name,String pass)
    {
        boolean st =false;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //załadowanie sterownika do obsługi bazy danych

            //utworzenie połączenia z bazą danych - łączymy się do bazy danych o nazwie users na konto 123 z hasłem 123
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","123","123");
            //utworzenie zapytania do bazy danych
            PreparedStatement ps = con.prepareStatement("select * from student where name=? and pass=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs =ps.executeQuery(); //wykonanie utworzonego zapytania
            st = rs.next();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;
    }
}