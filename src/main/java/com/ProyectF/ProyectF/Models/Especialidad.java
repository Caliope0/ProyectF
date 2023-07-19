package com.ProyectF.ProyectF.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "especialidad")
public class Especialidad {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "Especialidad")
    private int especialidad;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "especialidad")
    private List<Medico> medicos;

    // Constructor
    public Especialidad(){    
    }

    // Constructor sobrecargado
    public Especialidad(Long id, int especialidad, String nombre, List<Medico> medicos) {
        this.id = id;
        this.especialidad = especialidad;
        this.nombre = nombre;
        this.medicos = medicos;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    // Override
    @Override
    public String toString() {
        return "Especialidad [id=" + id + ", especialidad=" + especialidad + ", nombre=" + nombre + ", medicos="
                + medicos + "]";
    }        
}
