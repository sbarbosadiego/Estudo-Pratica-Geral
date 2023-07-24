import javax.swing.JOptionPane;

public class Rota {

    public void planejarDia() {

        double consumoMedio = 2.5;
        double distanciaTotal = 0;
        double combustivelTotal = 0;
        double valorCombustivel;
        double valorDespesa = 0;
        
        int quantidadeRotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de rotas:"));
        for (int i = 1; i <= quantidadeRotas; i++) {
            double distancia = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos km a rota " + i + " possui:").replaceAll(",", "."));
            distanciaTotal += distancia;
            double combustivel = distancia / 2.5;
            combustivelTotal += combustivel;
        }
        
        valorCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do litro do óleo diesel:").replaceAll(",", "."));
        valorDespesa = combustivelTotal * valorCombustivel;
        
        String mensagem = String.format("Total de km percorridos: %.2f \n"
                + "Quantidade de litros de combustível necessário: %.2f \n"
                + "Valor que a empresa desembolsará: R$: %.2f", distanciaTotal, combustivelTotal, valorDespesa);
        JOptionPane.showMessageDialog(null, mensagem);
        
    }

}
