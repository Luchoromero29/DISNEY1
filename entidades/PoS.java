/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alkemy.disney.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Luciano
 */
@Entity
public class PoS {
    
@Id
private String id;

private String titulo;
private Date fechaDeCreacion;
private int calificacion;

@ManyToOne
@JoinColumn(name = "genero_id")
private Genero genero;

@OneToMany(mappedBy="pos")
private List<Personajes> personajesAsociados;

    public PoS() {
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public List<Personajes> getPersonajesAsociados() {
        return  personajesAsociados;
    }

    public void setPersonajesAsociados(List<Personajes> personajesAsociados) {
        this.personajesAsociados = personajesAsociados;
    }


}
