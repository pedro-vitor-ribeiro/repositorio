package questao_dois;

import java.util.Scanner;

public class QuestaoDois {
	public static void main(String[] args) {
		
	// Variaveis
		Scanner input = new Scanner(System.in);
		int numeroMinimo = 6;
		
	// Input da senha e Opera��o matematica para ver ela est� com a quantidade minima de caracteres
		System.out.print("Digite sua senha: ");
		int senha = input.next().length();
		int faltas = numeroMinimo - senha;
	
	// 	Testagem para conferir se est� nos criterios minimos de caracteres e mensagem
		if (faltas > 0) {	
			System.out.print("Para a senha ficar segura, faltam: " + faltas + " caracteres");
		} else { 
			System.out.print("A senha est� com numero de caracteres correspondente");
		}
		
	}
}
