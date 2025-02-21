package model;

import java.time.LocalDate;

public class CicloAcademico {
    private Integer idCicloAcademico;
    private String nomCicloAcademico;
    private String descripcion;
    private LocalDate feInicio;
    private LocalDate feFin;

    public CicloAcademico(Integer idCicloAcademico, String nomCicloAcademico, String descripcion, LocalDate feInicio, LocalDate feFin) {
        this.idCicloAcademico = idCicloAcademico;
        this.nomCicloAcademico = nomCicloAcademico;
        this.descripcion = descripcion;
        this.feInicio = feInicio;
        this.feFin = feFin;
    }

    public Integer getIdCicloAcademico() {
        return idCicloAcademico;
    }

    public void setIdCicloAcademico(Integer idCicloAcademico) {
        this.idCicloAcademico = idCicloAcademico;
    }

    public String getNomCicloAcademico() {
        return nomCicloAcademico;
    }

    public void setNomCicloAcademico(String nomCicloAcademico) {
        this.nomCicloAcademico = nomCicloAcademico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFeInicio() {
        return feInicio;
    }

    public void setFeInicio(LocalDate feInicio) {
        this.feInicio = feInicio;
    }

    public LocalDate getFeFin() {
        return feFin;
    }

    public void setFeFin(LocalDate feFin) {
        this.feFin = feFin;
    }
}
