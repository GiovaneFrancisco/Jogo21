package com.jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random jog = new Random();
		Random comp = new Random();
		String cartas[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String nipes[] = { "♥", "♦", "♣", "♠" };
		System.out.print("Qual é a sua aposta? ");
		int aposta = teclado.nextInt();
		int somaJ = 0;
		int valor = 0;
		char resp = 'a';
		System.out.println("==========================");
		do {
			int cartaJ = jog.nextInt(13); // Escolhe uma carta aleatória de 0 a 13
			int nipeJ = jog.nextInt(4); // Escolhe um nipe aleatório de 0 a 3
			if (cartas[cartaJ] == "A" || cartas[cartaJ] == "J" || cartas[cartaJ] == "Q" || cartas[cartaJ] == "K") {
				valor = 10; // Define o valor de 10 para A J Q K
			}
			if (cartas[cartaJ] == "2") { // Define o valor em int para cada escolha String do Array
				valor = 2;
			} else if (cartas[cartaJ] == "3") {
				valor = 3;
			} else if (cartas[cartaJ] == "4") {
				valor = 4;
			} else if (cartas[cartaJ] == "5") {
				valor = 5;
			} else if (cartas[cartaJ] == "6") {
				valor = 6;
			} else if (cartas[cartaJ] == "7") {
				valor = 7;
			} else if (cartas[cartaJ] == "8") {
				valor = 8;
			} else if (cartas[cartaJ] == "9") {
				valor = 9;
			} else if (cartas[cartaJ] == "10") {
				valor = 10;
			}
			somaJ = somaJ + valor; // Faz a soma dos valores selecionados
			System.out.println(cartas[cartaJ] + nipes[nipeJ]); // Escreve o valor e o nipe
			System.out.println("Soma: " + somaJ);
			System.out.println();
			if(somaJ>21) {
				System.out.println("Voce estourou!");
				System.exit(0);
			}
			System.out.println("Quer mais uma carta? [S/N]");
			resp = teclado.next().charAt(0);
			if (resp == 's') {
				resp = 'S';
			} else if (resp == 'n') {
				resp = 'N';
			}
			System.out.println();
		} while (resp == 'S'); // Cria um looping enquanto a resposta for S e a soma<21
		
		System.out.println("");
		System.out.println("Cartas do computador"); // Faz exatamente o mesmo proecesso para o computador
		System.out.println("==========================");
		int somaC=0;
		do {
			int cartaC = jog.nextInt(13);
			int nipeC = jog.nextInt(4);
			if (cartas[cartaC] == "A" || cartas[cartaC] == "J" || cartas[cartaC] == "Q" || cartas[cartaC] == "K") {
				valor = 10;
			}
			if (cartas[cartaC] == "2") {
				valor = 2;
			} else if (cartas[cartaC] == "3") {
				valor = 3;
			} else if (cartas[cartaC] == "4") {
				valor = 4;
			} else if (cartas[cartaC] == "5") {
				valor = 5;
			} else if (cartas[cartaC] == "6") {
				valor = 6;
			} else if (cartas[cartaC] == "7") {
				valor = 7;
			} else if (cartas[cartaC] == "8") {
				valor = 8;
			} else if (cartas[cartaC] == "9") {
				valor = 9;
			} else if (cartas[cartaC] == "10") {
				valor = 10;
			}
			somaC = somaC + valor;
			System.out.println(cartas[cartaC] + nipes[nipeC]);
			System.out.println("Soma: " + somaC);
			System.out.println();
			if(somaC>21) {
				System.out.println("O computador estourou!");
				System.exit(0);
			}
		}while(somaC<17);
		System.out.println("==========================");

		if(somaJ<somaC) { // Caso nenhum dos 2 tenham estourado, o que tiver a maior soma ganha
			System.out.println("Computador ganhou o jogo!");
		}else if(somaJ>somaC) {
			System.out.println("Jogador ganhou o jogo!");
		}
	}
}