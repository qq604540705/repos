package DruidDemo;

import Utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo2 {
    public static void main(String[] args) {
        Connection conn =null;
        PreparedStatement ppsmt =null;
        ResultSet rs =null;
        try {
            conn = JDBCUtils.getConnection();
            ppsmt = conn.prepareStatement("SELECT * from emp");
            rs = ppsmt.executeQuery();
            rs.next();
            int anInt = rs.getInt(1);
            System.out.println(anInt);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                JDBCUtils.close(conn,ppsmt,rs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
