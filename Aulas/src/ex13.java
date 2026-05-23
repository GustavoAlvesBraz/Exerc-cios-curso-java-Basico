import java.util.Scanner;

public class ex13 {
    //Tendo como dados de entrada a altura e o sexo de uma pessoa,
    //construa um algoritmo que calcule seu peso ideal, utilizando as
    //seguintes fórmulas:
    //. Para homens: (72.7*h) - 58
    //a. Para mulheres: (62.1*h) - 44.7 (h = altura)
    //b. Peça o peso da pessoa e informe se ela está dentro, acima ou
    //abaixo do peso.
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double altura;
        String sexo = "";

        System.out.println("Insira sua altura em metros");
        altura = scan.nextDouble();
        System.out.println("Digite M - masculino F - feminino");
        sexo = scan.next();

        double pesoIdeal = 0;
        if(sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;

        } else if (sexo.equalsIgnoreCase("F")){
            pesoIdeal = (62.1 * altura) - 44.7;
        } else { System.out.println("Sexo inválido.");
            scan.close();
            return;

        }

        System.out.printf("Seu peso ideal é: %.2f kg\n", pesoIdeal);

    }
}
