package model;

public class Curso {
    private Integer idCurso;
    private String nomCurso;
    private Integer credCurso;
    private Boolean estadoCurso;

    public Curso() {
    }

    public Curso(Integer idCurso){
        this.idCurso = idCurso;
    }

    public Curso(Integer idCurso, String nomCurso, Integer credCurso, Boolean estadoCurso) {
        this.idCurso = idCurso;
        this.nomCurso = nomCurso;
        this.credCurso = credCurso;
        this.estadoCurso = estadoCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomCurso() {
        return nomCurso;
    }

    public void setNomCurso(String nomCurso) {
        this.nomCurso = nomCurso;
    }

    public Integer getCredCurso() {
        return credCurso;
    }

    public void setCredCurso(Integer credCurso) {
        this.credCurso = credCurso;
    }

    public Boolean getEstadoCurso() {
        return estadoCurso;
    }

    public void setEstadoCurso(Boolean estadoCurso) {
        this.estadoCurso = estadoCurso;
    }
}
