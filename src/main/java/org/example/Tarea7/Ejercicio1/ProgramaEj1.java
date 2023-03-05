package org.example.Tarea7.Ejercicio1;

public class ProgramaEj1 {
    public static void main(String[] args) {
        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(10);
        Dado dado3 = new Dado(12);

        int suma=0; //acumulador resultados lanzamientos

        int cont=0;

        do {
            System.out.println("Tirada nº: " + cont);

            int tirada1 = dado1.tirarDado();
            int tirada2 = dado2.tirarDado();
            int tirada3 = dado3.tirarDado();

            System.out.println("Primer lanzamiento: " + tirada1);
            System.out.println("Segundo lanzamiento: " + tirada2);
            System.out.println("Tercer lanzamiento: " + dado3.tirarDado());
            suma = tirada1 + tirada2 + tirada3;
            cont++;

        }while (suma <= 19); //
        System.out.println("Suma: " + suma);
    }
}


