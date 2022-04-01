package br.edu.infnet.projetopdv.model.domain;

public class Cest extends Produto {

	public Cest(String categoria, int codigo, String nome, float valor) {
		super(categoria, codigo, nome, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularvalorimposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
