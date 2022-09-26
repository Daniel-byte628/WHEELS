package Modelo;

public class Usuario {
    private int identificador;
    private String nombre;
    private String apellido;
    private int numtelefono;
    private String CorreoElectronico;
    private String contrasena;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumtelefono(int numtelefono) {
        this.numtelefono = numtelefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumtelefono() {
        return numtelefono;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }
}
