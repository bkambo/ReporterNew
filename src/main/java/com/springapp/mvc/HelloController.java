package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller


public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getdata() {

        List<String> list = getList();
        ModelAndView model = new ModelAndView("hello");
        model.addObject("listToOutput", list);

        return model;

    }

    private List<String> getList() {

        List<String> list = new ArrayList<String>();
        list.add("poop");
        list.add("poops");
        list.add("more poops");
        list.add("poopies");
        list.add("more poopies");
        list.add("even more poopies");
        list.add("poop and poopies");

        return list;

    }

}
