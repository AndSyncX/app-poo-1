package model;

import java.time.LocalDate;
import java.util.Calendar;

public class Especialidad {
    private Integer idEspe;
    private String nomEspe;
    private Boolean estado;
    private LocalDate fechaCrea;

    public Especialidad(Integer idEspe, String nomEspe, Boolean estado, LocalDate fechaCrea) {
        this.idEspe = idEspe;
        this.nomEspe = nomEspe;
        this.estado = estado;
        this.fechaCrea = fechaCrea;
    }

    public Integer getIdEspe() {
        return idEspe;
    }

    public void setIdEspe(Integer idEspe) {
        this.idEspe = idEspe;
    }

    public String getNomEspe() {
        return nomEspe;
    }

    public void setNomEspe(String nomEspe) {
        this.nomEspe = nomEspe;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(LocalDate fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public void Imprimir() {
        System.out.println("ID: " + idEspe + "Nombre: " + nomEspe);
    }
}
