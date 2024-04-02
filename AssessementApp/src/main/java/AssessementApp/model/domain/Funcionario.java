package AssessementApp.model.domain;

public class Funcionario {
	
	private int id;
	private String nome;
	private String cargo;
	private float salario;
	
	public Funcionario() {
		this.nome = "Carlos Eduardo";
		this.cargo = "Gerente";
		this.salario = (float) 200.00;
	}
	
	public Funcionario(String nome) {
		this();
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Funcionario [" + id + "-"+ nome + "-"+ cargo + "-" + salario + "-"+ "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
