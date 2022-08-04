package com.xeridia.xercoffeeshop;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "demo")
public class ControllingCoffe {

    private Repository repository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewCoffe_O (@RequestParam String Type_Coffe,@RequestParam int num_Coffe, @RequestParam double Price){

        Coffe c = new Coffe();

        c.setTypeCoffe(Type_Coffe);
        c.setNumberCoffe(num_Coffe);
        c.setPriceCoffe(Price);

        repository.save(c);
        return "saved";
    }
}
