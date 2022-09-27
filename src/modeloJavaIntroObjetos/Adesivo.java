package modeloJavaIntroObjetos;

// criação de objeto com atributos e métodos representando a classe Adesivo.

public class Adesivo {

	public String mensagem;
	public String cor;
	private String sentido;

	public void colar() {
		System.out.println(mensagem);
		System.out.println(cor);
		System.out.println(getSentido());
	}

// métodos acessores "get" & "set" para habilitar a utilização do atributo sentido (private)
// fora do package modeloJavaIntroObjetos.

	public String getSentido() {
		return sentido;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}
}