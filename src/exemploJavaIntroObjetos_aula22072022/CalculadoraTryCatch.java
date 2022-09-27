package exemploJavaIntroObjetos_aula22072022;

import modeloJavaIntroObjetos.Calculadora;

// loop de multiplicação e divisão com tratamento de exceção em divisão por zero.

public class CalculadoraTryCatch {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		int i = -5;
		while (i <= 5)
			try {
				System.out.println("Multiplicação: " + c1.multiplicacao(50, i));
				System.out.println("Divisão: " + c1.divisao(50, i));
			} catch (DivisaoException ERROR) {
				System.out.println(ERROR.getMessage());
			} finally {
				i++;
			}
	}
}