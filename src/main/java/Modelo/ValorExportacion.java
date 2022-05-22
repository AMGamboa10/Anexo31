package Modelo;

import java.sql.Date;

public class ValorExportacion {
    
    String regimen, bimestre;
    java.sql.Date fechaInicial;
    java.sql.Date fechaFinal;
    int año;

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    

    public String getRegimen() {
        return regimen;
    }
    
    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    
    
    
    
}
