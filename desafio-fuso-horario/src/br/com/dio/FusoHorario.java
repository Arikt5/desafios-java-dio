package br.com.dio;

import java.util.Scanner;

public class FusoHorario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();

		/*int ajuste = 0;
		int horaChegada = (horasaida + tempoviagem);

		  if (horasaida <= 23) {
		    ajuste = horaChegada + fuso; -> como eu resolvi mas um teste não passou;
		  } else if (horasaida == 24) {
		    ajuste = 0;
		  }

		System.out.println(ajuste);*/

        int horaChegada = (horasaida + tempoviagem);
        int ajuste;

        if (horaChegada > 24) {
            ajuste = horaChegada - 24;
            horaChegada = 0;
            horaChegada += ajuste;
        } else if (horaChegada == 24){
            horaChegada = 0;
        }

        horaChegada += fuso;

        System.out.println(horaChegada);

        sc.close();
    }
}
