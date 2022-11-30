package org.example.patron.paquete;

import org.example.patron.articulosFactory.FabricaDePaquetes;
import org.example.patron.articulosFactory.FabricaPaquetePremium;

public class PaquetePremium extends SolicitudPaquete {

    @Override
    protected Paquete crearPaquete(String item) {
        Paquete paquete = null;

        FabricaDePaquetes fabricaDePaquetes = new FabricaPaquetePremium();

        paquete = new PreparadorDePaquete(fabricaDePaquetes);
        paquete.setNombre("Premium");

        return paquete;
    }
}
