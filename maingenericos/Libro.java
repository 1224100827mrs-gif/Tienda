/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maingenericos;

/**
 *
 * @author DELL
 */
public class Libro extends Producto <Integer> {
     public Libro(String nombre, double precio, Integer paginas) {
        super(nombre, precio, paginas);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Libro: " + getNombre() + " | Precio: $" + getPrecio() + " | Páginas: " + getExtra());
    }
}
