
public class Numero {
	
	int numero1;
	int numero2;
	
	Numero(){
		
	}
	public void validaNumeros()throws Exception{
		if(numero1 <=0){
			throw new Exception("0 n�mero 1 precisa ser maior que zero");
		}else if (numero2<=0){
			throw new Exception("0 n�mero 2 precisa ser maior que zero");
			
		}
		
	}

	public double dividir(){
		return numero1/numero2;
	}
}
