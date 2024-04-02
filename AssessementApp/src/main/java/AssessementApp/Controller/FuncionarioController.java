package AssessementApp.Controller;

import com.google.gson.Gson;

import AssessementApp.model.domain.Funcionario;
import AssessementApp.model.service.FuncionarioService;
import spark.Route;

public class FuncionarioController {

	public static Route obterLista = (req, res) -> {
		
		return FuncionarioService.obterLista();
	};
	
	
	public static Route incluir = (req, res) -> {
		
		Funcionario funcionario = new Gson().fromJson(req.body(), Funcionario.class);
		
		FuncionarioService.incluir(funcionario);
		return "Funcionario cadastrado com sucesso: " + funcionario;
		
		
	};
	
	
	public static Route cadastrar = (req, res) -> {
		
		String oNome = req.params("Nome");
		
		Funcionario funcionario = new Funcionario(oNome);
				
		FuncionarioService.incluir(funcionario);
		return "Funcionario cadastrado com sucesso: " + funcionario;
		
		
	};
	
	public static Route excluir = (req, res) -> {

		Integer index = Integer.valueOf(req.params("id"));
		
		Funcionario funcionario = FuncionarioService.pesquisar(index);
		
		FuncionarioService.excluir(index);
		
		return "Exclus�o realizada com sucesso: " + funcionario;
	};
	
	
	public static Route pesquisar = (req, res) -> {
		
		Integer index = Integer.valueOf(req.params("id"));
		Funcionario funcionario = FuncionarioService.pesquisar(index);
		return "Funcionario: " + funcionario;
		
	};
		
}
