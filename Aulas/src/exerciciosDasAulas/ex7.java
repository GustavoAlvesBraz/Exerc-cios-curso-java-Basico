package exerciciosDasAulas;

import java.util.Scanner;

public class ex7 {

    public static void main (String[] argsS){
        Scanner scan = new Scanner(System.in);
        double lado;

        System.out.println("Insira o valor de L para área do quadrado");
        lado = scan.nextDouble();
        double area = lado * lado;

        System.out.println("Aréa total:" + area);
        System.out.println("O dobro da área é " + area * 2);

        scan.close();

    }
}
