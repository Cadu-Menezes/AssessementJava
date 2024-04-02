package AssessementApp;

import AssessementApp.Controller.AnimalController;
import AssessementApp.Controller.ClienteController;
import AssessementApp.Controller.FuncionarioController;
import AssessementApp.Controller.PetShopController;
import AssessementApp.Controller.ViaCepController;
import spark.Spark;

public class App {
	
	public static void main(String[] args) {
		
		Spark.port(8080);
		
		Spark.get("/", (req, res) -> {
			return App.class.getResourceAsStream("/index.html");
		});
		
		
		//Cliente
		Spark.get("/Cliente/Lista", ClienteController.obterLista);
		Spark.post("/Cliente/Incluir", ClienteController.incluir);
		Spark.get("/Cliente/:Nome/Cadastrar", ClienteController.cadastrar);
		Spark.delete("/Cliente/:Id/Excluir", ClienteController.excluir);
		Spark.get("/Cliente/:Id", ClienteController.pesquisar);
		
		//Funcionario
		Spark.get("/Funcionario/Lista", FuncionarioController.obterLista);
		Spark.post("/Funcionario/Incluir", FuncionarioController.incluir);
		Spark.get("/Funcionario/:Nome/Cadastrar", FuncionarioController.cadastrar);
		Spark.delete("/Funcionario/:Id/Excluir", FuncionarioController.excluir);
		Spark.get("/Funcionario/:Id", FuncionarioController.pesquisar);
		
		//Animal
		Spark.get("/Animal/Lista", AnimalController.obterLista);
		Spark.post("/Animal/Incluir", AnimalController.incluir);
		Spark.get("/Animal/:Nome/Cadastrar", AnimalController.cadastrar);
		Spark.delete("/Animal/:Id/Excluir", AnimalController.excluir);
		Spark.get("/Animal/:Id", AnimalController.pesquisar);
		
		//PetShop
		Spark.get("/PetShop/Lista", PetShopController.obterLista);
		Spark.post("/PetShop/Incluir", PetShopController.incluir);
		Spark.get("/PetShop/:Nome/Cadastrar", PetShopController.cadastrar);
		Spark.delete("/PetShop/:Id/Excluir", PetShopController.excluir);
		Spark.get("/PetShop/:Id", PetShopController.pesquisar);
		
		//ViaCep
		Spark.get("ViaCep/:cep", ViaCepController.getAdress);
		
	}
}
