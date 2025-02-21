package tpe.ib;

import java.util.*;

public class PlataformaStreaming {
	private List<Pelicula> peliculas;
	private Filtro criterioRentabilidad;
	
	public PlataformaStreaming(List<Pelicula> peliculas, Filtro criterioRentabilidad) {
		super();
		this.peliculas = peliculas;
		this.criterioRentabilidad = criterioRentabilidad;
	}
	
	public void cambiarFiltroRentabilidad(Filtro nuevoCriterio) {
		this.criterioRentabilidad = nuevoCriterio;
	}
	
	public void addPelicula(Pelicula peli) {
		if (esRentable(peli)) {
			peliculas.add(peli);
		}
	}
	
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public boolean esRentable(Pelicula peli) {
		if (criterioRentabilidad.aceptar(peli)) {
			return true;
		}
		return false;
	}

	public List<Pelicula> filtrar (Filtro criterio){
		List<Pelicula> resultado = new ArrayList<>();
		
		for (Pelicula peli: peliculas) {
				if (criterio.aceptar(peli)) {
					resultado.add(peli);
				}
			}
		return resultado;
	}
	
}
