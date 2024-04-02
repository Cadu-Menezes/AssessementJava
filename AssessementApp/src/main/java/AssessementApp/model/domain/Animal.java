package AssessementApp.model.domain;

public class Animal {
	
	private int id;
	private String nome;
	private int idade;
	private String especie;
	private boolean disponivel;
	
	
	public Animal() {
		this.nome = "Dalto";
		this.idade = 9;
		this.especie = "Felino";
	}
	
	public Animal(String nome) {
		this();
		this.nome = nome;
	}
		
	@Override
	public String toString() {
		return "Animal [Id= " + id  + ", nome=" + nome + ", idade=" + idade + ", especie=" + especie + "]";
	}

	
	
	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
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
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
