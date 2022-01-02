package RMIschool;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
import java.util.Vector;

public class SchoolServant extends UnicastRemoteObject implements School {
	Vector<Materia> materias;
	Diretor dr;
	public void setDiretor(String name)throws RemoteException{
		dr = new Diretor(2400, 4 );
		dr.setName(name);
	}
	
	public Materia getMateria(String name) throws RemoteException{
		if(this.materias == null)
		for(int i =0 ; i < materias.size() ; i++) {
			if(materias.get(i).getName().equals( name)) {
				return materias.get(i);
			}
		}
		return null;
	}
	public SchoolServant()throws RemoteException{
		materias = new Vector<Materia>();
	}
	public boolean addAluno ( Materia m , People p) throws RemoteException {
		
		return true;
	}
	public void addMateria(Materia m ) throws RemoteException {
			materias.add(m);
	}
	public void addMateria(String name ) throws RemoteException {
		Materia m = new Materia();
		m.setName(name);
		materias.add(m);
	}
	public Vector getAllDisc()throws RemoteException{
		return materias;
	}
	public Vector getAllAlunos(Materia m ) throws RemoteException{
		if( m == null ) return null;
		return m.getAlunos();
	}
	
	public boolean  remove ( Materia m) throws RemoteException{
		for(int i =0 ; i < materias.size() ; i++) {
			if(materias.get(i).getName().equals(m.getName())) {
				materias.remove(materias.get(i));
			}
		}
		return true;
	}
	public boolean  remove ( Materia m , People p) throws RemoteException{
		for(int i =0 ; i < materias.size() ; i++) {
			if(materias.get(i).getName().equals(m.getName()) ){
				for( int j =0 ; j < materias.get(i).getAlunos().size() ; j++ ) {
					if( materias.get(i).getAlunos().get(j).getName().equals(m.getName())) {
						materias.get(i).getAlunos().remove(i);
					}
				}
					
			}
		}
		return true;
	}
	
	public void setName( Materia m , String name)  throws RemoteException{
		for(int i =0 ; i < materias.size() ; i++) {
			if(materias.get(i).getName().equals(m.getName())) {
				materias.get(i).setName(name);
			}
		}
	}

}
	
