package exerciciosDasAulas;

import java.util.Scanner;

public class ex9 {

    //Faça um programa que peça a temperatura em graus Farenheit e converta para Cº

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double F;

        System.out.println("Insira a temperatura em Farenheit");
        F = scan.nextDouble();
        double C = (5 * (F - 32) / 9);

        System.out.printf("A temperatura em Celsius é: %.2f\n", C);

        scan.close();

    }


}
