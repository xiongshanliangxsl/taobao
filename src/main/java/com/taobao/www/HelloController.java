package com.taobao.www;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
public class HelloController {
    
    @RequestMapping("/thymeleaf")
    public ModelAndView thymeleaf(){
        log.info("info thymeleaf()");
        ModelAndView modelAndView = new ModelAndView("/thymeleaf");
        User user = new User();
        user.setUserName("myName");
        user.setPassword("myPassword");
        Role role = new Role();
        role.setName("myRole");
        user.setRole(null);
        modelAndView.addObject(user);
        return modelAndView;
    }

    @RequestMapping("/beetl")
    public ModelAndView index(){
        log.info("info beetl()");
        ModelAndView modelAndView = new ModelAndView("/beetl.btl");
        User user = new User();
        user.setUserName("myName");
        user.setPassword("myPassword");
        Role role = new Role();
        role.setName("myRole");
        user.setRole(null);
        modelAndView.addObject(user);
        return modelAndView;
    }
}
