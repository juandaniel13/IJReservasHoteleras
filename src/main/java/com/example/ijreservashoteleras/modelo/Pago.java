package com.example.ijreservashoteleras.modelo;

import java.util.Date;

public class Pago {
    private int numero;
    private Date fecha;
    private double total;
    private String forma;

    public Pago(int numero, Date fecha, double total, String forma) {
        this.numero = numero;
        this.fecha = fecha;
        this.total = total;
        this.forma = forma;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}
