package Modelo;

public class VFraccion {
    
    String fraccion, regimenExpo, tipoMaterial, ValFraccion, ValAF, dateImpo;

    public VFraccion(String fraccion, String regimenExpo, String tipoMaterial, String ValFraccion, String ValAF, String dateImpo) {
        this.fraccion = fraccion;
        this.regimenExpo = regimenExpo;
        this.tipoMaterial = tipoMaterial;
        this.ValFraccion = ValFraccion;
        this.ValAF = ValAF;
        this.dateImpo = dateImpo;
    }

    public VFraccion() {
    }
    
    public String getFraccion() {
        return fraccion;
    }

    public void setFraccion(String fraccion) {
        this.fraccion = fraccion;
    }

    public String getRegimenExpo() {
        return regimenExpo;
    }

    public void setRegimenExpo(String regimenExpo) {
        this.regimenExpo = regimenExpo;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getValFraccion() {
        return ValFraccion;
    }

    public void setValFraccion(String ValFraccion) {
        this.ValFraccion = ValFraccion;
    }

    public String getValAF() {
        return ValAF;
    }

    public void setValAF(String ValAF) {
        this.ValAF = ValAF;
    }

    public String getDateImpo() {
        return dateImpo;
    }

    public void setDateImpo(String dateImpo) {
        this.dateImpo = dateImpo;
    }
    
    
}
