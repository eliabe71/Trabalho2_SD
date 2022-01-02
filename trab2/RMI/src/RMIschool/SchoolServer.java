package RMIschool;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;

public class SchoolServer {
	
	public static void main(String args[]){

        try{
        	LocateRegistry.createRegistry(1097);
        	
            School aSchool = new SchoolServant();
            System.out.println("Sim");
			Naming.rebind("rmi://localhost/School", aSchool);
            
        }catch(Exception e) {
            System.out.println("School server main " + e.getMessage());
        }
    }
}