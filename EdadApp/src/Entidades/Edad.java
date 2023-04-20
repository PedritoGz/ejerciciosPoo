package Entidades;

import java.util.Date;

public class Edad {

    private String Nombre;
    private Date fecha;

    public Edad() {
    }

    public Edad(String Nombre, Date fecha) {
        this.Nombre = Nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
