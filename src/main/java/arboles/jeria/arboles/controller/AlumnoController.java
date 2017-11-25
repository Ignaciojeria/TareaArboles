package arboles.jeria.arboles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import arboles.jeria.arboles.model.Alumno;
import arboles.jeria.arboles.service.AlumnoService;

@RestController
@CrossOrigin(origins = "*")
public class AlumnoController {
	
	@Autowired
	AlumnoService alumnoService;
	
	@GetMapping
	public List<Alumno> findAllOrderByEdad(){
		return alumnoService.findAllOrderByEdad();
	}

}
