package AssessementApp.Controller;


import com.google.gson.Gson;

import AssessementApp.model.domain.Animal;
import AssessementApp.model.service.AnimalService;

import spark.Route;

public class AnimalController {

	public static Route obterLista = (req, res) -> {
		
		return AnimalService.obterLista();
	};
	
	
	public static Route incluir = (req, res) -> {
				
		Animal animal = new Gson().fromJson(req.body(), Animal.class);
		AnimalService.incluir(animal);
		return "Animal cadastrado com sucesso: " + animal;
		
		
	};
	
	public static Route cadastrar = (req, res) -> {
	
		String oNome = req.params("Nome");
		
		Animal animal= new Animal(oNome);
				
		AnimalService.incluir(animal);
		return "Animal cadastrado com sucesso: " + animal;
		
		
	};
	
	
	public static Route excluir = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		
		Animal animal = AnimalService.pesquisar(index);
		
		AnimalService.excluir(index);
		
		return "Exclusão realizada com sucesso: " + animal;
	};
	
	
	public static Route pesquisar = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		Animal animal = AnimalService.pesquisar(index);
		return "Animal: " + animal;
		
	};
		
}
