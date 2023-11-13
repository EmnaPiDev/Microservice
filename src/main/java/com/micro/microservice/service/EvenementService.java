package com.micro.microservice.service;

import com.micro.microservice.entities.Evenement;

import java.util.List;

public interface EvenementService {
    List<Evenement> retrieveAllEvenement();

    Evenement addEvenement(Evenement b);

    Evenement updateEvenement(Evenement b);

    Evenement retrieveEvenement(Long idEvenement);

    void removeEvenement(Long idEvenement);
}
