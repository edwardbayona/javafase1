
class CuentaJava {
	
	private double saldo ;
	private int numeroCuenta;
	String NombreUsuario;
	private int agencia;
	Cliente titular = new Cliente();
	
	
	
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
	
	
	//metodo getter
	
	public double getSaldo(){
		
		return this.saldo;
		
	}
	
	public int getAgencia() {
		
		return this.agencia;
	}
	
	//setter
	
	public void setAgencia(int nuevaAgencia){
		if(nuevaAgencia >0) {
		this.agencia = nuevaAgencia;
		}else {
			
			System.out.println("no se permiten valores negativos");
		}
		
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

}
