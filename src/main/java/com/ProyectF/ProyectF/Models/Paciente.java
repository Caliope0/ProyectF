package com.ProyectF.ProyectF.Models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;

import java.util.List;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column ( unique = true, nullable = false )
    private Long id;

    @Column(name = "cedula")
    private int cedula;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "telefono")
    private String telefono;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Cita> citas;

    // Constructor

    public Paciente(){
    }

    // Constructor sobrecargado
    public Paciente(Long id, int cedula, String nombre, String apellido, LocalDate fechaNacimiento, String telefono,
            List<Cita> citas) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.citas = citas;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    //  Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    // Override
    @Override
    public String toString() {
        return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
                + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", citas=" + citas + "]";
    } 
}
