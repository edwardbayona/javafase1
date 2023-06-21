
public class Ejemplo1cuenta {

	public static void main(String[] args) {
		
		CuentaJava PrimeraCuenta = new CuentaJava();
		
		
		PrimeraCuenta.saldo = 15800;
		PrimeraCuenta.numeroCuenta =3569;
		PrimeraCuenta.NombreUsuario="Edward";
		
		System.out.println(PrimeraCuenta.saldo);
		
		CuentaJava SegundaCuenta = new CuentaJava();
		
		SegundaCuenta.saldo=18000;
		SegundaCuenta.NombreUsuario="Ernesto Perez";
		SegundaCuenta.numeroCuenta=4587;
		
		System.out.println(SegundaCuenta.NombreUsuario);
		
		System.out.println(PrimeraCuenta);
		
		System.out.println(SegundaCuenta);
		
		if (PrimeraCuenta == SegundaCuenta) {
			
			System.out.println("son el mismo objeto");
		}else {
			
			System.out.println("Son diferentes");
		}
	
		
	}
	
}
