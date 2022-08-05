package com.xeridia.xercoffeeshop;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "cafeteria")
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
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Coffe> getAllUsers() {
        // This returns a JSON or XML with the users
        return repository.findAll();
    }
}
