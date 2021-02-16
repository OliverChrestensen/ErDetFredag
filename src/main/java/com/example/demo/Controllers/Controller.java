package com.example.demo.Controllers;

import com.example.demo.Services.ErDetFredag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@org.springframework.stereotype.Controller
public class Controller {
    ErDetFredag erDetFredag = new ErDetFredag();

    @ResponseBody
    @GetMapping("/Fredag")
    public String erDetFredag(){
    return erDetFredag.isItFriday();
    }
}
