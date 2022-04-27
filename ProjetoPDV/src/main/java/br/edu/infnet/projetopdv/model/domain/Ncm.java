package br.edu.infnet.projetopdv.model.domain;


public class Ncm extends Produto {

	private float code;
	private String descricao;
	
	public Ncm(String categoria, int codigo, String nome, float valor) {
		super(categoria, codigo, nome, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularvalorimposto() {
		// TODO Auto-generated method stub
		return getValor() + code * 0.10f;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder() ;
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(calcularvalorimposto());
		sb.append(";");
		sb.append(code);
		sb.append(";");
		sb.append(descricao);
		
		return sb.toString();
	}

	public float getCode() {
		return code;
	}

	public void setCode(float code) {
		this.code = code;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
