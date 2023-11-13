package com.example.micro2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Evenement")
public class Evenement implements Serializable {


    @Id
    @GeneratedValue
    private long id;
    private String nomE ,description;
    private Date dateDebut;
    private Date dateFin;
    @ManyToOne
    @JoinColumn(name = "Lieu_id")
    private Lieu lieu;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="evenement")
    private Set<Sponsor> sponsors;


    public Evenement(long id, String nomE, String description, Date dateDebut, Date dateFin) {
        this.id = id;
        this.nomE = nomE;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }


}
