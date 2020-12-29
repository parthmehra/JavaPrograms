package com.company;
import java.sql.*;

public class DemoClass {

    public static void main(String[] args) throws Exception,ClassNotFoundException {
        String url="jdbc:mysql://localhost:3306/alien";
        String uname="root";
        String password="";
        String query="select sname from students where userid=3";

        Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection(url,uname,password);
        Statement st=con.createStatement();
        st.executeQuery(query);
    }
}