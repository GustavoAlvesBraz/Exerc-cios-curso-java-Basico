package exerciciosDasAulas;

import java.util.Scanner;

public class ex5 {

    public static void main (String[] args){

        //Conversor de Metros para Cm
        double metros;


        Scanner scan = new Scanner(System.in);
        System.out.println("Converta metros para centímetros:");
        metros = scan.nextDouble();
        double cm = metros * 100;
        System.out.println(cm + "cm");
    }

}
