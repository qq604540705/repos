package fy.UresManagement.service.impl;

import fy.UresManagement.dao.UserDao;
import fy.UresManagement.dao.impl.UserDaoImpl;
import fy.UresManagement.domain.User;
import fy.UresManagement.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao dao=new UserDaoImpl();
    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        List<User> daoAll = dao.findAll();
        return daoAll;
    }

    @Override
    public User login(User user) {
       //调用数据库的方法进行查询
        String username = user.getUsername();
        String password = user.getPassword();
        return dao.findUsernameAndPassword(username, password);
    }

    @Override
    public void addUser(User user) {
        dao.addUser(user);
    }
    /*
    * 调用DAO去删除该ID的用户信息
    * */
    @Override
    public void deleteUser(int id) {
        dao.deleteUser(id);
    }

    /**
     *
     * @param uids
     */
    @Override
    public void deleteSelectUser(String[] uids) {
        for (String uid : uids) {
            int i = Integer.parseInt(uid);
            dao.deleteUser(i);
        }
    }
}
