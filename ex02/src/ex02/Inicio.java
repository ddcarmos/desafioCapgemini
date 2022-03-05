package ex02;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			String senha = entrada.next();

			int faltantes = 0;
			int regrasDescumpridas = 0;

			if (senha.length() < 6) {
				faltantes = (6 - senha.length());
			}

			boolean temDigitos = false;
			boolean temMaiusculo = false;
			boolean temMinusculo = false;
			boolean temCaractereEspecial = false;

			// !@#$%^&*()-+
			for (char c : senha.toCharArray()) {
				if (c >= '0' && c <= '9') {
					temDigitos = true;
				} else if (c >= 'A' && c <= 'Z') {
					temMaiusculo = true;
				} else if (c >= 'a' && c <= 'z') {
					temMinusculo = true;
				} else if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*'
						|| c == '(' || c == ')' || c == '-' || c == '+') {
					temCaractereEspecial = true;
				}
			}

			if (!temDigitos)
				regrasDescumpridas++;
			if (!temMaiusculo)
				regrasDescumpridas++;
			if (!temMinusculo)
				regrasDescumpridas++;
			if (!temCaractereEspecial)
				regrasDescumpridas++;

			if (faltantes > regrasDescumpridas)
				System.out.println(faltantes);
			else
				System.out.println(regrasDescumpridas);

		}

	}

}
