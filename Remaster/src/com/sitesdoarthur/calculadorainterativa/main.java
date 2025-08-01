package com.sitesdoarthur.calculadorainterativa;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean continuar = true;
        Scanner teclado = new Scanner(System.in);
        System.out.println("********************************************************************************");
        System.out.println("****************************CALCULADORA INTERATIVA******************************");
        System.out.println("********************************************************************************");
        while (continuar) {
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
            System.out.print("Digite o primeiro número: ");
            int n1 = teclado.nextInt();
            System.out.print("Digite o segundo número: ");
            int n2 = teclado.nextInt();
            switch (opcao) {
                case 1:
                    int soma = n1 + n2;
                    System.out.printf("A soma de %d + %d é: %d\n", n1, n2, soma);
                    break;
                case 2:
                    int subtracao = n1 - n2;
                    System.out.printf("A subtração de %d - %d é: %d\n", n1, n2, subtracao);
                    break;
                case 3:
                    int multiplicacao = n1 * n2;
                    System.out.printf("A multiplicação de %d * %d é: %d\n", n1, n2, multiplicacao);
                    break;
                case 4:
                    if (n2 != 0) {
                        double divisao = (double) n1 / n2;
                        System.out.printf("A divisão de %d / %d é: %.2f\n", n1, n2, divisao);
                    } else {
                        System.out.println("Divisão por zero não é permitida.");
                    }
                    break;
                case 5:
                    double potencia = Math.pow(n1, n2);
                    System.out.printf("A potenciação de %d ^ %d é: %.2f\n", n1, n2, potencia);
                    break;
                case 6:
                    if (n1 >= 0) {
                        double raizQuadrada = Math.sqrt(n1);
                        System.out.printf("A raiz quadrada de %d é: %.2f\n", n1, raizQuadrada);
                    } else {
                        System.out.println("Raiz quadrada de número negativo não é permitida.");
                 }
                    break;
                case 7:
                    System.out.println("Saindo da calculadora. Até logo!");
                    teclado.close();
                    System.exit(0);
                    break;
                default:
                break;
            }
        }
    }
}