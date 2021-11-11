
package com.cursoegg.ejemplopersonas.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class mainController {
    
    @GetMapping("")
    public String  index(){
        return "index";
    }
    
}
