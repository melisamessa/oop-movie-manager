package tpe.ia;

public class FiltroNot implements Filtro{
	private Filtro f;

	public FiltroNot(Filtro f) {
		super();
		this.f = f;
	}

	@Override
	public boolean aceptar(Pelicula peli) {
		return !f.aceptar(peli);
	}

}
