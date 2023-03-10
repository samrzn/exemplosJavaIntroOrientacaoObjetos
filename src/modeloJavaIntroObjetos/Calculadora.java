package modeloJavaIntroObjetos;

import exemploJavaIntroObjetos_aula22072022.DivisaoException;

// criação de objeto com atributos representando a classe Calculadora
// e importação do método de exceção para tratamento de erro.

public class Calculadora {

	public int multiplicacao(int a, int b) {
		return a * b;
	}

	public int divisao(int a, int b) throws DivisaoException {
		if (b == 0)
			throw new DivisaoException(a, b);
		return a / b;
	}
} 