package com.example.demo.Controller;

import com.example.demo.Service.JokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokerService jokerService;

    @Autowired
    public JokeController(JokerService jokerService){
        this.jokerService = jokerService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokerService.getJoke());

        return "chucknorris";
    }
}
