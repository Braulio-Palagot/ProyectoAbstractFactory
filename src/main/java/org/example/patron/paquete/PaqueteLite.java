package org.example.patron.paquete;

import org.example.patron.articulosFactory.FabricaDePaquetes;
import org.example.patron.articulosFactory.FabricaPaqueteLite;

public class PaqueteLite extends SolicitudPaquete {

    @Override
    protected Paquete crearPaquete(String item) {
        Paquete paquete = null;

        FabricaDePaquetes fabricaDePaquetes = new FabricaPaqueteLite();

        paquete = new PreparadorDePaquete(fabricaDePaquetes);
        paquete.setNombre("Lite");

        return paquete;
    }
}
