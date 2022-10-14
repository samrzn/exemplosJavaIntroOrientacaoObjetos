package exemploJavaIntroObjetos_aula22072022;

// palavras reservadas para tratamento de erros em Java.

public class TryCatchFinally_Ex {

	public static void main(String[] args) {
		int[] vetor = new int[5];
		try {
			System.out.println("Primeira linha.");
			vetor[6] = 22;
			System.out.println("Segunda linha.");
// a palavra reservada "ex" representa a captura de qualquer erro genérico existente.
		} catch (Exception ex) {
			System.out.println("Erro de índice!");
// a palavra reservada "throw" não permite a renderização dos elementos fora do campo
// "finally", pois renderiza apenas os elementos da estrutura "try/catch/finally" e
// acusa o erro no console; para renderizar todos os elementos - retire "throw ex".
			throw ex;
		} finally {
			System.out.println("Mensagem final aparece.");
		}
		System.out.println("Terceira linha.");
	}
}