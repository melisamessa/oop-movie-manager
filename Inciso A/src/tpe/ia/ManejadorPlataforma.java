package tpe.ia;

import java.util.*;

public class ManejadorPlataforma {
	
public static void main(String[] args) {
		List<Pelicula> peliculas = new ArrayList<>();
		
		//Agrego las películas que ya van a estar desde el inicio en el catalogo
		peliculas.add(new Pelicula("culpable", "un policia asignado al servicio de emergencia...", Arrays.asList("drama", "policial","thriller") ,"Antonie Fuqua",Arrays.asList("Jake Gyllenhaal","Ethen Hawke","Riley Keough", "Peter Sarsgaard"),2021,91,16));
		peliculas.add(new Pelicula("en busca de la felicidad", "...", Arrays.asList("drama") ,"Gabriele Muccino",Arrays.asList("Will Smith","Jaden Smith", "Thandie Newton","Dan Castellaneta"),2007,117,13));
		peliculas.add(new Pelicula("tiburon", "...", Arrays.asList("accion","drama","clasica","criaturas feroces","thrillers") ,"Steven Spielberg",Arrays.asList("Roy Scheider","Robert Shaw","Richard Dreyfuss","Lorraine Gary"),1975,124,13));
		peliculas.add(new Pelicula("el silencio", "", Arrays.asList("criaturas feroces","terror","peliculas basadas en libros") ,"John R. Leonetti",Arrays.asList("Stanley Tucci","Kiernan Shipka","Miranda Otto","Kate Trotter","John Corbett"),2019,90,16));
		peliculas.add(new Pelicula("la isla siniestra", "...", Arrays.asList("suspenso","misterio"),"Martin Scorsese",Arrays.asList("Leonardo DiCaprio","Ben Kingsley","Will Smith", "Mark Ruffalo","Michelle Williams"),2010,138,16));
		peliculas.add(new Pelicula("chucky, el muñeco diabolico 2", "...", Arrays.asList("terror","suspenso") ,"John Lafia",Arrays.asList("Alex Vincent","Jenny Agutter","Brad Dourif","Gerrit Graham","Christine Elise"),1990,83,16));
		peliculas.add(new Pelicula("luna nueva", "...", Arrays.asList("pelicula para adolescentes","drama","romance") ,"Chris Weitz",Arrays.asList("Kristen Stewart","Robert Pattinson","Taylor Lautner","Ashley Greene"),2009,130,13));
		peliculas.add(new Pelicula("dia de la independencia", "...", Arrays.asList("ciencia ficcion","accion") ,"Roland Emmerich",Arrays.asList("Bill Pullman","Jeff Goldblum","Will Smith","Vivica A. Fox"),1996,145,13));
		peliculas.add(new Pelicula("el orfanato", "...", Arrays.asList("terror"),"J.A. Bayona",Arrays.asList("Belen Rueda","Fernando Cayo","Roger Princep"),2007,91,16));
		peliculas.add(new Pelicula("ocultos por la luna", "...", Arrays.asList("drama","policial","ciencia ficcion") ,"Jim Mickle",Arrays.asList("Boyd Holbrook","Michael C. Hall","Cleopatra Coleman","Bokeem Woodbine","Rudi Dharmalingam","Rachel Keller"),2019,115,16));
		
		// creo los filtros necesarios para realizar las distintas busquedas
		Filtro filtroPalabraLuna = new FiltroNombrePelicula("luna");
		Filtro filtroGeneroTerror = new FiltroGenero("terror");
		Filtro filtroActorXIgual = new FiltroActor("Will Smith");
		Filtro filtroDirectorXIgual = new FiltroDirector("Martin Scorsese");	
		Filtro filtroNotDirector = new FiltroNot(filtroDirectorXIgual);
		Filtro filtroDuracionMenor = new FiltroDuracionMenor(95);
		Filtro filtroFechaMenor = new FiltroFechaMenor(2015);
		Filtro filtroAndDF = new FiltroAnd(filtroFechaMenor, filtroDuracionMenor);
		Filtro filtroAndAD = new FiltroAnd(filtroActorXIgual, filtroNotDirector);
		
		
		//Creo los 2 filtros de rentabilidad,
		Filtro filtroDuracion1 = new FiltroDuracionMenor(120);
		Filtro filtroGenero0 = new FiltroGenero("comedia");
		Filtro filtroGeneroNot = new FiltroNot(filtroGenero0);
		Filtro filtroAndDG = new FiltroAnd(filtroDuracion1, filtroGeneroNot);
		Filtro filtroFechaMayor = new FiltroFechaMayor(2017);
		Filtro filtroGeneroInfantil = new FiltroGenero("infantil");
		Filtro filtroGeneroDocumental = new FiltroGenero("documental");
		Filtro filtroOrGenero = new FiltroOr(filtroGeneroInfantil, filtroGeneroDocumental);
		Filtro filtroOr = new FiltroOr(filtroFechaMayor, filtroOrGenero);
		
		//utilizo la plataforma con el primer filtro. Imprimo las busquedas y luego creo nuevas peliculas para agregarlas teniendo en cuenta el 
		// criterio de rentabilidad 1. Finalmente imprimo el catálogo con las nuevas películas agregadas
		PlataformaStreaming plataformaStreaming = new PlataformaStreaming (peliculas, filtroAndDG);
		
		//Demostración por pantalla de los criterios de busqueda
		System.out.println("Contiene la palabra luna: ");
		System.out.println(plataformaStreaming.filtrar(filtroPalabraLuna));
		System.out.println("\n Contiene el genero terror: ");
		System.out.println(plataformaStreaming.filtrar(filtroGeneroTerror));
		System.out.println("\n Fecha menor a 2015 y duracion menor a 95 minutos: ");
		System.out.println(plataformaStreaming.filtrar(filtroAndDF));
		System.out.println("\n Actuo Will Smith pero no la dirigio Martin Scorsese: ");
		System.out.println(plataformaStreaming.filtrar(filtroAndAD));
		
		
		Pelicula p1 = new Pelicula("sin reservas", "...", Arrays.asList("comedia romantica","romance","comedia") ,"Scott Hicks",Arrays.asList("Catherine Zeta-Jones","Aaron Eckhart","Abigail Breslin","Patricia Clarkson","Jenny Wade","Bob Balaban"),2007,104,13);
		Pelicula p2 = new Pelicula("gato con botas", "...", Arrays.asList("familiar","infantil","comedia") ,"Chris Miller",Arrays.asList("Antonio Banderas","Sakna Hayek","Zach Galifianakis","Billy Bob Thornton","Amy Sedaris","Constance Marie"),2011,92,7);
		Pelicula p3 = new Pelicula("la quinta ola", "...", Arrays.asList("ciencia ficcion","pelicula basadas en libros","accion") ,"J Blakeson",Arrays.asList("Chloe Grace Moretz","Nick Robinson","Ron Livingston","Maggie Siff","Alex Roe","Maria Bello"),2016,112,13);
		Pelicula p4 = new Pelicula("apolo 13", "...", Arrays.asList("basados en hechos reales","accion","drama") ,"Ron Howard",Arrays.asList("Tom Hanks","Kevin Bacon","Bill Paxton","Gary Sinise","Ed Harris","Kathleen Quinlan"),1995,139,13);
		plataformaStreaming.addPelicula(p1);
		plataformaStreaming.addPelicula(p2);
		plataformaStreaming.addPelicula(p3);
		plataformaStreaming.addPelicula(p4);
		System.out.println("\n Criterio rentabilidad 1: ");
		System.out.println(plataformaStreaming.getPeliculas());
		
		//cambio el criterio de rentabilidad 1 por el 2 y utilizo las mismas peliculas que cree para el 1, para utilizar en el filtro 2. Imprimo el nuevo catalogo.
		plataformaStreaming.cambiarFiltroRentabilidad(filtroOr);
		
		plataformaStreaming.addPelicula(p1);
		plataformaStreaming.addPelicula(p2);
		plataformaStreaming.addPelicula(p3);
		plataformaStreaming.addPelicula(p4);
		
		System.out.println("\n Criterio rentabilidad 2: ");
		System.out.println(plataformaStreaming.getPeliculas());
	}

}
