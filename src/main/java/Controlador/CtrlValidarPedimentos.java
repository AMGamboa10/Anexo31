package Controlador;

import Modelo.VPedimentoGlosa;
import Modelo.VPedimentoTXT;
import Modelo.TXTFraccion;
import Modelo.TXTFraccionConsultas;
import Modelo.TXTPedimento;
import Modelo.TXTPedimentoConsultas;
import Vista.PanelPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CtrlValidarPedimentos implements ActionListener{
    
    private PanelPrincipal frmPrincipal;
    private VPedimentoTXT modPedimentoTXT;
    private VPedimentoGlosa modPedimentoGlosa;
    private TXTPedimentoConsultas modcPedimento;
    private TXTPedimento modPedimento;

    public CtrlValidarPedimentos(PanelPrincipal frmPrincipal, VPedimentoTXT modPedimentoTXT, VPedimentoGlosa modPedimentoGlosa, TXTPedimentoConsultas modcPedimento, TXTPedimento modPedimento) {
        this.frmPrincipal = frmPrincipal;
        this.modPedimentoTXT = modPedimentoTXT;
        this.modPedimentoGlosa = modPedimentoGlosa;
        this.modcPedimento = modcPedimento;
        this.modPedimento = modPedimento;
        frmPrincipal.btnValidarPedimentos.addActionListener(this);
    }
    
    TableRowSorter trs;
    
    public void llenarTablaValidacionPedimentosTXTvsGlosa(){
        
        modPedimento.setAño(Integer.parseInt(frmPrincipal.cmbSeleccionarAñoValPedimentos.getSelectedItem().toString()));
        modPedimento.setBimestre(frmPrincipal.cmbSeleccionarBimestreValPed.getSelectedItem().toString());
        
        ArrayList<VPedimentoTXT> lista = modcPedimento.validarPedimentoTXTvsGlosa(modPedimento);
        
        String matris[][] = new String[lista.size()][6];
        
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getTipo();
            matris[i][1] = lista.get(i).getPatente();
            matris[i][2] = lista.get(i).getPedimento();
            matris[i][3] = lista.get(i).getAduana();
            matris[i][4] = lista.get(i).getRegimen();
            matris[i][5] = lista.get(i).getValidacionVsGlosa();
        }
        
        frmPrincipal.jtableValidarPedimentosTXT.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Tipo", "Patente", "Pedimento", "Aduana", "Regimen", "Vs Glosa"
                }
        ));
        
        frmPrincipal.cmbFiltroValPedimTXT.setVisible(true);
        frmPrincipal.lblFiltrarValPedimentoTXT.setVisible(true);
                
    }
    
    public void llenarTablaValidacionPedimentosGlosaVsTXT(){
        
        modPedimento.setAño(Integer.parseInt(frmPrincipal.cmbSeleccionarAñoValPedimentos.getSelectedItem().toString()));
        modPedimento.setBimestre(frmPrincipal.cmbSeleccionarBimestreValPed.getSelectedItem().toString());
        
        ArrayList<VPedimentoGlosa> lista = modcPedimento.validarPedimentoGlosavsTXT(modPedimento);
        
        String matris[][] = new String[lista.size()][6];
        
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getPatente();
            matris[i][1] = lista.get(i).getPedimento();
            matris[i][2] = lista.get(i).getAduana();
            matris[i][3] = lista.get(i).getRegimen();
            matris[i][4] = lista.get(i).getFechaPago();
            matris[i][5] = lista.get(i).getValidacionVsTXT();
        }
        
        frmPrincipal.jtableValidarPedimentosGlosa.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Patente", "Pedimento", "Aduana", "Regimen", "Fecha Pago", "Vs TXT"
                }
        ));
        
        frmPrincipal.cmbFiltroValPedimGlosa.setVisible(true);
        frmPrincipal.lblFiltrarValPedimentoGlosa.setVisible(true);
    
    }
    
    public void filtrarValPedimGlosa(){
        
        
        trs.setRowFilter(RowFilter.regexFilter(frmPrincipal.cmbFiltroValPedimGlosa.getSelectedItem().toString() , 5));
        trs = new TableRowSorter(frmPrincipal.jtableValidarPedimentosGlosa.getModel());
        frmPrincipal.jtableValidarPedimentosGlosa.setRowSorter(trs);
    }
    
    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == frmPrincipal.btnValidarPedimentos) {
            if (frmPrincipal.cmbSeleccionarAñoValPedimentos.getSelectedItem().toString().equals("Seleccionar") ||
                    frmPrincipal.cmbSeleccionarBimestreValPed.getSelectedItem().toString().equals("Seleccionar")) {
                JOptionPane.showMessageDialog(null, "Favor de seleccionar el bimestre y el año a validar");
            }else{
                llenarTablaValidacionPedimentosTXTvsGlosa();
                llenarTablaValidacionPedimentosGlosaVsTXT();
                frmPrincipal.cmbFiltroValPedimTXT.setSelectedItem("Encontrado");
                frmPrincipal.cmbFiltroValPedimGlosa.setSelectedItem("Encontrado");
                frmPrincipal.cmbFiltroValPedimTXT.setSelectedItem("Seleccionar");
                frmPrincipal.cmbFiltroValPedimGlosa.setSelectedItem("Seleccionar");
                
                frmPrincipal.btnLimpiarValPedimentos.setEnabled(true);
                frmPrincipal.cmbSeleccionarAñoValPedimentos.setEnabled(false);
                frmPrincipal.cmbSeleccionarBimestreValPed.setEnabled(false);
                frmPrincipal.btnValidarPedimentos.setEnabled(false);
                
            }
        }
    }
    
    
}
