import model.Curso;
import model.Alumno;
import model.Especialidad;

import java.time.LocalDate;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        // Creando un objeto desde un constructor vacio
        Curso objCurso = new Curso(); // Instancia a la clase Curso y crear el Objeto
        objCurso.setIdCurso(1); // Enviar el valor SET
        System.out.println(objCurso.getIdCurso()); // Recuperar el valor GET

        // Creando un objeto desde un constructor con parametros
        Curso objCurso2 = new Curso(2);
        System.out.println(objCurso2.getIdCurso());

        Especialidad objEspecialidad = new Especialidad(1, "Joel", true, LocalDate.now());
        System.out.println(objEspecialidad);

        objEspecialidad.Imprimir();

        Alumno objAlumno = new Alumno();
        objAlumno.setId(2);
    }
}