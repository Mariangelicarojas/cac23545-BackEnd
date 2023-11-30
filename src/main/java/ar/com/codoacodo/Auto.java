package ar.com.codoacodo;

public class Auto {
	//atributos
	String marca;
	String modelo;
	String color;
	Integer anio;
	Boolean encendido;
	Float velocidad;
	Float velocidadMaxima;
	
	
	//constructor
	public Auto(
		String marca,
		String modelo,
		String color,
		Integer anio,
		Float velocidadMaxima
		) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.anio = anio;
		this.velocidadMaxima = velocidadMaxima;
		
		this.encendido = Boolean.FALSE;
		this.velocidad = 0f;
	}
		
		//métodos
		
		void encender () {
		if (!this.encendido) {
			this.encendido = Boolean.TRUE;
		}else {
			System.out.println("Ya esta encendido");	
			}
		}
		
		void apagar () {
			if (this.encendido) {
				this.encendido = Boolean.FALSE;
				this.velocidad = 0f;
			}else {
				System.out.println("No se puede apagar dos veces");	
				}
			}
		
		void acelerar() {
			if (this.encendido) {
				if (velocidad < velocidadMaxima) {
				this.velocidad++;
			}else {
				System.out.println("LLegastes a la velocidad máxima");	
				}
			}else {
				System.out.println("Primero enciende el auto para acelerar");	
				}
			}

		void frenar () {
			if (this.encendido) {
				if (velocidad < 0) {
				this.velocidad--;
			}else {
				System.out.println("El auto llego a la velocidad 0");	
				}
			}else {
				System.out.println("Auto frenado");	
				}
			}
		}


		
		
	
	
	
		
	

