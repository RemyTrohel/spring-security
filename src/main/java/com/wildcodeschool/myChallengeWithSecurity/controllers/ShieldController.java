package com.wildcodeschool.myChallengeWithSecurity.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {
    
    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public List<String> bases() {
        List<String> bases = new ArrayList<String>();
        bases.add("Biarritz");
        bases.add("Bordeaux");
        bases.add("La Loupe");
        bases.add("Lille");
        bases.add("Lyon");
        bases.add("Marseille");
        bases.add("Nantes");
        bases.add("Orléans");
        bases.add("Paris");
        bases.add("Reims");
        bases.add("Strasbourg");
        bases.add("Toulouse");
        bases.add("Tours");
        bases.add("Berlin");
        bases.add("Bruxelles");
        bases.add("Bucarest");
        bases.add("Lisbonne");
        bases.add("Londres");
        bases.add("Madrid");
        return bases;
    }
}