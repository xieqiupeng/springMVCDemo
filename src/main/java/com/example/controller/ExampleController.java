package com.example.controller;

import com.example.model.User;
import com.example.service.impl.ExampleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhan005 on 2016-03-18. Time:11:46 desc:
 */
@Controller
public class ExampleController {
    private static final String TAG = "ExampleController";
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleController.class);
    @Autowired
    private ExampleServiceImpl exampleService;

    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView login(@RequestParam(required = false, value = "userId") String userId) {
        User user = exampleService.get(userId);
        ModelAndView mv = new ModelAndView("login");
        mv.addObject("user", user.toString());
        return mv;
    }

    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public ModelAndView register(
          @RequestParam(value = "mobile") String mobile,
            @RequestParam(value = "password") String password) {
        User user = exampleService.login(mobile, password);
        ModelAndView mv = new ModelAndView("login");
        if (user.getId() == null) {
            mv.addObject("user", "，登录失败，error用户不存在");
        }
        mv.addObject("user", user.toString());
        return mv;
    }
} 