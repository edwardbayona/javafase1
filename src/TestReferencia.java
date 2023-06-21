
public class TestReferencia {
	
	public static void main(String[] args) {
		CuentaJava PrimeraCuenta = new CuentaJava();
		PrimeraCuenta.saldo = 200;
		
		CuentaJava SegundaCuenta = PrimeraCuenta;
		
		SegundaCuenta.saldo =100;
		
		System.out.println("Saldo primera cuenta" + PrimeraCuenta.saldo);
		
		System.out.println("Saldo segunda cuenta" + SegundaCuenta.saldo);
		
		SegundaCuenta.saldo +=400;
		
		System.out.println("Saldo primera cuenta" + PrimeraCuenta.saldo);
		
		System.out.println(PrimeraCuenta);
		
		System.out.println(SegundaCuenta);
		
		if (PrimeraCuenta == SegundaCuenta) {
			
			System.out.println("son el mismo objeto");
		}
		
	}

}
