package questao_um;

import java.util.Scanner;

public class QuestaoUm {
	public static void main(String[] args) {
		
		// Variaveis
			3 input = new Scanner(System.in);            
			int relacao = 0;                                    // Variavel usada para estabelecer uma relação entre a quantidade de " " e "*"
		
		// Extrair a altura da escada
			
			System.out.print("Digite a altura da escada: ");
			int degraus = input.nextInt();                      // Input em uma variavel a quantidade de degraus que terá a escada
			
		// Posicionamento dos " " e dos "*"
			
			for(int z = 0; z < degraus; z++) {                  // Estrutura responsável por estabelecer os degraus das escadas
				
				for (int i = relacao; i < degraus-1; i++) {     // Estrutura responsável por colocar os espaços nos locais
					System.out.print(" ");
				}
				
				relacao++;                                      // A medida que os espaços vazios vão diminuindo, essa variavel permite que os asteriscos vão aumentando e ocupando esses espaços
				                               
				for(int y = 0; y < relacao; y++) {              // Estrutura responsavel por prencher os asteriscos 
					System.out.print("*");
				}
				
				System.out.print("\n");                         // Pular para a proxima linha
				
			}

		}

	
}
