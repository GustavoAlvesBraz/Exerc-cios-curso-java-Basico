package exerciciosDasAulas;

import java.util.Scanner;

public class ex8 {
// 8.Faça um programa que pergunte o quanto você ganha por hora
//    e o número de horas trabalhadas no mês. calcule e mostre o total do seu
//    salário referido no mês

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int hora;
        double salarioHora;

        System.out.println("Quanto você ganha por hora?");
        salarioHora = scan.nextDouble();

        System.out.println("Quantas horas por dia?");
        hora = scan.nextInt();

        double salárioDia = salarioHora * hora;
        double salarioSemana = salárioDia * 7;
        double salarioMes = salarioSemana * 4.5;
        System.out.println("Você recebe " + salarioSemana + " por semana.");
        System.out.println("Você recebe " + salarioMes + " por mês.");

    }
}
