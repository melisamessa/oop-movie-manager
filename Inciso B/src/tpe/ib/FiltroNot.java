package tpe.ib;

public class FiltroNot implements Filtro{
	private Filtro f1;

	public FiltroNot(Filtro f1) {
		super();
		this.f1 = f1;
	}

	@Override
	public boolean aceptar(Pelicula peli) {
		return !f1.aceptar(peli);
	}
}
