/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainzoo;

/**
 *
 * @author jante
 */
public class Ornitorrinco extends Animal implements Mascota {

    public Ornitorrinco(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡Gruu gru gru! ");
    }

    @Override
    public void moverse() {
        System.out.println("Voy nadando y combatiendo el mal.");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " salpica en el agua y persiguiendo burbujas.");
        
    }
}