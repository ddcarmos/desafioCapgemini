package ex01;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			int n = entrada.nextInt();
			
			for (int j = 1; j <=n; j++) {
				for (int i = 1; i <= n; i++) {
					if (i <= n-j) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
		}

		
	}

}
