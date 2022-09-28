package pe.ineapp.ineappalumnoservice.Alumno;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping
    @RequestMapping("/getAll")
    public List<Alumno> getAll(){

        Alumno alumno = Alumno.builder()
                .id(1L)
                .nombre("Eduardo")
                .apellido("Salinas")
                .dni("72879084")
                .curso("Integracion")
                .build();

        Alumno alumno2 = Alumno.builder()
                .id(2L)
                .nombre("Kevin")
                .apellido("Moya")
                .dni("72322544")
                .curso("Mecanica I")
                .build();

        Alumno alumno3 = Alumno.builder()
                .id(3L)
                .nombre("Valeria")
                .apellido("Pimentel")
                .dni("70616287")
                .curso("Fundamentos de Marketing")
                .build();

        return List.of(alumno, alumno2, alumno3);
    }
}
