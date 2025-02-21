package tpe.ia;

public class FiltroOr implements Filtro{
	Filtro f1, f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean aceptar(Pelicula peli) {
		return f1.aceptar(peli) || f2.aceptar(peli);
	}

}
