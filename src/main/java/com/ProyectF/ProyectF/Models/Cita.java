package com.ProyectF.ProyectF.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "cita")
public class Cita {

    @Id
    @Column(name = "id_Cita")
    private int idCita;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "cedula_Paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "tarjeta_Profesional")
    private Medico medico;

    // Constructor

    public Cita() {
    }

    // Constructor sobrecargado

    public Cita(int idCita, LocalDateTime fecha, Paciente paciente, Medico medico) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
    }

    // Getters

    public int getIdCita() {
        return idCita;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    // Setters

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
