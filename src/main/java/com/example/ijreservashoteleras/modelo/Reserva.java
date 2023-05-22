package com.example.ijreservashoteleras.modelo;

import java.util.Date;

public class Reserva {
    private int numero;
    private Date fechaInicio;
    private String estado;
    private Date feechaReserva;
    private double valTotal;

    public Reserva(int numero, Date fechaInicio, String estado, Date feechaReserva, double valTotal) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.feechaReserva = feechaReserva;
        this.valTotal = valTotal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFeechaReserva() {
        return feechaReserva;
    }

    public void setFeechaReserva(Date feechaReserva) {
        this.feechaReserva = feechaReserva;
    }

    public double getValTotal() {
        return valTotal;
    }

    public void setValTotal(double valTotal) {
        this.valTotal = valTotal;
    }
}
