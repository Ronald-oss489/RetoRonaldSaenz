package com.entelgy.challenge;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String raza;
    protected int tiempoDeVida;
    protected String tipo;

    public Animal(String nombre, int edad, String raza, int tiempoDeVida, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tiempoDeVida = tiempoDeVida;
        this.tipo = tipo;
    }

    public abstract void realizarSonido();

    public void describir() {
        System.out.println(nombre + " es un " + tipo + " de raza " + raza + " que tiene " + edad +
                " años de edad. Siempre " + tipoSonido() + " cuando está feliz. Su expectativa de vida es de " +
                tiempoDeVida + " años.");
    }

    protected abstract String tipoSonido();
}
