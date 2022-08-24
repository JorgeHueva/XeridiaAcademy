package com.xeridia.xercoffeeshop;


import com.google.gson.JsonObject;
import com.xeridia.xercoffeeshop.repository.*;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.security.MessageDigest;
import org.apache.commons.codec.binary.Base64;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.ArrayList;
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
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private FavouriteRepository favouriteRepository;

    Long num = Long.valueOf(0);

    public String addNewCoffe_O (String Type_Coffe, int num_Coffe, double Price, Long num){

        Coffe_O c = new Coffe_O();

        Optional<Coffe> optionalCoffe = repository.findById(Type_Coffe);
        Optional<Pedido> optionalOrder = pedidoRepository.findById(num);
        if (optionalCoffe.isPresent() && optionalOrder.isPresent()) {
            c.setCoffe(optionalCoffe.get());
            c.setNum_Coffe(num_Coffe);
            c.setPrice(Price);
            c.setPedido(optionalOrder.get());
            coffe_oRepository.save(c);
        }
       return "Saved";
    }

    @PostMapping(path = "/agrega")
    public @ResponseBody String addNewPedido (@RequestBody(required=false) ArrayList<Object> order){

        Pedido p = new Pedido();

        String typeCoffe;
        int numCoffe;
        double price;

        p.setRegistDate(LocalDate.now());
        pedidoRepository.save(p);
        num = p.getOrder_id();


        if (!order.isEmpty()){
            for (int i=0; i < order.size() ;i++){
                typeCoffe = (String) ((LinkedHashMap) order.get(i)).get("typeCoffe");
                numCoffe = (int) ((LinkedHashMap) order.get(i)).get("numCoffe");
                if (((LinkedHashMap) order.get(i)).get("price").getClass().isInstance(Double.valueOf(0.00))){
                    price = (double) ((LinkedHashMap) order.get(i)).get("price");
                }else {
                    price = ((Integer) ((LinkedHashMap) order.get(i)).get("price")).doubleValue();
                }
                this.addNewCoffe_O(typeCoffe,numCoffe,price,num);
            }
        }
        num ++;
        return "Saved";
    }

    @PostMapping(path = "/registro")
    public @ResponseBody String addNewClient (@RequestBody(required=false) Client cliente){

        Client c = new Client();
        c = cliente;

        c.setPassword(getHash(cliente.getPassword()));
        System.out.println(c);
        clientRepository.save(c);
        return "Saved";

    }

    @GetMapping(path="/cafes")
    public @ResponseBody List<Coffe> getAllUsers() {
        // This returns a JSON or XML with the users
        return (List<Coffe>) repository.findAll();
    }
    @PostMapping(path = "/login")
    public @ResponseBody Client logeado (@RequestBody(required=false) Client logeado){
        Client c = new Client();
        c = logeado;

        c.setPassword(getHash(logeado.getPassword()));

        Optional<Client> opcionalclient = clientRepository.findById(c.getEmail());
        if (!opcionalclient.isEmpty() && Objects.equals(opcionalclient.get().getPassword(), c.getPassword()) ){
            return opcionalclient.get();
        }

        return null;
    }

    public static String getHash(String txt) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest
                    .getInstance("MD5");
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
                        .substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @PostMapping(path = "/favoritos")
    public @ResponseBody Favourite addFav (@RequestBody(required=false) Favourite fav){

        Favourite f = new Favourite();
        f = fav;

        f.setTypeCoffe(fav.getTypeCoffe());

        System.out.println(fav);

        favouriteRepository.save(f);


    return null;



    }

}
