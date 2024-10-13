package Main;

import Utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        FuncoesUteis funcoes = new FuncoesUteis();

        // Testando o método Soma
        int resultadoSoma = funcoes.Soma(5, 4);
        System.out.println("Resultado da Soma: " + resultadoSoma);

        // Testando o método Triangulo
        System.out.println("Triângulo de altura 5:");
        // Chamando a função Triangulo para exibir o triangulo na tela
        funcoes.Triangulo(3);

        // Testando o método printArquivo
        System.out.println("Conteúdo do arquivo:");
        // Chamando a função printArquivo para exibir o texto do arquivo para o usuario
        funcoes.printArquivo("C:/Users/BLESSED/eclipse-workspace/Triangulo/src/teste.txt");

    }
}