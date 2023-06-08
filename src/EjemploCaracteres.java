
public class EjemploCaracteres {
	
	public static void main(String[] args) {
		
		char caracter = 'a';// comillas simples para char
		System.out.println(caracter);
		
		caracter =65;  // esta numeracion se refiere a codigo acci
		
		System.out.println(caracter);
		
		char segundoCaracter = (char) ( caracter + 1); // dado que caracter se convirtio implicitamente a entero se hace un cast para char 
		
		System.out.println(segundoCaracter);
		
		// todos estos son primitivos
		
		// string es un objeto no un primitivo ni palabra reservada
		
		String palabra ="alura";
		System.out.println(palabra);
		
		//concatenar strings
		
		palabra = palabra + "2023";
		System.out.println(palabra);
		
		
		
		
	}

}
