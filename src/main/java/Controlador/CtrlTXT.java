package Controlador;

import Modelo.Conexion;
import Modelo.TXTFraccion;
import Modelo.TXTFraccionConsultas;
import Modelo.TXTNombre;
import Modelo.TXTNombreConsultas;
import Modelo.TXTPedimento;
import Modelo.TXTPedimentoConsultas;
import Vista.PanelPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.http.WebSocket;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CtrlTXT implements ActionListener, MouseListener {
    private PanelPrincipal frmPrincipal;
    private TXTFraccion modFraccion;
    private TXTFraccionConsultas modcFraccion;
    private TXTPedimento modPedimento;
    private TXTPedimentoConsultas modcPedimento;
    private TXTNombre modNombre;
    private TXTNombreConsultas modcNombre;

    public CtrlTXT(PanelPrincipal frmPrincipal, TXTFraccion modFraccion, TXTFraccionConsultas modcFraccion, TXTPedimento modPedimento, TXTPedimentoConsultas modcPedimento, TXTNombre modNombre, TXTNombreConsultas modcNombre) {
        this.frmPrincipal = frmPrincipal;
        this.modFraccion = modFraccion;
        this.modcFraccion = modcFraccion;
        this.modPedimento = modPedimento;
        this.modcPedimento = modcPedimento;
        this.modNombre = modNombre;
        this.modcNombre = modcNombre;
        this.frmPrincipal.btnSeleccionarTXTInsertar.addActionListener(this);
        this.frmPrincipal.btnExportarTXT.addActionListener(this);
        this.frmPrincipal.btnFiltrarTXT.addActionListener(this);
        this.frmPrincipal.btnEliminarTXT.addActionListener(this);
        this.frmPrincipal.btnLimpiarTXT.addActionListener(this);
        this.frmPrincipal.btnLock.addActionListener(this);
        this.frmPrincipal.jtableConsultaTXT.addMouseListener(this);
        this.frmPrincipal.btnEliminarRegistroTxt.addActionListener(this);
        this.frmPrincipal.btnGuardarRegistroTXT.addActionListener(this);
        this.frmPrincipal.btnCancelarRegistroTxt.addActionListener(this);
    }

    public void insertarTXT() {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt", "txt");
        fc.setFileFilter(filtro);
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        String nombreArchivo = archivo.getName();


            FileReader fr;
            try {
                fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String linea = "";

                String tipo, fraccion, tipoMaterial, patente, pedimento, seccion;
                double valor;
                String regimen = "";
                int año = 0;
                String bimestre = "";

                int n = 1;
                boolean valInsertado = true;
                boolean registrarFraccion = false;
                boolean registrarPedimento = false;

                try {
                    while (((linea = br.readLine()) != null)) {

                        if (n == 1) {
                            linea = linea.substring(linea.indexOf('|') + 1);
                            regimen = linea.substring(0, linea.indexOf('|'));
                            linea = linea.substring(linea.indexOf('|') + 1);
                            año = Integer.parseInt(linea.substring(0, linea.indexOf('|')));
                            linea = linea.substring(linea.indexOf('|') + 1);
                            bimestre = linea.substring(0, linea.indexOf('|'));
                            
                            modFraccion.setAño(año);
                            modFraccion.setBimestre(bimestre);
                            modFraccion.setRegimen(regimen);
                            modcFraccion.validarExisteTXT(modFraccion);
                            
                            if (modFraccion.getResultValExisteTXT() >= 1) {
                                JOptionPane.showMessageDialog(null,
                                        "El txt del regimen " + regimen
                                        + " del año " + año + " del periodo " + bimestre + " ya se encunetra registrado en la base de datos");
                                break;
                            }

                            n++;

                        } else {
                            
                            tipo = linea.substring(0, linea.indexOf('|'));
                            linea = linea.substring(linea.indexOf('|') + 1);
                            //Validamos si es fraccion
                            if (tipo.equals("03")) {
                                fraccion = linea.substring(0, linea.indexOf('|'));

                                linea = linea.substring(linea.indexOf('|') + 1);
                                valor = Double.parseDouble(linea.substring(0, linea.indexOf('|')));
                                linea = linea.substring(linea.indexOf('|') + 1);
                                tipoMaterial = linea;

                                modFraccion.setTipo(tipo);
                                modFraccion.setFraccion(fraccion);
                                modFraccion.setValor(valor);
                                modFraccion.setTipoMaterial(tipoMaterial);
                                modFraccion.setRegimen(regimen);
                                modFraccion.setAño(año);
                                modFraccion.setBimestre(bimestre);
                                modFraccion.setNombreTXT(nombreArchivo);
                                
                                
                                registrarFraccion = modcFraccion.registrar(modFraccion);
                                if (registrarFraccion) {
                                    System.out.println("Registro guardado (TXT Fraccion)");
                                    registrarFraccion = true;
                                } else {
                                    System.err.println("Registro no guardado (TXT Fraccion)");
                                    modcFraccion.eliminarRegistro(modFraccion);
                                    valInsertado = false;
                                    JOptionPane.showMessageDialog(null, "Error al insertar el txt", "Insertado TXT", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                                //Sino es fraccion entonces es pedimento
                            } else {
                                //DecimalFormat format = new DecimalFormat("0000000");
                                patente = linea.substring(0, linea.indexOf('|'));
                                linea = linea.substring(linea.indexOf('|') + 1);
                                pedimento = linea.substring(0, linea.indexOf('|'));
                                pedimento = pedimento.replace(" ", "");
                                
                                linea = linea.substring(linea.indexOf('|') + 1);
                                seccion = linea;

                                modPedimento.setTipo(tipo);
                                modPedimento.setPatente(patente);
                                modPedimento.setPedimento(pedimento);
                                modPedimento.setSeccion(seccion);
                                modPedimento.setRegimen(regimen);
                                modPedimento.setAño(año);
                                modPedimento.setBimestre(bimestre);
                                modPedimento.setNombreTXT(nombreArchivo);

                                if (pedimento.length() != 7) {
                                    JOptionPane.showMessageDialog(null, "Pedimento " + pedimento + " no esta a 7 digitos, favor de validar");
                                    modcPedimento.eliminarRegistro(modPedimento);
                                    modcFraccion.eliminarRegistro(modFraccion);
                                    JOptionPane.showMessageDialog(null, "Se elimino el TXT", "Eliminar TXT", JOptionPane.ERROR_MESSAGE);
                                    registrarPedimento = false;
                                    break;
                                } else {

                                    if (modcPedimento.registrar(modPedimento)) {
                                        System.out.println("Registro guardado(TXT pedimento)");
                                        registrarPedimento = true;
                                    } else {
                                        System.err.println("Registro no guardado(TXT Pedimento)");
                                        modcPedimento.eliminarRegistro(modPedimento);
                                        modcFraccion.eliminarRegistro(modFraccion);
                                        JOptionPane.showMessageDialog(null, "Se elimino el TXT", "Eliminar TXT", JOptionPane.ERROR_MESSAGE);
                                        break;
                                    }
                                }
                            }
                        }

                    }
                    if (registrarPedimento && registrarFraccion) {
                        JOptionPane.showMessageDialog(null, "TXT insertado con exito", "Insertar TXT", JOptionPane.INFORMATION_MESSAGE);
                    }

                } catch (IOException ex) {
                    Logger.getLogger(CtrlTXT.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(CtrlTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean crearTXT(){
        
        modFraccion.setAño(Integer.parseInt(frmPrincipal.cmbSeleccionarAñoConsultarTXT.getSelectedItem().toString()));
        modFraccion.setBimestre(frmPrincipal.cmbSeleccionarBimestreConsultaTXT.getSelectedItem().toString().substring(3,5));
        modFraccion.setRegimen(frmPrincipal.cmbSeleccionarRegimenConsultaTXT.getSelectedItem().toString());
        
        if (modcFraccion.crearTXT(modFraccion)) {
            System.out.println("Creacion de archivo satisfactoriamente");
            return true;
        }else{
            System.out.println("Error en crear txt");
            return false;
        }
    }
    
    public void filtrarTXT(){
        
        modFraccion.setAño(Integer.parseInt(frmPrincipal.cmbSeleccionarAñoConsultarTXT.getSelectedItem().toString()));
        modFraccion.setBimestre(frmPrincipal.cmbSeleccionarBimestreConsultaTXT.getSelectedItem().toString().substring(3,5));
        modFraccion.setRegimen(frmPrincipal.cmbSeleccionarRegimenConsultaTXT.getSelectedItem().toString());
        
        ArrayList<TXTFraccion> lista = modcFraccion.buscarTXT(modFraccion);
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        
        String matris[][] = new String[lista.size()][9];
        for (int i = 0; i < lista.size(); i++) {
            
            matris[i][0] = Integer.toString(lista.get(i).getId());
            matris[i][1] = lista.get(i).getTipo();
            matris[i][2] = lista.get(i).getFraccion();
            
            if (
                    Double.toString(lista.get(i).getValor()).length() == 9 &&
                    Double.toString(lista.get(i).getValor()).lastIndexOf('.') == 7  &&
                    Double.toString(lista.get(i).getValor()).substring(8).equals("0")
                    ) {
                
                matris[i][3] = Double.toString(lista.get(i).getValor()).substring(0, 7);
                
            }else{
                matris[i][3] = decimalFormat.format(lista.get(i).getValor());
            }
            
            matris[i][4] = lista.get(i).getTipoMaterial();
            matris[i][5] = lista.get(i).getRegimen();
            matris[i][6] = String.valueOf(lista.get(i).getAño());
            matris[i][7] = lista.get(i).getBimestre();
            matris[i][8] = lista.get(i).getValidado();
        }
        
        //Le asiganmos el modelo a la tabla a partir de la matriz que creamos
        frmPrincipal.jtableConsultaTXT.setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "ID", "Tipo", "Fraccion/Patente", "Valor/Pedimento", "TipoMat/Aduana", "Regimen", "Año", "Bimestre", "Validado"
                }
        ));
        
        //Ajustamos los anchos de las columnas
        int[] anchos = {15, 30, 50, 80, 30, 30, 30, 35, 40};
        for(int x = 0; x < 8; x++){
            frmPrincipal.jtableConsultaTXT.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
        }
        
        if (lista.get(1).getValidado().equals("Candadeado")) {
            frmPrincipal.btnLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/unlock.png"))); // NOI18N
            frmPrincipal.btnLock.setToolTipText("Descandadear");
            frmPrincipal.btnEliminarTXT.setEnabled(false);
        }else{
            frmPrincipal.btnLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock.png")));
            frmPrincipal.btnLock.setToolTipText("Candadear");
            frmPrincipal.btnEliminarTXT.setEnabled(true);
        }
        
    }
    
    public boolean validarSeleccionarFiltrosTXT(){
        if (
                frmPrincipal.cmbSeleccionarAñoConsultarTXT.getSelectedItem().toString().equals("Seleccionar") ||
                frmPrincipal.cmbSeleccionarBimestreConsultaTXT.getSelectedItem().toString().equals("Seleccionar") ||
                frmPrincipal.cmbSeleccionarRegimenConsultaTXT.getSelectedItem().toString().equals("Seleccionar")
                ) {
            JOptionPane.showMessageDialog(null, "Favor de seleccionar todos los parametros", "Seleccionar paramtero", JOptionPane.ERROR_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
    
    public boolean validacionSupervisor() {
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter a password:");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "Ingresar password de supervisor", JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        if (option == 0) // pressing OK button 
        {
            char[] password = pass.getPassword();
            if (new String(password).equals("trade2021")) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Constraseña equivocada", "Error contraseña", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            return false;
        }
    }
    
    public void eliminarTXTArchivoTXT(){
        String destino = "O:\\Mexico\\Trade Compliance\\NPS_ CUMPLIMIENTO LEGAL E IMMEX\\ANEXO 31\\Informes de Descargo\\TXTs Automatizacion\\" 
                + modFraccion.getAño() + "\\" 
                + modFraccion.getBimestre() + "\\"
                + modFraccion.getNombreTXT() ;
        File ficheroTXT = new File(destino);
        if (ficheroTXT.exists()) {

            if (ficheroTXT.delete()) {
                JOptionPane.showMessageDialog(null, "Se elimino el fichero en carpeta con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el TXT en carpeta", "Error eliminar TXT", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }
    
    //llenaremos los txts a partir de la seleccion en la tabla
    public void llenarTXTsTabla(){
        int fila = frmPrincipal.jtableConsultaTXT.getSelectedRow();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frmPrincipal.btnSeleccionarTXTInsertar) {
            insertarTXT();
            listarAño();
            listarBimestre();
            listarRegimen();

        }
        if (e.getSource() == frmPrincipal.btnExportarTXT) {
            if (validarSeleccionarFiltrosTXT()) {
                crearTXT();
            }
        }
        if (e.getSource() == frmPrincipal.btnFiltrarTXT) {
            if (validarSeleccionarFiltrosTXT()) {
                filtrarTXT();
                frmPrincipal.cmbSeleccionarAñoConsultarTXT.setEnabled(false);
                frmPrincipal.cmbSeleccionarBimestreConsultaTXT.setEnabled(false);
                frmPrincipal.cmbSeleccionarRegimenConsultaTXT.setEnabled(false);
                frmPrincipal.btnLimpiarTXT.setEnabled(true);
                frmPrincipal.btnExportarTXT.setEnabled(true);
                frmPrincipal.btnLock.setVisible(true);
            }
        }

        if (e.getSource() == frmPrincipal.btnEliminarTXT) {
            if (validacionSupervisor()) {

                modFraccion.setAño(Integer.parseInt(frmPrincipal.cmbSeleccionarAñoConsultarTXT.getSelectedItem().toString()));
                modFraccion.setBimestre(frmPrincipal.cmbSeleccionarBimestreConsultaTXT.getSelectedItem().toString().substring(3, 5));
                modFraccion.setRegimen(frmPrincipal.cmbSeleccionarRegimenConsultaTXT.getSelectedItem().toString());

                modPedimento.setAño(Integer.parseInt(frmPrincipal.cmbSeleccionarAñoConsultarTXT.getSelectedItem().toString()));
                modPedimento.setBimestre(frmPrincipal.cmbSeleccionarBimestreConsultaTXT.getSelectedItem().toString().substring(3, 5));
                modPedimento.setRegimen(frmPrincipal.cmbSeleccionarRegimenConsultaTXT.getSelectedItem().toString());

                //Validamos si esta candadeado o no, en caso de que si se solicita contraseña
                if (modcFraccion.validacionCandado(modFraccion) || modcFraccion.validacionCandado(modFraccion) == false) {
                    if (modcFraccion.eliminarRegistro(modFraccion) && modcPedimento.eliminarRegistro(modPedimento)) {

                        JOptionPane.showMessageDialog(null, "Se elimino el TXT con exito");
                        DefaultTableModel tb = (DefaultTableModel) frmPrincipal.jtableConsultaTXT.getModel();
                        tb.setRowCount(0);
                        frmPrincipal.cmbSeleccionarAñoConsultarTXT.setEnabled(true);
                        frmPrincipal.cmbSeleccionarBimestreConsultaTXT.setEnabled(true);
                        frmPrincipal.cmbSeleccionarRegimenConsultaTXT.setEnabled(true);
                        frmPrincipal.btnLimpiarTXT.setEnabled(false);
                        frmPrincipal.btnEliminarTXT.setEnabled(false);
                        frmPrincipal.btnExportarTXT.setEnabled(false);
                        frmPrincipal.btnLock.setVisible(false);
                        listarAño();
                        listarBimestre();
                        listarRegimen();
                        //Metodo para elimianr archivo TXT
                        eliminarTXTArchivoTXT();

                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
                    }
                }
            }
        }

        if (e.getSource() == frmPrincipal.btnLimpiarTXT) {
            DefaultTableModel tb = (DefaultTableModel) frmPrincipal.jtableConsultaTXT.getModel();
            tb.setRowCount(0);
            frmPrincipal.cmbSeleccionarAñoConsultarTXT.setEnabled(true);
            frmPrincipal.cmbSeleccionarBimestreConsultaTXT.setEnabled(true);
            frmPrincipal.cmbSeleccionarRegimenConsultaTXT.setEnabled(true);
            frmPrincipal.btnLimpiarTXT.setEnabled(false);
            frmPrincipal.btnEliminarTXT.setEnabled(false);
            frmPrincipal.btnExportarTXT.setEnabled(false);
            frmPrincipal.btnLock.setVisible(false);
        }

        if (e.getSource() == frmPrincipal.btnLock) {
            if (validacionSupervisor()) {
                modFraccion.setAño(Integer.parseInt(frmPrincipal.cmbSeleccionarAñoConsultarTXT.getSelectedItem().toString()));
                modFraccion.setRegimen(frmPrincipal.cmbSeleccionarRegimenConsultaTXT.getSelectedItem().toString());
                modFraccion.setBimestre(frmPrincipal.cmbSeleccionarBimestreConsultaTXT.getSelectedItem().toString().substring(3, 5));
                modFraccion.setValidado(frmPrincipal.btnLock.getToolTipText());
                modPedimento.setAño(Integer.parseInt(frmPrincipal.cmbSeleccionarAñoConsultarTXT.getSelectedItem().toString()));
                modPedimento.setRegimen(frmPrincipal.cmbSeleccionarRegimenConsultaTXT.getSelectedItem().toString());
                modPedimento.setBimestre(frmPrincipal.cmbSeleccionarBimestreConsultaTXT.getSelectedItem().toString().substring(3, 5));
                modPedimento.setValidado(frmPrincipal.btnLock.getToolTipText());

                if (modcFraccion.actualizarCandado(modFraccion) && modcPedimento.actualizarCandado(modPedimento)) {
                    if (modFraccion.getValidado().equals("Descandadear")) {
                        frmPrincipal.btnLock.setToolTipText("Candadear");
                        frmPrincipal.btnLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock.png")));
                        frmPrincipal.btnEliminarTXT.setEnabled(false);
                        filtrarTXT();
                    } else {
                        frmPrincipal.btnLock.setToolTipText("Descandadear");
                        frmPrincipal.btnLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/unlock.png")));
                        frmPrincipal.btnEliminarTXT.setEnabled(true);
                        filtrarTXT();
                    }
                }
            }

        }
        if (e.getSource() == frmPrincipal.btnGuardarRegistroTXT) {
            
            int Fila = frmPrincipal.jtableConsultaTXT.getSelectedRow();
            boolean nuevoRegistro = false;
            String candado = "Sin candado";
            if (frmPrincipal.txtIDFraccion.getText().equals("")) {
                nuevoRegistro = true;
            }else{
                candado = frmPrincipal.jtableConsultaTXT.getValueAt(Fila, 8).toString();
            }

            if (candado.equals("Sin candado") || nuevoRegistro) {
                if (frmPrincipal.cmbTipoAgregarFraccion.getSelectedItem().toString().equals("03")) {
                    modFraccion.setFraccion(frmPrincipal.txtFraccion.getText());
                    modFraccion.setValor(Double.parseDouble(frmPrincipal.txtValor.getText().substring(1)));
                    modFraccion.setTipoMaterial(frmPrincipal.txtTipoMaterial.getText());
                    modFraccion.setRegimen(frmPrincipal.cmbSeleccionarRegimenAgregarFraccion.getSelectedItem().toString());
                    modFraccion.setAño(Integer.parseInt(frmPrincipal.txtAño.getText()));
                    modFraccion.setBimestre(frmPrincipal.cmbSeleccionarBimestreRegistro.getSelectedItem().toString());
                    if (!nuevoRegistro) {
                        modFraccion.setId(Integer.parseInt(frmPrincipal.txtIDFraccion.getText()));
                    }
                    
                    //
                    if (frmPrincipal.txtIDFraccion.getText().equals("")) {
                        
                        if (modcFraccion.registrar(modFraccion)) {
                            JOptionPane.showMessageDialog(null, "Nuevo registro guardado con exito");
                        }else{
                            JOptionPane.showMessageDialog(null, "Error al guardar", "Error al guardar", JOptionPane.ERROR_MESSAGE);
                        }
                        
                    }else if (modcFraccion.actualizar(modFraccion)) {
                        JOptionPane.showMessageDialog(null, "Guardado y actualizado con exito");
                        frmPrincipal.pnlValidaciones.setVisible(true);
                        frmPrincipal.pnlRegistroTXT.setVisible(false);
                    }
                } else {
                    modPedimento.setPatente(frmPrincipal.txtFraccion.getText());
                    modPedimento.setPedimento(frmPrincipal.txtValor.getText().substring(1));
                    modPedimento.setSeccion(frmPrincipal.txtTipoMaterial.getText());
                    modPedimento.setRegimen(frmPrincipal.cmbSeleccionarRegimenAgregarFraccion.getSelectedItem().toString());
                    modPedimento.setAño(Integer.parseInt(frmPrincipal.txtAño.getText()));
                    modPedimento.setBimestre(frmPrincipal.cmbSeleccionarBimestreRegistro.getSelectedItem().toString());
                    if (!nuevoRegistro) {
                        modPedimento.setId(Integer.parseInt(frmPrincipal.txtIDFraccion.getText()));
                    }
                    
                    if (nuevoRegistro) {
                        if (modcPedimento.registrar(modPedimento)) {
                            JOptionPane.showMessageDialog(null, "Nuevo registro guardado con exito");
                        }else{
                            JOptionPane.showMessageDialog(null, "Error al guardar el registro", "Error guardado", JOptionPane.ERROR_MESSAGE);
                        }
                    }else if (modcPedimento.actualizar(modPedimento)) {
                        JOptionPane.showMessageDialog(null, "Guardado y actualizado con exito");
                        filtrarTXT();
                        frmPrincipal.pnlValidaciones.setVisible(true);
                        frmPrincipal.pnlRegistroTXT.setVisible(false);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Registro candadeado, se necesita descandadear para modificar", "Candadeado", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        if (e.getSource() == frmPrincipal.btnEliminarRegistroTxt) {

            int Fila = frmPrincipal.jtableConsultaTXT.getSelectedRow();
            String candado = frmPrincipal.jtableConsultaTXT.getValueAt(Fila, 8).toString();

            if (candado.equals("Sin candado")) {
                if (frmPrincipal.cmbTipoAgregarFraccion.getSelectedItem().toString().equals("03")) {
                    modFraccion.setId(Integer.parseInt(frmPrincipal.txtIDFraccion.getText()));
                    if (modcFraccion.eliminar(modFraccion)) {
                        JOptionPane.showMessageDialog(null, "Se elimino el registro de forma satisfactoria");
                        filtrarTXT();
                        frmPrincipal.pnlValidaciones.setVisible(true);
                        frmPrincipal.pnlRegistroTXT.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro de forma adecuada");
                    }
                } else {
                    modPedimento.setId(Integer.parseInt(frmPrincipal.txtIDFraccion.getText()));
                    if (modcPedimento.eliminar(modPedimento)) {
                        JOptionPane.showMessageDialog(null, "Se elimino el registro de forma satisfactoria");
                        filtrarTXT();
                        frmPrincipal.pnlValidaciones.setVisible(true);
                        frmPrincipal.pnlRegistroTXT.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro de forma adecuada");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registro candadeado, se necesita descandadear para modificar", "Candadeado", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    @Override
    public void mouseClicked(java.awt.event.MouseEvent eMouseClick) {
        if (eMouseClick.getSource() == frmPrincipal.jtableConsultaTXT) {

            int Fila = frmPrincipal.jtableConsultaTXT.getSelectedRow();
            int id = Integer.parseInt(frmPrincipal.jtableConsultaTXT.getValueAt(Fila, 0).toString());
            modFraccion.setId(id);
            modPedimento.setId(id);
            String tipo = frmPrincipal.jtableConsultaTXT.getValueAt(Fila, 1).toString();
            DecimalFormat decimalFormat = new DecimalFormat("#.000");

            if (tipo.equals("03")) {
                if (modcFraccion.buscar(modFraccion)) {
                    frmPrincipal.txtIDFraccion.setText(String.valueOf(modFraccion.getId()));
                    frmPrincipal.cmbTipoAgregarFraccion.setSelectedItem(modFraccion.getTipo());
                    frmPrincipal.txtFraccion.setText(modFraccion.getFraccion());
                    frmPrincipal.txtValor.setText("$" + decimalFormat.format(modFraccion.getValor()));
                    frmPrincipal.txtTipoMaterial.setText(modFraccion.getTipoMaterial());
                    frmPrincipal.cmbSeleccionarRegimenAgregarFraccion.setSelectedItem(modFraccion.getRegimen());
                    frmPrincipal.txtValidado.setText(modFraccion.getValidado());
                    frmPrincipal.cmbSeleccionarBimestreRegistro.setSelectedItem(modFraccion.getBimestre());
                    frmPrincipal.txtAño.setText(String.valueOf(modFraccion.getAño()));
                    frmPrincipal.txtNombreArchivo.setText(modFraccion.getNombreTXT());

                    frmPrincipal.pnlValidaciones.setVisible(false);
                    frmPrincipal.pnlRegistroTXT.setVisible(true);
                }
            } else {
                if (modcPedimento.buscar(modPedimento)) {
                    frmPrincipal.txtIDFraccion.setText(String.valueOf(modPedimento.getId()));
                    frmPrincipal.cmbTipoAgregarFraccion.setSelectedItem(modPedimento.getTipo());
                    frmPrincipal.txtFraccion.setText(modPedimento.getPatente());
                    frmPrincipal.txtValor.setText(modPedimento.getPedimento());
                    frmPrincipal.txtTipoMaterial.setText(modPedimento.getSeccion());
                    frmPrincipal.cmbSeleccionarRegimenAgregarFraccion.setSelectedItem(modPedimento.getRegimen());
                    frmPrincipal.txtValidado.setText(modPedimento.getValidado());
                    frmPrincipal.cmbSeleccionarBimestreRegistro.setSelectedItem(modFraccion.getBimestre());
                    frmPrincipal.txtAño.setText(String.valueOf(modPedimento.getAño()));
                    frmPrincipal.txtNombreArchivo.setText(modPedimento.getNombreTXT());

                    frmPrincipal.pnlValidaciones.setVisible(false);
                    frmPrincipal.pnlRegistroTXT.setVisible(true);
                }
            }
        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent arg0) {
        
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent arg0) {
        
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent arg0) {
        
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent arg0) {
        
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
    
    public void listarBimestre(){
        
        frmPrincipal.cmbSeleccionarBimestreValPed.removeAllItems();
        frmPrincipal.cmbSeleccionarBimestreValFracciones.removeAllItems();
        frmPrincipal.cmbSeleccionarBimestreConsultaTXT.removeAllItems();
        
        ArrayList<String> lista = modcFraccion.listarBimestre();
        
        
        for (int i = 0; i < lista.size(); i++) {
            frmPrincipal.cmbSeleccionarBimestreValPed.addItem(lista.get(i));
            frmPrincipal.cmbSeleccionarBimestreValFracciones.addItem(lista.get(i));
            frmPrincipal.cmbSeleccionarBimestreConsultaTXT.addItem(lista.get(i));
        }
    }
    
    public void listarRegimen(){
        
        frmPrincipal.cmbSeleccionarRegimenConsultaTXT.removeAllItems();
        
        ArrayList<String> lista = modcFraccion.listarRegimen();
        
        
        for (int i = 0; i < lista.size(); i++) {
            frmPrincipal.cmbSeleccionarRegimenConsultaTXT.addItem(lista.get(i));
        }
    }

}
