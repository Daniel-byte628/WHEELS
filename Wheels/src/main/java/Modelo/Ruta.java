package Modelo;

import java.util.Date;

public class Ruta {

    private int idRuta;
    private String nombreRuta;
    private String ptoOrigen;
    private int cantPasajeros;
    private Date horaLlegada;
    private Date horaSalida;

    //Getters

    public int getIdRuta() {
        return idRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public String getPtoOrigen() {
        return ptoOrigen;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    //Setters

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public void setPtoOrigen(String ptoOrigen) {
        this.ptoOrigen = ptoOrigen;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }
}
