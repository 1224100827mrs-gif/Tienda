/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainzoo;

import com.mycompany.mainzoo.Mascota;
import com.mycompany.mainzoo.Animal;

/**
 *
 * @author DELL
 */
public class Raton extends Animal  implements Mascota{
    
     public Raton(String nombre , int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("iiik iiik!!");
    }

    @Override
    public void moverse() {
        System.out.println(" Estoy corriendo rapidamente para escapar de los gatos.");
    }

    @Override
    public void jugar() {
        System.out.println( nombre + " juega corriendo en su rueda hasta que se marea.");
    }

}