package exerciciosDasAulas;

import java.util.Scanner;

//17.Faça um Programa para uma loja de tintas. O programa deverá pedir o
//tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
//tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
//galões de 3,6 litros, que custam R$ 25,00.
//o Informe ao usuário as quantidades de tinta a serem compradas
//e os respectivos preços em 3 situações:
//o comprar apenas latas de 18 litros;
//o comprar apenas galões de 3,6 litros;
//o misturar latas e galões, de forma que o preço seja o
//menor. Acrescente 10% de folga e sempre arredonde os
//valores para cima, isto é, considere latas cheias.
public class Ex17 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Insira a quantidade de m² de sua casa:");
            double metros = scan.nextDouble();

            ObjetosEx17 orcamento = new ObjetosEx17(metros);

            System.out.println("\n--- RESULTADOS DO ORÇAMENTO ---");
            orcamento.exibirApenasLatas();
            orcamento.exibirApenasGaloes();
            orcamento.exibirMisturaOtimizada();

            scan.close();
    }
}
