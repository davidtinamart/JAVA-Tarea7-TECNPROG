package org.example.Tarea7.Ejercicio2;
import org.example.Tarea7.Ejercicio2.Cliente;

import java.util.Scanner;

public class ProgramaEj2 {
    public static void main(String[] args) {

        Cliente[] clientes = new Cliente[100]; //creamos un array de 10 clientes
        int cont = 0; //contador para el array

        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        int opcionint;
        do {

            System.out.println("1 - Mostrar Clientes");
            System.out.println("2 - Crear Cliente");
            System.out.println("3 - Salir");

            opcionint = teclado1.nextInt();


            switch (opcionint) {
                case 1:
                    System.out.println("-- Clientes --");
                    for (int i = 0; i < cont; i++) {
                        System.out.println(clientes[i].toString());
                    }
                    break;
                case 2:
                    System.out.println("¿Nombre?");
                    String nombre = teclado2.nextLine();
                    System.out.println("Cliente n.°" + (cont + 1) + " [" + nombre + "] añadido");
                    clientes[cont] = new Cliente(nombre, cont + 1);
                    cont++;
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcionint != 3);

    }
}

