package com.miguelangel.spring.app1.springboot_app.models;

public class Taco {
    private String nombre, tipoCarne, tipoTortilla, tipoSalsa;
    private int precio, cantidad, id;

    public Taco(String nombre, String tipoCarne, String tipoTortilla, String tipoSalsa, 
                int precio, int cantidad, int id){
                    this.nombre = nombre;
                    this.tipoCarne = tipoCarne;
                    this.tipoTortilla= tipoTortilla;
                    this.tipoSalsa = tipoSalsa;
                    this.precio= precio;
                    this.cantidad = cantidad;
                    this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoCarne() {
        return tipoCarne;
    }
    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }
    public String getTipoTortilla() {
        return tipoTortilla;
    }
    public void setTipoTortilla(String tipoTortilla) {
        this.tipoTortilla = tipoTortilla;
    }
    public String getTipoSalsa() {
        return tipoSalsa;
    }
    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    

}
