package ifsc;

import java.util.Scanner;

public class MainAnimal {

	public static void main(String[] args) {
	
		
		
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		cachorro.setNome("Tolfo");
		cachorro.setRaca("Persa");
		cachorro.setNumPatas(4);
		cachorro.setEcosistema("lugares macios");
		cachorro.setCor("Preto");
		cachorro.setComprimento(0.90f);
	
		gato.setNome("Gatao");
		gato.setRaca("Labrador");
		gato.setNumPatas(3);
		gato.setEcosistema("Rua");
		gato.setCor("cinza");
		gato.setComprimento(1.80f);
		
		cachorro.late();
		gato.mia();
		
		
		
		
	}
	
}
