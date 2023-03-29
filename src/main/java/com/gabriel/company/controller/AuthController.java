package com.gabriel.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gabriel.company.dto.SigninRequest;

import jakarta.validation.Valid;

@Controller
public class AuthController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String signin(SigninRequest signinRequest){
        return "/auth/signin";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String signin(@Valid SigninRequest signinRequest, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            System.out.println("deu ruim");
            return "/auth/signin";    
        }
        System.out.println("deu bom");
        return "/auth/signin";
    }

}
