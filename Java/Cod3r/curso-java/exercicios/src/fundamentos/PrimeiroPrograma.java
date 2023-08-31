package fundamentos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeiroPrograma {
	
	/**
	 * Método apenas para retornar um texto.
	 * @return String
	 */
	public static String retornarTexto() {
		Scanner sc = new Scanner(System.in);
		String texto = sc.next();
		return texto+=" ";
	}
	
	/**
	 * Método para retornar um valor inteiro, com tratamento
	 * de exceção de entrada de valores não inteiros.
	 * @return int
	 */
	public static int retornarInteiro() {
		Scanner sc = new Scanner(System.in);
		int valor = 0;
		try {
			valor = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Valor digita inválido, digite um valor inteiro!!");
		} finally {
			sc.close();
		}
		return valor;
	}
	
	public static void main(String[] args) {
		
		
		int idade = 0;
		String nome = "";
				
		System.out.print("Digite seu primeiro nome: ");
		nome = retornarTexto();
		System.out.print("Digite seu segundo nome: ");
		nome += retornarTexto();
		
		System.out.print("Digite sua idade: ");
		while (idade == 0) {
			idade = retornarInteiro();
			System.out.print("Digite sua idade: ");
		}
		
		System.out.println("Olá " + nome + " você tem " + idade + " anos de idade");
		
	}
}