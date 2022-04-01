package br.edu.infnet.projetopdv.model.Test;

import br.edu.infnet.projetopdv.model.domain.Ncm;

public class Produtoteste {

	public static void main(String[] args) {
	
		Cest Cest = new Cest(null, 0, 0);
		
		Extipi Extipi = new Extipi(null, 0, 0);
		
		Ncm ncm = new ncm ("chop", 10, 987);
		ncm.setCodigo(0);
		ncm.setDescricao(null);
		System.out.println(ncm);


	}

}
