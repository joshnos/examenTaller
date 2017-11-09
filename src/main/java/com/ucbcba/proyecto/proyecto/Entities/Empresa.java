package com.ucbcba.proyecto.proyecto.Entities;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name="Empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEmpresa;

    @NotNull
    @Size(min = 1, max = 45, message = "Debe tener entre 1 y 45 caracteres")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 45, message = "Debe tener entre 1 y 45 caracteres")
    private String direccion;

    @NotNull
    private int telefono;

    @NotNull
    @Size(min = 1, max = 45, message = "Debe tener entre 1 y 45 caracteres")
    private String descripcion;

    @OneToMany(mappedBy = "empresa")
    private Set<Option> Options;

    @Range(min = 0, max = 5, message = "debe ser entre 1 y 5")
    private Integer Calificacion;

    public Set<Option> getOptions() {
        return Options;
    }

    public void setOptions(Set<Option> options) {
        Options = options;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Integer getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        Calificacion = calificacion;
    }
}
