package RMIschool;
import java.io.Serializable;

public class People implements Serializable {
	private static final long serialVersionUID = 2L;
	private String name;
	private int idade;
	private String cpf;
	public People() {}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf(String cpf) {
		return this.cpf;
	}
	public void setName(String name) {
		this.name= name ;
	}
	public void setIdade(int idade ) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	public String getName() {
		return this.name;
	}
}
