package com.example.micro2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Lieu")

public class Lieu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idLieu")
    private Long idLieu;
    private String nom;
    private String adresse;
    private String codePostal;
    private String ville;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="lieu")
    private Set<Evenement> evenement;

}
