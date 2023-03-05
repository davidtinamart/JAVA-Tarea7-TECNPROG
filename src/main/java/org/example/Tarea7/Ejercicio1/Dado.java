package org.example.Tarea7.Ejercicio1;

public class Dado {
    private int numCaras;
    private int ultCara;

    public Dado() {
    }

    public Dado(int numCaras, int ultCara) {
        this.numCaras = numCaras;
        this.ultCara = ultCara;
    }

    public Dado(int numCaras) {
        this.numCaras = numCaras;
    }

    public int tirarDado() {
        int numero = (int) (Math.random() * numCaras + 1);
        return numero;
    }

    public int getNumeroCaras() {
        return numCaras;
    }

    public void setNumeroCaras(int numCaras) {
        this.numCaras = numCaras;
    }

    public int getUltimacara() {
        return ultCara;
    }

    public void setUltimacara(int ultimacara) {
        this.ultCara = ultimacara;
    }

}
