package br.edu.infnet.projetopdv.model.domain;

public abstract class Produto {
	private String categoria;
	private int codigo; 
	private String nome;
	private float valor;
	
	public Produto(String categoria, int codigo, String nome, float valor) {

		this.categoria = categoria;
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}

	public abstract float calcularvalorimposto();
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder() ;
		
		sb.append(categoria);
		sb.append(";");
		sb.append(codigo);
		sb.append(";");
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		
		return sb.toString();
	}
	
	
	
	public String getCategoria() {
		return categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public float getValor() {
		return valor;
	}
}
