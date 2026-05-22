package exerciciosDasAulas;

import java.util.Scanner;

public class ex6 {
    public static void main (String[] args){
        //calculadora de área de circulora
        double raio;

        Scanner scan = new Scanner(System.in);

        System.out.println("Descubra a área do círculo\n Insira o valor do raio");
        raio = scan.nextDouble();
        double area = (raio * raio) * Math.PI;
        System.out.println(area);
    }

}
