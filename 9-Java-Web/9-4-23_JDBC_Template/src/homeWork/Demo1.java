package homeWork;

import Utils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*1、As we know，大家之前学过IO或者集合版的学生管理系统，先再完成一个数据库版的学生管理系统，是不是很easy?
* 1.步骤分解,需要连接数据库
* 2.需要键盘录入,增删改查,直接连接数据库调用数据
*
    1.账号登入 :
                键盘录入 和数据库数据匹配判断
                prepareStatement
*   2.增删改查:
*           1.增: 账号 密码 姓名 年龄 insert
*           2.删: 根据学号或姓名 delete
*           3.改: 通过学号或姓名修改 update
*           4.查:通过学号或名字查个人/查所有人信息
* */
public class Demo1 {
    public static void main(String[] args) {
        //调用键盘录入模块
        boolean user = user();
        //如果登录成功 进入学生管理系统
        if (user) {
            //让系统一直运行
            while (true) {
                //键盘录入 选择的功能
                Scanner sc = new Scanner(System.in);
                System.out.println("         1.    添加学生信息");
                System.out.println("         2.    删除学生信息");
                System.out.println("         3.    修改学生信息");
                System.out.println("         4.    查询学生信息");
                System.out.println("         5.    退出系统");
                int number = sc.nextInt();
                if (number == 1) {
                    insert();
                } else if (number == 2) {
                    delete();
                } else if (number == 3) {
                    update();
                } else if (number == 4) {
                    query();
                } else if (number == 5) {
                    System.out.println("欢迎下次访问");
                    break;
                } else {
                    System.out.println("输入有误,请重新输入");
                }
            }
        }
    }

    //1.键盘录入账号以及密码,以及判断登录是否成功
    public static boolean user() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------欢迎访问学生成绩查询系统---------------");
        System.out.println("进入系统需要先登入,请输入账号");
        String user = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        //调用登录模块获得结果
        if (login(user, password)) {
            System.out.println("---------------登入成功,进入学生管理系统---------------");
        } else {
            System.out.println("账号或密码错误,请检查账号或密码");
        }
        return login(user, password);
    }

    //2.账号登入模块
    public static boolean login(String username, String password) {
        try {
            JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
            String sql = "SELECT id from student where username=? and PASSWORD=?";
            Integer integer = template.queryForObject(sql, Integer.class, username, password);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    //增删改查:
    // 1.增: 账号 密码 姓名 年龄 insert
    public static void insert() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入需要增加的学生信息,用-隔开(如:账号-密码-姓名-年龄)");
                String user = sc.nextLine();
                //把输入的字符串按-切割
                String[] splits = user.split("-");
                //将数据添加进数据库
                JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
                String sql = "insert into student values (null,?,?,?,?);";
                int update = template.update(sql, splits[0], splits[1], splits[2], Integer.parseInt(splits[3]));
                if (update > 0) {
                    System.out.println("修改成功");
                    break;
                } else {
                    System.out.println("格式输入有误,请重新输入");
                }
            } catch (Exception e) {
                System.out.println("格式输入有误,请重新输入");
            }
        }
    }

    //增删改查:
    //2.删: 根据学号或姓名 delete
    public static void delete() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入需要删除的学生id");
                int i = sc.nextInt();
                JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
                String sql = "DELETE FROM student where id=?";
                int delete = template.update(sql, i);
                if (delete > 0) {
                    System.out.println("修改成功");
                    break;
                } else {
                    System.out.println("格式输入有误,请重新输入");
                }
            } catch (Exception e) {
                System.out.println("格式输入有误,请重新输入");
            }
        }
    }


    //增删改查:
    //3.改: 通过学号或姓名修改 update
    public static void update() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入需要修改的学生id");
                int i = sc.nextInt();
                //先判断是否存在改学生id
                JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
                String sql1 = "SELECT age from student where id=?";
                Integer integer = template.queryForObject(sql1, Integer.class, i);
                if (integer > 0) {        //如果存在将进行修改
                    //做一个查询,打印出需要该ID的学生信息
                    Map<String, Object> map = template.queryForMap("SELECT * from student where id=?", i);
                    System.out.println(map);
                    //键盘录入需要修改学生的信息
                    System.out.println("请输入学生新信息(不修改请使用原值),使用- 间隔,例如:账号-密码-姓名-年龄");
                    Scanner sc2 = new Scanner(System.in);
                    String s = sc2.nextLine();
                    String[] splits = s.split("-");
                    String sql = "UPDATE student set username=?,PASSWORD=?,nickname=?,age=? WHERE id=?;";
                    int update = template.update(sql, splits[0], splits[1], splits[2], Integer.parseInt(splits[3]), i);
                    if (update > 0) {
                        System.out.println("修改成功");
                        break;
                    } else {
                        System.out.println("格式输入有误,请重新输入");
                    }
                }
            } catch (Exception e) { //如果id不存在会报错,重复进行查询
                System.out.println("格式输入有误,请重新输入");
            }
        }
    }

    //增删改查
    // 4.查:通过学号或名字查个人/查所有人信息
    public static void query() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入(1or2)查询信息,1.查询所有学生信息 2.根据id查询学生信息");
                int i = sc.nextInt();
                if (i == 1) {
                    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
                    List<Map<String, Object>> list = template.queryForList("SELECT * from student");
                    for (Map<String, Object> map : list) {
                        System.out.println(map);
                    }
                    break;
                } else if (i == 2) {
                    Scanner sc2=new Scanner(System.in);
                    System.out.println("请输入学生ID");
                    int i1 = sc2.nextInt();
                    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
                    Map<String, Object> map = template.queryForMap("SELECT * FROM student WHERE id=?", i1);
                    System.out.println(map);
                    break;
                }
            } catch (Exception e) {
                System.out.println("输入信息有误,请重新输入");
            }
        }
    }
}