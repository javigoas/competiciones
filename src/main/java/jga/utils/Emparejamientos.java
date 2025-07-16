package jga.utils;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;

public class Emparejamientos {
    /**
     * Genera todos los emparejamientos posibles entre N elementos,
     * donde N es un número par. Cada elemento se empareja con todos los demás
     * exactamente una vez.
     *
     * @param N El número total de elementos (debe ser par y >= 2).
     * @return Una lista de listas de pares, donde cada lista interna representa
     * una ronda de emparejamientos perfectos.
     * @throws IllegalArgumentException Si N no es par o es menor que 2.
     */
    public static List<List<AbstractMap.SimpleEntry<Integer, Integer>>> generarEmparejamientos(int N) {
        if (N % 2 != 0 || N < 2) {
            throw new IllegalArgumentException("N debe ser un número par y al menos 2.");
        }

        // Representamos los elementos como números de 0 a N-1
        // List<Integer> elementos = new ArrayList<>();
        // for (int i = 0; i < N; i++) {
        //     elementos.add(i);
        // }

        // El elemento 0 se mantiene fijo
        // Los elementos que rotarán son del 1 al N-1
        List<Integer> rotantes = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            rotantes.add(i);
        }

        List<List<AbstractMap.SimpleEntry<Integer, Integer>>> todosLosApareamientos = new ArrayList<>();

        // Se realizarán N-1 rondas
        for (int ronda = 0; ronda < N - 1; ronda++) {
            List<AbstractMap.SimpleEntry<Integer, Integer>> apareamientosRondaActual = new ArrayList<>();

            // Emparejar el elemento fijo (0) con el último elemento de la lista 'rotantes'
            apareamientosRondaActual.add(new AbstractMap.SimpleEntry<>(0, rotantes.get(rotantes.size() - 1)));

            // Emparejamientos entre los elementos restantes de la lista rotante
            // La lista rotantes ahora tiene N-1 elementos. Después de tomar el último, quedan N-2 elementos.
            // Necesitamos (N-2)/2 pares
            for (int i = 0; i < (N - 2) / 2; i++) {
                apareamientosRondaActual.add(new AbstractMap.SimpleEntry<>(rotantes.get(i), rotantes.get(rotantes.size() - 2 - i)));
            }

            todosLosApareamientos.add(apareamientosRondaActual);

            // Rotar los elementos en la lista 'rotantes'
            // El último elemento se mueve al principio, y los demás se desplazan una posición a la derecha.
            int ultimoElemento = rotantes.remove(rotantes.size() - 1); // Quitar el último
            rotantes.add(0, ultimoElemento); // Añadirlo al principio
        }

        return todosLosApareamientos;
    }

    public static void main(String[] args) {
        // Probando con N=4
        try {
            List<List<AbstractMap.SimpleEntry<Integer, Integer>>> emparejamientos4 = generarEmparejamientos(4);
            System.out.println("Emparejamientos para N=4:");
            for (List<AbstractMap.SimpleEntry<Integer, Integer>> ronda : emparejamientos4) {
                System.out.println(ronda);
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n---");

        // Probando con N=6
        try {
            List<List<AbstractMap.SimpleEntry<Integer, Integer>>> emparejamientos6 = generarEmparejamientos(10);
            System.out.println("Emparejamientos para N=10:");
            for (List<AbstractMap.SimpleEntry<Integer, Integer>> ronda : emparejamientos6) {
                System.out.println(ronda);
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("\n---");

        // Probando con N impar (debería lanzar una excepción)
        try {
            generarEmparejamientos(5);
        } catch (IllegalArgumentException e) {
            System.err.println("Error al probar con N=5: " + e.getMessage());
        }
    }
}
