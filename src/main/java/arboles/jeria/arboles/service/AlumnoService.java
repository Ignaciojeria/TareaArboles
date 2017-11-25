package arboles.jeria.arboles.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import arboles.jeria.arboles.model.Alumno;
import arboles.jeria.arboles.repository.AlumnoRepository;

@Service
public class AlumnoService {
	
	AlumnoRepository alumnoRepository=AlumnoRepository.getInstance();
	
	public List<Alumno> findAllOrderByEdad(){
		return alumnoRepository.getArbol().recorrido_en_orden(alumnoRepository.getArbol().raiz, new ArrayList<Alumno>());
	}
	
	
}
