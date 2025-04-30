package modelo;

public abstract class MedioTransporte {
	protected final double pesoMaximo;
	protected final double distanciaMaxima;
	protected final int paquetesMaximos;

	public MedioTransporte(double pesoMaximo, double distanciaMaxima, int paquetesMaximos) {
		this.pesoMaximo = pesoMaximo;
		this.distanciaMaxima = distanciaMaxima;
		this.paquetesMaximos = paquetesMaximos;
	}

	public abstract boolean puedeLlevarPeso(Paquete paquete);
	
	public boolean puedeLlevarDistancia(Paquete paquete) {
		return true;
	}
	
	public boolean puedeLlevarCantidadPaquetes(Paquete paquete) {
		return true;
	}
	
	public boolean puedeLlevar(Paquete paquete) {
		return  puedeLlevarPeso(paquete) &&
				puedeLlevarDistancia(paquete) &&
				puedeLlevarCantidadPaquetes(paquete);
	}
}
