/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class PanelPrincipal extends javax.swing.JFrame {

    TableRowSorter trs;
    
    public PanelPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSubPrincipal = new javax.swing.JPanel();
        pnlContenido = new javax.swing.JPanel();
        pnlValidaciones = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnSeleccionarTXTInsertar = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        cmbSeleccionarAñoConsultarTXT = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cmbSeleccionarBimestreConsultaTXT = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cmbSeleccionarRegimenConsultaTXT = new javax.swing.JComboBox<>();
        btnExportarTXT = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtableConsultaTXT = new javax.swing.JTable();
        btnFiltrarTXT = new javax.swing.JButton();
        btnEliminarTXT = new javax.swing.JButton();
        btnLimpiarTXT = new javax.swing.JButton();
        btnLock = new javax.swing.JButton();
        btnNuevoRegistro = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableValidarFracciones = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        cmbSeleccionarBimestreValFracciones = new javax.swing.JComboBox<>();
        btnValidarFracciones = new javax.swing.JButton();
        cmbSeleccionarAñoValFraccion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbFiltrarValFraccionesAF = new javax.swing.JComboBox<>();
        cmbFiltrarValFracciones = new javax.swing.JComboBox<>();
        lblFiltrarValFraccion = new javax.swing.JLabel();
        lblFiltrarValFraccionAF = new javax.swing.JLabel();
        btnLimpiarValFracciones = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableValidarPedimentosTXT = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtableValidarPedimentosGlosa = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        cmbSeleccionarAñoValPedimentos = new javax.swing.JComboBox<>();
        cmbSeleccionarBimestreValPed = new javax.swing.JComboBox<>();
        btnValidarPedimentos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblFiltrarValPedimentoGlosa = new javax.swing.JLabel();
        cmbFiltroValPedimGlosa = new javax.swing.JComboBox<>();
        lblFiltrarValPedimentoTXT = new javax.swing.JLabel();
        cmbFiltroValPedimTXT = new javax.swing.JComboBox<>();
        btnLimpiarValPedimentos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnValidarSaldos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableSaldos = new javax.swing.JTable();
        cmbFiltrarSobredescargo = new javax.swing.JComboBox<>();
        lblFiltrarValSaldosSD = new javax.swing.JLabel();
        btnLimpiarSaldos = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtRTB2 = new javax.swing.JTextField();
        txtRTB3 = new javax.swing.JTextField();
        txtRTB4 = new javax.swing.JTextField();
        txtRTB1 = new javax.swing.JTextField();
        txtRTB5 = new javax.swing.JTextField();
        txtRTB6 = new javax.swing.JTextField();
        txtV5B1 = new javax.swing.JTextField();
        txtV5B2 = new javax.swing.JTextField();
        txtV5B3 = new javax.swing.JTextField();
        txtV5B4 = new javax.swing.JTextField();
        txtV5B5 = new javax.swing.JTextField();
        txtV5B6 = new javax.swing.JTextField();
        txtV1B1 = new javax.swing.JTextField();
        txtV1B2 = new javax.swing.JTextField();
        txtV1B5 = new javax.swing.JTextField();
        txtV1B6 = new javax.swing.JTextField();
        txtV1B3 = new javax.swing.JTextField();
        txtV1B4 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtRTB1TXT = new javax.swing.JTextField();
        txtV1B1TXT = new javax.swing.JTextField();
        txtV5B1TXT = new javax.swing.JTextField();
        txtRTB2TXT = new javax.swing.JTextField();
        txtV1B2TXT = new javax.swing.JTextField();
        txtV5B2TXT = new javax.swing.JTextField();
        txtRTB3TXT = new javax.swing.JTextField();
        txtV1B3TXT = new javax.swing.JTextField();
        txtV5B3TXT = new javax.swing.JTextField();
        txtRTB4TXT = new javax.swing.JTextField();
        txtV1B4TXT = new javax.swing.JTextField();
        txtV5B4TXT = new javax.swing.JTextField();
        txtRTB5TXT = new javax.swing.JTextField();
        txtV1B5TXT = new javax.swing.JTextField();
        txtV5B5TXT = new javax.swing.JTextField();
        txtRTB6TXT = new javax.swing.JTextField();
        txtV1B6TXT = new javax.swing.JTextField();
        txtV5B6TXT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        btnCalcularValorExpo = new javax.swing.JButton();
        cmbSeleccionarAñoValorExpo = new javax.swing.JComboBox<>();
        pnlRegistroTXT = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtIDFraccion = new javax.swing.JTextField();
        txtFraccion = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtTipoMaterial = new javax.swing.JTextField();
        txtNombreArchivo = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtValidado = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        cmbSeleccionarBimestreRegistro = new javax.swing.JComboBox<>();
        cmbTipoAgregarFraccion = new javax.swing.JComboBox<>();
        cmbSeleccionarRegimenAgregarFraccion = new javax.swing.JComboBox<>();
        btnGuardarRegistroTXT = new javax.swing.JButton();
        btnEliminarRegistroTxt = new javax.swing.JButton();
        btnCancelarRegistroTxt = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1025, 665));

        pnlSubPrincipal.setMinimumSize(new java.awt.Dimension(1010, 640));
        pnlSubPrincipal.setPreferredSize(new java.awt.Dimension(1010, 640));
        pnlSubPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenido.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenido.setMinimumSize(new java.awt.Dimension(1010, 640));
        pnlContenido.setPreferredSize(new java.awt.Dimension(1010, 640));
        pnlContenido.setLayout(new java.awt.CardLayout());

        pnlValidaciones.setMinimumSize(new java.awt.Dimension(955, 640));
        pnlValidaciones.setPreferredSize(new java.awt.Dimension(955, 640));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(955, 640));
        jPanel2.setPreferredSize(new java.awt.Dimension(955, 640));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(101, 178, 233));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SELECCIONAR ARCHIVO TXT A INSERTAR");
        jLabel2.setOpaque(true);

        btnSeleccionarTXTInsertar.setBackground(new java.awt.Color(0, 78, 151));
        btnSeleccionarTXTInsertar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        btnSeleccionarTXTInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarTXTInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/subir.png"))); // NOI18N
        btnSeleccionarTXTInsertar.setText("  SUBIR TXT");
        btnSeleccionarTXTInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionarTXTInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarTXTInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeleccionarTXTInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSeleccionarTXTInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setBackground(new java.awt.Color(101, 178, 233));
        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CONSULTAR TXT");
        jLabel20.setOpaque(true);

        cmbSeleccionarAñoConsultarTXT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021" }));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Seleccionar año:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Seleccionar bimestre:");

        cmbSeleccionarBimestreConsultaTXT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "41" }));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Seleccionar regimen:");

        cmbSeleccionarRegimenConsultaTXT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RT" }));

        btnExportarTXT.setBackground(new java.awt.Color(218, 217, 215));
        btnExportarTXT.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnExportarTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/txt.png"))); // NOI18N
        btnExportarTXT.setText("EXPORTAR");
        btnExportarTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportarTXT.setPreferredSize(new java.awt.Dimension(169, 30));

        jtableConsultaTXT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jtableConsultaTXT);

        btnFiltrarTXT.setBackground(new java.awt.Color(218, 217, 215));
        btnFiltrarTXT.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnFiltrarTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnFiltrarTXT.setText("   BUSCAR");
        btnFiltrarTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFiltrarTXT.setPreferredSize(new java.awt.Dimension(111, 30));

        btnEliminarTXT.setBackground(new java.awt.Color(218, 217, 215));
        btnEliminarTXT.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnEliminarTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        btnEliminarTXT.setText("ELIMINAR   ");
        btnEliminarTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarTXT.setPreferredSize(new java.awt.Dimension(149, 30));

        btnLimpiarTXT.setBackground(new java.awt.Color(218, 217, 215));
        btnLimpiarTXT.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnLimpiarTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        btnLimpiarTXT.setText("   LIMPIAR");
        btnLimpiarTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLock.setBackground(new java.awt.Color(240, 240, 241));
        btnLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock.png"))); // NOI18N
        btnLock.setToolTipText("Candadear");
        btnLock.setBorder(null);
        btnLock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLock.setOpaque(false);

        btnNuevoRegistro.setBackground(new java.awt.Color(218, 217, 215));
        btnNuevoRegistro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnNuevoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/newRecord.png"))); // NOI18N
        btnNuevoRegistro.setText("  NUEVO");
        btnNuevoRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoRegistro.setPreferredSize(new java.awt.Dimension(169, 30));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(cmbSeleccionarAñoConsultarTXT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSeleccionarBimestreConsultaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSeleccionarRegimenConsultaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFiltrarTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExportarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(btnLock, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnFiltrarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExportarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLimpiarTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel22))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmbSeleccionarAñoConsultarTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbSeleccionarBimestreConsultaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbSeleccionarRegimenConsultaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pnlValidaciones.addTab("Insertar TXT", jPanel2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(955, 640));
        jPanel6.setPreferredSize(new java.awt.Dimension(955, 640));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableValidarFracciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane3.setViewportView(jtableValidarFracciones);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 231, 921, 330));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbSeleccionarBimestreValFracciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnValidarFracciones.setBackground(new java.awt.Color(218, 217, 215));
        btnValidarFracciones.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnValidarFracciones.setText("Validar fracciones");
        btnValidarFracciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cmbSeleccionarAñoValFraccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("BIMESTRE:");

        jLabel8.setText("AÑO:");

        jLabel10.setBackground(new java.awt.Color(101, 178, 233));
        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SELECCIONAR BIMESTRE");
        jLabel10.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeleccionarAñoValFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeleccionarBimestreValFracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnValidarFracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSeleccionarAñoValFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeleccionarBimestreValFracciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnValidarFracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 11, -1, -1));

        cmbFiltrarValFraccionesAF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "No es fraccion AF", "Es fraccion AF", "Fraccion AF e IN", "Fraccion AF, IN y V1" }));
        cmbFiltrarValFraccionesAF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltrarValFraccionesAFItemStateChanged(evt);
            }
        });
        jPanel6.add(cmbFiltrarValFraccionesAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 198, 116, -1));

        cmbFiltrarValFracciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Fraccion nueva", "Fraccion antigua", "No encontrada" }));
        cmbFiltrarValFracciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltrarValFraccionesItemStateChanged(evt);
            }
        });
        jPanel6.add(cmbFiltrarValFracciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 198, 116, -1));

        lblFiltrarValFraccion.setText("Filtrar validacion fraccion");
        jPanel6.add(lblFiltrarValFraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 178, -1, -1));

        lblFiltrarValFraccionAF.setText("Filtrar validacion AF");
        jPanel6.add(lblFiltrarValFraccionAF, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 178, 113, -1));

        btnLimpiarValFracciones.setBackground(new java.awt.Color(218, 217, 215));
        btnLimpiarValFracciones.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnLimpiarValFracciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        btnLimpiarValFracciones.setText(" LIMPIAR");
        btnLimpiarValFracciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarValFracciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarValFraccionesActionPerformed(evt);
            }
        });
        jPanel6.add(btnLimpiarValFracciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 194, 128, -1));

        pnlValidaciones.addTab("Validacion fracciones", jPanel6);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(955, 640));
        jPanel5.setPreferredSize(new java.awt.Dimension(955, 640));

        jtableValidarPedimentosTXT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtableValidarPedimentosTXT);

        jtableValidarPedimentosGlosa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jtableValidarPedimentosGlosa);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbSeleccionarAñoValPedimentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbSeleccionarBimestreValPed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnValidarPedimentos.setBackground(new java.awt.Color(218, 217, 215));
        btnValidarPedimentos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnValidarPedimentos.setText("Validar pedimentos");
        btnValidarPedimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setBackground(new java.awt.Color(101, 178, 233));
        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SELECCIONAR BIMESTRE");
        jLabel3.setOpaque(true);

        jLabel4.setText("BIMESTRE:");

        jLabel5.setText("AÑO:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeleccionarAñoValPedimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeleccionarBimestreValPed, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnValidarPedimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSeleccionarAñoValPedimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeleccionarBimestreValPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnValidarPedimentos, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel6.setText("TXT VS GLOSA");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel7.setText("GLOSA VS TXT");

        lblFiltrarValPedimentoGlosa.setText("Filtrar");

        cmbFiltroValPedimGlosa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Encontrado", "No encontrado" }));
        cmbFiltroValPedimGlosa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltroValPedimGlosaItemStateChanged(evt);
            }
        });

        lblFiltrarValPedimentoTXT.setText("Filtrar");

        cmbFiltroValPedimTXT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Encontrado", "No encontrado" }));
        cmbFiltroValPedimTXT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltroValPedimTXTItemStateChanged(evt);
            }
        });

        btnLimpiarValPedimentos.setBackground(new java.awt.Color(218, 217, 215));
        btnLimpiarValPedimentos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnLimpiarValPedimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        btnLimpiarValPedimentos.setText("LIMPIAR");
        btnLimpiarValPedimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarValPedimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarValPedimentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarValPedimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(lblFiltrarValPedimentoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(450, 450, 450)
                        .addComponent(lblFiltrarValPedimentoGlosa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel6)
                        .addGap(155, 155, 155)
                        .addComponent(cmbFiltroValPedimTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel7)
                        .addGap(155, 155, 155)
                        .addComponent(cmbFiltroValPedimGlosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarValPedimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFiltrarValPedimentoTXT)
                    .addComponent(lblFiltrarValPedimentoGlosa))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbFiltroValPedimTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbFiltroValPedimGlosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlValidaciones.addTab("Validacion pedimentos", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(955, 640));
        jPanel3.setPreferredSize(new java.awt.Dimension(955, 640));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnValidarSaldos.setBackground(new java.awt.Color(218, 217, 215));
        btnValidarSaldos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        btnValidarSaldos.setText("VALIDAR SALDOS");
        btnValidarSaldos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btnValidarSaldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 203, 33));

        jtableSaldos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtableSaldos);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 147, 920, 410));

        cmbFiltrarSobredescargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "SI", "NO" }));
        cmbFiltrarSobredescargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltrarSobredescargoItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbFiltrarSobredescargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 141, -1));

        lblFiltrarValSaldosSD.setText("Filtrar sobredescargo");
        jPanel3.add(lblFiltrarValSaldosSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, -1));

        btnLimpiarSaldos.setBackground(new java.awt.Color(218, 217, 215));
        btnLimpiarSaldos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnLimpiarSaldos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        btnLimpiarSaldos.setText("LIMPIAR");
        btnLimpiarSaldos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSaldosActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiarSaldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 140, 30));

        pnlValidaciones.addTab("Validacion saldos", jPanel3);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setMinimumSize(new java.awt.Dimension(955, 640));
        jPanel9.setPreferredSize(new java.awt.Dimension(955, 640));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("B6");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 60, 50));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<html><center>EL VALOR DE LOS INSUMOS RETORNADOS REPRESENTA EL 60%</center><html>");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 300, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("BIMESTRE");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 110));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("B2");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 60, 50));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("B3");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 60, 50));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("B4");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 60, 50));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("B5");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 60, 50));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("B1");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 60, 50));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("GLOSA - VALOR MENSUAL EXPORTACION");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 300, 20));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("V1");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 100, 40));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("V5");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 100, 40));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("RT");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 100, 40));

        txtRTB2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 100, 50));

        txtRTB3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 100, 50));

        txtRTB4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 100, 50));

        txtRTB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 100, 50));

        txtRTB5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 100, 50));

        txtRTB6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 100, 50));

        txtV5B1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 100, 50));

        txtV5B2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 100, 50));

        txtV5B3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 100, 50));

        txtV5B4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 100, 50));

        txtV5B5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 100, 50));

        txtV5B6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 100, 50));

        txtV1B1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 100, 50));

        txtV1B2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 100, 50));

        txtV1B5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 100, 50));

        txtV1B6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 100, 50));

        txtV1B3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 100, 50));

        txtV1B4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, 50));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("VALOR COMERCIAL");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 300, 50));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("GLOSA - VALOR MENSUAL EXPORTACION");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 300, 20));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("RT");
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 100, 40));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("V1");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 100, 40));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("V5");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 100, 40));

        txtRTB1TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB1TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB1TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 100, 50));

        txtV1B1TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B1TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B1TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 100, 50));

        txtV5B1TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B1TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B1TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 100, 50));

        txtRTB2TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB2TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB2TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 100, 50));

        txtV1B2TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B2TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B2TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 100, 50));

        txtV5B2TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B2TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B2TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 100, 50));

        txtRTB3TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB3TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB3TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 100, 50));

        txtV1B3TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B3TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B3TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 100, 50));

        txtV5B3TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B3TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B3TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 100, 50));

        txtRTB4TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB4TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB4TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 100, 50));

        txtV1B4TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B4TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B4TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 100, 50));

        txtV5B4TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B4TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B4TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 100, 50));

        txtRTB5TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB5TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB5TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 100, 50));

        txtV1B5TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B5TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B5TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 100, 50));

        txtV5B5TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B5TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B5TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 100, 50));

        txtRTB6TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRTB6TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtRTB6TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 100, 50));

        txtV1B6TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV1B6TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV1B6TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 100, 50));

        txtV5B6TXT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtV5B6TXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(txtV5B6TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 100, 50));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("VALOR COMERCIAL");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 300, 50));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Valor Insumos");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 100, 50));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Valor Exportacion");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 100, 50));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("<html><center>% (Valor Expo Vs Valor Impo-Consumo)</center></html>");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 100, 50));

        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 100, 50));

        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 100, 50));

        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 100, 50));

        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 100, 50));

        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 100, 50));

        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 100, 50));

        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 210, 100, 50));

        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 100, 50));

        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 100, 50));

        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 100, 50));

        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 100, 50));

        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 100, 50));

        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 100, 50));

        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField56, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 100, 50));

        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField57, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 100, 50));

        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField58, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 100, 50));

        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField59, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 100, 50));

        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(jTextField60, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, 100, 50));

        btnCalcularValorExpo.setText("Calcular valor expo");

        cmbSeleccionarAñoValorExpo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2020", "2021", "2022" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(cmbSeleccionarAñoValorExpo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcularValorExpo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularValorExpo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeleccionarAñoValorExpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlValidaciones.addTab("Valor Exportacion", jPanel9);

        pnlContenido.add(pnlValidaciones, "card3");

        pnlRegistroTXT.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistroTXT.setMinimumSize(new java.awt.Dimension(1010, 640));
        pnlRegistroTXT.setPreferredSize(new java.awt.Dimension(1010, 640));
        pnlRegistroTXT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1010, 654));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel44.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel44.setText("Nombre archivo");

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel25.setText("Fraccion/Patente");

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel32.setText("Validado");

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel30.setText("Bimestre");

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel26.setText("Valor/Pedimento");

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel27.setText("Tipo material/Aduana");

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel29.setText("Año");

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel28.setText("Regimen");

        jLabel45.setBackground(new java.awt.Color(101, 178, 233));
        jLabel45.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("INFORMACION FRACCION");
        jLabel45.setOpaque(true);

        jLabel46.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel46.setText("Tipo");

        cmbSeleccionarBimestreRegistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selected", "37", "38", "39", "40", "41", "42" }));

        cmbTipoAgregarFraccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selected", "03", "04" }));

        cmbSeleccionarRegimenAgregarFraccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selected", "RT", "V1", "V5", "F5", "F4", "A3" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIDFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSeleccionarRegimenAgregarFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidado, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(cmbTipoAgregarFraccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFraccion, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeleccionarBimestreRegistro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreArchivo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel46))
                                    .addComponent(jLabel27))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTipoAgregarFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(6, 6, 6)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(txtValidado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(cmbSeleccionarBimestreRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(cmbSeleccionarRegimenAgregarFraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlRegistroTXT.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 930, 260));

        btnGuardarRegistroTXT.setBackground(new java.awt.Color(7, 48, 79));
        btnGuardarRegistroTXT.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        btnGuardarRegistroTXT.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarRegistroTXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btnGuardarRegistroTXT.setText(" GUARDAR");
        btnGuardarRegistroTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRegistroTXT.add(btnGuardarRegistroTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 151, 39));

        btnEliminarRegistroTxt.setBackground(new java.awt.Color(7, 48, 79));
        btnEliminarRegistroTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        btnEliminarRegistroTxt.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarRegistroTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete2.png"))); // NOI18N
        btnEliminarRegistroTxt.setText(" ELIMINAR");
        btnEliminarRegistroTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRegistroTXT.add(btnEliminarRegistroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 152, 39));

        btnCancelarRegistroTxt.setBackground(new java.awt.Color(7, 48, 79));
        btnCancelarRegistroTxt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 15)); // NOI18N
        btnCancelarRegistroTxt.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarRegistroTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        btnCancelarRegistroTxt.setText(" CANCELAR");
        btnCancelarRegistroTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRegistroTXT.add(btnCancelarRegistroTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 152, 39));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRegistroTXT.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 60));

        pnlContenido.add(pnlRegistroTXT, "card3");

        pnlSubPrincipal.add(pnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 31, -1, -1));

        jLabel24.setBackground(new java.awt.Color(0, 78, 151));
        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("ANEXO 31");
        jLabel24.setOpaque(true);
        pnlSubPrincipal.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSubPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSubPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFiltroValPedimGlosaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltroValPedimGlosaItemStateChanged
        String filter = cmbFiltroValPedimGlosa.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) jtableValidarPedimentosGlosa.getModel());
        jtableValidarPedimentosGlosa.setRowSorter(tr);
        if (!"Seleccionar".equals(filter)) {
            tr.setRowFilter(RowFilter.regexFilter(filter));
        }else{
            jtableValidarPedimentosGlosa.setRowSorter(tr);
        }
    }//GEN-LAST:event_cmbFiltroValPedimGlosaItemStateChanged

    private void cmbFiltroValPedimTXTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltroValPedimTXTItemStateChanged
        String filter = cmbFiltroValPedimTXT.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) jtableValidarPedimentosTXT.getModel());
        jtableValidarPedimentosTXT.setRowSorter(tr);
        if (!"Seleccionar".equals(filter)) {
            tr.setRowFilter(RowFilter.regexFilter(filter));
        }else{
            jtableValidarPedimentosTXT.setRowSorter(tr);
        }
    }//GEN-LAST:event_cmbFiltroValPedimTXTItemStateChanged

    private void cmbFiltrarValFraccionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltrarValFraccionesItemStateChanged
        String filter = cmbFiltrarValFracciones.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) jtableValidarFracciones.getModel());
        jtableValidarFracciones.setRowSorter(tr);
        if (!"Seleccionar".equals(filter)) {
            tr.setRowFilter(RowFilter.regexFilter(filter));
        }else{
            jtableValidarFracciones.setRowSorter(tr);
        }
    }//GEN-LAST:event_cmbFiltrarValFraccionesItemStateChanged

    private void cmbFiltrarValFraccionesAFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltrarValFraccionesAFItemStateChanged
        String filter = cmbFiltrarValFraccionesAF.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) jtableValidarFracciones.getModel());
        jtableValidarFracciones.setRowSorter(tr);
        if (!"Seleccionar".equals(filter)) {
            tr.setRowFilter(RowFilter.regexFilter(filter));
        }else{
            jtableValidarFracciones.setRowSorter(tr);
        }
    }//GEN-LAST:event_cmbFiltrarValFraccionesAFItemStateChanged

    private void cmbFiltrarSobredescargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltrarSobredescargoItemStateChanged
        String filter = cmbFiltrarSobredescargo.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) jtableSaldos.getModel());
        jtableSaldos.setRowSorter(tr);
        if (!"Seleccionar".equals(filter)) {
            tr.setRowFilter(RowFilter.regexFilter(filter));
        }else{
            jtableSaldos.setRowSorter(tr);
        }
    }//GEN-LAST:event_cmbFiltrarSobredescargoItemStateChanged

    private void btnSeleccionarTXTInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarTXTInsertarActionPerformed
        
    }//GEN-LAST:event_btnSeleccionarTXTInsertarActionPerformed

    private void btnLimpiarValFraccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarValFraccionesActionPerformed
        cmbFiltrarValFracciones.setSelectedItem("Seleccionar");
        cmbFiltrarValFraccionesAF.setSelectedItem("Seleccionar");
        DefaultTableModel tb = (DefaultTableModel) jtableValidarFracciones.getModel();
        tb.setRowCount(0);
        cmbSeleccionarAñoValFraccion.setSelectedItem("Seleccionar");
        cmbSeleccionarBimestreValFracciones.setSelectedItem("Seleccionar");
        cmbFiltrarValFracciones.setVisible(false);
        cmbFiltrarValFraccionesAF.setVisible(false);
        lblFiltrarValFraccion.setVisible(false);
        lblFiltrarValFraccionAF.setVisible(false);
        btnLimpiarValFracciones.setEnabled(false);
        btnValidarFracciones.setEnabled(true);
        cmbSeleccionarAñoValFraccion.setEnabled(true);
        cmbSeleccionarBimestreValFracciones.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarValFraccionesActionPerformed

    private void btnLimpiarValPedimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarValPedimentosActionPerformed

        cmbFiltroValPedimTXT.setSelectedItem("Seleccionar");
        cmbFiltroValPedimGlosa.setSelectedItem("Seleccionar");
        DefaultTableModel tbG = (DefaultTableModel) jtableValidarPedimentosGlosa.getModel();
        tbG.setRowCount(0);
        DefaultTableModel tbT = (DefaultTableModel) jtableValidarPedimentosTXT.getModel();
        tbT.setRowCount(0);
        cmbSeleccionarAñoValPedimentos.setSelectedItem("Seleccionar");
        cmbSeleccionarBimestreValPed.setSelectedItem("Seleccionar");
        cmbFiltroValPedimTXT.setVisible(false);
        cmbFiltroValPedimGlosa.setVisible(false);
        lblFiltrarValPedimentoTXT.setVisible(false);
        lblFiltrarValPedimentoGlosa.setVisible(false);
        btnLimpiarValPedimentos.setEnabled(false);
        btnLimpiarSaldos.setEnabled(false);
        cmbSeleccionarAñoValPedimentos.setEnabled(true);
        cmbSeleccionarBimestreValPed.setEnabled(true);
        btnValidarPedimentos.setEnabled(true);
        
    }//GEN-LAST:event_btnLimpiarValPedimentosActionPerformed

    private void btnLimpiarSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSaldosActionPerformed
        DefaultTableModel tb = (DefaultTableModel) jtableSaldos.getModel();
        tb.setRowCount(0);
        cmbFiltrarSobredescargo.setSelectedItem("Seleccionar");
        cmbFiltrarSobredescargo.setVisible(false);
        lblFiltrarValSaldosSD.setVisible(false);
        btnValidarSaldos.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarSaldosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBack;
    public javax.swing.JButton btnCalcularValorExpo;
    public javax.swing.JButton btnCancelarRegistroTxt;
    public javax.swing.JButton btnEliminarRegistroTxt;
    public javax.swing.JButton btnEliminarTXT;
    public javax.swing.JButton btnExportarTXT;
    public javax.swing.JButton btnFiltrarTXT;
    public javax.swing.JButton btnGuardarRegistroTXT;
    public javax.swing.JButton btnLimpiarSaldos;
    public javax.swing.JButton btnLimpiarTXT;
    public javax.swing.JButton btnLimpiarValFracciones;
    public javax.swing.JButton btnLimpiarValPedimentos;
    public javax.swing.JButton btnLock;
    public javax.swing.JButton btnNuevoRegistro;
    public javax.swing.JButton btnSeleccionarTXTInsertar;
    public javax.swing.JButton btnValidarFracciones;
    public javax.swing.JButton btnValidarPedimentos;
    public javax.swing.JButton btnValidarSaldos;
    public javax.swing.JComboBox<String> cmbFiltrarSobredescargo;
    public javax.swing.JComboBox<String> cmbFiltrarValFracciones;
    public javax.swing.JComboBox<String> cmbFiltrarValFraccionesAF;
    public javax.swing.JComboBox<String> cmbFiltroValPedimGlosa;
    public javax.swing.JComboBox<String> cmbFiltroValPedimTXT;
    public javax.swing.JComboBox<String> cmbSeleccionarAñoConsultarTXT;
    public javax.swing.JComboBox<String> cmbSeleccionarAñoValFraccion;
    public javax.swing.JComboBox<String> cmbSeleccionarAñoValPedimentos;
    public javax.swing.JComboBox<String> cmbSeleccionarAñoValorExpo;
    public javax.swing.JComboBox<String> cmbSeleccionarBimestreConsultaTXT;
    public javax.swing.JComboBox<String> cmbSeleccionarBimestreRegistro;
    public javax.swing.JComboBox<String> cmbSeleccionarBimestreValFracciones;
    public javax.swing.JComboBox<String> cmbSeleccionarBimestreValPed;
    public javax.swing.JComboBox<String> cmbSeleccionarRegimenAgregarFraccion;
    public javax.swing.JComboBox<String> cmbSeleccionarRegimenConsultaTXT;
    public javax.swing.JComboBox<String> cmbTipoAgregarFraccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField60;
    public javax.swing.JTable jtableConsultaTXT;
    public javax.swing.JTable jtableSaldos;
    public javax.swing.JTable jtableValidarFracciones;
    public javax.swing.JTable jtableValidarPedimentosGlosa;
    public javax.swing.JTable jtableValidarPedimentosTXT;
    public javax.swing.JLabel lblFiltrarValFraccion;
    public javax.swing.JLabel lblFiltrarValFraccionAF;
    public javax.swing.JLabel lblFiltrarValPedimentoGlosa;
    public javax.swing.JLabel lblFiltrarValPedimentoTXT;
    public javax.swing.JLabel lblFiltrarValSaldosSD;
    private javax.swing.JPanel pnlContenido;
    public javax.swing.JPanel pnlRegistroTXT;
    private javax.swing.JPanel pnlSubPrincipal;
    public javax.swing.JTabbedPane pnlValidaciones;
    public javax.swing.JTextField txtAño;
    public javax.swing.JTextField txtFraccion;
    public javax.swing.JTextField txtIDFraccion;
    public javax.swing.JTextField txtNombreArchivo;
    public javax.swing.JTextField txtRTB1;
    public javax.swing.JTextField txtRTB1TXT;
    public javax.swing.JTextField txtRTB2;
    public javax.swing.JTextField txtRTB2TXT;
    public javax.swing.JTextField txtRTB3;
    public javax.swing.JTextField txtRTB3TXT;
    public javax.swing.JTextField txtRTB4;
    public javax.swing.JTextField txtRTB4TXT;
    public javax.swing.JTextField txtRTB5;
    public javax.swing.JTextField txtRTB5TXT;
    public javax.swing.JTextField txtRTB6;
    public javax.swing.JTextField txtRTB6TXT;
    public javax.swing.JTextField txtTipoMaterial;
    public javax.swing.JTextField txtV1B1;
    public javax.swing.JTextField txtV1B1TXT;
    public javax.swing.JTextField txtV1B2;
    public javax.swing.JTextField txtV1B2TXT;
    public javax.swing.JTextField txtV1B3;
    public javax.swing.JTextField txtV1B3TXT;
    public javax.swing.JTextField txtV1B4;
    public javax.swing.JTextField txtV1B4TXT;
    public javax.swing.JTextField txtV1B5;
    public javax.swing.JTextField txtV1B5TXT;
    public javax.swing.JTextField txtV1B6;
    public javax.swing.JTextField txtV1B6TXT;
    public javax.swing.JTextField txtV5B1;
    public javax.swing.JTextField txtV5B1TXT;
    public javax.swing.JTextField txtV5B2;
    public javax.swing.JTextField txtV5B2TXT;
    public javax.swing.JTextField txtV5B3;
    public javax.swing.JTextField txtV5B3TXT;
    public javax.swing.JTextField txtV5B4;
    public javax.swing.JTextField txtV5B4TXT;
    public javax.swing.JTextField txtV5B5;
    public javax.swing.JTextField txtV5B5TXT;
    public javax.swing.JTextField txtV5B6;
    public javax.swing.JTextField txtV5B6TXT;
    public javax.swing.JTextField txtValidado;
    public javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
