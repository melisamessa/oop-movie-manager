package tpe.ib;

import java.util.ArrayList;
import java.util.List;

public class ManejadorPlataforma {

	public static void main(String[] args) {
		List<Pelicula> peliculas = new ArrayList<>();

		//	Creo 10 peliculas que estaran desde un inicio en el catálogo
		Pelicula p1 = new Pelicula();
		Atributo stringNombrep1 = new AtributoString("culpable");
		Atributo stringGeneros1 = new AtributoString("drama, policial, thrillers");
		Atributo comparableDuracion1 = new AtributoComparable(91);
		Atributo comparableFecha1 = new AtributoComparable(2021);
		p1.addAtributo("nombre", stringNombrep1);
		p1.addAtributo("genero", stringGeneros1);
		p1.addAtributo("duracion", comparableDuracion1);
		p1.addAtributo("fecha", comparableFecha1);
		
		Pelicula p2 = new Pelicula();
		Atributo stringNombrep2 = new AtributoString("en busca de la felicidad");
		Atributo stringGeneros2 = new AtributoString("drama");
		Atributo stringDirector2 = new AtributoString("Gabriele Muccino");
		Atributo stringActores2 = new AtributoString("Will Smith, Jaden Smith, Thandie Newton, Dan Castellaneta");
		p2.addAtributo("nombre", stringNombrep2);
		p2.addAtributo("genero", stringGeneros2);
		p2.addAtributo("director", stringDirector2);
		p2.addAtributo("reparto", stringActores2);
		
		Pelicula p3 = new Pelicula();
		Atributo stringNombrep3 = new AtributoString("tiburon");
		Atributo stringDirectorp3 = new AtributoString("Steven Spielberg");
		Atributo comparablefechap3 = new AtributoComparable(1975);
		p3.addAtributo("nombre", stringNombrep3);
		p3.addAtributo("director", stringDirectorp3);
		p3.addAtributo("fecha", comparablefechap3);
		
		
		Pelicula p4 = new Pelicula();
		Atributo stringNombrep4 = new AtributoString("el silencio");
		Atributo stringGenerop4 = new AtributoString("terror, criaturas feroces, peliculas basadas en libros");
		Atributo stringResenia4 = new AtributoString("muy buena, recomendable");
		Atributo comparableFecha4 = new AtributoComparable(2019);
		p4.addAtributo("fecha", comparableFecha4);
		p4.addAtributo("resenia", stringResenia4);
		p4.addAtributo("genero", stringGenerop4);
		p4.addAtributo("nombre", stringNombrep4);
		
		Pelicula p5 = new Pelicula();
		Atributo stringNombrep5 = new AtributoString("la isla siniestra");
		Atributo stringReseniap5 = new AtributoString("buenisima");
		Atributo stringDirectorp5 = new AtributoString("Martin Scorsese");
		Atributo stringRepartop5 = new AtributoString("Leonardo DiCaprio, Ben Kingsley, Will Smith, Mark Ruffalo, Michelle Williams");
		Atributo comparableFechap5 = new AtributoComparable(2010);
		Atributo comparableDuracionp5 = new AtributoComparable(138);
		p5.addAtributo("nombre", stringNombrep5);
		p5.addAtributo("resenia", stringReseniap5);
		p5.addAtributo("director", stringDirectorp5);
		p5.addAtributo("reparto", stringRepartop5);
		p5.addAtributo("fecha", comparableFechap5);
		p5.addAtributo("duracion", comparableDuracionp5);
		
		Pelicula p6 = new Pelicula();
		Atributo stringNombrep6 = new AtributoString("chucky, el muñeco diabolico 2");
		Atributo stringGeneros6 = new AtributoString("suspenso, terror");
		Atributo stringResenia6 = new AtributoString("buena");
		Atributo comparableFecha6 = new AtributoComparable(1990);
		Atributo comparableDuracion6 = new AtributoComparable(83);
		p6.addAtributo("nombre", stringNombrep6);
		p6.addAtributo("genero", stringGeneros6);
		p6.addAtributo("fecha", comparableFecha6);
		p6.addAtributo("resenia", stringResenia6);
		p6.addAtributo("duracion", comparableDuracion6);
		
		Pelicula p7 = new Pelicula();
		Atributo stringNombrep7 = new AtributoString("luna nueva");
		Atributo comparableFechap7 = new AtributoComparable(2009);
		Atributo comparableDuracionp7 = new AtributoComparable(130);
		p7.addAtributo("nombre", stringNombrep7);
		p7.addAtributo("fecha", comparableFechap7);
		p7.addAtributo("duracion", comparableDuracionp7);
		
		Pelicula p8 = new Pelicula();
		Atributo stringNombrep8 = new AtributoString("dia de la independencia");
		Atributo stringRepartop8 = new AtributoString("Bill Pullman, Jeff Goldblum, Will Smith, Vivica A. Fox");
		Atributo stringDirectorp8 = new AtributoString("Roland Emmerich");
		Atributo comparableDuracionp8 =new AtributoComparable(145);
		Atributo comparableFechap8 = new AtributoComparable(1996);
		Atributo comparableRestriccionEdadp8 = new AtributoComparable(13);
		p8.addAtributo("nombre", stringNombrep8);
		p8.addAtributo("reparto", stringRepartop8);
		p8.addAtributo("director", stringDirectorp8);
		p8.addAtributo("duracion", comparableDuracionp8);
		p8.addAtributo("fecha", comparableFechap8);
		p8.addAtributo("restriccion edad" , comparableRestriccionEdadp8);
		
		Pelicula p9 = new Pelicula();
		Atributo stringNombrep9 = new AtributoString("el orfanato");
		Atributo stringRepartop9 = new AtributoString("Belen Rueda, Fernando Cayo, Roger Princep");
		Atributo stringGenerop9 = new AtributoString("terror");
		Atributo comparableDuracionp9 = new AtributoComparable(91);
		Atributo comparableFechap9 = new AtributoComparable(2007);
		p9.addAtributo("nombre", stringNombrep9);
		p9.addAtributo("reparto", stringRepartop9);
		p9.addAtributo("genero", stringGenerop9);
		p9.addAtributo("duracion", comparableDuracionp9);
		p9.addAtributo("fecha", comparableFechap9);
		
		Pelicula p10 = new Pelicula();
		Atributo stringNombrep10 = new AtributoString("ocultos por la luna");
		Atributo stringGenerosp10 = new AtributoString("drama, policial, ciencia ficcion");	
		p10.addAtributo("genero", stringGenerosp10);
		p10.addAtributo("nombre", stringNombrep10);

		//agrego las peliculas a la lista que serán las que ya tiene el catálogo
		peliculas.add(p1);
		peliculas.add(p2);
		peliculas.add(p3);
		peliculas.add(p4);
		peliculas.add(p5);
		peliculas.add(p6);
		peliculas.add(p7);
		peliculas.add(p8);
		peliculas.add(p9);
		peliculas.add(p10);
		
		//creo el primer filtro de rentabilidad: peliculas con duracion < 120min y que no sean del genero comedia
		Comparable duracion = 120;
		Filtro rentabilidadDuracionMenor = new FiltroComparable("duracion", duracion, 1);
		Filtro rentabilidadGenero = new FiltroString("genero","comedia");
		Filtro rentabilidadNot = new FiltroNot(rentabilidadGenero);
		Filtro rentabilidadAnd = new FiltroAnd(rentabilidadDuracionMenor, rentabilidadNot);
		PlataformaStreaming plataforma = new PlataformaStreaming(peliculas, rentabilidadAnd);


		//Creo los filtros de criterios de busqueda, tealizo las busquedas y las imprimo por pantalla.
		Filtro filtroStringNombre = new FiltroString("nombre","luna");
		Filtro filtroStringGenero = new FiltroString("genero","terror");
		Filtro filtroStringActor = new FiltroString("reparto", "Will Smith");
		Filtro filtroStringDirector = new FiltroString ("director", "Martin Scorsese");
		Filtro filtroNotDirector = new FiltroNot (filtroStringDirector);
		Filtro filtroAndDirectorActor = new FiltroAnd(filtroStringActor, filtroNotDirector);

		Comparable compFecha = 2015;
		Comparable compDuracion = 95;
		Filtro filtroCompFechaMenor = new FiltroComparable("fecha", compFecha, 1);
		Filtro filtroCompDuracionMenor = new FiltroComparable("duracion", compDuracion, 1);
		Filtro filtroAndFechaDuracion = new FiltroAnd (filtroCompFechaMenor, filtroCompDuracionMenor);
		
		System.out.println("Contiene la palabra luna: " + plataforma.filtrar(filtroStringNombre));
		System.out.println("Contiene como genero el genero terror: " + plataforma.filtrar(filtroStringGenero));
		System.out.println("No dirigio MS y actuo WS: " + plataforma.filtrar(filtroAndDirectorActor));
		System.out.println("Antes 2015, duracion menor a 95: " + plataforma.filtrar(filtroAndFechaDuracion));

		// creo películas nuevas para probar agregarlas por el criterio de rentabilidad actual. Imprimo el catálogo de películas resultante.
		Pelicula p11 = new Pelicula();	
		Atributo comparableFechap11 = new AtributoComparable(2014);
		Atributo comparableDuracionp11 = new AtributoComparable(103);
		Atributo stringGenerop11 = new AtributoString("accion, terror, ciencia ficcion");
		Atributo stringDirectorp11 = new AtributoString("James DeMonaco");
		Atributo stringNombrep11 = new AtributoString("12 horas para sobrevivir");
		p11.addAtributo("nombre", stringNombrep11);
		p11.addAtributo("director", stringDirectorp11);
		p11.addAtributo("fecha", comparableFechap11);
		p11.addAtributo("duracion", comparableDuracionp11);
		p11.addAtributo("genero", stringGenerop11);
		
		Pelicula p12 = new Pelicula();			
		Atributo stringGenerop12 = new AtributoString("comedia");
		Atributo comparableDuracionp12 = new AtributoComparable(119);
		Atributo comparableRestriccionp12 = new AtributoComparable(16);
		Atributo stringNombrep12 = new AtributoString("friday");
		p12.addAtributo("nombr", stringNombrep12);
		p12.addAtributo("genero", stringGenerop12);
		p12.addAtributo("duracion", comparableDuracionp12);
		p12.addAtributo("restriccion edad", comparableRestriccionp12);
		
		Pelicula p13 = new Pelicula();	
		Atributo stringRepartop13 = new AtributoString("Edward Norton, Helen Mirren, Will Smith");
		Atributo stringDirectorp13 = new AtributoString("David Frankel");
		Atributo stringNombrep13 = new AtributoString("belleza inesperada");
		Atributo comparableDuracionp13 = new AtributoComparable(96);
		p13.addAtributo("director", stringDirectorp13);
		p13.addAtributo("nombre", stringNombrep13);
		p13.addAtributo("reparto", stringRepartop13);
		p13.addAtributo("duracion", comparableDuracionp13);
		
		Pelicula p14 = new Pelicula();	
		Atributo stringGenerop14 = new AtributoString("drama, melodrama");
		Atributo stringRepartop14 = new AtributoString("Mark Wahlberg, Rachel Weisz, Stanley Tucci");
		Atributo comparableFechap14 = new AtributoComparable(2009);
		Atributo stringNombrep14 = new AtributoString("desde mi cielo");
		p14.addAtributo("nombre", stringNombrep14);
		p14.addAtributo("genero", stringGenerop14);
		p14.addAtributo("reparto", stringRepartop14);
		p14.addAtributo("fecha", comparableFechap14);
		
		plataforma.addPelicula(p11);
		plataforma.addPelicula(p12);
		plataforma.addPelicula(p13);
		plataforma.addPelicula(p14);
		
		System.out.println("\n Catalogo criterio rentabilidad 1: ");
		System.out.println(plataforma.getPeliculas());
		
		//Creo un nuevo filtro para cambiar el criterio de rentabilidad. Nuevo criterio: posteriores 2017 o de genero infantil o de genero documental
		Comparable fechaMayor = 2017;
		Filtro comparableFechaMayor = new FiltroComparable("fecha", fechaMayor, -1);
		Filtro stringGeneroInf = new FiltroString("genero", "infantil");
		Filtro stringGeneroDoc = new FiltroString("genero", "documental");
		Filtro filtroOrGenero = new FiltroOr(stringGeneroInf, stringGeneroDoc);
		Filtro filtroOr = new FiltroOr (comparableFechaMayor, filtroOrGenero);
		
		//Modifico el criterio de rentabilidad creo 4 peliculas nuevas y las agrego. Al final imprimo la lista resultante de películas, catálogo actual
		plataforma.cambiarFiltroRentabilidad(filtroOr);
		
		Pelicula p15 = new Pelicula();	//POSTERIOR A 2017 NO TIENE GENERO
		Atributo stringRepartop15 = new AtributoString("Javier Gutierrez, Karra Elejalde, Luis Callejo, Isak Ferriz");
		Atributo stringReseniap15 = new AtributoString("muy buena");
		Atributo comparableFechap15 = new AtributoComparable(2021);
		Atributo comparableDuracionp15 = new AtributoComparable(106);
		Atributo stringNombrep15 = new AtributoString("bajo cero");
		p15.addAtributo("nombre", stringNombrep15);
		p15.addAtributo("reparto", stringRepartop15);
		p15.addAtributo("resenia", stringReseniap15);
		p15.addAtributo("fecha", comparableFechap15);
		p15.addAtributo("duracion", comparableDuracionp15);
		
		Pelicula p16 = new Pelicula();	//INFANTIL NO TIENE FHECA
		Atributo stringGenerop16 = new AtributoString("familiar, infantil, comedia, basada en libros");
		Atributo stringDirectorp16 = new AtributoString("Denny DeVito");
		Atributo stringNombrep16 = new AtributoString("matilda");
		Atributo comparableFechap16 = new AtributoComparable(2009);
		p16.addAtributo("nombre", stringNombrep16);
		p16.addAtributo("genero", stringGenerop16);
		p16.addAtributo("director", stringDirectorp16);
		p16.addAtributo("fecha", comparableFechap16);
		
		Pelicula p17 = new Pelicula();
		Atributo stringDirectorp17 = new AtributoString("Vicky Jewson");
		Atributo comparableDuracionp17 = new AtributoComparable(94);
		Atributo stringGenerop17 = new AtributoString("accion, drama");
		Atributo stringNombrep17 = new AtributoString("escolta");
		p17.addAtributo("nombre", stringNombrep17);
		p17.addAtributo("director", stringDirectorp17);
		p17.addAtributo("duracion", comparableDuracionp17);
		p17.addAtributo("genero", stringNombrep17);
		
		Pelicula p18 = new Pelicula();	// POSTERIOR A 2017 NO INFANTIL NO DOCUMENTAL
		Atributo comparableFechap18 = new AtributoComparable(2021);
		Atributo stringGenerop18 = new AtributoString("documental, infantil");
		Atributo comparableDuracionp18 = new AtributoComparable(60);
		Atributo stringNombrep18 = new AtributoString("amigos caninos");
		p18.addAtributo("nombre", stringNombrep18);
		p18.addAtributo("genero", stringGenerop18);
		p18.addAtributo("fecha", comparableFechap18);
		p18.addAtributo("duracion", comparableDuracionp18);
		
		plataforma.addPelicula(p15);
		plataforma.addPelicula(p16);
		plataforma.addPelicula(p17);
		plataforma.addPelicula(p18);
		
		System.out.println("\n Catalogo criterio rentabilidad 2: ");
		System.out.println(plataforma.getPeliculas());

	}

}
