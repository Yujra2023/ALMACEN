
package com.emergentes.modelo;


public class Almacen {
    
    private int id;
    private int cantidad;
    private String descripcion;
    private float precio;
    private String categoria;
    
    public Almacen(){
    id=0;
    cantidad=0;
    descripcion="";
    precio=0;
    categoria="";
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString(){
        return "Almacen{"+ "id="+id+ ", cantidad="+cantidad+", descripcion="+descripcion+",precio="+precio+",categoria="+cantidad+'}';
    }
    
}
