package br.com.dio;

import java.util.Scanner;

public class TrigoNoTabuleiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gramas = 12;

        int n = sc.nextInt();

        for(int i=0 ; i<n ; i++) {

            int x = sc.nextInt();
            double quantidadeDeTrigo = (double) Math.pow(2, x) -1;
            double quantidadeDeGramas = quantidadeDeTrigo / gramas;
            long quantidadeDeKilos = (long) quantidadeDeGramas / 1000;

            System.out.println(quantidadeDeKilos + " kg");   //Complete o código aqui.
        }
        sc.close();
    }
}
