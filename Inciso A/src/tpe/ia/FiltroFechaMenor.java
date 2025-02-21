package tpe.ia;

public class FiltroFechaMenor implements Filtro{
		private int anio;
		
		public FiltroFechaMenor(int anio) {
			this.anio = anio;
		}

		@Override
		public boolean aceptar(Pelicula peli) {
			return peli.getAnioEstreno() < anio;
		}

}
