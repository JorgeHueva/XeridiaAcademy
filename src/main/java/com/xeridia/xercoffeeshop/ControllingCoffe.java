package com.xeridia.xercoffeeshop;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "demo")
public class ControllingCoffe {

    private Repository repository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewCoffe_O (){
        return "saved";
    }
}
