package com.xeridia.xercoffeeshop;


import com.xeridia.xercoffeeshop.repository.CoffeRepository;
import com.xeridia.xercoffeeshop.repository.Coffe_ORepository;
import com.xeridia.xercoffeeshop.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

@Controller
@RequestMapping(path = "cafeteria")
public class ControllingCoffe {
    @Autowired
    private CoffeRepository repository;
    @Autowired
    private Coffe_ORepository coffe_oRepository;
    private List<Coffe> coffe;
    @Autowired
    private PedidoRepository pedidoRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewCoffe_O (@RequestParam String Type_Coffe,@RequestParam int num_Coffe, @RequestParam double Price){

        Coffe_O c = new Coffe_O();

       c.setTypeCoffe_O(Type_Coffe);
       c.setNum_Coffe(num_Coffe);
       c.setPrice(Price);
       coffe_oRepository.save(c);
       return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Coffe> getAllUsers() {
        // This returns a JSON or XML with the users
        return repository.findAll();
    }

    @PostMapping(path = "/add")
    public @ResponseBody String pedido (@RequestParam int order_id,@RequestParam Calendar registDate){
        Pedido p = new Pedido();

        p.setOrder_id(order_id);
        p.setRegistDate(registDate);

        pedidoRepository.save(p);
        return "Saved";
    }
}
