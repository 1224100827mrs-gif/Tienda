/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainzoo;

/**
 *
 * @author DELL
 */
public class MainZoo {

    public static void main(String[] args) {
        Animal[] zoo = new Animal[3];

        zoo[0] = new Raton("Ratatin", 2);
        zoo[1] = new Serpiente("Bocaraca", 4);
        zoo[2] = new Ornitorrinco("Perry el Agente P", 5);

        System.out.println("¡Bienvenidos al Zoologico Polimorfico de JavaLandia!");
        System.out.println("Preparense para conocer a nuestros animales estrella:\n");

        for (Animal animal : zoo) {
            System.out.println("Hola, me llamo " + animal.getNombre() + " y tengo " + animal.getEdad() + " años.");

            animal.hacerSonido();
            animal.moverse();

            if (animal instanceof Mascota mascota) {
                mascota.jugar();
            }

            System.out.println(); 
        }
    }
}