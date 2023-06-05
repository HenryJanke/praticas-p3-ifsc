package ex09;

public class PessoaMainA {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Henry Janke",111111l,"11/05/2004");
		Pessoa p2 = new Pessoa("Camila Schimit",222222l,"11/05/2006");
		Pessoa p3 = new Pessoa("Alexander Janke",333333l,"12/01/2001");
	
		System.out.println("Nome: "+p1.getNome()+"\nData de nasc: "+p1.getData_nasc()+"\nCpf: "+p1.getCpf()+"\n****");
		System.out.println("Nome: "+p2.getNome()+"\nData de nasc: "+p2.getData_nasc()+"\nCpf: "+p2.getCpf()+"\n****");
		System.out.println("Nome: "+p3.getNome()+"\nData de nasc: "+p3.getData_nasc()+"\nCpf: "+p3.getCpf()+"\n****");
	
	
	}
	
}
