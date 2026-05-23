package exerciciosDasAulas;

import java.util.Scanner;

//15.Faça um Programa que pergunte quanto você ganha por hora e o
//número de horas trabalhadas no mês. Calcule e mostre o total do seu
//salário no referido mês, sabendo-se que são descontados 11% para o
//Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
//programa que nos dê:
//. salário bruto.
//a. quanto pagou ao INSS.
//b. quanto pagou ao sindicato.
//c. o salário líquido.
//d. calcule os descontos e o salário líquido, conforme a tabela
//abaixo:
//+ Salário Bruto : R$ - IR (11%) : R$ - INSS
//(8%) : R$ - Sindicato ( 5%) : R$ = Salário
//Liquido : R$
//Obs.: Salário Bruto - Descontos = Salário Líquido.
public class ex15 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Double rendHora;
        Double horaMes;

        System.out.println("Insira o valor hora/trabalhada");
        rendHora = scan.nextDouble();
        System.out.println("Quantas horas trabalha por mês");
        horaMes = scan.nextDouble();

        Double salario = rendHora * horaMes;
        Double imposto = salario * 0.11;
        Double inss = salario * 0.08;
        Double sindicato = salario * 0.05;
        Double salarioLiquido = salario - imposto - inss - sindicato;

        System.out.println("Salario bruto: " + salario);
        System.out.println("Imposto de renda 11%: " + imposto);
        System.out.println("INSS 8%: " + inss);
        System.out.println("Sindicato 5%: " + sindicato);
        System.out.println("Salario liquido " + salarioLiquido);

        scan.close();
    }
}
