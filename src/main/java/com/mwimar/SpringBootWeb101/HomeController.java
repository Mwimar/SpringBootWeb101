package com.mwimar.SpringBootWeb101;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called");
        return "index.jsp";
    };

    @RequestMapping("/add")
    public String result(@RequestParam("num1") int num, @RequestParam("num2")int num2, HttpSession session){

        int result= num + num2;
        session.setAttribute("result", result);
        System.out.println(result);
        return"result.jsp";
    }

}