package Modelo;

public class Pasajero {

    private String medioPago;
    private Boolean penalizacionPago;

    //Setters
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public void setPenalizacionPago(Boolean penalizacionPago) {
        this.penalizacionPago = penalizacionPago;
    }

    //Getters

    public String getMedioPago() {
        return medioPago;
    }

    public Boolean getPenalizacionPago() {
        return penalizacionPago;
    }
}
