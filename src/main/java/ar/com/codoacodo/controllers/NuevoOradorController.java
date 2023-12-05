package ar.com.codoacodo.controllers;


import java.util.stream.Collectors;
import java.io.IOException;
import java.time.LocalDate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import ar.com.codoacodo.entity.Orador;
import ar.com.codoacodo.repository.MySQLOradorRepository;
import ar.com.codoacodo.repository.OradorRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/orador/nuevo")

public class NuevoOradorController extends HttpServlet{
	
	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
	
		
		String json = request.getReader()
				.lines()
				.collect(Collectors.joining(System.lineSeparator()));
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		OradorRequest oradorRequest = mapper.readValue(json, OradorRequest.class);
		
		//validaciones
		if (oradorRequest.getNombre() == null || oradorRequest.getApellido()== null 
			||oradorRequest.getMail() == null || oradorRequest.getTema() == null ) {
		}

		
		OradorRepository repository = new MySQLOradorRepository();
		Orador orador = new Orador(oradorRequest.getNombre(), 
				oradorRequest.getApellido(),
				oradorRequest.getMail(), 
				oradorRequest.getTema(), 
				LocalDate.now());

				repository.save(orador);
		//respondo al frotned un json ok
		response.getWriter().print(mapper.writeValueAsString(orador));
		

	}

}
