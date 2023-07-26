package estudar.poo;

public enum EstadoBrasileiro{
    SAO_PAULO ("SP","São Paulo", 10),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 86),
	PIAUI ("PI", "Piauí", 01),
	MARANHAO ("MA","Maranhão", 39)
    
    ;
	
	private String nome;
	private String sigla;
	private int ibge;

	EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

	public int getIbge(){
		return ibge;
	}
}
