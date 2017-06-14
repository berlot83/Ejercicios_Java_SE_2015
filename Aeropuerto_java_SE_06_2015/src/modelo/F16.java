package modelo;

public class F16 extends Avion{
	
	public void accionesF16(){
		
		Avion f16= new F16();
			System.out.println("El avi�n est� en la mitad de la pista a punto de despegar: ");
		
		f16.setDespegue(true);
			System.out.println(f16.getDespegue());
		
			System.out.println("Una tormenta se avecina... aterrizaje:");
		
		f16.setAterrizaje(true);
			System.out.println(f16.getAterrizaje());
			
		f16.setEsquivarN(esquivarN="El avi�n est� esquivando loas nubes llenas de hielo...");
			System.out.println(f16.getEsquivarN());
			
		f16.setEsquivarM(esquivarM="el avi�n est� esquivando los m isiles pero alguno le va a pegar seguro...");
			System.out.println(f16.getEsquivarM());
			
		f16.setPeso(30);
			System.out.println("El F-16 tiene un peso promedio de "+f16.getPeso()+" toneladas...");
		
		f16.setCantidadMisles(8);
		System.out.println("Este avi�n puede cargar hasta "+f16.getCantidadMisles()+" misiles de corta y larga distancia...");
		
		f16.setPotencia(50000);
			System.out.println("Tiene una potencia m�xima de "+f16.getPotencia()+" kg/f de empuje total...");
		
		f16.setValor(60);
			System.out.println("Tiene un valor aproximado a los "+f16.getValor()+" millones de d�lares...");
		
		f16.setSupersonico(true);
			System.out.println("Este avi�n puede ser catalogado como un avi�n "+f16.getSupersonico()+" ya que rompe la barrera del sonido...");
		
		f16.setRodar("El avion est� rodando en este momento...");
			System.out.println(f16.getRodar());
			
	}
	
	//Metodo est�tico que define estrictamente la cantidad de misiles que lleva.
	public static void cargarMisilesF16(){
		Avion f16= new F16();
		f16.setCantidadMisles(8);
		
			System.out.println(f16.getCantidadMisles());
	}	

}
