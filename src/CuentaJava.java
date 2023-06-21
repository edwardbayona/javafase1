
public class CuentaJava {
	
	double saldo ;
	int numeroCuenta;
	String NombreUsuario;
	int agencia;
	
	//definicion de metodos
	
	public void depositar(double valor){
		this.saldo = this.saldo + valor;
		
	}
	
	//ejemplo retornando valores
	
	public boolean retirar(double valor) {
		
		if (this.saldo >= valor) {
			
			this.saldo = this.saldo - valor;
			return true;
			
		} else {
			
			return false;
		}
		
	
		
		
	}
		 
	public boolean transferir (double valor, CuentaJava cuenta ) {
		
		if(this.saldo >=valor){
			
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
		
	}
	

}
