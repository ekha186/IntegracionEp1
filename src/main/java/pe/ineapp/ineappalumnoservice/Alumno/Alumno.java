package pe.ineapp.ineappalumnoservice.Alumno;

import lombok.*;

@Getter
@Setter
@Builder
public class Alumno {

    Long id;
    String nombre;
    String apellido;
    String dni;
    String curso;

}
