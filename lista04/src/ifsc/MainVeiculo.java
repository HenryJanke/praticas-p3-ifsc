package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo("Volkswagen Golf", "Volkswagen", "Vermelho", 2021, 4);
		Veiculo v2 = new Veiculo("Ford Mustang", "Ford", "Roxo", 2021, 4);
		Veiculo v3 = new Veiculo("Toyota Camry", "Toyota", "Prata", 2022, 4);
		
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
		veiculos.add(v1);
		veiculos.add(v2);
		veiculos.add(v3);
		
		if(veiculos!=null) {
			for (Veiculo veiculo : veiculos) {
				veiculo.info();
			}
		}
	}
	
}
