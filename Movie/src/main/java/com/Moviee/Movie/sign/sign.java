package com.Moviee.Movie.sign;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sign {
    @GetMapping("Sign")
    public String sign(){
        return "sign";
    }
}
