package org.example.patron.articulosFactory;

import org.example.patron.articulos.*;

public class FabricaPaquetePremium implements FabricaDePaquetes {

    @Override
    public Acceso crearAcceso() {
        return new Premium();
    }

    @Override
    public Anotador crearAnotador() {
        return new CarpetaCuero();
    }

    @Override
    public Borrador crearBorrador() {
        return new GomaTecNM();
    }

    @Override
    public Contenedor crearContenedor() {
        return new Termo();
    }

    @Override
    public Escritor crearEscritor() {
        return new Boligrafo();
    }

    @Override
    public Conferencia[] crearConferencias() {
        Conferencia conferencias[] = {
                new ConferenciaSaludMental(),
                new ConferenciaFrontEnd(),
                new ConferenciaIA(),
                new ConferenciaMagistral()
        };
        return conferencias;
    }
}
