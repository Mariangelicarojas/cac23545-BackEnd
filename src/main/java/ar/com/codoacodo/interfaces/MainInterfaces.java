package ar.com.codoacodo.interfaces;

public class MainInterfaces {

	public static void main(String[] args) {
		//instanciar
		ConsolaInformableImpl obj1 = new ConsolaInformableImpl();
		
		//Interface nombre = ClaseQueImplementa();		
		Informable i = new ConsolaInformableImpl();
		i.informar();
		
		//down casting 
		ConsolaInformableImpl ci = (ConsolaInformableImpl)i;
		
		
	}

}
