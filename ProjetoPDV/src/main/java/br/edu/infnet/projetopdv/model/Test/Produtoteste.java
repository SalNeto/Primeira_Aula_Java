package br.edu.infnet.projetopdv.model.Test;

import br.edu.infnet.projetopdv.model.domain.Cest;
import br.edu.infnet.projetopdv.model.domain.Extipi;
import br.edu.infnet.projetopdv.model.domain.Ncm;

public class Produtoteste {

	public static void main(String[] args) {
	
		Cest Cest = new Cest("categ", 123, "teste", 100);
		
		Extipi extipi = new Extipi("categ", 123, "teste", 100);
		
		Ncm ncm = new Ncm("categ", 123, "teste", 100);
		ncm.setCode(0);
		ncm.setDescricao(null);
		System.out.println(ncm);


	}

}
