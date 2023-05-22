package com.example.ijreservashoteleras.modelo;

public class Registro {
    private int numero;
    private boolean checkIn;
    private boolean checkOut;

    public Registro(int numero, boolean checkIn, boolean checkOut) {
        this.numero = numero;
        this.checkIn = checkIn;//inicializar en false
        this.checkOut = checkOut;//inicializar en false
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}
