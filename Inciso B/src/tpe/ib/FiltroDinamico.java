package tpe.ib;

public abstract class FiltroDinamico implements Filtro{
	protected String clave;
	
	public FiltroDinamico(String clave) {
		super();
		this.clave = clave;
	}

	public abstract boolean aceptar(Pelicula peli);
}


