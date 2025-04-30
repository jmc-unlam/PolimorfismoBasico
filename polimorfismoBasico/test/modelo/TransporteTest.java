package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransporteTest {

    @Test
    void testBicicletaPequeno() {
        Bicicleta bici = new Bicicleta();
        Paquete pequeno = new Paquete(3, 0.5);
        assertTrue(bici.puedeLlevar(pequeno));
    }

    @Test
    void testBicicletaMediano() {
        Bicicleta bici = new Bicicleta();
        Paquete mediano = new Paquete(30, 0.5);
        assertFalse(bici.puedeLlevar(mediano));
    }

    @Test
    void testMotitoDistanciaSobrepasa() {
        Motito moto = new Motito();
        Paquete paqueteDistancia = new Paquete(10, 8);
        assertFalse(moto.puedeLlevar(paqueteDistancia));
    }

    @Test
    void testMotitoAgregarPaquete() {
        Motito moto = new Motito();
        Paquete paquete = new Paquete(5, 2);
        assertTrue(moto.puedeLlevar(paquete));
        moto.agregarPaquete(paquete);
        assertEquals(5, moto.getPesoTransportado());
    }

    @Test
    void testPickupNoFragil() {
        Pickup pickup = new Pickup();
        Paquete paqueteNoFragil = new Paquete(100, 50);
        assertFalse(pickup.puedeLlevar(paqueteNoFragil));
    }

    @Test
    void testPickupPesoAcumulado() {
        Pickup pickup = new Pickup();
        Paquete grande1 = new Paquete(400, 100, true);
        Paquete grande2 = new Paquete(200, 100, true);
        
        assertTrue(pickup.puedeLlevar(grande1));
        pickup.agregarPaquete(grande1);
        assertFalse(pickup.puedeLlevar(grande2));// Excedió el límite     
    }
}