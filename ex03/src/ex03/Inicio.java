package ex03;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		try (Scanner in = new Scanner(System.in)) {
			String palavra = in.next();
			
			int anagramas = 0;
			int n = palavra.length();
			
			for (int pivo = 0; pivo < n; pivo++) {
				anagramas = anagramas + getAnagrama(pivo, palavra);
			}
			
			System.out.println(anagramas);
		}
	}

	private static int getAnagrama(int pivo, String palavra) {
		int novosAnagramas = 0;
		int n = palavra.length();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == pivo || j == pivo || i == j) continue;
				char[] novaPalavraCharArray = palavra.toCharArray();
				novaPalavraCharArray[i] = palavra.charAt(j);
				novaPalavraCharArray[j] = palavra.charAt(i);
				String novaPalavra = String.valueOf(novaPalavraCharArray);
				if (novaPalavra.equals(palavra)) {					
					novosAnagramas = novosAnagramas + 1;
				}
			}
		}
		
		return novosAnagramas;
	}

}
