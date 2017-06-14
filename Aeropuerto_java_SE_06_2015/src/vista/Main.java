package vista;

import controlador.CargarArmamento;
import controlador.DespegarAvion;
import controlador.EncenderTurbina;
import modelo.F14;
import modelo.F16;
import modelo.F18;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		F16 f16= new F16();	//INSTANCIA imprimir directamente por setters and getters
			f16.accionesF16();
		
		F18 f18= new F18();	//INSTANCIA imprimir por interfaces
			f18.emergencias();
			
		F14 f14= new F14();	//INSTANCIA imprimir por interface especial toString()
			f14.esquivar();
			
			System.out.println(f14.toString());
			
			
		EncenderTurbina encender= new EncenderTurbina();
		encender.encenderTurbina();
		
		DespegarAvion despegar= new DespegarAvion();
		despegar.despegarAvion();
		
		CargarArmamento cargar= new CargarArmamento();
		cargar.cargarArmamento();
		
		cargar.cargarArmamentoPorClase(f16);
		
		F16.cargarMisilesF16(); //LLamada a un método estático osea de toda la clase que no se puede cambiar. 
	}

}
