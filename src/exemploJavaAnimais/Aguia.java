package exemploJavaAnimais;

import interfaceJavaIntro.I_Voar;

// criação de objeto representando a classe Águia com implementação de interface
// e extensão de classe abstrata.

public class Aguia extends Ave implements I_Voar{

	@Override
	public void voar() {
		System.out.println("Águia levantou voo!");	
	}
}