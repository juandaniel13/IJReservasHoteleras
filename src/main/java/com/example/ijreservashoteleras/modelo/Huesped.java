package com.example.ijreservashoteleras.modelo;

import java.text.DateFormat;
import java.util.Date;

public class Huesped extends Persona {
    private String direccion;
    //fecha de nacimiento
    private Date fechaNac;
    private String sexo;

    public Huesped(String nombre, int id, String tipoId, String direccion, Date fechaNac, String sexo) {
        super(nombre, id, tipoId);
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
