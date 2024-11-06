package com.Moviee.Movie.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {

    @GetMapping("/")
    public String Login() {
        return "Login";
    }
    @GetMapping("/Sign-Up")
    public String sign(){
        return "sign";
    }
}
