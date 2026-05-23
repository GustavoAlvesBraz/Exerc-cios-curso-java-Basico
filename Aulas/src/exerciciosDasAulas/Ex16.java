package exerciciosDasAulas;

import java.util.Scanner;

//16.Faça um programa para uma loja de tintas. O programa deverá pedir o
//tamanho em metros quadrados da área a ser pintada. Considere que a
//cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
//tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
//usuário a quantidades de latas de tinta a serem compradas e o preço
//total.
public class Ex16 {

    public static void main (String[] args) {


        Scanner scan = new Scanner(System.in);

        Double metrosQ;
        System.out.println("Insira a quantidade de m² de sua casa");
        metrosQ = scan.nextDouble();

        Double tinta = metrosQ / 3.0;
        double latas = Math.ceil(tinta / 18.0);
        double precoTotal = latas * 80.0;

        System.out.println("Você precisará comprar " + (int)latas + " Latas");
        System.out.println("Preço das latas R$ 80,00, total: " + precoTotal);
    }
}
