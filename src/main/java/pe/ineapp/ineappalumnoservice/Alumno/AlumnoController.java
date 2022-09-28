package pe.ineapp.ineappalumnoservice.Alumno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping
    @RequestMapping("/getAll")
    public String getAlumno(){

        Alumno alumno = new Alumno("Eduardo");

        return alumno.getNombre();
    }
}
