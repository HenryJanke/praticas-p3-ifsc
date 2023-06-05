package ex09;

public class Pessoa {

	private String nome;
	private Long cpf;
	private String data_nasc;
	
	public Pessoa() {}
	public Pessoa(String nome, Long cpf, String data_nasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nasc = data_nasc;
	}
	
	public String getNome() {
		return nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	
	
	
	
}
