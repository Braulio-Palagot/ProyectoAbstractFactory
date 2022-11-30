package org.example.patron.paquete;

import org.example.patron.articulos.*;

public abstract class Paquete {
    String nombre;
    Acceso acceso;
    Anotador anotador;
    Borrador borrador;
    Contenedor contenedor;
    Escritor escritor;
    Conferencia conferencias[];

    //Procedimiento de preparacion de paquete
    abstract void preparar();

    void agregarAcceso() {
        System.out.println("Agregando acceso");
    }

    void agregarAnotador() {
        System.out.println("Agregando anotador");
    }

    void agregarBorrador() {
        System.out.println("Agregando borrador");
    }

    void agregarContenedor() {
        System.out.println("Agregando contenedor");
    }

    void agregarEscritor() {
        System.out.println("Agregando escritor");
    }

    void agregarConferencias() {
        System.out.println("Agregando conferencias");
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\n---- " + nombre + " ----\n");

        if (acceso != null) {
            result.append(acceso);
            result.append(":\n");
        }
        if (conferencias != null) {
            for (Conferencia conferencia : conferencias) {
                result.append("ヽ(=^･ω･^=)丿");
                result.append(conferencia);
                if (conferencia != conferencias[conferencias.length - 1]) {
                    result.append(", ");
                }
                result.append("\n");
            }
        }
        if (anotador != null) {
            result.append(anotador);
            result.append("\n");
        }
        if (borrador != null) {
            result.append(borrador);
            result.append("\n");
        }
        if (contenedor != null) {
            result.append(contenedor);
            result.append("\n");
        }
        if (escritor != null) {
            result.append(escritor);
            result.append("\n");
        }

        return result.toString();
    }
}
