package com.softlc.listadeinmuebles;

public class Inmueble {
    private int imagen;
    private String direccion;
    private double precio;

    public Inmueble(int imagen, String direccion, double precio) {
        this.imagen = imagen;
        this.direccion = direccion;
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
