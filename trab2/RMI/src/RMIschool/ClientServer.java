package RMIschool;

import java.rmi.*;
import java.util.Vector;

import java.util.Scanner;
public class ClientServer{
   public static void main(String args[]){
   		String option = "Read"; //Read or write
		
   		Scanner ler = new Scanner(System.in);
 		
 		//if(System.getSecurityManager() == null){
        //	System.setSecurityManager(new RMISecurityManager());
        //} else System.out.println("Already has a security manager, so cant set RMI SM");
        
 		School aSchool = null;
        try{
        	aSchool = (School) Naming.lookup("rmi://localhost/School");	// CHAMADA REMOTA
 			System.out.println("Found server");
 			
 			System.out.println("Got vector");
			if(option.equals("Readi")){
				
        	} else {
        		Portugues pt = new Portugues();
                
        		aSchool.addMateria(pt); // Adicionando Materia
                Vector<?> mt = aSchool.getAllDisc(); // Vendo Quatidade de materia
      			
                System.out.println("Numero de Matérias "+ mt.size());
      			for( int i =0 ; i <mt.size() ; i++ ) {
      				System.out.println("Nome da Materia " + mt.get(i).getName());
      			}
      			
      			mt =   aSchool.getAllAlunos( pt);
      			
      			System.out.println("Numero de Alunos da materia " + pt.getName() +" "+ mt.size());
      			
      			aSchool.remove(pt);
      			
      			
      			mt = aSchool.getAllDisc();
      			
      			System.out.println("Numero de Matérias "+ mt.size());
      			
      			aSchool.addMateria("Ingles");
      			
      			Aluno a = new Aluno();
      			a.setName("Arthur");
      			
      			aSchool.addAluno( aSchool.getMateria("Ingles"), a);	      			
      			

      			mt =  aSchool.getAllAlunos(aSchool.getMateria("Ingles"));
      			
      			
      			if(mt != null) System.out.println("Numero de Alunos da materia Ingles"+ mt.size());

      			//aSchool.remove(aSchool.getMateria("Ingles"), a);
      			
      		
      			//aSchool.remove(aSchool.getMateria("Ingles"));
      			
                
        	}
		}catch(RemoteException e) {
			System.out.println("allShapes: " + e.getMessage());
	    }catch(Exception e) {System.out.println("Lookup: " + e.getMessage());}
    }
}