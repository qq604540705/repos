package fy.service;

import fy.domain.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    Item findById(Integer id);
}
