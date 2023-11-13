package com.example.micro2.Service;

import com.example.micro2.Repository.EvenementRepository;
import com.example.micro2.entity.Evenement;

import java.util.List;

public class EvenementServiceImpl implements EvenementService{
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
