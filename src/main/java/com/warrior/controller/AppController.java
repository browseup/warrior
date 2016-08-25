package com.warrior.controller;

import com.warrior.dao.UnitDao;
import com.warrior.entity.Unit;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes
public class AppController {
    @Autowired
    UnitDao unitDao;

    @Autowired
    SessionFactory sessionFactory;

//    @RequestMapping("/")
//    public String hello(Model model) {
//        model.addAttribute("warrior", (Warrior)warriorDao.getById(1));
//        return "hello";
//    }

    @RequestMapping("/")
    public String warrior(Model model) {
        model.addAttribute("crypt", new BCryptPasswordEncoder().encode("user"));
//        List<Warrior> lw = warriorDao.getAll();
//        model.addAttribute("warrior", lw);
        return "hello";
    }

    @ModelAttribute("unitadd")
    public Unit formBackingObject() {
        return new Unit();
    }

    @RequestMapping("/unit")
    public String unit(Model model) {
        List<Unit> lu = unitDao.getAll();
        model.addAttribute("unit_list", lu);
//        model.addAttribute("unitadd", new Unit());
        return "unit";
    }

    @RequestMapping(value = "/addunit", method = { RequestMethod.POST })
    public String addUnit(@ModelAttribute("unitadd") Unit unit, Model model) {
//    public String addUnit(Model model) {
//        Unit unit = formBackingObject();
        model.addAttribute("unitadd", unit.getName());
        return "test";
    }

//    @RequestMapping(value = "/addunit", method = { RequestMethod.POST })
//    public String addUnit1(@ModelAttribute("unitadd") Unit unit, Model model) {
////    public String addUnit(Model model) {
////        Unit unit = formBackingObject();
//        model.addAttribute("unitadd", unit.getName());
//        return "test";
//    }

//    @RequestMapping("/auth/list")
//    public String magician(Model model) {
//        List<Warrior> lw = warriorDao.getAll();
//        model.addAttribute("warrior", lw);
//        List<Magician> lm = magicianDao.getAll();
//        model.addAttribute("magician", lm);
//        return "list";
//    }

//    @RequestMapping("/")
//    public String main(Model model) {
//        List<Warrior> lw = warriorDao.getAll();
//        model.addAttribute("warrior", lw);
//        return "list";
//    }
}
