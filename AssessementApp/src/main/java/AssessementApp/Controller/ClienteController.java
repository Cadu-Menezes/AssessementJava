package AssessementApp.Controller;

import com.google.gson.Gson;

import AssessementApp.model.domain.Cliente;
import AssessementApp.model.service.ClienteService;

import spark.Route;

public class ClienteController {

	public static Route obterLista = (req, res) -> {
		
		return ClienteService.obterLista();
	};
	
	
	public static Route incluir = (req, res) -> {
		
		Cliente cliente = new Gson().fromJson(req.body(), Cliente.class);
		
		ClienteService.incluir(cliente);
		return "Cliente cadastrado com sucesso: " + cliente;
		
		
	};
	
	
	public static Route cadastrar = (req, res) -> {
		
		String oNome = req.params("Nome");
		
		Cliente cliente = new Cliente(oNome);
				
		ClienteService.incluir(cliente);
		return "Cliente cadastrado com sucesso: " + cliente;
		
		
	};
	
	
	public static Route excluir = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		
		Cliente cliente = ClienteService.pesquisar(index);
		
		ClienteService.excluir(index);
		
		return "Exclusão realizada com sucesso: " + cliente;
	};
	
	
	public static Route pesquisar = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		Cliente cliente = ClienteService.pesquisar(index);
		return "Cliente: " + cliente;
		
	};
		
}
