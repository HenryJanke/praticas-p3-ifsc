package ifsc;

public class Veiculo {

	private String nome;
	private String fabricante;
	private String cor;
	private Integer ano;
	private Integer num_rodas;
	
	
	public Veiculo() {}
	public Veiculo(String nome, String fabricante, String cor, Integer ano, Integer num_rodas) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.cor = cor;
		this.ano = ano;
		this.num_rodas = num_rodas;
	}


	public String getNome() {
		return nome;
	}


	public String getFabricante() {
		return fabricante;
	}


	public String getCor() {
		return cor;
	}


	public Integer getAno() {
		return ano;
	}


	public Integer getNum_rodas() {
		return num_rodas;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}


	public void setNum_rodas(Integer num_rodas) {
		this.num_rodas = num_rodas;
	}
	
	public void info() {
		
		System.out.println("Nome: "+this.nome);
		System.out.println("Fabricante: "+this.fabricante);
		System.out.println("Cor: "+this.cor);
		System.out.println("Ano: "+this.ano);
		System.out.println("Numero de rodas: "+this.num_rodas);
		System.out.println("--------------------------------------");
	
	}
	
}
