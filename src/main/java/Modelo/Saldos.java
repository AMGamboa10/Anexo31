package Modelo;

import java.util.ArrayList;

public class Saldos {
    
    String fraccion, abono, descargo, saldo, porcentajeDescargo, activofijo, sobredescargo;


    public Saldos() {
    }

    public Saldos(String fraccion, String abono, String descargo, String saldo, String porcentajeDescargo, String activofijo, String sobredescargo) {
        this.fraccion = fraccion;
        this.abono = abono;
        this.descargo = descargo;
        this.saldo = saldo;
        this.porcentajeDescargo = porcentajeDescargo;
        this.activofijo = activofijo;
        this.sobredescargo = sobredescargo;
    }

    

    public String getFraccion() {
        return fraccion;
    }

    public void setFraccion(String fraccion) {
        this.fraccion = fraccion;
    }

    public String getAbono() {
        return abono;
    }

    public void setAbono(String abono) {
        this.abono = abono;
    }

    public String getDescargo() {
        return descargo;
    }

    public void setDescargo(String descargo) {
        this.descargo = descargo;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getPorcentajeDescargo() {
        return porcentajeDescargo;
    }

    public void setPorcentajeDescargo(String porcentajeDescargo) {
        this.porcentajeDescargo = porcentajeDescargo;
    }

    public String getActivofijo() {
        return activofijo;
    }

    public void setActivofijo(String activofijo) {
        this.activofijo = activofijo;
    }

    public String getSobredescargo() {
        return sobredescargo;
    }

    public void setSobredescargo(String sobredescargo) {
        this.sobredescargo = sobredescargo;
    }
    
}
