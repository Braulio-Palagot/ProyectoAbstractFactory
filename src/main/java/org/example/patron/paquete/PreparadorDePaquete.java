package org.example.patron.paquete;

import org.example.patron.articulosFactory.FabricaDePaquetes;

public class PreparadorDePaquete extends Paquete {
    FabricaDePaquetes fabricaDePaquetes;

    public PreparadorDePaquete(FabricaDePaquetes fabricaDePaquetes) {
        this.fabricaDePaquetes = fabricaDePaquetes;
    }

    @Override
    void preparar() {
        System.out.println("Preparando paquete " + nombre);
        acceso = fabricaDePaquetes.crearAcceso();
        anotador = fabricaDePaquetes.crearAnotador();
        borrador = fabricaDePaquetes.crearBorrador();
        contenedor = fabricaDePaquetes.crearContenedor();
        escritor = fabricaDePaquetes.crearEscritor();
        conferencias = fabricaDePaquetes.crearConferencias();
    }
}
