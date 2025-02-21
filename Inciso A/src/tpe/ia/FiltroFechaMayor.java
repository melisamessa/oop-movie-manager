package tpe.ia;

public class FiltroFechaMayor implements Filtro{
		private int anio;
		
		public FiltroFechaMayor(int anio) {
			this.anio = anio;
		}

		@Override
		public boolean aceptar(Pelicula peli) {
			return peli.getAnioEstreno() > anio;
		}

}