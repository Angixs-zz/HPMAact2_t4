package com.miguelangel.spring.app1.springboot_app.models.dto;

public class TacoDTO {

    private int id;
    private String nombre;
    private String tipoCarne;
    private String tipoTortilla;
    private String tipoSalsa;
    private int precio;
    private int cantidad;

    public TacoDTO() {
    }

    public TacoDTO(
            int id,
            String nombre,
            String tipoCarne,
            String tipoTortilla,
            String tipoSalsa,
            int precio,
            int cantidad) {

        this.id = id;
        this.nombre = nombre;
        this.tipoCarne = tipoCarne;
        this.tipoTortilla = tipoTortilla;
        this.tipoSalsa = tipoSalsa;
        this.precio = precio;
        this.cantidad = cantidad;
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
}