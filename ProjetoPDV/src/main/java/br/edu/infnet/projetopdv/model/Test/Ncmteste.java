package br.edu.infnet.projetopdv.model.Test;

import br.edu.infnet.projetopdv.model.domain.Ncm;

public class Ncmteste {

	public static void main(String[] args) {
		
		Ncm ncm1 = new Ncm("outro", 10, "chope", 123);
		ncm1.setCode(0);
		ncm1.setDescricao(null);
		

		Ncm ncm2 = new Ncm("outro", 10, "chope", 123);
		ncm2.setCode(0);
		ncm2.setDescricao(null);
		System.out.println("carga tributaria = " + ncm2.calcularvalorimposto());
		
		
	}

}
