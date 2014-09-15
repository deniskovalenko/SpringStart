package com.springapp.mvc;

/**
 * Created by Денис on 9/15/2014.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PersonController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("person", "command", new Person());
    }
    @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("SpringWeb")Person person, ModelMap model){
        model.addAttribute("name", person.getName());
        model.addAttribute("age", person.getAge());
        model.addAttribute("id", person.getId());

        return "result";
    }
}
