package com.gabriel.company.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gabriel.company.dto.SigninRequest;
import com.gabriel.company.service.UserService;

import jakarta.validation.Valid;

@Controller
public class AuthController {
    
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String signin(SigninRequest signinRequest){
        return "/auth/signin";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String signin(@Valid SigninRequest signinRequest, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            System.out.println("deu ruim");
            return "/auth/signin";    
        }

        try {
            userService.findByEmail(signinRequest.getEmail());
            System.out.println(userService.getUser());
            model.addAttribute("user", userService.getUser());
        } catch (NoSuchElementException e) {
            model.addAttribute("errorAuthentication", "Invalid email or password");
        }
        return "/auth/signin";
    }

}
