package AssessementApp.model.domain;

public class PetShop {
	
	private int id;
	private String nome;
	private String localizacao;
	private int anoFuncionamento;
	private Funcionario funcionario;
	
	public PetShop() {
		this.nome = "GatoMiau";
		this.localizacao = "Rua dos bobos";
		this.anoFuncionamento = 2024;
	}
	
	
	public PetShop(String nome) {
		this();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "PetShop [Id=" + id +  ", nome=" + nome + ", localizacao=" + localizacao + ", anoFuncionamento=" + anoFuncionamento + ", Funcionario: " + funcionario
				+ "]";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public int getAnoFuncionamento() {
		return anoFuncionamento;
	}
	public void setAnoFuncionamento(int anoFuncionamento) {
		this.anoFuncionamento = anoFuncionamento;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
