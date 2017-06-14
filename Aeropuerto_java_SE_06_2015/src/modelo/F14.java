package modelo;

public class F14 extends Avion{

	public void esquivar(){
		
		Avion f14= new F14();
			System.out.println("El F-14 es muy grande y antiguo.");
		
				f14.setEsquivarM("No tiene capacidad esquivar misiles por su elevado tamaño.");
					System.out.println(f14.getEsquivarM());
				
				f14.setEsquivarN("Sí puede esquivar nubes, pero sus sistemas son antiguos.");
					System.out.println(f14.getEsquivarN());
		
				
	}
	
	
	@Override
	public String toString(){
		
		setValor(45);
		setPeso(40);
		setPotencia(60000);
		
			return "Esta oración está creada con la función especial toString()... el valor es de "+ getValor() +" millones de dolares estadounidenses y un peso promedio de "+ getPeso() +" toneladas, así como una potencia aproximada de "+ getPotencia() +" kg/f de empuje...";
	}
	
}
