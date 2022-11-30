package org.example;

import org.example.patron.paquete.Paquete;
import org.example.patron.paquete.PaqueteLite;
import org.example.patron.paquete.PaquetePremium;
import org.example.patron.paquete.SolicitudPaquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Bienvenido al sistema de paquetes del Evento");
        System.out.println("============================================");
        System.out.println("Paquetes Disponibles:");
        System.out.println("1. Paquete Lite");
        System.out.println("2. Paquete Premium");
        System.out.println("3. Salir");
        System.out.println("============================================");
        System.out.println("Ingrese el número de la opción que desea: ");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                SolicitudPaquete solicitudPaquete = new PaqueteLite();
                Paquete paquete = solicitudPaquete.solicitarPaquete("Lite");
                System.out.println(paquete);
                break;
            case 2:
                SolicitudPaquete solicitudPaquete2 = new PaquetePremium();
                Paquete paquete2 = solicitudPaquete2.solicitarPaquete("Premium");
                System.out.println(paquete2);
                break;
            case 3:
                System.out.println("Gracias por utilizar el sistema de paquetes del Evento");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}