package br.com.senai.usuariosmarketplace;

import br.com.senai.usuariosmarketplace.core.service.UsuarioService;

public class InitApp {

	public static void main(String[] args) {
		UsuarioService service = new UsuarioService();
		service.criarPor("Laudelino Martins Cardoso Neto Cabral", "jose1424");
	}

}
