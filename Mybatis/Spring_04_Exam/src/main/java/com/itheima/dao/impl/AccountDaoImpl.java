package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.utils.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author 王磊
 * @Date 2019/6/12/012
 */
public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    public List<Account> findAll() {
        String sql = "select * from account";
        return template.query(sql,new BeanPropertyRowMapper<Account>(Account.class));
    }

    public Account findByUsername(String username) {
        String sql = "select * from account where username = ? ";
        return template.queryForObject(sql,new BeanPropertyRowMapper<Account>(Account.class),username);
    }

    public Integer findTotalcount() {
        String sql = "select count(*) from account";
        return template.queryForObject(sql,Integer.class);
    }

    public void add(Account account) {
        String sql = "insert into account values(null,?,?)";
        template.update(sql,account.getUsername(),account.getMoney());
    }

    public void update(Account account) {
        String sql = "update account set username = ? ,money = ? where id = ? ";
        template.update(sql,account.getUsername(),account.getMoney(),account.getId());
    }

    public void deleteById(Integer id) {
        String sql = "delete from account where id = ? ";
        template.update(sql,id);
    }
}
