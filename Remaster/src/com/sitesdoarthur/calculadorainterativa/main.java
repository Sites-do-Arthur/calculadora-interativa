package com.sitesdoarthur.calculadorainterativa;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Variáveis para controle do loop e números
        boolean continuar = true;
        Scanner teclado = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        // Exibe o cabeçalho da calculadora
        System.out.println("********************************************************************************");
        System.out.println("****************************CALCULADORA INTERATIVA******************************");
        System.out.println("********************************************************************************");
        // Loop para manter a calculadora ativa até que o usuário decida sair
        while (continuar) {
            // Simula um menu de opções em modo texto
            System.out.println("****MENU****");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potenciação");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("7 - Sair");
            System.out.println("Diga sua opção: ");
            byte opcao = teclado.nextByte();
            // Verifica se a opção é válida e é menor que 7
            if(opcao >= 1 && opcao < 7) {
                System.out.print("Digite o primeiro número: ");
                n1 = teclado.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = teclado.nextInt();
            }
            // Verifica as opções selecionadas pelo usuário
            switch (opcao) {
                // Caso 1: Soma
                case 1:
                    int soma = n1 + n2;
                    System.out.printf("A soma de %d + %d é: %d\n", n1, n2, soma);
                    break;
                case 2:
                    // Caso 2: Subtração
                    int subtracao = n1 - n2;
                    System.out.printf("A subtração de %d - %d é: %d\n", n1, n2, subtracao);
                    break;
                case 3:
                    // Caso 3: Multiplicação
                    int multiplicacao = n1 * n2;
                    System.out.printf("A multiplicação de %d * %d é: %d\n", n1, n2, multiplicacao);
                    break;
                case 4:
                    // Caso 4: Divisão
                    // Verifica se o segundo número é diferente de zero para evitar divisão por zero
                    if (n2 != 0) {
                        double divisao = (double) n1 / n2;
                        System.out.printf("A divisão de %d / %d é: %.2f\n", n1, n2, divisao);
                    } else {
                        // Exibe mensagem de erro se o segundo número for zero
                        System.out.println("Divisão por zero não é permitida.");
                    }
                    break;
                case 5:
                    // Caso 5: Potenciação
                    double potencia = Math.pow(n1, n2);
                    System.out.printf("A potenciação de %d ^ %d é: %.2f\n", n1, n2, potencia);
                    break;
                case 6:
                    if (n1 >= 0) { 
                        // Caso 6: Raiz Quadrada
                        // Verifica se o número é não negativo para calcular a raiz quadrada
                        double raizQuadrada = Math.sqrt(n1);
                        System.out.printf("A raiz quadrada de %d é: %.2f\n", n1, raizQuadrada);
                    } else {
                        // Exibe mensagem de erro se o número for negativo
                        System.out.println("Raiz quadrada de número negativo não é permitida.");
                 }
                    break;
                case 7:
                    // Caso 7: Sair
                    continuar = false;
                    System.out.println("Saindo da calculadora. Até logo!");
                    teclado.close();
                    System.exit(0);
                    break;
                default:
                    // Caso inválido: Exibe mensagem de erro
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
                    // Recomeça o programa caso não tenha sido encerrado
            }
        }
    }
}