
public class EjemploScope {
	// todo lo delimitado por yaves
	
	public static void main(String[] args) {
		System.out.println("hola");
		//condicionales
		
		int edad =21;
		int cantidadPersonas =2;
		
		boolean esPareja = cantidadPersonas >1;
		boolean puedeEntrar = edad>=18 && esPareja;
		
		
		if (puedeEntrar){ 
						
			System.out.println("Usted puede entrar");
		}	else {
			
					System.out.println("NO esta permitido entrar");
				 }
		
			
			
		
	}
}
