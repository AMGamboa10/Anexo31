package Modelo;

public class VPedimentoGlosa {
    
    //Lo de nuestro constructor
    String patente, pedimento, aduana, regimen, fechaPago, validacionVsTXT;
    
    //Parametros
    String bimestre, año;

    public VPedimentoGlosa(String patente, String pedimento, String aduana, String regimen, String fechaPago, String validacionVsTXT) {
        this.patente = patente;
        this.pedimento = pedimento;
        this.aduana = aduana;
        this.regimen = regimen;
        this.fechaPago = fechaPago;
        this.validacionVsTXT = validacionVsTXT;
    }

    public VPedimentoGlosa() {
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPedimento() {
        return pedimento;
    }

    public void setPedimento(String pedimento) {
        this.pedimento = pedimento;
    }

    public String getAduana() {
        return aduana;
    }

    public void setAduana(String aduana) {
        this.aduana = aduana;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getValidacionVsTXT() {
        return validacionVsTXT;
    }

    public void setValidacionVsTXT(String validacionVsTXT) {
        this.validacionVsTXT = validacionVsTXT;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }
    
    
    
    
    
    
}
