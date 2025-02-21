package tpe.ia;

public class FiltroActor implements Filtro{
	private String actor;

	public FiltroActor(String actor) {
		super();
		this.actor = actor;
	}

	@Override
	public boolean aceptar(Pelicula peli) {
		return peli.getReparto().contains(actor);
	}
	
}
