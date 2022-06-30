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
        frmPrincipal.btnLimpiarValorExpo.addActionListener(this);
    }
    
    public void valorExportacionGlosa(){
        String regimen = "";
        String año = frmPrincipal.cmbSeleccionarAñoValorExpo.getSelectedItem().toString();
        java.sql.Date fechaInicial;
        java.sql.Date fechaFinal;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        double valorComercial = 0;
        double valorComercialTotalB1 = 0;
        double valorComercialTotalB2 = 0;
        double valorComercialTotalB3 = 0;
        double valorComercialTotalB4 = 0;
        double valorComercialTotalB5 = 0;
        double valorComercialTotalB6 = 0;
        
        
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
                                        frmPrincipal.txtRTB1.setText("-");
                                    }else{
                                        frmPrincipal.txtRTB1.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB1 = valorComercialTotalB1 + valorComercial;
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV1B1.setText("-");
                                    }else{
                                        frmPrincipal.txtV1B1.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB1 = valorComercialTotalB1 + valorComercial;
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV5B1.setText("-");
                                    }else{
                                        frmPrincipal.txtV5B1.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB1 = valorComercialTotalB1 + valorComercial;
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
                                        frmPrincipal.txtRTB2.setText("-");
                                    }else{
                                        frmPrincipal.txtRTB2.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB2 = valorComercialTotalB2 + valorComercial;
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV1B2.setText("-");
                                    }else{
                                        frmPrincipal.txtV1B2.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB2 = valorComercialTotalB2 + valorComercial;
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV5B2.setText("-");
                                    }else{
                                        frmPrincipal.txtV5B2.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB2 = valorComercialTotalB2 + valorComercial;
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
                                        frmPrincipal.txtRTB3.setText("-");
                                    }else{
                                        frmPrincipal.txtRTB3.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB3 = valorComercialTotalB3 + valorComercial;
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV1B3.setText("-");
                                    }else{
                                        frmPrincipal.txtV1B3.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB3 = valorComercialTotalB3 + valorComercial;
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV5B3.setText("-");
                                    }else{
                                        frmPrincipal.txtV5B3.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB3 = valorComercialTotalB3 + valorComercial;
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
                                        frmPrincipal.txtRTB4.setText("-");
                                    }else{
                                        frmPrincipal.txtRTB4.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB4 = valorComercialTotalB4 + valorComercial;
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV1B4.setText("-");
                                    }else{
                                        frmPrincipal.txtV1B4.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB4 = valorComercialTotalB4 + valorComercial;
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV5B4.setText("-");
                                    }else{
                                        frmPrincipal.txtV5B4.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB4 = valorComercialTotalB4 + valorComercial;
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
                                        frmPrincipal.txtRTB5.setText("-");
                                    }else{
                                        frmPrincipal.txtRTB5.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB5 = valorComercialTotalB5 + valorComercial;
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV1B5.setText("-");
                                    }else{
                                        frmPrincipal.txtV1B5.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB5 = valorComercialTotalB5 + valorComercial;
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV5B5.setText("-");
                                    }else{
                                        frmPrincipal.txtV5B5.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB5 = valorComercialTotalB5 + valorComercial;
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
                                        frmPrincipal.txtRTB6.setText("-");
                                    }else{
                                        frmPrincipal.txtRTB6.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB6 = valorComercialTotalB6 + valorComercial;
                                    }
                                    break;
                                case 1:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV1B6.setText("-");
                                    }else{
                                        frmPrincipal.txtV1B6.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB6 = valorComercialTotalB6 + valorComercial;
                                    }
                                    break;
                                case 2:
                                    valorComercial = modValExpoC.valorExportacionGlosa(modValExpo);
                                    if (valorComercial == 0) {
                                        frmPrincipal.txtV5B6.setText("-");
                                    }else{
                                        frmPrincipal.txtV5B6.setText("$ " + decimalFormat.format(valorComercial));
                                        valorComercialTotalB6 = valorComercialTotalB6 + valorComercial;
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
        
        //Pasamos el total del bimestre al modelo
        modValExpo.setValorExportacionTotalB1(valorComercialTotalB1);
        modValExpo.setValorExportacionTotalB2(valorComercialTotalB2);
        modValExpo.setValorExportacionTotalB3(valorComercialTotalB3);
        modValExpo.setValorExportacionTotalB4(valorComercialTotalB4);
        modValExpo.setValorExportacionTotalB5(valorComercialTotalB5);
        modValExpo.setValorExportacionTotalB6(valorComercialTotalB6);
        
        //Asignamos los valores comerciales en sus campos correspondientes
        if(valorComercialTotalB1 == 0){
            frmPrincipal.txtValorExportacionB1.setText("-");
        }else{
            frmPrincipal.txtValorExportacionB1.setText("$ " + decimalFormat.format(valorComercialTotalB1));
        }
        if(valorComercialTotalB2 == 0){
            frmPrincipal.txtValorExportacionB2.setText("-");
        }else{
            frmPrincipal.txtValorExportacionB2.setText("$ " + decimalFormat.format(valorComercialTotalB2));
        }
        if(valorComercialTotalB3 == 0){
            frmPrincipal.txtValorExportacionB3.setText("-");
        }else{
            frmPrincipal.txtValorExportacionB3.setText("$ " + decimalFormat.format(valorComercialTotalB3));
        }
        if(valorComercialTotalB4 == 0){
            frmPrincipal.txtValorExportacionB4.setText("-");
        }else{
            frmPrincipal.txtValorExportacionB4.setText("$ " + decimalFormat.format(valorComercialTotalB4));
        }
        if(valorComercialTotalB5 == 0){
            frmPrincipal.txtValorExportacionB5.setText("-");
        }else{
            frmPrincipal.txtValorExportacionB5.setText("$ " + decimalFormat.format(valorComercialTotalB5));
        }
        if(valorComercialTotalB6 == 0){
            frmPrincipal.txtValorExportacionB6.setText("-");
        }else{
            frmPrincipal.txtValorExportacionB6.setText("$ " + decimalFormat.format(valorComercialTotalB6));
        }       
    }
    
    public void valorExportacionTXT(){
        String regimen = "";
        String bimestre = "";
        double valorExportacionTXT = 0;
        double valorExportacionTXTTotalB1 = 0;
        double valorExportacionTXTTotalB2 = 0;
        double valorExportacionTXTTotalB3 = 0;
        double valorExportacionTXTTotalB4 = 0;
        double valorExportacionTXTTotalB5 = 0;
        double valorExportacionTXTTotalB6 = 0;
        
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
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
                switch (y) {
                    case 0:
                        modValExpo.setAño(año);
                        modValExpo.setBimestre("37");
                        switch (x) {
                            case 0:
                                regimen = "RT";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtRTB1TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB1 = valorExportacionTXTTotalB1 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtRTB1TXT.setText("-");
                                }
                                break;
                            case 1:
                                regimen = "V1";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV1B1TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB1 = valorExportacionTXTTotalB1 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV1B1TXT.setText("-");
                                }
                                break;
                            case 2:
                                regimen = "V5";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV5B1TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB1 = valorExportacionTXTTotalB1 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV5B1TXT.setText("-");
                                }
                                break;
                        }
                        break;
                    case 1:
                        modValExpo.setAño(año);
                        modValExpo.setBimestre("38");
                        switch (x) {
                            case 0:
                                regimen = "RT";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtRTB2TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB2 = valorExportacionTXTTotalB2 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtRTB2TXT.setText("-");
                                }
                                break;
                            case 1:
                                regimen = "V1";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV1B2TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB2 = valorExportacionTXTTotalB2 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV1B2TXT.setText("-");
                                }
                                break;
                            case 2:
                                regimen = "V5";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV5B2TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB2 = valorExportacionTXTTotalB2 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV5B2TXT.setText("-");
                                }
                                break;
                        }
                        break;
                    case 2:
                        modValExpo.setAño(año);
                        modValExpo.setBimestre("39");
                        switch (x) {
                            case 0:
                                regimen = "RT";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtRTB3TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB3 = valorExportacionTXTTotalB3 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtRTB3TXT.setText("-");
                                }
                                break;
                            case 1:
                                regimen = "V1";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV1B3TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB3 = valorExportacionTXTTotalB3 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV1B3TXT.setText("-");
                                }
                                break;
                            case 2:
                                regimen = "V5";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV5B3TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB3 = valorExportacionTXTTotalB3 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV5B3TXT.setText("-");
                                }
                                break;
                        }
                        break;
                    case 3:
                        modValExpo.setAño(año);
                        modValExpo.setBimestre("40");
                        switch (x) {
                            case 0:
                                regimen = "RT";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtRTB4TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB4 = valorExportacionTXTTotalB4 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtRTB4TXT.setText("-");
                                }
                                break;
                            case 1:
                                regimen = "V1";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV1B4TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB4 = valorExportacionTXTTotalB4 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV1B4TXT.setText("-");
                                }
                                break;
                            case 2:
                                regimen = "V5";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV5B4TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB4 = valorExportacionTXTTotalB4 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV5B4TXT.setText("-");
                                }
                                break;
                        }
                        break;
                    case 4:
                        modValExpo.setAño(año);
                        modValExpo.setBimestre("41");
                        switch (x) {
                            case 0:
                                regimen = "RT";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtRTB5TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB5 = valorExportacionTXTTotalB5 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtRTB5TXT.setText("-");
                                }
                                break;
                            case 1:
                                regimen = "V1";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV1B5TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB5 = valorExportacionTXTTotalB5 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV1B5TXT.setText("-");
                                }
                                break;
                            case 2:
                                regimen = "V5";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV5B5TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB5 = valorExportacionTXTTotalB5 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV5B5TXT.setText("-");
                                }
                                break;
                        }
                        break;
                    case 5:
                        modValExpo.setAño(año);
                        modValExpo.setBimestre("42");
                        switch (x) {
                            case 0:
                                regimen = "RT";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtRTB6TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB6 = valorExportacionTXTTotalB6 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtRTB6TXT.setText("-");
                                }
                                break;
                            case 1:
                                regimen = "V1";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV1B6TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB6 = valorExportacionTXTTotalB6 + valorExportacionTXT;
                                }else{
                                    frmPrincipal.txtV1B6TXT.setText("-");
                                }
                                break;
                            case 2:
                                regimen = "V5";
                                modValExpo.setRegimen(regimen);
                                valorExportacionTXT = modValExpoC.valorExportacionTXT(modValExpo);
                                if (valorExportacionTXT != 0) {
                                    frmPrincipal.txtV5B6TXT.setText("$ " + decimalFormat.format(valorExportacionTXT));
                                    valorExportacionTXTTotalB6 = valorExportacionTXTTotalB6 + valorExportacionTXT;
                                    
                                }else{
                                    frmPrincipal.txtV5B6TXT.setText("-");
                                }
                                break;
                        }
                        break;
                }
            }
        }
        
        if(valorExportacionTXTTotalB1 == 0){
            frmPrincipal.txtValorInsumosB1.setText("-");
            modValExpo.setValorInsumosTotalB1(0);
        }else{
            frmPrincipal.txtValorInsumosB1.setText("$ " + decimalFormat.format(valorExportacionTXTTotalB1));
            modValExpo.setValorInsumosTotalB1(valorExportacionTXTTotalB1);
        }
        if(valorExportacionTXTTotalB2 == 0){
            frmPrincipal.txtValorInsumosB2.setText("-");
            modValExpo.setValorInsumosTotalB2(0);
        }else{
            frmPrincipal.txtValorInsumosB2.setText("$ " + decimalFormat.format(valorExportacionTXTTotalB2));
            modValExpo.setValorInsumosTotalB2(valorExportacionTXTTotalB2);
        }
        if(valorExportacionTXTTotalB3 == 0){
            frmPrincipal.txtValorInsumosB3.setText("-");
            modValExpo.setValorInsumosTotalB3(0);
        }else{
            frmPrincipal.txtValorInsumosB3.setText("$ " + decimalFormat.format(valorExportacionTXTTotalB3));
            modValExpo.setValorInsumosTotalB3(valorExportacionTXTTotalB3);
        }
        if(valorExportacionTXTTotalB4 == 0){
            frmPrincipal.txtValorInsumosB4.setText("-");
            modValExpo.setValorInsumosTotalB4(0);
        }else{
            frmPrincipal.txtValorInsumosB4.setText("$ " + decimalFormat.format(valorExportacionTXTTotalB4));
            modValExpo.setValorInsumosTotalB4(valorExportacionTXTTotalB4);
        }
        if(valorExportacionTXTTotalB5 == 0){
            frmPrincipal.txtValorInsumosB5.setText("-");
            modValExpo.setValorInsumosTotalB5(0);
        }else{
            frmPrincipal.txtValorInsumosB5.setText("$ " + decimalFormat.format(valorExportacionTXTTotalB5));
            modValExpo.setValorInsumosTotalB5(valorExportacionTXTTotalB5);
        }
        if(valorExportacionTXTTotalB6 == 0){
            frmPrincipal.txtValorInsumosB6.setText("-");
            modValExpo.setValorInsumosTotalB6(0);
        }else{
            frmPrincipal.txtValorInsumosB6.setText("$ " + decimalFormat.format(valorExportacionTXTTotalB6));
            modValExpo.setValorInsumosTotalB6(valorExportacionTXTTotalB6);
        }
        
    }
    
    public void porcentajeValorExpo(){
        double valorInsumosTotalB1 = modValExpo.getValorInsumosTotalB1();
        double valorInsumosTotalB2 = modValExpo.getValorInsumosTotalB2();
        double valorInsumosTotalB3 = modValExpo.getValorInsumosTotalB3();
        double valorInsumosTotalB4 = modValExpo.getValorInsumosTotalB4();
        double valorInsumosTotalB5 = modValExpo.getValorInsumosTotalB5();
        double valorInsumosTotalB6 = modValExpo.getValorInsumosTotalB6();
        double valorExportacionTotalB1 = modValExpo.getValorExportacionTotalB1();
        double valorExportacionTotalB2 = modValExpo.getValorExportacionTotalB2();
        double valorExportacionTotalB3 = modValExpo.getValorExportacionTotalB3();
        double valorExportacionTotalB4 = modValExpo.getValorExportacionTotalB4();
        double valorExportacionTotalB5 = modValExpo.getValorExportacionTotalB5();
        double valorExportacionTotalB6 = modValExpo.getValorExportacionTotalB6();
        
        if (valorInsumosTotalB1 == 0 || valorExportacionTotalB1 == 0) {
            frmPrincipal.txtPorcentajeB1.setText("-");
        }else{
            String porcentajeExpoB1 = String.valueOf(valorInsumosTotalB1 / valorExportacionTotalB1 * 100);
            porcentajeExpoB1 = porcentajeExpoB1.substring(0, porcentajeExpoB1.indexOf('.')) + "%";
            frmPrincipal.txtPorcentajeB1.setText(porcentajeExpoB1);
        }
        
        if (valorInsumosTotalB2 == 0 || valorExportacionTotalB2 == 0) {
            frmPrincipal.txtPorcentajeB2.setText("-");
        }else{
            String porcentajeExpoB2 = String.valueOf(valorInsumosTotalB2 / valorExportacionTotalB2 * 100);
            porcentajeExpoB2 = porcentajeExpoB2.substring(0, porcentajeExpoB2.indexOf('.')) + "%";
            frmPrincipal.txtPorcentajeB2.setText(porcentajeExpoB2);
        }
        
        if (valorInsumosTotalB3 == 0 || valorExportacionTotalB3 == 0) {
            frmPrincipal.txtPorcentajeB3.setText("-");
        }else{
            String porcentajeExpoB3 = String.valueOf(valorInsumosTotalB3 / valorExportacionTotalB3 * 100);
            porcentajeExpoB3 = porcentajeExpoB3.substring(0, porcentajeExpoB3.indexOf('.')) + "%";
            frmPrincipal.txtPorcentajeB3.setText(porcentajeExpoB3);
        }
        
        if (valorInsumosTotalB4 == 0 || valorExportacionTotalB4 == 0) {
            frmPrincipal.txtPorcentajeB4.setText("-");
        }else{
            String porcentajeExpoB4 = String.valueOf(valorInsumosTotalB4 / valorExportacionTotalB4 * 100);
            porcentajeExpoB4 = porcentajeExpoB4.substring(0, porcentajeExpoB4.indexOf('.')) + "%";
            frmPrincipal.txtPorcentajeB4.setText(porcentajeExpoB4);
        }
        
        if (valorInsumosTotalB5 == 0 || valorExportacionTotalB5 == 0) {
            frmPrincipal.txtPorcentajeB5.setText("-");
        }else{
            String porcentajeExpoB5 = String.valueOf(valorInsumosTotalB5 / valorExportacionTotalB5 * 100);
            porcentajeExpoB5 = porcentajeExpoB5.substring(0, porcentajeExpoB5.indexOf('.')) + "%";
            frmPrincipal.txtPorcentajeB5.setText(porcentajeExpoB5);
        }
        
        if (valorInsumosTotalB6 == 0 || valorExportacionTotalB6 == 0) {
            frmPrincipal.txtPorcentajeB6.setText("-");
        }else{
            String porcentajeExpoB6 = String.valueOf(valorInsumosTotalB6 / valorExportacionTotalB6 * 100);
            porcentajeExpoB6 = porcentajeExpoB6.substring(0, porcentajeExpoB6.indexOf('.')) + "%";
            frmPrincipal.txtPorcentajeB6.setText(porcentajeExpoB6);
        }
        
        
        
        
        
        
    }
    
    public void limpiarValorExpo(){
        frmPrincipal.txtRTB1.setText("");
        frmPrincipal.txtRTB2.setText("");
        frmPrincipal.txtRTB3.setText("");
        frmPrincipal.txtRTB4.setText("");
        frmPrincipal.txtRTB5.setText("");
        frmPrincipal.txtRTB6.setText("");
        frmPrincipal.txtV1B1.setText("");
        frmPrincipal.txtV1B2.setText("");
        frmPrincipal.txtV1B3.setText("");
        frmPrincipal.txtV1B4.setText("");
        frmPrincipal.txtV1B5.setText("");
        frmPrincipal.txtV1B6.setText("");
        frmPrincipal.txtV5B1.setText("");
        frmPrincipal.txtV5B2.setText("");
        frmPrincipal.txtV5B3.setText("");
        frmPrincipal.txtV5B4.setText("");
        frmPrincipal.txtV5B5.setText("");
        frmPrincipal.txtV5B6.setText("");
        frmPrincipal.txtRTB1TXT.setText("");
        frmPrincipal.txtRTB2TXT.setText("");
        frmPrincipal.txtRTB3TXT.setText("");
        frmPrincipal.txtRTB4TXT.setText("");
        frmPrincipal.txtRTB5TXT.setText("");
        frmPrincipal.txtRTB6TXT.setText("");
        frmPrincipal.txtV1B1TXT.setText("");
        frmPrincipal.txtV1B2TXT.setText("");
        frmPrincipal.txtV1B3TXT.setText("");
        frmPrincipal.txtV1B4TXT.setText("");
        frmPrincipal.txtV1B5TXT.setText("");
        frmPrincipal.txtV1B6TXT.setText("");
        frmPrincipal.txtV5B1TXT.setText("");
        frmPrincipal.txtV5B2TXT.setText("");
        frmPrincipal.txtV5B3TXT.setText("");
        frmPrincipal.txtV5B4TXT.setText("");
        frmPrincipal.txtV5B5TXT.setText("");
        frmPrincipal.txtV5B6TXT.setText("");
        frmPrincipal.txtValorInsumosB1.setText("");
        frmPrincipal.txtValorInsumosB2.setText("");
        frmPrincipal.txtValorInsumosB3.setText("");
        frmPrincipal.txtValorInsumosB4.setText("");
        frmPrincipal.txtValorInsumosB5.setText("");
        frmPrincipal.txtValorInsumosB6.setText("");
        frmPrincipal.txtValorExportacionB1.setText("");
        frmPrincipal.txtValorExportacionB2.setText("");
        frmPrincipal.txtValorExportacionB3.setText("");
        frmPrincipal.txtValorExportacionB4.setText("");
        frmPrincipal.txtValorExportacionB5.setText("");
        frmPrincipal.txtValorExportacionB6.setText("");
        frmPrincipal.txtPorcentajeB1.setText("");
        frmPrincipal.txtPorcentajeB2.setText("");
        frmPrincipal.txtPorcentajeB3.setText("");
        frmPrincipal.txtPorcentajeB4.setText("");
        frmPrincipal.txtPorcentajeB5.setText("");
        frmPrincipal.txtPorcentajeB6.setText("");
        
                
    }
    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == frmPrincipal.btnCalcularValorExpo) {
            if (frmPrincipal.cmbSeleccionarAñoValorExpo.getSelectedItem().toString().equals("Seleccionar")) {
                JOptionPane.showMessageDialog(null, "Favor de seleccionar el año a validar");
            }else{
                valorExportacionGlosa();
                valorExportacionTXT();
                porcentajeValorExpo();
            }
        }
        if (ev.getSource() == frmPrincipal.btnLimpiarValorExpo) {
            limpiarValorExpo();
        }
    }
    
}
