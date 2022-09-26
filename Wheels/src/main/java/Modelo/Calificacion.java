package Modelo;

public class Calificacion {

    private String referencia;
    private int puntuacion;
    private String comentario;


    //Getters
    public String getReferencia() {
        return referencia;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    //Setters

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
