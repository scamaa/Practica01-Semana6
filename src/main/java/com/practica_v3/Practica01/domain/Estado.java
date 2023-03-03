package com.practica_v3.Practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;
    
    private String nombre;
    private String capital;
    private int poblacion;
    private String territorio;

    public Estado() {
    }

    public Estado(String nombre, String capital, int poblacion, String territorio) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.territorio = territorio;
    }   
    
}
