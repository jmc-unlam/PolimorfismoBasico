package modelo;

public class Motito extends MedioDeTransporte {
	private static final double IDA_Y_VUELTA = 2;

	private int paquetesTransportados = 0;
	private double pesoTransportado = 0;

	public Motito() {
		super(20, 15, 5); // Peso  20kg, distancia 15 paquetes 5
	}

	public void agregarPaquete(Paquete paquete) {
		if (puedeLlevar(paquete)) {
			paquetesTransportados++;
			pesoTransportado += paquete.peso;
		}
	}
	public double getPesoTransportado() {
			return this.pesoTransportado;
	}
	
	
	@Override
	public boolean puedeLlevarPeso(Paquete paquete) {
		return paquete.peso <= (this.pesoMaximo - pesoTransportado);
	}

	@Override
	public boolean puedeLlevarDistancia(Paquete paquete) {
		return paquete.distancia * IDA_Y_VUELTA <= this.distanciaMaxima;
	}

	@Override
	public boolean puedeLlevarCantidadPaquetes(Paquete paquete) {
		return this.paquetesTransportados < this.paquetesMaximos;
	}
	
}
