package fy.controller;

import fy.domain.Item;
import fy.service.serviceImpl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping(path = "/ItemController")
public class ItemController {
    @Autowired
    private ItemServiceImpl itemService;
    @RequestMapping(path = "/findById")
    public String findById(Integer id, Model model){
        Item item = itemService.findById(id);
        System.out.println("item = " + item);
        model.addAttribute("item",item);
        return "itemDetail";
    }

}
