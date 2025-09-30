/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maingenericos;

/**
 *
 * @author DELL
 */
public abstract class Producto <T>{
    protected String nombre;
    protected double precio;
    protected T extra;

    public Producto(String nombre, double precio, T extra) {
        this.nombre = nombre;
        this.precio = precio;
        this.extra = extra;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public T getExtra() { return extra; }

    public abstract void mostrarDetalles();
}
