package tpe.ia;

public class FiltroGenero implements Filtro{
	private String genero;
	
	public FiltroGenero(String genero) {
		super();
		this.genero = genero;
	}

	@Override
	public boolean aceptar(Pelicula peli) {
		return peli.getGeneros().contains(genero);
	}

}
