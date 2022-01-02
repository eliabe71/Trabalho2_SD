package RMIschool;
import java.util.Vector;
public class Aluno extends People{
	private String responsavel;
	private String escolaridade;
	private Vector<Materia> m;
	public Aluno() {}
	public void setEscolaridade(String escolaridade) {
			this.escolaridade = escolaridade;
	}
	public String getEscolariade() {
		return this.escolaridade;
	}
	public String getResponsavel() {
		return this.responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
}
