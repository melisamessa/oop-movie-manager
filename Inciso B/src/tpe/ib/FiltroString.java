package tpe.ib;

public class FiltroString extends FiltroDinamico{
	private String valor;

	public FiltroString(String clave, String valor) {
		super(clave);
		this.valor = valor;
	}
	
	@Override
	public boolean aceptar(Pelicula peli) {
		if (peli.getClave().contains(clave)) {
			return peli.getAtributo(clave).contains(valor);
		}
		return false;
	}

}
