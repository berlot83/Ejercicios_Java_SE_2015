package controlador;

import modelo.Avion;
import modelo.F16;

public class CargarArmamento {
	
	public boolean cargarArmamento(){
	
			boolean cargado= false;
		
			Avion f16= new F16();
			
			f16.setCantidadMisles(1);
		
						if(f16.cantidadMisles<=8 && f16.cantidadMisles!=0)		
										{
											System.out.println("El avion está cargado");
											cargado=true;
										}
									else
										{
											System.out.println("El avion está vacío");
											cargado=false;
										}
						return cargado;
				}
	
	
	
	public boolean cargarArmamentoPorClase(F16 avion){
	
			boolean cargado= false;
			
			//F16 f= new F16();			//Acá se puede usar tambien la instancia del F16 aunque hayamos usado la del avion abstracta.
			
			avion.setCantidadMisles(3);
					
					System.out.print("El avión tiene cargado "+avion.getCantidadMisles()+" misiles.  ");
				
								if(avion.getCantidadMisles()<=8 && avion.getCantidadMisles()!=0)		
												{
													System.out.println("El avion está cargado");
													cargado=true;
												}
											else
												{
													System.out.println("El avion está vacío");
													cargado=false;
												}
								return cargado;
						}


}
