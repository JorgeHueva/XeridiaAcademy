package com.xeridia.xercoffeeshop;


import com.xeridia.xercoffeeshop.repository.CoffeRepository;
import com.xeridia.xercoffeeshop.repository.Coffe_ORepository;
import com.xeridia.xercoffeeshop.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(path = "cafeteria")
@CrossOrigin(origins = "http://localhost:4200")
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

    @PostMapping(path = "/agrega")
    public @ResponseBody String addNewPedido (@RequestBody ArrayList<Coffe_O> order){

        Pedido p = new Pedido();
        p.setOrder_id(2);
        p.setRegistDate(LocalDate.now());


        System.out.println(order.get(0).getTypeCoffe_O());

        pedidoRepository.save(p);
        return "Saved";
    }

    @GetMapping(path="/cafes")
    public @ResponseBody List<Coffe> getAllUsers() {
        // This returns a JSON or XML with the users
        return (List<Coffe>) repository.findAll();
    }
}
