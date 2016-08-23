package com.warrior.controller;

import com.warrior.dao.WarriorDao;
import com.warrior.entity.Warrior;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    WarriorDao warriorDao;

    @Autowired
    SessionFactory sessionFactory;

//    @RequestMapping("/")
//    public String hello(Model model) {
//        model.addAttribute("warrior", (Warrior)warriorDao.getById(1));
//        return "hello";
//    }

    @RequestMapping("/")
    public String hello(Model model) {
        List<Warrior> lw = warriorDao.getAll();
        model.addAttribute("warrior", lw);
        return "list";
    }
}
