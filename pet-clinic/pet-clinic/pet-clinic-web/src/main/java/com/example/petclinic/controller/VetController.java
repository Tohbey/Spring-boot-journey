package com.example.petclinic.controller;


import com.example.petclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService){
        this.vetService = vetService;
    }

    @RequestMapping({"","/vets/index","/vets/index.html"})
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
