package exemploJavaIntroObjetos_aula22072022;

import exemploJavaAnimais.*;
import interfaceJavaIntro.*;

// classe para representação do uso de objetos com interfaces e aplicação
// do operador "instanceof" para verificar implementação da interface por objeto.

public class ExemploAnimaisInterfaces {

	public static void jogue30Andar(Ave a) {
		if (a instanceof I_Voar) {
			((I_Voar) a).voar();
		} else {
			System.out.println("Coitado do " + a.nome + ".");
		}
	}

	public static void main(String[] args) {
		Ave[] aves = { new Galinha(), new Aguia(), new Pinguim() };
		aves[0].nome = "Galinha Cocoricó";
		aves[1].nome = "Águia América";
		aves[2].nome = "Pingu Pinguim";
		for (Ave a : aves)
			jogue30Andar(a);
	}
}