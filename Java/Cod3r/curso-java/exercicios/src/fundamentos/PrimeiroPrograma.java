package fundamentos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeiroPrograma {
	
	public static int retornarIdade() {
		Scanner entrada = new Scanner(System.in);
		int idade = 0;
		try {
			idade = entrada.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Valor digita inválido, digite um valor inteiro!!");
		}
		return idade;
	}
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.next();
		System.out.print("Digite sua idade: ");
		while (idade == 0) {
			idade = retornarIdade();
			System.out.print("Digite sua idade: ");
		}
		System.out.println("Olá " + nome + " você tem " + idade + " anos de idade");
		
	}
}