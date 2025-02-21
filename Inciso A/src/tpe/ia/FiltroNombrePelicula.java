package tpe.ia;

public class FiltroNombrePelicula implements Filtro{
	private String palabra;

	public FiltroNombrePelicula(String palabra) {
		super();
		this.palabra = palabra;
	}

	@Override
	public boolean aceptar(Pelicula peli) {
		return peli.getNombrePelicula().contains(palabra);
	}
	
	
}
