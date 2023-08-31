package fundamentos;

import javax.swing.JOptionPane;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		String nome = "";
		String sobrenome = "";
		int idade = 0;
		boolean status = false;
		
		while (status == false) {
			if (nome.isEmpty()) {
				nome = JOptionPane.showInputDialog("Digite seu nome: ");
			} else if (sobrenome.isEmpty()) {
				sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");
			} else if (idade == 0) {
				try {
					idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")); 
				} catch (Exception e) {
					JOptionPane.showInternalMessageDialog(null, "Digite um valor inteiro!!");
				}
			} else {
				status = true;
			}
		}
		
		JOptionPane.showInternalMessageDialog(null, "Olá "+nome+" "+sobrenome+" você tem "+idade+" anos de idade");
		

	}

}
