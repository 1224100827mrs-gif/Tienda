/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maingenericos;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class MainGenericos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
      ArrayList<Producto<?>> inventario = new ArrayList<>();

        inventario.add(new Libro("Java Básico", 299.99, 350));
        inventario.add(new Electronico("Laptop ASUS", 15999.99, "2 años"));
        inventario.add(new Libro("Patrones de Diseño", 499.50, 420));
        inventario.add(new Electronico("Smartphone Samsung", 10999.00, "1 año"));
        inventario.add(new Ropa("Camisa Polo", 699.99, "M"));

        System.out.println("=== INVENTARIO COMPLETO ===");
        for (Producto<?> p : inventario) {
            p.mostrarDetalles();
        }

        System.out.println("\n=== FILTRADO INTELIGENTE ===");
        for (Producto<?> p : inventario) {
            if (p instanceof Libro l && l.extra > 400) {
                l.mostrarDetalles();
            } else if (p instanceof Electronico e && e.obtenerAniosGarantia() > 1) {
                e.mostrarDetalles();
            }
        }
    }
}
