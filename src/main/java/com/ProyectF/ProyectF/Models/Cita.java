package com.ProyectF.ProyectF.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;


@Entity
@Table(name = "cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "Cita")
    private int cita;

    @Column(name = "fecha")
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "cedula_Paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "tarjeta_Profesional")
    private Medico medico;

    // Constructor
    public Cita (){    
    }

    // Constructor sobrecargado
    public Cita(Long id, int cita, LocalDate fecha, Paciente paciente, Medico medico) {
        this.id = id;
        this.cita = cita;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public int getCita() {
        return cita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCita(int cita) {
        this.cita = cita;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    // Override
    @Override
    public String toString() {
        return "Cita [id=" + id + ", cita=" + cita + ", fecha=" + fecha + ", paciente=" + paciente + ", medico="
                + medico + "]";
    }    
}
