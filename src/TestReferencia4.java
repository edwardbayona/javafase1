
public class TestReferencia4 {
	
	public static void main(String[] args) {
		
		
		CuentaJava cuentaDiego = new CuentaJava();
		
		cuentaDiego.titular = new Cliente();
		
		cuentaDiego.titular.nombre="Diego";
		
		System.out.println(cuentaDiego.titular.nombre);
		
	}

}
