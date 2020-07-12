package app.controller;

import app.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegController {

    @GetMapping
    public ModelAndView showForm(Person person) {
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("person", person);
        return mav;
    }

    @PostMapping
    public ModelAndView register(@Valid Person person, Errors errors) {
        ModelAndView mav = new ModelAndView("register");
        if (!errors.hasErrors()) {
            mav.addObject("message", "Successfully");
        }
        return mav;
    }
}
