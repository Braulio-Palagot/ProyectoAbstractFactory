package org.example.patron.articulosFactory;

import org.example.patron.articulos.*;

public interface FabricaDePaquetes {
    public Acceso crearAcceso();
    public Anotador crearAnotador();
    public Borrador crearBorrador();
    public Contenedor crearContenedor();
    public Escritor crearEscritor();
    public Conferencia[] crearConferencias();
}
