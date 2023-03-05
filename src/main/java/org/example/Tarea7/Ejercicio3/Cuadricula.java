package org.example.Tarea7.Ejercicio3;

    public class Cuadricula {
        private char[][] tablero;
        private int FIL = 10, COL = 10;


        public Cuadricula() {
            tablero = new char[FIL][COL];
            inicializarTablero();
        }

        private void inicializarTablero() {
            for (int i = 0; i < FIL; i++) {
                for (int j = 0; j < COL; j++) {
                    tablero[i][j] = '~';
                }
            }
        }

        public void depositarBarco(int fila, int columna) {
            tablero[fila][columna] = 'B';
        }

        public boolean disparar(int fila, int columna) {
            if (tablero[fila][columna] == 'B') {
                tablero[fila][columna] = 'X';
                return true;
            } else {
                tablero[fila][columna] = 'O';
                return false;
            }
        }

        public void visualizacion() {
            System.out.println("  1 2 3 4 5 6 7 8 9 10");
            for (int i = 0; i < FIL; i++) {
                System.out.print((char) ('A' + i) + " ");
                for (int j = 0; j < COL; j++) {
                    if(tablero[i][j] == 'B')
                        System.out.print("~ ");
                    else
                        System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
