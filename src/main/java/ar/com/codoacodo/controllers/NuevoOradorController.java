package ar.com.codoacodo.controllers;

import java.time.LocalDate;

import ar.com.codoacodo.entity.Orador;
import ar.com.codoacodo.repository.MySQLOradorRepository;
import ar.com.codoacodo.repository.OradorRepository;

public class NuevoOradorController {
	public static void main(String[] args) {
		String nombre = "carlos";
		String apellido = "lopez";
		String mail = "carlos2@hotmail.com";
		String tema = "java";
		
		//validaciones
		if (nombre == null || nombre.isEmpty() || !nombre.matches("[a-zA-Z]+")) {
            System.out.println("Error: El nombre no es válido.");
            return; // Puedes manejar el error de la manera que desees.
        }

        if (apellido == null || apellido.isEmpty() || !apellido.matches("[a-zA-Z]+")) {
            System.out.println("Error: El apellido no es válido.");
            return;
        }

        if (mail == null || mail.isEmpty() || !mail.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            System.out.println("Error: El correo electrónico no es válido.");
            return;
        }
        
        if (tema == null || tema.isEmpty() || !tema.matches("[a-zA-Z]+")) {
            System.out.println("Error: El tema no es válido.");
            return;
        }

		
		OradorRepository repository = new MySQLOradorRepository();
		repository.save(new Orador(nombre, apellido, mail, tema, LocalDate.now()));
		
		//respondo al frotned un json ok
		System.out.println("Operación exitosa: Nuevo orador creado y guardado.");
		
		

	}

}
