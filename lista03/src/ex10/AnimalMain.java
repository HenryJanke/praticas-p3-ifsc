package ex10;

public class AnimalMain {
	//SEI Q TÁ MAIS PRO MENOS MAS JÁ CONSTRUI ALGO, DESCULPA PROF.
	public static void main(String[] args) {
		
		String nomesPop[] = {"Cão","Totó","cachorrão","Rex","Dog"};
		
		
		Animal animal = new Animal("Canis lupus familiaris", "Animalia", "Canidae", nomesPop);
	
		System.out.println(animal.info());
		
	}
	
}
