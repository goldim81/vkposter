package com.goldim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping(value = "/vklogin", method = RequestMethod.GET)
    public ModelAndView tableView(){
        ModelAndView page = new ModelAndView("vklogin");
        return page;
    }
}
