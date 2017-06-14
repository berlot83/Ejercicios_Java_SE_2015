package modelo;

import controlador.Emergencias;

public class F18 extends Avion implements Emergencias{
	

public void emergencias(){

	ejectarse();
	forzarTren();
	aterrizarSinCombustible();
	acuatizar();
}

			@Override
			public void ejectarse() {
				// TODO Auto-generated method stub
				System.out.println("El piloto se eject� a tiempo...");
			}
			
			@Override
			public void forzarTren() {
				// TODO Auto-generated method stub
				System.out.println("El piloto forz� el tren de aterrizaje y baj�...");
			}
			
			@Override
			public void aterrizarSinCombustible() {
				// TODO Auto-generated method stub
				System.out.println("El piloto est� quedandose sin combustible y no hay pista cerca...");
			}
			
			@Override
			public void acuatizar() {
				// TODO Auto-generated method stub
				System.out.println("Tuvo un desperfecto en la mitad del oc�ano y necesita acuatizar...");
			}


}
