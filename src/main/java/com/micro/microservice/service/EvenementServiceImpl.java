package com.micro.microservice.service;

import com.micro.microservice.entities.Evenement;
import com.micro.microservice.repository.EvenementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EvenementServiceImpl implements EvenementService {
    EvenementRepository evenementRepository;
    @Override
    public List<Evenement> retrieveAllEvenement() {
        return evenementRepository.findAll();
    }

    @Override
    public Evenement addEvenement(Evenement b) {
        return evenementRepository.save(b);
    }

    @Override
    public Evenement updateEvenement(Evenement b) {
        return evenementRepository.save(b);
    }

    @Override
    public Evenement retrieveEvenement(Long idEvenement) {
        return evenementRepository.findById(idEvenement).get();
    }

    @Override
    public void removeEvenement(Long idEvenement) {
        evenementRepository.deleteById(idEvenement);

    }
}
