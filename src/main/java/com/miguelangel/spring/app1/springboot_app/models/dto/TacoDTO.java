package com.miguelangel.spring.app1.springboot_app.models.dto;
public class TacoDTO {

    private int id;
    private String nombre;
    private String tipoCarne;
    private int precio;

    public TacoDTO() {
    }

    public TacoDTO(int id, String nombre, String tipoCarne, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.tipoCarne = tipoCarne;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}