package Controlador;

import Modelo.TXTFraccion;
import Modelo.TXTFraccionConsultas;
import Modelo.VPedimentoGlosa;
import Modelo.VPedimentoTXT;
import Modelo.TXTPedimentoConsultas;
import Vista.PanelPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class CtrlFrame implements ActionListener{
    
    private PanelPrincipal frmPrincipal;
    private TXTPedimentoConsultas modcPedimento;
    private TXTFraccionConsultas modcFraccion;

    public CtrlFrame(PanelPrincipal frmPrincipal, TXTPedimentoConsultas modcPedimento, TXTFraccionConsultas modcFraccion) {
        this.frmPrincipal = frmPrincipal;
        this.modcPedimento = modcPedimento;
        this.modcFraccion = modcFraccion;
        this.frmPrincipal.btnBack.addActionListener(this);
        this.frmPrincipal.btnCancelarRegistroTxt.addActionListener(this);
        this.frmPrincipal.btnNuevoRegistro.addActionListener(this);
    }

    public CtrlFrame() {
    }
    
    public void listarAño(){
        frmPrincipal.cmbSeleccionarAñoValPedimentos.removeAllItems();
        frmPrincipal.cmbSeleccionarAñoValFraccion.removeAllItems();
        frmPrincipal.cmbSeleccionarAñoConsultarTXT.removeAllItems();
        
        ArrayList<String> lista = modcFraccion.listarAño();
        
        for (int i = 0; i < lista.size(); i++) {
            frmPrincipal.cmbSeleccionarAñoValPedimentos.addItem(lista.get(i));
            frmPrincipal.cmbSeleccionarAñoValFraccion.addItem(lista.get(i));
            frmPrincipal.cmbSeleccionarAñoConsultarTXT.addItem(lista.get(i));
        }
    }
    
    public void run(){
        listarAño();
        frmPrincipal.setResizable(false);
        
        frmPrincipal.cmbSeleccionarBimestreConsultaTXT.setSelectedItem("Selected");
        frmPrincipal.cmbSeleccionarBimestreValFracciones.setSelectedItem("Selected");
        frmPrincipal.cmbSeleccionarBimestreValPed.setSelectedItem("Selected");
        frmPrincipal.cmbSeleccionarRegimenConsultaTXT.setSelectedItem("Selected");
        frmPrincipal.cmbFiltroValPedimGlosa.setVisible(false);
        frmPrincipal.cmbFiltroValPedimTXT.setVisible(false);
        frmPrincipal.cmbFiltrarValFracciones.setVisible(false);
        frmPrincipal.cmbFiltrarValFraccionesAF.setVisible(false);
        frmPrincipal.cmbFiltrarSobredescargo.setVisible(false);
        frmPrincipal.lblFiltrarValPedimentoGlosa.setVisible(false);
        frmPrincipal.lblFiltrarValPedimentoTXT.setVisible(false);
        frmPrincipal.lblFiltrarValFraccion.setVisible(false);
        frmPrincipal.lblFiltrarValFraccionAF.setVisible(false);
        frmPrincipal.lblFiltrarValSaldosSD.setVisible(false);
        frmPrincipal.btnLimpiarTXT.setEnabled(false);
        frmPrincipal.btnEliminarTXT.setEnabled(false);
        frmPrincipal.btnExportarTXT.setEnabled(false);
        frmPrincipal.btnLock.setVisible(false);
        frmPrincipal.txtIDFraccion.setEnabled(false);
        frmPrincipal.txtNombreArchivo.setEnabled(false);
        frmPrincipal.txtValidado.setEnabled(false);
        frmPrincipal.cmbTipoAgregarFraccion.setEnabled(false);
        DefaultTableModel tb = (DefaultTableModel) frmPrincipal.jtableConsultaTXT.getModel();
        tb.setRowCount(0);
        frmPrincipal.btnLimpiarSaldos.setEnabled(false);
        frmPrincipal.btnLimpiarValFracciones.setEnabled(false);
        frmPrincipal.btnLimpiarValPedimentos.setEnabled(false);
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == frmPrincipal.btnBack || ev.getSource() == frmPrincipal.btnCancelarRegistroTxt) {
            frmPrincipal.pnlValidaciones.setVisible(true);
            frmPrincipal.pnlRegistroTXT.setVisible(false);
        }
        if (ev.getSource() == frmPrincipal.btnNuevoRegistro) {
            limpiar();
            frmPrincipal.pnlRegistroTXT.setVisible(true);
            frmPrincipal.pnlValidaciones.setVisible(false);
        }
    }
    
    
    public void limpiar() {
        frmPrincipal.txtIDFraccion.setText("");
        frmPrincipal.cmbTipoAgregarFraccion.setSelectedItem("Selected");
        frmPrincipal.cmbTipoAgregarFraccion.setEnabled(true);
        frmPrincipal.txtFraccion.setText("");
        frmPrincipal.txtValor.setText("");
        frmPrincipal.txtTipoMaterial.setText("");
        frmPrincipal.cmbSeleccionarRegimenAgregarFraccion.setSelectedItem("Selected");
        frmPrincipal.txtValidado.setText("0");
        frmPrincipal.cmbSeleccionarBimestreRegistro.setSelectedItem("Selected");
        frmPrincipal.txtAño.setText("");
        frmPrincipal.txtNombreArchivo.setText("");
        
    }
    
}
