
public class TestReferencia3 {
	
	public static void main(String[] args) {
		CuentaJava cuentaDiego = new CuentaJava();
		Cliente clienteD = new Cliente();
		cuentaDiego.titular=clienteD;
		//cuentaDiego.titular.nombre="Diego";
		
		
		
		System.out.println(cuentaDiego.titular.nombre);
	}

}
