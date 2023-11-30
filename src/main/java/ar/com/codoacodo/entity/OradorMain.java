package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class OradorMain {

	public static void main(String[] args) {
		
		//crear un orador a partir de la clase orador
		
		//instancio un objeto
		
	Orador nuevoOrador = new Orador("Carlos", "Lopez", "mariarojas792@gmail.com", "Java", LocalDate.now());
	
		//instancia un obejto de la base de datos
	Orador nuevoFromDB = new Orador(1L,"Carlos", "Lopez", "mariarojas792@gmail.com", "Java", LocalDate.now());
		
	//un tipo de polimorfismo es la sobrecarga: en la misma clase tengo dos metodos o constructores con el mismo nombre 
	//pero con distintos parametros.
	//sobredifinición no es la misma clase  y modifica atributos del padre
	
	
	//nuevoOrador.id = 1L; (ejemplo de que se podia cambiar el id)
	System.out.println(nuevoOrador);
	nuevoOrador.setNombre("Pepe");
	
	//si quiero saber el nombre del orador hago un getters 
	
	
	
	}

}
