package exerciciosDasAulas;

import java.util.Scanner;

public class ex3 {

    //Faça dois números inteiors e imprima a soma

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;



        System.out.println("Insire dois números inteiros");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        int resultado = num1 + num2;

        System.out.println(resultado);


    }


}
