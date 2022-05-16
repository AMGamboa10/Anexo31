package Modelo;

import java.util.ArrayList;

public class VPedimentoTXT {
    
    String tipo, patente, pedimento, aduana, regimen, validacionVsGlosa;

    public VPedimentoTXT(String tipo, String patente, String pedimento, String aduana, String regimen, String validacionVsGlosa) {
        this.tipo = tipo;
        this.patente = patente;
        this.pedimento = pedimento;
        this.aduana = aduana;
        this.regimen = regimen;
        this.validacionVsGlosa = validacionVsGlosa;
    }
    

    public VPedimentoTXT() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getValidacionVsGlosa() {
        return validacionVsGlosa;
    }

    public void setValidacionVsGlosa(String validacionVsGlosa) {
        this.validacionVsGlosa = validacionVsGlosa;
    }
    
}
