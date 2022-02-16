package questao_tres;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuestaoTres {
	
	// Metodo que testará se é, ou nao, um anagrama
	static boolean isAnagrama(String str1, String str2) {
		if (str1.length() == str2.length()) {
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
	return false;
	}
	
	public static void main(String[] args) {
		
		// Variaveis e ArrayList
		int quantidade = 0;
		ArrayList<ArrayList<Integer>> posAnagrama = new ArrayList<>();
		
		// Input da Mensagem
		System.out.print("Digite sua palavra: ");
		Scanner input = new Scanner(System.in);
		String palavra = input.nextLine();
		
		// Estrutura responsavel por introduzir no Array as posiçoes
		for (int i = 1; i <= palavra.length(); i++) {
            for (int z = 0; z <= palavra.length() - i; z++) {
                int relacao = z + i - 1;
                ArrayList<Integer> posicao = new ArrayList<Integer>();
                for (int k = z; k <= relacao; k++) {
                    posicao.add(k);
                }
                posAnagrama.add(posicao);
            }
        }
		
		
		
		// Estrutura responsavel por separar de forma possivel a string em substrings e, ao chamar o metodo isAnagram, testar
		// se é um anagrama.
		
		char[] c_palavra = palavra.toCharArray();
		ArrayList<ArrayList<Integer>> analise = new ArrayList<>();
		for (ArrayList<Integer> anagrams : posAnagrama) {
			analise.add(anagrams);
 
			String str1 = "";
			for (Integer posicao : anagrams) {
				str1+= c_palavra[posicao];
			}
 
			for (ArrayList<Integer> anagrams2 : posAnagrama) {
				if (!analise.contains(anagrams2)) {
					String str2 = "";
					for (Integer pos : anagrams2) {
						str2+= c_palavra[pos];
					}
					if (isAnagrama(str1, str2)) {
						quantidade+=1;
					}
				}
			}
		}
		
		// Introduzirá no console a resposta
		System.out.println("Foi encontrado nessa palavra: " + quantidade + " anagramas");
 
	}
}
