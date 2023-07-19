package com.ProyectF.ProyectF.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

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

    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;

    @ManyToOne
    @JoinColumn(name = "especialidad")
    private Especialidad especialidad;

    // Constructor

    public Medico(){    
    }

    // Constructor sobrecargado
    public Medico(Long id, int tarjetaProfesional, String nombre, String apellido, String consultorio, String correo,
            List<Cita> citas, Especialidad especialidad) {
        this.id = id;
        this.tarjetaProfesional = tarjetaProfesional;
        this.nombre = nombre;
        this.apellido = apellido;
        this.consultorio = consultorio;
        this.correo = correo;
        this.citas = citas;
        this.especialidad = especialidad;
    }

    // Getters
    public Long getId() {
        return id;
    }

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

    public List<Cita> getCitas() {
        return citas;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

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

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    // Override
    @Override
    public String toString() {
        return "Medico [id=" + id + ", tarjetaProfesional=" + tarjetaProfesional + ", nombre=" + nombre + ", apellido="
                + apellido + ", consultorio=" + consultorio + ", correo=" + correo +  ", citas=" + citas + ", especialidad=" + especialidad + "]";
    }
}
