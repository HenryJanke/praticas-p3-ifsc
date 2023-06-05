package ex10;

public class Animal {


	private String nomeCientifico;
	private String reino;
	private String familia ;
	private String[] nomesPop;
	
	public Animal() {
		nomesPop = new String[5];
	}
	public Animal(String nomeCientifico, String reino, String familia, String[] nomesPop) {
		nomesPop = new String[5];							
		this.nomeCientifico = nomeCientifico;
		this.reino = reino;
		this.familia = familia;
		this.nomesPop = nomesPop;
	}
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public String getReino() {
		return reino;
	}
	public String getFamilia() {
		return familia;
	}
	public String[] getNomesPop() {
		return nomesPop;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public void setReino(String reino) {
		this.reino = reino;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public void setNomesPop(String[] nomesPop) {
		this.nomesPop = nomesPop;
	}

	public String info(){
		
		String infos ="Nome Cientifico: "+this.nomeCientifico+
		"\nReino: "+this.reino+"\nFamilia: "+this.familia+"\nNomes pop:";
		
		
		
		return infos;
	}
}
