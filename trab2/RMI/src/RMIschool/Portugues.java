package RMIschool;
import java.io.*;
public class Portugues extends Materia  {
	
	 private String pais ;
	 public Portugues() {
		 setName("Portugues");
	 }
	 
	 public  void setPais(String pais) {
		 this.pais = pais;
	 }
	 public String getPais() {
		 return this.pais;
	 }
}
