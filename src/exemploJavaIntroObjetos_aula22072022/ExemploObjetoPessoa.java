package exemploJavaIntroObjetos_aula22072022;

import modeloJavaIntroObjetos.Pessoa;
import modeloJavaIntroObjetos.Profissional;

// instância do objeto Pessoa assumindo valores e comportamentos da classe homônima representada.

public class ExemploObjetoPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Sam";
		p1.CPF = "215.110.619-98";
		p1.idade = 22;

		Pessoa p2 = new Pessoa();
		p2.nome = "Donna";
		p2.CPF = "239.260.420-20";
		p2.idade = 2;

		Profissional p3 = new Profissional();
		p3.nome = "Iza";
		p3.CPF = "323.030.919-90";
		p3.idade = 32;
		p3.profissao = "Cantora";

		p1.exibir();
		p2.exibir();
		p3.exibir();
	}
} 