
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
	
	
		CuentaJava cuenta = new CuentaJava();
		
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Diego");
		cliente.setDocumento("4581");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		
		System.out.println(cuenta.getTitular().getNombre());
	}
}
