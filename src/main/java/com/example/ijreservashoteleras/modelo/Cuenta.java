package com.example.ijreservashoteleras.modelo;

public class Cuenta {
    private int id;
    private String estado;
    private double total;

    public Cuenta(int id, String estado, double total) {
        this.id = id;
        this.estado = estado;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
