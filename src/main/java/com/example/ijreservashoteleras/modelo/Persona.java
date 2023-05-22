package com.example.ijreservashoteleras.modelo;

public class Persona {
    private String nombre;
    private int id;
    private String tipoId;

    public Persona(String nombre, int id, String tipoId) {
        this.nombre = nombre;
        this.id = id;
        this.tipoId = tipoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }
}
