package JDBCTemplate;


import Utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
/* 1. 修改1号数据的 salary 为 10000
 2. 添加一条记录
 3. 删除刚才添加的记录*/
public class JDBCtemplate_update {
    @Test
    public  void update (){
        //创建一个JDBCTemplate 对象,里面传入连接池
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="update emp set salary=10000 where id=?";
        int row = template.update(sql, 1001);
        System.out.println(row);
    }
    //2. 添加一条记录
    @Test
    public void insert(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="insert into emp values(?,?,?,?,?,?,?,?) ";
        int i = template.update(sql, 1015, "通天教主", 4, 1004, "1-01-01", 9999, 9999, 40);
        System.out.println("i = " + i);
    }
    //3. 删除刚才添加的记录
    @Test
    public void Delete(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql="delete from emp where id=?";
        int i = template.update(sql, 1015);
        System.out.println("i = " + i);
    }
}
