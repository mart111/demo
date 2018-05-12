package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RegistrationController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView signup() {

        return new ModelAndView("signup");
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ModelAndView handleSignup(@RequestParam String name,
                                     @RequestParam String surname,
                                     @RequestParam String username,
                                     @RequestParam String password) {
        if (userService.validateLogin(username, password)) {
            userService.add(new User(name, surname, username, password));
            return new ModelAndView("login");
        }

        return null;
    }
}
