package AssessementApp.Controller;


import com.google.gson.Gson;

import AssessementApp.model.domain.PetShop;
import AssessementApp.model.service.PetShopService;

import spark.Route;

public class PetShopController {

	public static Route obterLista = (req, res) -> {
		
		return PetShopService.obterLista();
	};
	
	
	public static Route incluir = (req, res) -> {
		
		
		PetShop petshop = new Gson().fromJson(req.body(), PetShop.class);
		PetShopService.incluir(petshop);
		return "PetShop cadastrado com sucesso: " + petshop;
		
		
	};
	
	public static Route cadastrar = (req, res) -> {
		
		String oNome = req.params("Nome");
		
		PetShop petshop= new PetShop(oNome);
				
		PetShopService.incluir(petshop);
		return "PetShop cadastrado com sucesso: " + petshop;
		
		
	};
	
	
	public static Route excluir = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		
		PetShop petshop = PetShopService.pesquisar(index);
		
		PetShopService.excluir(index);
		
		return "Exclusão realizada com sucesso: " + petshop;
	};
	
	
	public static Route pesquisar = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		PetShop petshop = PetShopService.pesquisar(index);
		return "PetShop: " + petshop;
		
	};
		
}
