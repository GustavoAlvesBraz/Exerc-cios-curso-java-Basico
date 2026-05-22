package exerciciosDasAulas;
import java.util.Scanner;
public class ex4 {
    public static void main (String[] args){
        // media bimestral
        Scanner scan = new Scanner(System.in);
        double notas[] = new double[4];
        double soma = 0;
        double media;

        for (int i = 0; i < notas.length; i++){
            System.out.println("digite as notas"+ (i + 1));
            notas[i] = scan.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {

            soma = soma + notas[i];
        }

        media = soma / notas.length;

        System.out.println("\nSoma das notas: " + soma);
        System.out.println("Média: " + media);

        scan.close();

    }
}
