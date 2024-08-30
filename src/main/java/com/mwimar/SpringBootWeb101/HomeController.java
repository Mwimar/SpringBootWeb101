package com.mwimar.SpringBootWeb101;


import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    public String home(){
        return "index.jsp";
    };
}