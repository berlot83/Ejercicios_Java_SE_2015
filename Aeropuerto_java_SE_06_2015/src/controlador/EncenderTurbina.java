package controlador;

import modelo.Avion;
import modelo.F16;

public class EncenderTurbina {
	
	public boolean encenderTurbina(){
		
		Avion f16= new F16();	//Creamos una instancia con todos los atributos del avion en cuesti�n, ver que 
			
		f16.setPotencia(25000);
				//System.out.println(f16.getPotencia());
		
		boolean encender=false;
		
				if(f16.getPotencia()>0)
								{
									System.out.println("La turbina est� prendida");
									encender=true;
								}
							else
								{
									System.out.println("La turbina est� apagada");
									encender=false;
								}
				return encender;
			}

}
