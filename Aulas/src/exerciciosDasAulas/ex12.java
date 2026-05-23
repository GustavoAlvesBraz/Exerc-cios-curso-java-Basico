package exerciciosDasAulas;
import java.util.Locale;
import java.util.Scanner;

public class ex12 {
    //.Tendo como dados de entrada a altura de uma pessoa, construa um
    //algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
    //(72.7*altura) - 58

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double altura;

        System.out.println("Descubra seu peso ideal\n Insira sua altura em m");
        altura = scan.nextDouble();
        double peso = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é\n" + peso);
    }
}
