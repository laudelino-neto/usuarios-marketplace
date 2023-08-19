package br.com.senai.usuariosmarketplace;

import br.com.senai.usuariosmarketplace.core.service.UsuarioService;

public class InitApp {

	public static void main(String[] args) {
		UsuarioService service = new UsuarioService();
		System.out.println(service.removerAcentoDo("Jacó da Silva"));
		System.out.println(service.fracionar("José da Silva Alburquerque dos Anjos e Bragança"));
		System.out.println(service.gerarLoginPor("José da Silva dos Anjos"));
		System.out.println(service.gerarHashDa("jose123456"));
	}

}
