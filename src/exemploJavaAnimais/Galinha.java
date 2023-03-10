package exemploJavaAnimais;

import interfaceJavaIntro.I_Voar;

// criação de objeto representando a classe Galinhs com implementação de interface
// e extensão de classe abstrata.

public class Galinha extends Ave implements I_Voar {

	@Override
	public void voar() {
		System.out.println("Galinha tentou voar mas apenas planou... :-(");	
	}
} 