import java.util.Scanner;


public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i==0){
		try{
		Scanner leia= new Scanner(System.in);
		Numero n = new Numero();
		double resultado;
		
		
		System.out.println("Digite o primeiro n�mero : ");
	    n.numero1= leia.nextInt();
		System.out.println("Digite o segundo n�mero : ");
		n.numero2 = leia.nextInt();
		
		n.validaNumeros();
		
		resultado =n.dividir();
		System.out.println("O resultado da divis�o � : " +resultado);
		i=1;
		
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
		
		
		
		
		

	}

}
