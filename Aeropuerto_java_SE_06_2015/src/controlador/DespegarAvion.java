package controlador;

import modelo.Avion;
import modelo.F16;

public class DespegarAvion {
	
	public boolean despegarAvion(){
		
		boolean despegar=false;
		
		Avion f16= new F16();
		f16.setGrados(15);
		
			  if(f16.getGrados()>5)
									{
										System.out.println("El avión levantó vuelo.");
										despegar= true;
									}
									else
									{
										System.out.println("El avión no pudo despegar.");
										despegar= false;
									}
				return despegar;
			}

}
