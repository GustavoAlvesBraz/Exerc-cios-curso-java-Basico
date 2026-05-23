package exerciciosDasAulas;

import java.util.Scanner;

public class ex10 {
    //Faça um programa que transforme celcius em farenheit
    public static void main (String[] args){
      Scanner scan = new Scanner(System.in);
     double C;
     System.out.println("Insira os graus em Celcius");
        C = scan.nextDouble();

        double F =  ( C * 1.8) + 32;

        System.out.println(F + "F");
    scan.close();
    }
}
