package contatoscsv;

import java.io.*;
import java.io.IOException;

/**
 * @author Diego Barbosa
 */
public class ContatosCSV {

    private static int atualizarLinhasCSV(String caminhoArquivo) {
        try (FileReader fileReader = new FileReader(caminhoArquivo);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(caminhoArquivo + "_temp");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            int contadorLinhas = 0;

            // Adicionar a linha "Name;Mobile Phone" no início do arquivo
            bufferedWriter.write("Name;Mobile Phone");
            bufferedWriter.newLine();

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                bufferedWriter.write("Cliente " + (contadorLinhas + 1) + ";" + linha);
                bufferedWriter.newLine();
                contadorLinhas++;
            }

            return contadorLinhas;
        } catch (IOException e) {
            e.printStackTrace();
            return -1; // Retorna -1 em caso de erro
        }
    }

    public static void main(String[] args) {
        String caminhoArquivo = "C:/Teste/teste.csv";

        int quantidadeLinhas = atualizarLinhasCSV(caminhoArquivo);

        if (quantidadeLinhas >= 0) {
            System.out.println("Quantidade de linhas no arquivo CSV: " + quantidadeLinhas);

            // Renomear o arquivo temporário para substituir o original
            File arquivoOriginal = new File(caminhoArquivo);
            File arquivoTemporario = new File(caminhoArquivo + "_temp");
            if (arquivoTemporario.renameTo(arquivoOriginal)) {
                System.out.println("Alterações salvas com sucesso.");
            } else {
                System.out.println("Erro ao salvar as alterações.");
            }

        } else {
            System.out.println("Erro ao atualizar as linhas do arquivo CSV.");
        }
    }
}
