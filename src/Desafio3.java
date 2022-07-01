import java.util.Scanner;

import static java.lang.Math.abs;

/*
Crie um programa que receba dois numeros como parametro e escreva todos os numeros do intervalo (ordem crescente) e tambem a soma.

    Entrada: 3 1

    Saida: 1, 2, 3 Soma: 5

    Entrada: 2 6

    Saida: 2,3,4,5,6 Soma: 20

NAO USAR: Collections, Arrays, metodos utilitarios sort

 */
public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os limites do intervalo: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int limiteInferior = 0;
        int limiteSuperior = 0;


        if(a<b){
            limiteInferior = a;
            limiteSuperior = b;
        } else if (b<a) {
            limiteInferior = b;
            limiteSuperior = a;
        }
        System.out.print(limiteInferior);
        int soma = limiteInferior;
        for(int contador = (limiteInferior+1); contador < (limiteSuperior+1); contador++){
            soma += contador;
            System.out.print(", "+ contador);
        }

        System.out.print(" Soma: " + soma);


    }
}