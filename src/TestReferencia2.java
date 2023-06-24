
public class TestReferencia2 {
	
	public static void main(String[] args) {
		
		
		Cliente Diego = new Cliente();
		
		Diego.nombre = "Diego";
		Diego.documento="16841749";
		Diego.setelefono="365452552";
		
		CuentaJava cuentaDiego = new CuentaJava();
		
		cuentaDiego.agencia =1;
		cuentaDiego.titular=Diego;
		
		System.out.println(cuentaDiego.titular.documento);
		System.out.println(cuentaDiego.titular);
	}

}
