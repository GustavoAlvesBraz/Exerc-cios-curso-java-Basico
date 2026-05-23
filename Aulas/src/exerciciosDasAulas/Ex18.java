package exerciciosDasAulas;

import java.util.Scanner;

public class Ex18 {
    //18.Faça um programa que peça o tamanho de um arquivo para download
    //(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
    //informe o tempo aproximado de download do arquivo usando este link
    //(em minutos).

    public static void main (String[] args){
        double tamanho = 0;
        double download = 0;


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo (em MB):");
         tamanho = scan.nextDouble();

        System.out.println("Digite a velocidade da internet (em Mbps):");
        download = scan.nextDouble();
        double tamanhoConvertido = tamanho * 8;

        double tempoSegundos = tamanhoConvertido / download;
        double tempoMinutos = tempoSegundos / 60;

        System.out.printf("O tempo aproximado de download é de: %.2f minutos.%n", tempoMinutos);

        scan.close();
    }
}
