package com.ProyectF.ProyectF.Models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "especialidad")
public class Especialidad {

    @Id
    @Column(name = "id_Especialidad")
    private int idEspecialidad;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "especialidad")
    private List<Medico> medicos;

    // Constructor

    public Especialidad(){
    }

    // Constructor sobrecargado

    public Especialidad(int idEspecialidad, String nombre, List<Medico> medicos) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.medicos = medicos;
    }

    // Getters

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }   
}
