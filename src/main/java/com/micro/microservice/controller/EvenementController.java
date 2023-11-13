package com.micro.microservice.controller;

import com.micro.microservice.entities.Evenement;
import com.micro.microservice.service.EvenementService;
import com.micro.microservice.service.EvenementServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/evenement")
public class EvenementController  {
    EvenementService evenementService;
    @GetMapping("/retrieve-all-evenement")
    public List<Evenement> getEvenementList() {
        List<Evenement> listEvenements = evenementService.retrieveAllEvenement();
        return listEvenements;
    }

    @GetMapping("/retrieve-evenements/{evenement-id}")
    public Evenement retrieveEvenement(@PathVariable("evenement-id") Long idEvenement) {
        return evenementService.retrieveEvenement(idEvenement);
    }

    @PostMapping("/add-evenement")
    public Evenement addEvenement(@RequestBody Evenement e) {
        Evenement evenement = evenementService.addEvenement(e);
        return evenement;
    }

    @DeleteMapping("/remove-evenement/{evenement-id}")
    public void removeEvenement(@PathVariable("evenement-id") Long idEvenement) {
        evenementService.removeEvenement(idEvenement);
    }

    @PutMapping("/update-evenement")
    public Evenement updateEvenement(@RequestBody  Evenement e) {
        Evenement evenement = evenementService.updateEvenement(e);
        return evenement;
    }

}
