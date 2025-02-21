package tpe.ia;

public class FiltroDirector implements Filtro{
	private String director;
	
	public FiltroDirector(String director) {
		super();
		this.director = director;
	}

	@Override
	public boolean aceptar(Pelicula peli) {
		return peli.getDirectorPelicula().equals(director);
	}

}
