package modeloJavaIntroObjetos;

// criação de objeto com atributos e métodos representando a classe Pessoa.

public class Pessoa {

// atributos
	public String nome;
	public String CPF;
	public int idade;

//métodos	
	public void exibir() {
		System.out.println(" ==> Dados de " + nome);
		System.out.println("CPF: " + CPF);
		System.out.println("Idade: " + idade);
	}

}