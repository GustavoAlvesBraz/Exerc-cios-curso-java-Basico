package exerciciosDasAulas;

import java.util.Scanner;

public class ex11 {
    //11.Faça um Programa que peça 2 números inteiros e um número real.
    //Calcule e mostre:
    //a. o produto do dobro do primeiro com metade do segundo .
    //b. a soma do triplo do primeiro com o terceiro.
    //c. o terceiro elevado ao cubo.

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira dois números inteiros e um real");
        int num1;
        int num2;
        double num3;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextDouble();

        int a = (num1 * 2) + (num2/2);
        double b = (num1 * 3) + num3;
        double c = Math.pow(num3, 3);

        System.out.println("o produto do dobro do primeiro com metade do segundo: " + a);
        System.out.println("a soma do triplo do primeiro com o terceiro: " + b);
        System.out.println("o terceiro elevado ao cubo: " + c);

        scan.close();
    }
}
