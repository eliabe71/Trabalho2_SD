package RMIschool;
import java.util.Date;
public class Professor extends People {
	private Date DiaContratacao;
	private String area;
	public Professor() {}
	public void setDiaContratacao( Date dia) {
		this.DiaContratacao = dia;
	}
	public Date getDia() {
		return DiaContratacao;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getArea(){
		return this.area;
	}
	
}
