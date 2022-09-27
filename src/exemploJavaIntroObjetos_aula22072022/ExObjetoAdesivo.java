package exemploJavaIntroObjetos_aula22072022;

import modeloJavaIntroObjetos.Adesivo;

// instância do objeto Adesivo assumindo valores e comportamentos da classe homônima e
// emprego do método acessor "set" para utilização do atributo sentido (private).

public class ExObjetoAdesivo {

	public static void main(String[] args) {
		Adesivo a1 = new Adesivo();
		a1.mensagem = "ATENÇÃO!";
		a1.cor = "Cor de fundo: VERMELHO";
		a1.setSentido("Alerta.");

		a1.colar();
		
// exemplo de tratamento de exceção simples.
		
		throw new RuntimeException("Simulação de erro.");
	}
}