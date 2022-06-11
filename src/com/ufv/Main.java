package com.ufv;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Creo un objeto vacio
        Persona sara = new Persona();

        // creo un objeto con datos
        Persona sara_filled= new Persona("Sara", "Peirotén", 54648454, 22);

        //muestro por pantalla el nombre del objeto persona sara_filled
        System.out.println(sara_filled.getNombre());
    }
}
