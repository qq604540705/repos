package JDB_homeWork;

import Utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//张三给李四转账100块,要用事务保护
/*事务3步
    1.开始事务
         连接对象 调用.setAutoCommit(false); 设置为手动提交
    2.提交事务
        连接对象 调用.Commit(); 设置为自动提交,就提交了事务
    3.回滚
        .rollback();
*/
public class text2 {
    public static void main(String[] args) {
        zz(100);
    }

    public static void zz(int money) {
        //张三给李四转账100块
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = JDBCUtils.getConnection();
            //设置为手动提交
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement("UPDATE account set balance=balance-? where id=?");
            pstmt.setInt(1, money);
            pstmt.setInt(2, 1);
            int i1 = pstmt.executeUpdate();
            pstmt = conn.prepareStatement("UPDATE account set balance=balance+? where id=?");
            pstmt.setInt(1, money);
            pstmt.setInt(2, 2);
            int i2 = pstmt.executeUpdate();
            System.out.println(i1 > 0 ? "转账成功" : "转账失败");
            System.out.println(i2 > 0 ? "转账成功" : "转账失败");
            //提交事务
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
                System.out.println("回滚");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        } finally {
            JDBCUtils.close(conn, pstmt);
        }
    }
}
