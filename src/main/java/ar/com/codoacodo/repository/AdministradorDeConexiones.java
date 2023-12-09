package ar.com.codoacodo.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {
	
	public static Connection getConnection() {
		//logica para crear la conexion a la db
		
		//abrir una conexion a la db
		//java.sql.Connection > conexion fisica contra la db
		String host = "localhost";
		String username = "root";
		String password = "20693544";
		String port = "3306";
		String dbName = "integrador_cac";		
		String dbUrl = "jdbc:mysql://"+host+":"+port+"/"+dbName + "?allowPublicKeyRetrieval=true&serverTimeZone=UTC&useSSL=false";  
		String driver = "com.mysql.cj.jdbc.Driver";
		
		Connection con = null;
		
		try { //se ve en el avanzado!! 
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, username, password);
		} catch (Exception e) {
			//System.out.println(e);
			//e.printStackTrace();
			throw new IllegalArgumentException("No se pudo obtener conexion: " + dbUrl + " - " + driver);
		}
		
		return con;
	}
}

