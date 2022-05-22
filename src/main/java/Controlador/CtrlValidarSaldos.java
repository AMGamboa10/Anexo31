package Controlador;

import Modelo.TXTFraccionConsultas;
import Modelo.Saldos;
import Vista.PanelPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CtrlValidarSaldos implements ActionListener {

    private PanelPrincipal frmPrincipal;
    private Saldos modSaldos;
    private TXTFraccionConsultas modcFraccion;

    public CtrlValidarSaldos(PanelPrincipal frmPrincipal, Saldos modSaldos, TXTFraccionConsultas modcFraccion) {
        this.frmPrincipal = frmPrincipal;
        this.modSaldos = modSaldos;
        this.modcFraccion = modcFraccion;
        this.frmPrincipal.btnValidarSaldos.addActionListener(this);
    }

    public void llenarTablaValidacionSaldos() {

        //Creamos un array y lo igualamos a nuestro metodo en consultas que busca todas las fracciones y calcula saldos
        ArrayList<Saldos> lista = modcFraccion.validarSaldos(modSaldos);
        
        String matris[][] = new String[lista.size()][7];

        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getFraccion();
            matris[i][1] = lista.get(i).getAbono();
            matris[i][2] = lista.get(i).getDescargo();
            matris[i][3] = lista.get(i).getSaldo();
            matris[i][4] = lista.get(i).getPorcentajeDescargo();
            matris[i][5] = lista.get(i).getActivofijo();
            matris[i][6] = lista.get(i).getSobredescargo();
        }
        
        frmPrincipal.jtableSaldos.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Fraccion","Abono", "Descargo", "Saldo", "% Descargo", "N/S", "Sobredescargo"
                }
        ));
        
        int[] anchos = {50, 70, 70, 70, 40, 20, 70};
        
        
        for(int x = 0; x < 6; x++){
            frmPrincipal.jtableSaldos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
        }
        
        frmPrincipal.cmbFiltrarSobredescargo.setVisible(true);
        frmPrincipal.lblFiltrarValSaldosSD.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource() == frmPrincipal.btnValidarSaldos) {
            llenarTablaValidacionSaldos();
            frmPrincipal.btnLimpiarSaldos.setEnabled(true);
            frmPrincipal.btnValidarSaldos.setEnabled(false);
        }
    }

}
