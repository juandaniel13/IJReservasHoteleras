package com.example.ijreservashoteleras.modelo;

public class ProductoServicio {
    private int id;
    private float valUnitario;
    private String tipo;

    public ProductoServicio(int id, float valUnitario, String tipo) {
        this.id = id;
        this.valUnitario = valUnitario;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValUnitario() {
        return valUnitario;
    }

    public void setValUnitario(float valUnitario) {
        this.valUnitario = valUnitario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
