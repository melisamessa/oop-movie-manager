package tpe.ia;

public class FiltroDuracionMenor implements Filtro{
	private int duracion;
	
	public FiltroDuracionMenor(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public boolean aceptar(Pelicula peli) {
		return peli.getDuracionPelicula() < duracion;
	}

}
