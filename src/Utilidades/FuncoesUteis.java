package Utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis {
    
    // Método para somar dois numeros inteiros
    public int Soma(int a, int b) {
        return a + b;
    }

    // Método para exibir um triângulo de altura especificada
    public void Triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    // Método para ler e imprimir o conteúdo de um arquivo de texto
    public void printArquivo(String arquivo) {
        // Tentativa de abrir e ler o arquivo usando BufferedReader e FileReader
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            
            // String para armazenar cada linha do arquivo
            String linha;
            
            // Loop que lê cada linha do arquivo até chegar ao final (quando readLine retorna null)
            while ((linha = br.readLine()) != null) {
                // Exibe a linha lida no console
                System.out.println(linha);
            }
            
        // Captura qualquer exceção de I/O (como arquivo não encontrado ou erro de leitura)
        } catch (IOException e) {
            // Exibe uma mensagem de erro se ocorrer algum problema ao ler o arquivo
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } 
    }
}