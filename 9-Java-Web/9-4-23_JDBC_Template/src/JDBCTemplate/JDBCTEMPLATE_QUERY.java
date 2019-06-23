package JDBCTemplate;

import Utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/*			4. 查询id为1的记录，将其封装为Map集合
			5. 查询所有记录，将其封装为List
			6. 查询所有记录，将其封装为Emp对象的List集合
			7. 查询总记录数*/
public class JDBCTEMPLATE_QUERY {
    //4. 查询id为1的记录，将其封装为Map集合
    @Test
    public void text1(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        Map<String, Object> map = template.queryForMap("SELECT * from emp WHERE id=?", 1001);
        System.out.println(map);
    }
    //5. 查询所有记录，将其封装为List
    @Test
    public void text2(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        List<Map<String, Object>> list = template.queryForList("SELECT * from emp");
        for (Map<String, Object> map : list) {
            System.out.println(map);
        }
    }
    //6. 查询所有记录，将其封装为Emp对象的List集合
    @Test
    public void text3(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        List<Emp> list = template.query("select * from emp", new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Object o : list) {
            System.out.println(o);
        }
    }
    //查询指定某个记录,封装成Emp对象
    @Test
    public void text5(){
        JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());
        Emp emp = template.queryForObject("select * from emp where id=?", new BeanPropertyRowMapper<>(Emp.class), 1001);
        System.out.println(emp);
        System.out.println(emp.getEname());
    }
    //查询指定某个记录,封装成Emp对象
    @Test
    public void text6(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        List<Emp> list = template.query("select * from emp where id=?", new BeanPropertyRowMapper<Emp>(Emp.class),1001);
        Emp emp=list.get(0);
        System.out.println(emp);
        System.out.println(emp.getEname());
    }
    @Test
    public void text7(){
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        Integer integer = template.queryForObject("select count(*) from emp", Integer.class);
        System.out.println("integer = " + integer);
    }
}
