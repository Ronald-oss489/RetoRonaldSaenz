package com.entelgy.challenge;

public class Perro extends Animal {
    public Perro(String nombre, int edad, String raza, int tiempoDeVida) {
        super(nombre, edad, raza, tiempoDeVida, "Perro");
    }

    @Override
    public void realizarSonido() {
        System.out.println("Ladrar");
    }

    @Override
    protected String tipoSonido() {
        return "ladra";
    }
}