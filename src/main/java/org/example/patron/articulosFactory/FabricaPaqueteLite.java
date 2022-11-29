package org.example.patron.articulosFactory;

import org.example.patron.articulos.*;

public class FabricaPaqueteLite implements FabricaDePaquetes {

    @Override
    public Acceso crearAcceso() {
        return new Lite();
    }

    @Override
    public Anotador crearAnotador() {
        return new LibretaEspiral();
    }

    @Override
    public Borrador crearBorrador() {
        return new GomaPelican();
    }

    @Override
    public Contenedor crearContenedor() {
        return new BotellaGreatValue();
    }

    @Override
    public Escritor crearEscritor() {
        return new Lapiz();
    }

    @Override
    public Conferencia[] crearConferencias() {
        Conferencia conferencias[] = {
                new ConferenciaSaludMental(),
                new ConferenciaFrontEnd()
        };
        return conferencias;
    }
}
