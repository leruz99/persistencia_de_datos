package org.example.model;

public class Mensajes {
    private int idMensaje;
    private String Mensaje;
    private String autorMensaje;
    private String fecheMensaje;

    public Mensajes() {
    }

    public Mensajes(int idMensaje, String mensaje, String autorMensaje, String fecheMensaje) {
        this.idMensaje = idMensaje;
        Mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fecheMensaje = fecheMensaje;
    }

    public Mensajes(String mensaje, String autorMensaje, String fecheMensaje) {
        Mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fecheMensaje = fecheMensaje;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFecheMensaje() {
        return fecheMensaje;
    }

    public void setFecheMensaje(String fecheMensaje) {
        this.fecheMensaje = fecheMensaje;
    }
}
