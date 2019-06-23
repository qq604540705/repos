package fy.dao;


import fy.domain.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao {

    public Item findById(String id);
}
