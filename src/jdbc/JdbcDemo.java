package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        ArrayList <String> studentInfo = new ArrayList<>();
        ArrayList<Integer> studentId= new ArrayList<>();
        HashMap <Integer, List> students = new HashMap<>();

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/peoplentcdb", "root",
                "root1234");
        Statement stat = con.createStatement();
        ResultSet res = stat.executeQuery("select * from student");


        while (res.next()) {

            studentInfo.add(res.getString("firstname"));
            studentInfo.add(res.getString("lastnamel"));
            studentInfo.add(res.getString("age"));
            studentId.add(res.getInt("idStudent"));

        }

        students.put(studentId.get(0), studentInfo.subList(0,3));
        students.put(studentId.get(1), studentInfo.subList(3,6));
        students.put(studentId.get(2), studentInfo.subList(6,9));
        students.put(studentId.get(3), studentInfo.subList(9,12));
        System.out.println(students);
        

        stat.close();
        con.close();
    }


}
