package com.spring.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    UserServiceImpl service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){return "login";}

    //로그인 실패
    @RequestMapping(value = "/loginfalse")
    public String loginFalse() {
        return "loginfalse";
    }

    //로그인 확인
    @RequestMapping(value = "/loginOk", method = RequestMethod.POST)
    public String loginCheck(HttpSession session, UserVO vo){
        String returnURL = "";
        if(session.getAttribute("login") != null){
            session.removeAttribute("login");
        }

        UserVO loginvo = service.getUser(vo);
        if(loginvo != null){//로그인 성공
            System.out.println("로그인 성공!");
            session.setAttribute("login", loginvo);
            returnURL = "redirect:/animal/list";
        }
        else {
            System.out.println("로그인 실패!");
            returnURL = "redirect:/login/loginfalse";
        }
        return returnURL;
    }

    //로그아웃 하는 부분
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        System.out.println("로그아웃 성공!");
        session.invalidate();
        return "redirect:/login/login";
    }
}
