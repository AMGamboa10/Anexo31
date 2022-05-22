package Controlador;

import Modelo.TXTFraccion;
import Modelo.TXTFraccionConsultas;
import Modelo.ValorExportacion;
import Modelo.ValorExportacionConsultas;
import Vista.PanelPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CtrlValorExpo implements ActionListener{
    
    private PanelPrincipal frmPrincipal;
    private ValorExportacion modValExpo;
    private ValorExportacionConsultas modValExpoC;

    public CtrlValorExpo(PanelPrincipal frmPrincipal, ValorExportacion modValExpo, ValorExportacionConsultas modValExpoC) {
        this.frmPrincipal = frmPrincipal;
        this.modValExpo = modValExpo;
        this.modValExpoC = modValExpoC;
        frmPrincipal.btnCalcularValorExpo.addActionListener(this);
    }
    
    public void valorExportacionGlosa(){
        String regimen = "";
        String año = frmPrincipal.cmbSeleccionarAñoValorExpo.getSelectedItem().toString();
        java.sql.Date fechaInicial;
        java.sql.Date fechaFinal;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        double valorComercial = 0;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        for (int x = 0; x < 3; x++) {
            switch(x){
                case 0:
                    regimen = "RT";
                    break;
                case 1:
                    regimen = "V1";
                    break;
                case 2:
                    regimen = "V5";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error valor exportacion (For X)", "Error case", JOptionPane.ERROR_MESSAGE);
            }
            
            for (int y = 0; y < 6; y++) {
                switch(y){
                    case 0:
                        try {
                            Date dateInicial = formato.parse("01/01/" + año);
                            long dInicial = dateInicial.getTime();
                            fechaInicial = new java.sql.Date(dInicial);
                            Date dateFinal = formato.parse("28/02/" + año);
                            long dFinal = dateFinal.getTime();
                            fechaFinal = new java.sql.Date(dFinal);
                            modValExpo.setRegimen(regimen);
                            modValExpo.setFechaInicial(fechaInicial);
                            modValExpo.setFechaFinal(fechaFinal);
                            switch(x){
                                case 0:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtRTB1.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV1B1.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV5B1.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                default:
                                    JOptionPane.showConfirmDialog(null, "Error switch case llenado de TXT", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                            }
                            //JOptionPane.showMessageDialog(null, "Rgimen: " + regimen + ", Fecha Inicial: " + fechaInicial+ ", Fecha Final: " + fechaFinal);
                            
                        } catch (ParseException ex) {
                            Logger.getLogger(CtrlValorExpo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    break;
                case 1:
                    try {
                            Date dateInicial = formato.parse("01/03/" + año);
                            long dInicial = dateInicial.getTime();
                            fechaInicial = new java.sql.Date(dInicial);
                            Date dateFinal = formato.parse("30/04/" + año);
                            long dFinal = dateFinal.getTime();
                            fechaFinal = new java.sql.Date(dFinal);
                            modValExpo.setRegimen(regimen);
                            modValExpo.setFechaInicial(fechaInicial);
                            modValExpo.setFechaFinal(fechaFinal);
                            switch(x){
                                case 0:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtRTB2.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV1B2.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV5B2.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                default:
                                    JOptionPane.showConfirmDialog(null, "Error switch case llenado de TXT", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                            }
                            //JOptionPane.showMessageDialog(null, "Rgimen: " + regimen + ", Fecha Inicial: " + fechaInicial+ ", Fecha Final: " + fechaFinal);
                            
                        } catch (ParseException ex) {
                            Logger.getLogger(CtrlValorExpo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    break;
                case 2:
                    try {
                            Date dateInicial = formato.parse("01/05/" + año);
                            long dInicial = dateInicial.getTime();
                            fechaInicial = new java.sql.Date(dInicial);
                            Date dateFinal = formato.parse("30/06/" + año);
                            long dFinal = dateFinal.getTime();
                            fechaFinal = new java.sql.Date(dFinal);
                            modValExpo.setRegimen(regimen);
                            modValExpo.setFechaInicial(fechaInicial);
                            modValExpo.setFechaFinal(fechaFinal);
                            switch(x){
                                case 0:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtRTB3.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV1B3.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV5B3.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                default:
                                    JOptionPane.showConfirmDialog(null, "Error switch case llenado de TXT", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                            }
                            
                        } catch (ParseException ex) {
                            Logger.getLogger(CtrlValorExpo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    break;
                case 3:
                    try {
                            Date dateInicial = formato.parse("01/07/" + año);
                            long dInicial = dateInicial.getTime();
                            fechaInicial = new java.sql.Date(dInicial);
                            Date dateFinal = formato.parse("31/08/" + año);
                            long dFinal = dateFinal.getTime();
                            fechaFinal = new java.sql.Date(dFinal);
                            modValExpo.setRegimen(regimen);
                            modValExpo.setFechaInicial(fechaInicial);
                            modValExpo.setFechaFinal(fechaFinal);
                            switch(x){
                                case 0:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtRTB4.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV1B4.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV5B4.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                default:
                                    JOptionPane.showConfirmDialog(null, "Error switch case llenado de TXT", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                            }
                            //JOptionPane.showMessageDialog(null, "Rgimen: " + regimen + ", Fecha Inicial: " + fechaInicial+ ", Fecha Final: " + fechaFinal);
                            
                        } catch (ParseException ex) {
                            Logger.getLogger(CtrlValorExpo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    break;
                case 4:
                    try {
                            Date dateInicial = formato.parse("01/09/" + año);
                            long dInicial = dateInicial.getTime();
                            fechaInicial = new java.sql.Date(dInicial);
                            Date dateFinal = formato.parse("31/10/" + año);
                            long dFinal = dateFinal.getTime();
                            fechaFinal = new java.sql.Date(dFinal);
                            modValExpo.setRegimen(regimen);
                            modValExpo.setFechaInicial(fechaInicial);
                            modValExpo.setFechaFinal(fechaFinal);
                            switch(x){
                                case 0:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtRTB5.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV1B5.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV5B5.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                default:
                                    JOptionPane.showConfirmDialog(null, "Error switch case llenado de TXT", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                            }
                            //JOptionPane.showMessageDialog(null, "Rgimen: " + regimen + ", Fecha Inicial: " + fechaInicial+ ", Fecha Final: " + fechaFinal);
                            
                        } catch (ParseException ex) {
                            Logger.getLogger(CtrlValorExpo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    break;
                case 5:
                    try {
                            Date dateInicial = formato.parse("01/11/" + año);
                            long dInicial = dateInicial.getTime();
                            fechaInicial = new java.sql.Date(dInicial);
                            Date dateFinal = formato.parse("31/12/" + año);
                            long dFinal = dateFinal.getTime();
                            fechaFinal = new java.sql.Date(dFinal);
                            modValExpo.setRegimen(regimen);
                            modValExpo.setFechaInicial(fechaInicial);
                            modValExpo.setFechaFinal(fechaFinal);
                            switch(x){
                                case 0:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtRTB6.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV1B6.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        
                                    }else{
                                        frmPrincipal.txtV5B6.setText("$ " + decimalFormat.format(valorComercial));
                                    }
                                    break;
                                default:
                                    JOptionPane.showConfirmDialog(null, "Error switch case llenado de TXT", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                            }
                            //JOptionPane.showMessageDialog(null, "Rgimen: " + regimen + ", Fecha Inicial: " + fechaInicial+ ", Fecha Final: " + fechaFinal);
                            
                        } catch (ParseException ex) {
                            Logger.getLogger(CtrlValorExpo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error valor exportacion (For Y)", "Error case", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public void valorExportacionTXT(){
        String regimen = "";
        String bimestre = "";
        double valorExportacionTXT = 0;
        int año = Integer.parseInt(frmPrincipal.cmbSeleccionarAñoValorExpo.getSelectedItem().toString());
        
        for (int x = 0; x < 3; x++) { 
            switch(x){
                case 0:
                    regimen = "RT";
                    break;
                case 1:
                    regimen = "V1";
                    break;
                case 2:
                    regimen = "V5";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error valor exportacion (For X)", "Error case", JOptionPane.ERROR_MESSAGE);
            }
            
            for (int y = 0; y < 6; y++) { 
                switch(y){
                    case 0:
                        modValExpo.setAño(año);
                        modValExpo.setBimestre("37");
                        switch(x){
                            case 0:
                                regimen = "RT";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtRTB1.setText(String.valueOf(valorExportacionTXT));
                                }
                        }
                        break;
                }
            }
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == frmPrincipal.btnCalcularValorExpo) {
            if (frmPrincipal.cmbSeleccionarAñoValorExpo.getSelectedItem().toString().equals("Seleccionar")) {
                JOptionPane.showMessageDialog(null, "Favor de seleccionar el año a validar");
            }else{
                valorExportacionGlosa();
            }
        }
    }
    
}
