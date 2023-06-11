
public class EjercicioMaria {
	
	public static void main(String[] args) {
		
		double valorCompra = 5000.0;
		double descuentoCompra=0;
		
		if (valorCompra>=100.0 && valorCompra <200.0) {
			
			descuentoCompra = (valorCompra-(valorCompra*0.10));
			System.out.println("El valor a pagar con el 10% de descuento es: " + descuentoCompra);
		}
		
		if (valorCompra>=200 && valorCompra <=299.99) {
			
			descuentoCompra = (valorCompra-(valorCompra*0.15));
			System.out.println("El valor a pagar con el 15% de descuento es: " + descuentoCompra);
		}
		
		if (valorCompra>300) {
			
			descuentoCompra = (valorCompra-(valorCompra*0.20));
			System.out.println("El valor a pagar con el 20% de descuento es: " + descuentoCompra);
		}
		if (valorCompra<100.0){
			
			System.out.println("Su compra no tiene descuento, el valor a pagar es " + valorCompra);
		}
	
	}
}

