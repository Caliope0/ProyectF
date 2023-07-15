package com.ProyectF.ProyectF.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @Column(name = "tarjeta_profesional")
    private int tarjetaProfesional;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "consultorio")
    private String consultorio;

    @Column(name = "correo")
    private String correo;

    @Column(name = "id_Especialidad")
    private int especialidadId;

    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;

    @ManyToOne
    @JoinColumn(name = "especialidadId_Especialidad")
    private Especialidad especialidad;

    // Constructor

    public Medico(){    
    }

    // Constructor sobrecargado

    public Medico(int tarjetaProfesional, String nombre, String apellido, String consultorio, String correo,
            int especialidadId, List<Cita> citas, Especialidad especialidad) {
        this.tarjetaProfesional = tarjetaProfesional;
        this.nombre = nombre;
        this.apellido = apellido;
        this.consultorio = consultorio;
        this.correo = correo;
        this.especialidadId = especialidadId;
        this.citas = citas;
        this.especialidad = especialidad;
    }

    // Getters

    public int getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEspecialidadId() {
        return especialidadId;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    // Setters

    public void setTarjetaProfesional(int tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEspecialidadId(int especialidadId) {
        this.especialidadId = especialidadId;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    } 
}
