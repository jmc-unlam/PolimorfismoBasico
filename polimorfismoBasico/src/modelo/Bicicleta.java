package modelo;

public class Bicicleta extends MedioTransporte {

	public Bicicleta() {
		super(5, 1, 1); // Peso 5kg, distancia 1km, 1 paquete
	}

	@Override
	public boolean puedeLlevarPeso(Paquete paquete) {
		return paquete.peso <= this.pesoMaximo;
	}

	@Override
	public boolean puedeLlevarDistancia(Paquete paquete) {
		return paquete.distancia <= this.distanciaMaxima;
	}

}
