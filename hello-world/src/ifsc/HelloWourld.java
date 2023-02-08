package ifsc;

import java.util.Arrays;
import java.util.Scanner;

//alou galera de couwboy
public class HelloWourld {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Idade: ");
		
		String idadeStr = in.nextLine();
		
		System.out.println(idadeStr+1);
		
		double idade = Double.valueOf(idadeStr);
		
		System.out.format("%22s%.2f","A idade digitada foi: ", (idade+1));
	}

}
