package com.example.demo;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class CatController {
    private RestTemplate restTemplate = new RestTemplate();
    private CatFact catFact;
    private JsonNode jsonNode;

    public CatController() {

    }

    @GetMapping
    public String getCat(Model model) {

        this.restTemplate = new RestTemplate();
        this.catFact = restTemplate.getForObject("https://cat-fact.herokuapp.com/facts/random",
                CatFact.class);

        this.jsonNode = restTemplate.getForObject("https://aws.random.cat/meow",
                JsonNode.class).get("file");


        model.addAttribute("fact", catFact.getText());
        model.addAttribute("photo", jsonNode.asText());

        System.out.println(catFact.getText());
        System.out.println(jsonNode);

        return "cat";
    }
}
