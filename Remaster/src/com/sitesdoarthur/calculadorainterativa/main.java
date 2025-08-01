package com.sitesdoarthur.calculadorainterativa;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("********************************************************************************");
        System.out.println("****************************CALCULADORA INTERATIVA******************************");
        System.out.println("********************************************************************************");
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
                
            default:
                break;
        }
    }
}