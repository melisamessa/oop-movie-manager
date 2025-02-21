package tpe.ia;

import java.util.*;

public class Pelicula {
	private String nombrePelicula;
	private String sinopsis;
	private List<String> generos = new ArrayList<>();			//considero que una pelicula puede tener más de un genero
	private String directorPelicula;
	private List<String> reparto = new ArrayList<>();		
	private int anioEstreno;
	private int duracionPelicula; 						
	private int restriccionEdad;								
	
	public Pelicula(String nombrePelicula, String sinopsis, List<String> generos, String directorPelicula,
			List<String> reparto, int anioEstreno, int duracionPelicula, int restriccionEdad) {
		super();
		this.nombrePelicula = nombrePelicula;
		this.sinopsis = sinopsis;
		this.generos = generos;
		this.directorPelicula = directorPelicula;
		this.reparto = reparto;
		this.anioEstreno = anioEstreno;
		this.duracionPelicula = duracionPelicula;
		this.restriccionEdad = restriccionEdad;
	}
	
	public String getDirectorPelicula() {
		return directorPelicula;
	}

	public void setDirectorPelicula(String directorPelicula) {
		this.directorPelicula = directorPelicula;
	}
	
	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public int getDuracionPelicula() {
		return duracionPelicula;
	}

	public void setDuracionPelicula(int duracionPelicula) {
		this.duracionPelicula = duracionPelicula;
	}
	
	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public List<String> getGeneros() {
		return generos;
	}

	public void setGeneros(List<String> generos) {
		this.generos = generos;
	}

	public List<String> getReparto() {
		return reparto;
	}

	@Override
	public String toString() {
		return "Pelicula \n [nombrePelicula= " + nombrePelicula + "\n sinopsis= " + sinopsis + "\n generos= " + generos
				+ "\n directorPelicula= " + directorPelicula + "\n reparto= " + reparto + "\n anioEstreno= " + anioEstreno
				+ "\n duracionPelicula= " + duracionPelicula+" minutos" + "\n restriccionEdad= " + restriccionEdad + "]"+"\n ------------------ \n";
	}
	
	
}
