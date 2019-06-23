package fy.service.serviceImpl;

import fy.dao.ItemDao;
import fy.domain.Item;
import fy.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;
    @Override
    public Item findById(Integer id) {
        Item item = itemDao.findById(id);
        return item;
    }
}
