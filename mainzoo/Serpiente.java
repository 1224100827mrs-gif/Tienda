/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainzoo;

/**
 *
 * @author jante 
 */
public class Serpiente extends Animal {

    public Serpiente(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Ssssssss!  Ssssssss!");
    }

    @Override
    public void moverse() {
        System.out.println("Me deslizo sigilosamente por el suelo.");
    }
}
//ll
