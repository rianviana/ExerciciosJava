package Atividades.ExerciosUdemy.Arrays;


import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Quantas notas voce quer informar: ");
        int quant = entrada.nextInt();

        double notas[] = new double[quant];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("informe a nota numero " + (i+1) + ": " );
            notas[i]= entrada.nextDouble();
        }
        double soma = 0;
        double TotalMedia = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas [i];
            TotalMedia = soma/ notas.length;
        }

        System.out.println("A media é: " + TotalMedia);

        entrada.close();
    }
}
