package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TesteComLista {

	public static void main(String[] args) {
		
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		// Em filter é passado o parâmetro na lambda para filtrar valores em que a divisão por dois seja de resto igual a 0
		List<Integer> numerosPares = numeros.stream()
		                                    .filter(n -> n % 2 == 0)
		                                    .collect(Collectors.toList());
		
		// Percorre a nova lista em que foi filtrado valores pares.
		numerosPares.forEach( (n) -> {System.out.print(n); }); 
		

	}

}
