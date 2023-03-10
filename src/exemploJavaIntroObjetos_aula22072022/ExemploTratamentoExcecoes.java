package exemploJavaIntroObjetos_aula22072022;

import java.io.IOException;
import java.util.Scanner;

// simulação de erros para demonstração de funcionamento dos métodos "try/catch" e "throw".

public class ExemploTratamentoExcecoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		try {
			System.out.println("Informe um número como valor de entrada:");
			int i = teclado.nextInt();
			System.out.println("Etapa 1");
			if (i == 1)
				throw new ArithmeticException("Divisão por zero.");
			System.out.println("Etapa 2");
			if (i == 2)
				throw new IOException("Erro de arquivo.");
			System.out.println("Etapa 3");
			if (i == 3)
				throw new RuntimeException("Erro genérico.");
		} catch (ArithmeticException i1) {
			System.out.println(i1.getMessage());
		} catch (IOException i2) {
			System.out.println(i2.getMessage());
			System.out.println("Arquivo 'exemplo.txt' corrompido.");
		} finally {
			teclado.close();
		}
	}
} 