package com.example.ijreservashoteleras.modelo;

public class Hotel {
    private int id;
    private float aforo;
    private float descuento;
    private short nDias;

    public Hotel(int id, float aforo, float descuento, short nDias) {
        this.id = id;
        this.aforo = aforo;
        this.descuento = descuento;
        this.nDias = nDias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAforo() {
        return aforo;
    }

    public void setAforo(float aforo) {
        this.aforo = aforo;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public short getnDias() {
        return nDias;
    }

    public void setnDias(short nDias) {
        this.nDias = nDias;
    }

    //añadir hótel

    //eliminar hótel

    //editar datos del hótel

}
