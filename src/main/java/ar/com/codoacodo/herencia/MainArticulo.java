package ar.com.codoacodo.herencia;

import javax.print.StreamPrintService;

public class MainArticulo {

	public static void main(String[] args) {
		Articulo art = new Articulo("Titulo1", 150.000f, "htpp:img.titulo1.jpg");
		Musica mu = new Musica ("musica1", 250.000f, "htpp:img.musica1.jpg");
		Articulo artmusica = new Musica ("musica2", 350.000f, "htpp:img.musica2.jpg");
		
		art.setAutor("Autor Titulo 1");
		
		//mostrar los datos de cada objeto
		System.out.println(art);
	}
	
	//Para accceder a los metodos y atributos que tiene musica coloco
	//Articulo artmusica = new Musica ("musica2", 350.000f, "htpp:img.musica2.jpg");
	//artMusica.getAutor();
	//hacer dow+
	//Musica muInArt = (Musica)artMusica;
	
	
	
	
	
	
}
	
	
