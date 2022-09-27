package exemploJavaIntroObjetos_aula22072022;

// mensagem do método DivisaoException para representar descrição do erro. 

public class DivisaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivisaoException(int x, int y) {
		super("Erro ao dividir o número " + x + " por " + y + ".");
	}
}