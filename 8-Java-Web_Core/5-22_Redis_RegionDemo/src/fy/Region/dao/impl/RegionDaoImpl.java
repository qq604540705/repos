package fy.Region.dao.impl;

import fy.Region.dao.RegionDao;
import fy.Region.domain.Region;
import fy.Region.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class RegionDaoImpl implements RegionDao {
    private static JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List findALL() {
        String sql="select NAME from province";
        List<Region> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Region>(Region.class));
        return list;
    }
}
