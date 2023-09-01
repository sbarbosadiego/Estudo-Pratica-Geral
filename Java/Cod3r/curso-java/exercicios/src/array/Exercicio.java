package array;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		// Declaração de array determinando o tamanho
		double[] notasAlunoA = new double[3];
		// Declaração de array determinando os valores
		double[] notasAlunoB = {6.3, 9.4, 5.3, 10};
		double total = 0;
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		// Impressão do array em linha
		System.out.println(Arrays.toString(notasAlunoA));
		
		// Impressão percorrendo o array utilizando um for
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.println(notasAlunoA[i]);
		}
		
		// Soma do total das notas percorrendo o array com um for
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		// Apenas relembrando a formatação de string e valores flutuantes
		System.out.println(String.format("Média: %.2f", total/3));
	}

}
