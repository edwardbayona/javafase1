
public class PruebaMetodos {
	
	
	public static void main(String[] args) {
		CuentaJava miCuenta = new CuentaJava();
		
		miCuenta.saldo = 300;
		miCuenta.depositar(200);
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
		
		CuentaJava cuentaJimena = new CuentaJava();
		cuentaJimena.depositar(1000);
		cuentaJimena.transferir(400, miCuenta);

		System.out.println(miCuenta.saldo);
		System.out.println(cuentaJimena.saldo);
	}
}