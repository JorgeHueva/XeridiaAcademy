package com.xeridia.xercoffeeshop;


import com.google.gson.JsonObject;
import com.xeridia.xercoffeeshop.repository.CoffeRepository;
import com.xeridia.xercoffeeshop.repository.Coffe_ORepository;
import com.xeridia.xercoffeeshop.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import com.google.gson.Gson;
import java.util.*;

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
    int num = 0;

    public String addNewCoffe_O (String Type_Coffe, int num_Coffe, double Price, int order_id){

        Coffe_O c = new Coffe_O();

       c.setTypeCoffe_O(Type_Coffe);
       c.setNum_Coffe(num_Coffe);
       c.setPrice(Price);
       c.setOrder_id(order_id);
       coffe_oRepository.save(c);
       return "Saved";
    }

    @PostMapping(path = "/agrega")
    public @ResponseBody String addNewPedido (@RequestBody(required=false) ArrayList<Object> order){

        Pedido p = new Pedido();
        List o = (List) pedidoRepository.findAll();
        String typeCoffe;
        int numCoffe;
        double price;

        if (!o.isEmpty()){
            num = o.size()+1;
        }

        p.setOrder_id(num);
        p.setRegistDate(LocalDate.now());

        if (!order.isEmpty()){
            for (int i=0; i < order.size() ;i++){
                typeCoffe = (String) ((LinkedHashMap) order.get(i)).get("typeCoffe");
                numCoffe = (int) ((LinkedHashMap) order.get(i)).get("numCoffe");
                price = (double) ((LinkedHashMap) order.get(i)).get("price");
                this.addNewCoffe_O(typeCoffe,numCoffe,price,num);
            }
        }
        num ++;
        pedidoRepository.save(p);
        return "Saved";
    }

    @GetMapping(path="/cafes")
    public @ResponseBody List<Coffe> getAllUsers() {
        // This returns a JSON or XML with the users
        return (List<Coffe>) repository.findAll();
    }
}
