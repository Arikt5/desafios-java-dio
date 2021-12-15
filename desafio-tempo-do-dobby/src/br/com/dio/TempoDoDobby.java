package br.com.dio;

import java.io.IOException;
import java.util.Scanner;

public class TempoDoDobby {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int A = leitor.nextInt() + leitor.nextInt();

        if (N < A)
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");
    }
}
