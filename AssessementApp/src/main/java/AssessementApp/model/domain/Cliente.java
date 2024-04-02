package AssessementApp.model.domain;

public class Cliente {
	
	private int id;
	private String nome;
	private int idade;
	private boolean ativo;
	
	
	public Cliente() {
		this.nome = "Leandro";
		this.idade = 36;
		this.ativo = true;
	}
	
	public Cliente(String nome) {
		this();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [Id=" + id+ ", nome=" + nome + ", idade=" + idade + ", ativo=" + ativo + "]";
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
