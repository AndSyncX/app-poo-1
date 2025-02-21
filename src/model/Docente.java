package model;

public class Docente extends Persona{
    @Override
    public boolean registrarAsistencia(String codIdentificador, String fechaAsistencia, String horaAsistencia, Boolean valorAsistencia) {
        System.out.println("Aplicar lógica " +
                "para la asistencia " +
                "del Docente");
        return true;
    }
}
