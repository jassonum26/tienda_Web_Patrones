package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jasso
 */
@Controller
public class IndexController {
    
    @RequestMapping("/") //URL al que responde
    public String index() {
        return "index"; //Nombre de la vista en templates a mostrar
    }
  
     @RequestMapping("/informacion") //URL al que responde
    public String info() {
        return "info"; //Nombre de la vista en templates a mostrar
    }
}
