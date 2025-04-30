package modelo;

public class Paquete {
	public final double peso;
	public final double distancia;
	public final boolean fragil;
	// Para no tener que usar el get porque puedo verlo pero además no puedo
	// modificarlo

	public Paquete(double peso, double distancia) {
		this.peso = peso;
		this.distancia = distancia;
		this.fragil = false;
	}

	public Paquete(double peso, double distancia, boolean fragil) {
		this.peso = peso;
		this.distancia = distancia;
		this.fragil = fragil;
	}
}
