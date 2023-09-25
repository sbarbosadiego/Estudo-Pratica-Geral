package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		// Atribuído a variável uma função
		Calculo calculo = (a, b) -> { return a + b; };
		
		System.out.println(calculo.executar(2, 3));
		
		// Ao omitir as chaves é entendido que é retornado um valor
		calculo = (x, y) -> x * y;
		System.out.println(calculo.executar(2, 3));
		
	}	

}
