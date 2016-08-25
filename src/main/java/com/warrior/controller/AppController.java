package com.warrior.controller;

import com.warrior.dao.UnitDao;
import com.warrior.entity.Unit;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes(types = Unit.class)
public class AppController {
    @Autowired
    UnitDao unitDao;

    @Autowired
    SessionFactory sessionFactory;

    @ModelAttribute("unitadd")
    public Unit formBackingObject() {
        return new Unit();
    }

    @ModelAttribute("unitadd1")
    public Unit formBackingObject1() {
        return new Unit();
    }

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

    @RequestMapping("/unit")
    public String unit(Model model) {
        List<Unit> lu = unitDao.getAll();
        model.addAttribute("unit_list", lu);
//        model.addAttribute("unitadd", new Unit());
        return "unit";
    }

    @RequestMapping(value = "/addunit", method = RequestMethod.POST)
    public String addUnit(@ModelAttribute("unitadd") Unit unit, Model model) {
//    public String addUnit(Model model) {
//        Unit unit = formBackingObject();
        model.addAttribute("unitadd", unit.getName());
        return "test";
    }

    @RequestMapping(value = "/addunit1", method = RequestMethod.GET)
    public String addUnit1(@ModelAttribute("unitadd") Unit unit, Model model) {
//    public String addUnit(Model model) {
//        Unit unit = formBackingObject();
        model.addAttribute("unitadd", unit.getName());
        return "test";
    }

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
