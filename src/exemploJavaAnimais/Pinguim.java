package exemploJavaAnimais;

import interfaceJavaIntro.I_Andar;
import interfaceJavaIntro.I_Navegar;

// criação de objeto representando a classe Pinguim com implementação de interface
// e extensão de classe abstrata.

public class Pinguim extends Ave implements I_Andar, I_Navegar {

	@Override
	public void flutuar() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void submergir() {
		System.out.println("Pinguim mergulhou...");	
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
	}

	@Override
	public void pular() {
		// TODO Auto-generated method stub	
	}
} 