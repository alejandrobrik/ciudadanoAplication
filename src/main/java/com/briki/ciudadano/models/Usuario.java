package com.briki.ciudadano.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "cedula")
    String cedula;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "correo")
    String correo;

    @Column(name = "estado")
    boolean estado;


}
