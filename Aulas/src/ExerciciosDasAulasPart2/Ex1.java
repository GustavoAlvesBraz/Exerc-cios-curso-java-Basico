package ExerciciosDasAulasPart2;

import java.util.Scanner;

//1. Faça um Programa que peça dois números e imprima o maior deles
public class Ex1 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira dois números");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        if (num1 > num2){
            System.out.println(num1 + " É maior");
        } else if (num2 > num1){
            System.out.println(num2 + " É maior");
        } else {
            System.out.println("Os números são iguais " + num1);
        }
    }
}
