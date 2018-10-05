package br.ucsal.oo;

public class Pessoa implements Comparable<Pessoa>{

	private String cpf;
	private String nome;
	
	
	
	
	public Pessoa(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public int compareTo(Pessoa o) {
		int i =  this.nome.compareTo(o.nome) ;
		if(i==0) {
			i = this.cpf.compareTo(o.cpf);
		}
		return i;
	}


	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + "]";
	}
	
	
	
	
}
