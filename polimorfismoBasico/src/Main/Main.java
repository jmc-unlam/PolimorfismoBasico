package Main;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Paquete paquetePequeno = new Paquete(3, 0.5);
        Paquete paqueteMediano = new Paquete(30, 10);
        Paquete paqueteGrande = new Paquete(300, 100);
        Paquete paqueteFragil = new Paquete(10, 5, true);

        MedioTransporte[] transportes = {
            new Bicicleta(),
            new Motito(),
            new Pickup()
        };

        System.out.println("=== Demostración de transporte de paquetes ===");
        for (MedioTransporte transporte : transportes) {
            probarTransporte(transporte, paquetePequeno);
            probarTransporte(transporte, paqueteMediano);
            probarTransporte(transporte, paqueteGrande);
            probarTransporte(transporte, paqueteFragil);
            System.out.println("-------------------");
        }
    }

    private static void probarTransporte(MedioTransporte transporte, Paquete paquete) {
        System.out.printf("%s intentando llevar paquete de %.1f kg a %.1f km: %b%n",
                transporte.getClass().getSimpleName(),
                paquete.peso,
                paquete.distancia,
                transporte.puedeLlevar(paquete));
    }
}