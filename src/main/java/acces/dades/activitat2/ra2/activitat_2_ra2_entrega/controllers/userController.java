  package acces.dades.activitat2.ra2.activitat_2_ra2_entrega.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import acces.dades.activitat2.ra2.activitat_2_ra2_service.UserService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



 @RestController
 @RequestMapping("/api")

public class userController {
   
    @Autowired 
    UserService userService;

   

    @GetMapping("/customers")
    public String getCustomer() {
        return "Endpoint get";
    }

    @PostMapping("/customers/bach")
    public String postCustomer() {
        return "Endpoint post";
       
    }
    @PutMapping("/path/{id}")
    public String putMethodName(@PathVariable String id) {
        
        
        return "esto wes un update: " + id;
    }
    @DeleteMapping("/path/{id}")
    public String deleteMethodName(@PathVariable String id) {
        return "esto wes un delete: " + id;
    }
}
