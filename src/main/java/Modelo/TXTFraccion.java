package Modelo;

public class TXTFraccion {
    
    private int id;
    private String tipo;
    private String fraccion;
    private double valor;
    private String tipoMaterial;
    private String regimen;
    private int año;
    private String bimestre;
    private int resultValExisteTXT;
    private String validado;
    private String nombreTXT;

    public TXTFraccion(int id, String tipo, String fraccion, double valor, String tipoMaterial, String regimen, int año, String bimestre, String validado) {
        this.id = id;
        this.tipo = tipo;
        this.fraccion = fraccion;
        this.valor = valor;
        this.tipoMaterial = tipoMaterial;
        this.regimen = regimen;
        this.año = año;
        this.bimestre = bimestre;
        this.validado = validado;
    }

    public TXTFraccion() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFraccion() {
        return fraccion;
    }

    public void setFraccion(String fraccion) {
        this.fraccion = fraccion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }
    
    public int getResultValExisteTXT() {
        return resultValExisteTXT;
    }

    public void setResultValExisteTXT(int resultValExisteTXT) {
        this.resultValExisteTXT = resultValExisteTXT;
    }

    public String getValidado() {
        return validado;
    }

    public void setValidado(String validado) {
        this.validado = validado;
    }

    public String getNombreTXT() {
        return nombreTXT;
    }

    public void setNombreTXT(String nombreTXT) {
        this.nombreTXT = nombreTXT;
    }
    
}
