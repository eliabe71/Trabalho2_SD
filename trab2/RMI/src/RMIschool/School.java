package RMIschool;

import java.rmi.*;
import java.util.Vector;
public interface School extends Remote  {
	Vector<?> getAllDisc()  throws RemoteException;
	Vector<?> getAllAlunos(Materia m ) throws RemoteException;
	boolean  remove ( Materia m) throws RemoteException;
	boolean  remove ( Materia m , People p) throws RemoteException;
	boolean  addAluno ( Materia m , People p) throws RemoteException;
	void setName( Materia m , String name)  throws RemoteException;
	Materia getMateria(String name) throws RemoteException;
	void setDiretor(String name)throws RemoteException;
	void addMateria(Materia m)throws RemoteException;
	void addMateria(String m)throws RemoteException;
}
