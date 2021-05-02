package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ConexionForSql2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Connection con = ConnectionToSql.connectTosql();
        Statement stat = con.createStatement();
        ResultSet res = stat.executeQuery(" select * from nameemploye");
        ArrayList<Integer> employeID = new ArrayList<>();
        ArrayList employeInfo = new ArrayList();
        HashMap<Integer, List> employe = new HashMap<>();
        while (res.next()) {
            int idFromDB = (res.getInt("id"));
            String nameFromDB = (res.getString("name"));
            String lastnameFromDB = (res.getString("lastname"));
            int ageFromDB = (res.getInt("age"));
            employeID.add(idFromDB);
            employeInfo.add(nameFromDB);
            employeInfo.add(lastnameFromDB);
            employeInfo.add(ageFromDB);
        }
        employe.put(employeID.get(0), employeInfo.subList(0, 3));
        employe.put(employeID.get(1), employeInfo.subList(3, 6));
        employe.put(employeID.get(2), employeInfo.subList(6, 9));
        employe.put(employeID.get(3), employeInfo.subList(9, 12));
        System.out.println(employe);
        System.out.println("--------------dispaly hash with Iterator--------");
        Iterator ita = employe.entrySet().iterator();
        while (ita.hasNext()) {
            System.out.println(ita.next());
        }
        System.out.println("---------------dispaly with inhanced forlop-----------------");
        for (Map.Entry m : employe.entrySet()) {
            System.out.println(m.getKey() + "=" + m.getValue());
        }
        ConnectionToSql.clearConection(stat,con);
    }
}
