package com.warrior.controller;

import com.warrior.dao.MagicianDao;
import com.warrior.dao.WarriorDao;
import com.warrior.entity.Magician;
import com.warrior.entity.Warrior;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    WarriorDao warriorDao;

    @Autowired
    MagicianDao magicianDao;

    @Autowired
    SessionFactory sessionFactory;

//    @RequestMapping("/")
//    public String hello(Model model) {
//        model.addAttribute("warrior", (Warrior)warriorDao.getById(1));
//        return "hello";
//    }

    @RequestMapping("/")
    public String warrior(Model model) {
//        List<Warrior> lw = warriorDao.getAll();
//        model.addAttribute("warrior", lw);
        return "hello";
    }

    @RequestMapping("/list")
    public String magician(Model model) {
        List<Warrior> lw = warriorDao.getAll();
        model.addAttribute("warrior", lw);
        List<Magician> lm = magicianDao.getAll();
        model.addAttribute("magician", lm);
        return "list";
    }

//    @RequestMapping("/")
//    public String main(Model model) {
//        List<Warrior> lw = warriorDao.getAll();
//        model.addAttribute("warrior", lw);
//        return "list";
//    }
}
