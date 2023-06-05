package ex11;

import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		String nome, cpfstr,data_nasc;
		Long cpf;
		
		Pessoa[] pessoas = new Pessoa[3];
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
	
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+"º Pessoa");
			System.out.print("Nome: ");
			nome = in.nextLine();
			System.out.print("Data Nasc: ");
			data_nasc = in.nextLine();
			System.out.print("Cpf: ");
			cpfstr = in.nextLine();
			switch (i) {
			case 0:
				if(cpfstr != null) {
					cpf = Long.valueOf(cpfstr);
					p1.setCpf(cpf);	
				}
				p1.setData_nasc(data_nasc);
				p1.setNome(nome);
				
				pessoas[i] = p1;
				
				break;
			case 1:
				if(cpfstr != null) {
					cpf = Long.valueOf(cpfstr);
					p2.setCpf(cpf);	
				}
				p2.setData_nasc(data_nasc);
				p2.setNome(nome);
				
				pessoas[i] = p2;
				
				break;
	
			default:
				if(cpfstr != null) {
					cpf = Long.valueOf(cpfstr);
					p3.setCpf(cpf);	
				}
				p3.setData_nasc(data_nasc);
				p3.setNome(nome);
				
				pessoas[i] = p3;
				
				break;
			}
		}
		if(pessoas!=null) {
			for (Pessoa pessoa : pessoas) {
				pessoa.info();
			}
		}
	}
	
}
