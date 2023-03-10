package modeloJavaIntroObjetos;

// criação de objeto representando a classe Profissional estendendo métodos da classe pai (Pessoa).

public class Profissional extends Pessoa {

	public String profissao;

// extensão do método exibir() com aplicação de polimorfismo para 
// sobrescrever método com característica da classe representada.

	@Override
	public void exibir() {
		super.exibir();
		System.out.println("Profissão: " + profissao);
	}
}