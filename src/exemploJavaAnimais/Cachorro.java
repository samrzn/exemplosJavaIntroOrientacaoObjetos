package exemploJavaAnimais;

import interfaceJavaIntro.I_Andar;

// criação de objeto representando a classe Cachorro com implementação de interface.

public class Cachorro implements I_Andar {

	@Override
	public void mover() {
		System.out.println("Cachorro andou...");
	}

	@Override
	public void pular() {
		// TODO Auto-generated method stub
	}
} 