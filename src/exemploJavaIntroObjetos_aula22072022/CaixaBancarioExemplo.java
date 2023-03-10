package exemploJavaIntroObjetos_aula22072022;

// simulação de operação realizada em caixa eletrônico.

class Caixa {
// classe Caixa criada com atributos e métodos para representação do objeto Caixa
// que será instanciado na public class CaixaBancarioExemplo.
	double saldo = 2850;
	
	void sacar(int valor) {
		saldo -= valor;
	}
	
	void depositar(int valor) {
		saldo += valor;
	}
	void exibirSaldo() {
		System.out.println(saldo);
	}
}

public class CaixaBancarioExemplo {

// instância da classe Caixa para criação do objeto "c1", executando no objeto
// as operações presentes nos métodos da classe homônima.
	public static void main(String[] args) {
		Caixa c1 = new Caixa();
		c1.sacar(389);
		c1.depositar(120);
		c1.sacar(583);
		c1.exibirSaldo();
	}
} 