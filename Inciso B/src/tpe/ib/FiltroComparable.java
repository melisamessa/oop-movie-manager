package tpe.ib;

public class FiltroComparable extends FiltroDinamico{
	private Comparable valor;
	private int opcion;

	public FiltroComparable(String clave, Comparable valor, int opcion) {
		super(clave);
		this.valor = valor;
		this.opcion = opcion;
	}

	@Override
	public boolean aceptar(Pelicula peli) {
		if (peli.getClave().contains(clave)) {
			return valor.compareTo(peli.getAtributo(clave).getValor()) == opcion;
	}
		return false;
	}
}
