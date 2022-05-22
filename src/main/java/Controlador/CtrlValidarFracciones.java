package Controlador;

import Modelo.TXTFraccion;
import Modelo.TXTFraccionConsultas;
import Modelo.VFraccion;
import Modelo.VPedimentoTXT;
import Vista.PanelPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CtrlValidarFracciones implements ActionListener{
    
    private PanelPrincipal frmPrincipal;
    private VFraccion modVFraccion;
    private TXTFraccion modFraccion;
    private TXTFraccionConsultas modcFraccion;

    public CtrlValidarFracciones(PanelPrincipal frmPrincipal, VFraccion modVFraccion, TXTFraccion modFraccion, TXTFraccionConsultas modcFraccion) {
        this.frmPrincipal = frmPrincipal;
        this.modVFraccion = modVFraccion;
        this.modFraccion = modFraccion;
        this.modcFraccion = modcFraccion;
        frmPrincipal.btnValidarFracciones.addActionListener(this);
    }
    
    public void llenarTablaValidacionFraccion() throws ParseException{
        modFraccion.setAño(Integer.parseInt(frmPrincipal.cmbSeleccionarAñoValFraccion.getSelectedItem().toString()));
        modFraccion.setBimestre(frmPrincipal.cmbSeleccionarBimestreValFracciones.getSelectedItem().toString());
        
        ArrayList<VFraccion> lista = modcFraccion.validarFraccion(modFraccion);
        
        String matris[][] = new String[lista.size()][6];
        
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getFraccion();
            matris[i][1] = lista.get(i).getRegimenExpo();
            matris[i][2] = lista.get(i).getTipoMaterial();
            matris[i][3] = lista.get(i).getValFraccion();
            matris[i][4] = lista.get(i).getValAF();
            matris[i][5] = lista.get(i).getDateImpo();
        }
        
        frmPrincipal.jtableValidarFracciones.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Fraccion", "Regimen Expo", "Tipo Material", "Validacion Fraccion", "Validacion AF", "Primera Impo"
                }
        ));
        
        frmPrincipal.cmbFiltrarValFracciones.setVisible(true);
        frmPrincipal.cmbFiltrarValFraccionesAF.setVisible(true);
        frmPrincipal.lblFiltrarValFraccion.setVisible(true);
        frmPrincipal.lblFiltrarValFraccionAF.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        
        if (ev.getSource() == frmPrincipal.btnValidarFracciones) {
            if (frmPrincipal.cmbSeleccionarAñoValFraccion.getSelectedItem().toString().equals("Seleccionar") ||
                    frmPrincipal.cmbSeleccionarBimestreValFracciones.getSelectedItem().toString().equals("Seleccionar")) {
                JOptionPane.showMessageDialog(null, "Favor de seleccionar el bimestre y el año a validar");
            }else{
                try {
                    llenarTablaValidacionFraccion();
                    frmPrincipal.cmbFiltrarValFracciones.setSelectedItem("Fraccion antigua");
                    frmPrincipal.cmbFiltrarValFraccionesAF.setSelectedItem("No es fraccion AF");
                    frmPrincipal.cmbFiltrarValFracciones.setSelectedItem("Seleccionar");
                    frmPrincipal.cmbFiltrarValFraccionesAF.setSelectedItem("Seleccionar");
                    frmPrincipal.btnLimpiarValFracciones.setEnabled(true);
                    frmPrincipal.btnValidarFracciones.setEnabled(false);
                    frmPrincipal.cmbSeleccionarAñoValFraccion.setEnabled(false);
                    frmPrincipal.cmbSeleccionarBimestreValFracciones.setEnabled(false);
                } catch (ParseException ex) {
                    Logger.getLogger(CtrlValidarFracciones.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
    }
    
}
