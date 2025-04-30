package modelo;

public class Pickup extends MedioDeTransporte {

	private double pesoTransportado = 0;

	public Pickup() {
		super(500, Double.MAX_VALUE, Integer.MAX_VALUE);
	}

	public void agregarPaquete(Paquete pedido) {
		if (puedeLlevar(pedido)) {
			pesoTransportado += pedido.peso;
		}
	}

	@Override
	public boolean puedeLlevarPeso(Paquete paquete) {
		return paquete.peso <= (this.pesoMaximo - pesoTransportado);
	}

	//usa el puedeLlevar de MedioDeTransporte y le agrega una condicion mas
	@Override
	public boolean puedeLlevar(Paquete paquete) {
		return super.puedeLlevar(paquete) && paquete.fragil;
	}
}
