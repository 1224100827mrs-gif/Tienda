/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maingenericos;

/**
 *
 * @author DELL
 */
public class Ropa extends Producto <String>{
     public Ropa(String nombre, double precio, String talla) {
        super(nombre, precio, talla);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ropa: " + getNombre() + " | Precio: $" + getPrecio() + " | Talla: " + getExtra());
    }
}
