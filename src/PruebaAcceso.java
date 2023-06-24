
public class PruebaAcceso {

	public static void main(String[] args) {
		CuentaJava cuenta =new CuentaJava();
		cuenta.setAgencia(-5);
		cuenta.depositar(400);
		cuenta.retirar(300);
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
		
		
	}
}
