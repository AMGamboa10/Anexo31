package Principal;

import Controlador.CtrlFrame;
import Controlador.CtrlTXT;
import Controlador.CtrlValidarFracciones;
import Controlador.CtrlValidarPedimentos;
import Controlador.CtrlValidarSaldos;
import Controlador.CtrlValorExpo;
import Modelo.VPedimentoGlosa;
import Modelo.VPedimentoTXT;
import Modelo.TXTFraccion;
import Modelo.TXTFraccionConsultas;
import Modelo.TXTPedimento;
import Modelo.TXTPedimentoConsultas;
import Modelo.Saldos;
import Modelo.TXTNombre;
import Modelo.TXTNombreConsultas;
import Modelo.VFraccion;
import Modelo.ValorExportacion;
import Modelo.ValorExportacionConsultas;
import Vista.PanelPrincipal;

public class Principal {
    
    public static void main(String[] args) {
        PanelPrincipal frmPrincipal = new PanelPrincipal();
        TXTFraccion modFraccion = new TXTFraccion();
        TXTFraccionConsultas modcFraccion = new TXTFraccionConsultas();
        TXTPedimento modPedimento = new TXTPedimento();
        TXTPedimentoConsultas modcPedimento = new TXTPedimentoConsultas();
        TXTNombre modNombre = new TXTNombre();
        TXTNombreConsultas modcNombre = new TXTNombreConsultas();
        Saldos modSaldos = new Saldos();
        VPedimentoGlosa modPedimentoGlosa = new VPedimentoGlosa();
        VPedimentoTXT modPedimentoTXT = new VPedimentoTXT();
        VFraccion modVFraccion = new VFraccion();
        ValorExportacion modValExpo = new ValorExportacion();
        ValorExportacionConsultas modValExpoC = new ValorExportacionConsultas();
        
        CtrlValorExpo ctrlValorExpo = new CtrlValorExpo(frmPrincipal, modValExpo, modValExpoC);
        CtrlFrame ctrlFrame = new CtrlFrame(frmPrincipal, modcPedimento, modcFraccion);
        CtrlTXT ctrlTXT = new CtrlTXT(frmPrincipal, modFraccion, modcFraccion, modPedimento, modcPedimento, modNombre, modcNombre);
        CtrlValidarSaldos ctrlValidarSaldos = new CtrlValidarSaldos(frmPrincipal, modSaldos, modcFraccion);
        CtrlValidarPedimentos ctrlValidarPedimentos = new CtrlValidarPedimentos(frmPrincipal, modPedimentoTXT, modPedimentoGlosa, modcPedimento, modPedimento);
        CtrlValidarFracciones ctrlValidarFracciones = new CtrlValidarFracciones(frmPrincipal, modVFraccion, modFraccion, modcFraccion);
        
        ctrlFrame.run();
        frmPrincipal.setVisible(true);
        
    }
    
    
    
}
