package com.example.ijreservashoteleras.modelo;

public class Habitacion {
    private int numero;
    private String tipo;
    private float precio;

    public Habitacion(int numero, String tipo, float precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
