package arboles.jeria.arboles.repository;

import arboles.jeria.arboles.model.Alumno;
import arboles.jeria.arboles.tree.AlumnoTree;

public class AlumnoRepository {
	
	private AlumnoTree arbol;
	
	private static final AlumnoRepository repository=new AlumnoRepository();
	
	private AlumnoRepository() {
		arbol=new AlumnoTree();
		mock();
	}
	
	private void mock() {
		Alumno alumno1=new Alumno("Ignacio",23);
		Alumno alumno2=new Alumno("Juan",21);
		Alumno alumno3=new Alumno("María",23);
		Alumno alumno4=new Alumno("Antonio",18);
		Alumno alumno5=new Alumno("Laura",17);
		Alumno alumno6=new Alumno("Leonardo Da Vinci",565);
		arbol.insertar(alumno1.getEdad(), alumno1);
		arbol.insertar(alumno2.getEdad(), alumno2);
		arbol.insertar(alumno3.getEdad(), alumno3);
		arbol.insertar(alumno4.getEdad(), alumno4);
		arbol.insertar(alumno5.getEdad(), alumno5);
		arbol.insertar(alumno6.getEdad(), alumno6);
	}
	
	public static AlumnoRepository getInstance() {
		return repository;
	}
	
	public AlumnoTree getArbol() {
		return arbol;
	}

}
