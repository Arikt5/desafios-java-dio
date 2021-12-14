package br.com.dio;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        String parImpar = " ";
        String positivoNegativo = " ";

        for (int i = 0; i < N; i++) {
            int numeros = leitor.nextInt();
            if (numeros < 0) {
                positivoNegativo = "NEGATIVE";
            } else {
                positivoNegativo = "POSITIVE";
            }
            if (numeros % 2 == 0) {
                parImpar = "EVEN";
            } else {
                parImpar = "ODD";
            }
            if (numeros != 0) {
                System.out.println(parImpar + " " + positivoNegativo);
            } else {
                System.out.println("NULL");
            }
        }    
    }
}
