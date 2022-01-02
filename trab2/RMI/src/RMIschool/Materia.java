package RMIschool;
import java.time.*;
import java.util.Vector;
import java.io.Serializable;
public  class Materia implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Duration duration;  
	private Vector<People> alunos;
	private People professor;
	private void setProfessor(People p) {
		this.professor = p;
	}
	public Materia() {
		alunos  = new Vector<People>();
	}
	public People getProfessor() {
		return 	professor; 
	}
	public void setAlunos(Vector<People> alunos) {
		this.alunos = alunos;
	}
	public Vector<People> getAlunos() {
		return 	this.alunos; 
	}
	public void setDuration( Duration d ) {
			duration = d;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return this.name; 
	}
	public Duration getDuration(){
		return this.duration;
	}
}
