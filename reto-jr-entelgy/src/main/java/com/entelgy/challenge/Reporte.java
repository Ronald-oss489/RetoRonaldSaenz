package com.entelgy.challenge;

public class Reporte {

    public Animal[] cargarDatos() {
        Animal[] animales = {
                new Perro("Thor", 4, "Labrador", 11),
                new Perro("Princesa", 6, "Shitsu", 13),
                new Gato("Lauri", 3, "Siam", 15),
                new Gato("Furia", 2, "Persa", 12),
                new Vaca("Bets", 6, "Jersey", 20),
                new Vaca("Aria", 9, "Jersey", 18),
        };
        return animales;
    }

    public void principal(String nombreBuscado) {
        Animal[] animales = cargarDatos();
        boolean encontrado = false;

        for (Animal animal : animales) {
            if (animal.nombre.equalsIgnoreCase(nombreBuscado)) {
                animal.describir();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            throw new RuntimeException("Animal no encontrado");
        }
    }

    public static void main(String[] args) {
        Reporte reporte = new Reporte();
        reporte.principal("Whiskers"); // Buscar animal por nombre
    }

}
