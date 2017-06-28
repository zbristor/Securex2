package byAJ.Securex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){

        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
