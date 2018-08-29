package com.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.User;
import com.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
    private IUserService userService;

    @RequestMapping("userShow")
    public String toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));

        User user = userService.getUserById(userId);

        model.addAttribute("user", user);

        return "showUser";
    }
}
