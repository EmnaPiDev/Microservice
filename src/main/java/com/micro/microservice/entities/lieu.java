package com.micro.microservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Lieu")

public class lieu implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="idLieu")
private Long idLieu;
private String nom;
private String adresse;
private String codePostal;
private String ville;

}
