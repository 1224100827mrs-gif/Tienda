/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maingenericos;

/**
 *
 * @author DELL
 */
public class Electronico extends Producto<String> {

    public Electronico(String nombre, double precio, String garantia) {
        super(nombre, precio, garantia);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónico: " + nombre + " | Precio: $" + precio + " | Garantía: " + extra);
    }

    public int obtenerAniosGarantia() {
        try {
            if (extra.toLowerCase().contains("año")) {
                return Integer.parseInt(extra.split(" ")[0]);
            }
        } catch (Exception e) {
            return 0;
        }
        return 0;
    }
}