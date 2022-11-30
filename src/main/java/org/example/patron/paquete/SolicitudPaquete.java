package org.example.patron.paquete;

public abstract class SolicitudPaquete {

    protected abstract Paquete crearPaquete(String item);

    public Paquete solicitarPaquete(String tipo) {
        Paquete paquete = crearPaquete(tipo);

        System.out.println("[--- PREPARANDO PAQUETE DE TIPO " + paquete.getNombre() + " !! ---]");
        paquete.preparar();
        paquete.agregarAcceso();
        paquete.agregarAnotador();
        paquete.agregarBorrador();
        paquete.agregarContenedor();
        paquete.agregarEscritor();
        paquete.agregarConferencias();

        return paquete;
    }
}
