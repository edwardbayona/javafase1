
public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("hola");
		//condicionales
		
		int edad =21;
		int cantidadPersonas =2;
		
		boolean esPareja = true;
		boolean puedeEntrar = edad>=18 && esPareja;
		
		
		if (puedeEntrar){ 
						
			System.out.println("Usted puede entrar");
		}	else {
			
					System.out.println("NO esta permitido entrar");
				 }
		
			
			
		
	}
}
