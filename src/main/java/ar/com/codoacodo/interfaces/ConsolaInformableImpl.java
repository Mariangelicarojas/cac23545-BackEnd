package ar.com.codoacodo.interfaces;

public class ConsolaInformableImpl implements Informable {

	private String atrx;
	
	
	//constructor propio	
	public ConsolaInformableImpl () {	
	}
	
	
	//polimorfismo: sobreescribir 
	public void informar() {
		System.out.println();	
	}

	public String getAtrx() {
		return this.atrx;	
	}
	
	public void setAtrx(String atrx) {
		this.atrx = atrx;
	}
	
}

