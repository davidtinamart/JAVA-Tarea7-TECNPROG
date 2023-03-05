package org.example.Tarea7.Ejercicio2;

public class Cliente {
    private String nombre;
    private int id;

    public Cliente() { //constructor por defecto
    }

    public Cliente(String nombre, int id) { //constructor con parámetros
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() { //getter
        return nombre;
    }

    public int getId() { //getter
        return id;
    }

    public void setNombre(String nombre) { //setter
        this.nombre = nombre;
    }

    public void setId(int id) { //setter
        this.id = id;
    }

    @Override
    public String toString() { //toString para mostrar los datos del cliente
        return "El cliente se llama " + nombre + " y su identificador es " + id;
    }
}


