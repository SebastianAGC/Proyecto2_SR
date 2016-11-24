
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class GUI_Test_de_Personalidad extends javax.swing.JFrame {
    Cliente elclient;
    double presupuesto=0;
    DataBase graphdb= new DataBase();

    /**
     * Creates new form GUI_Test_de_Personalidad
     */
    public GUI_Test_de_Personalidad() {
        initComponents();
        jTabbedPane2.setSelectedIndex(0);
        graphdb.createGrafoPCArmadas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pregunta1 = new javax.swing.ButtonGroup();
        pregunta2 = new javax.swing.ButtonGroup();
        pregunta3 = new javax.swing.ButtonGroup();
        pregunta4 = new javax.swing.ButtonGroup();
        pregunta5 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panel_pregunta1 = new javax.swing.JPanel();
        rbnSI_pregunta1 = new javax.swing.JRadioButton();
        rbnNO_pregunta1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        panel_pregunta2 = new javax.swing.JPanel();
        rbnOP1_pregunta2 = new javax.swing.JRadioButton();
        rbnOP2_pregunta2 = new javax.swing.JRadioButton();
        rbnOP3_pregunta2 = new javax.swing.JRadioButton();
        rbnOP4_pregunta2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        panel_pregunta3 = new javax.swing.JPanel();
        rbnSI_pregunta3 = new javax.swing.JRadioButton();
        rbnNO_pregunta3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        panel_pregunta4 = new javax.swing.JPanel();
        rbnSI_pregunta4 = new javax.swing.JRadioButton();
        rbnNO_pregunta4 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        panel_pregunta5 = new javax.swing.JPanel();
        rbnSI_pregunta5 = new javax.swing.JRadioButton();
        rbnNO_pregunta5 = new javax.swing.JRadioButton();
        jContinuar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPresupuesto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("¡ESPERA!");

        jLabel2.setText("Antes de continuar con el programa necesitamos conocerte un poco mas");

        jLabel3.setText("para poder darte las recomendaciones más exactas posibles.");

        jLabel4.setText("¿Sueles viajar frecuentemente?");

        pregunta1.add(rbnSI_pregunta1);
        rbnSI_pregunta1.setSelected(true);
        rbnSI_pregunta1.setText("SI");

        pregunta1.add(rbnNO_pregunta1);
        rbnNO_pregunta1.setText("NO");

        javax.swing.GroupLayout panel_pregunta1Layout = new javax.swing.GroupLayout(panel_pregunta1);
        panel_pregunta1.setLayout(panel_pregunta1Layout);
        panel_pregunta1Layout.setHorizontalGroup(
            panel_pregunta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pregunta1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rbnSI_pregunta1)
                .addGap(18, 18, 18)
                .addComponent(rbnNO_pregunta1)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        panel_pregunta1Layout.setVerticalGroup(
            panel_pregunta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pregunta1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_pregunta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnSI_pregunta1)
                    .addComponent(rbnNO_pregunta1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("¿Que prefieres hacer con tu tiempo?");

        pregunta2.add(rbnOP1_pregunta2);
        rbnOP1_pregunta2.setSelected(true);
        rbnOP1_pregunta2.setText("Jugar videojuegos");

        pregunta2.add(rbnOP2_pregunta2);
        rbnOP2_pregunta2.setText("Ver películas y fotos");

        pregunta2.add(rbnOP3_pregunta2);
        rbnOP3_pregunta2.setText("Salir con amigos");

        pregunta2.add(rbnOP4_pregunta2);
        rbnOP4_pregunta2.setText("Terminar tareas/trabajos");

        javax.swing.GroupLayout panel_pregunta2Layout = new javax.swing.GroupLayout(panel_pregunta2);
        panel_pregunta2.setLayout(panel_pregunta2Layout);
        panel_pregunta2Layout.setHorizontalGroup(
            panel_pregunta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pregunta2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel_pregunta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnOP4_pregunta2)
                    .addComponent(rbnOP3_pregunta2)
                    .addComponent(rbnOP2_pregunta2)
                    .addComponent(rbnOP1_pregunta2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_pregunta2Layout.setVerticalGroup(
            panel_pregunta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pregunta2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbnOP1_pregunta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnOP2_pregunta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnOP3_pregunta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbnOP4_pregunta2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("¿Juzgas un libro por su portada?");

        pregunta3.add(rbnSI_pregunta3);
        rbnSI_pregunta3.setSelected(true);
        rbnSI_pregunta3.setText("SI");

        pregunta3.add(rbnNO_pregunta3);
        rbnNO_pregunta3.setText("NO");

        javax.swing.GroupLayout panel_pregunta3Layout = new javax.swing.GroupLayout(panel_pregunta3);
        panel_pregunta3.setLayout(panel_pregunta3Layout);
        panel_pregunta3Layout.setHorizontalGroup(
            panel_pregunta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pregunta3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(rbnSI_pregunta3)
                .addGap(18, 18, 18)
                .addComponent(rbnNO_pregunta3)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panel_pregunta3Layout.setVerticalGroup(
            panel_pregunta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pregunta3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_pregunta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnSI_pregunta3)
                    .addComponent(rbnNO_pregunta3)))
        );

        jLabel7.setText("¿Estás de acuerdo con la frase: \"Mas vale lo viejo conocido que lo nuevo por conocer\"?");

        pregunta4.add(rbnSI_pregunta4);
        rbnSI_pregunta4.setSelected(true);
        rbnSI_pregunta4.setText("SI");

        pregunta4.add(rbnNO_pregunta4);
        rbnNO_pregunta4.setText("NO");

        javax.swing.GroupLayout panel_pregunta4Layout = new javax.swing.GroupLayout(panel_pregunta4);
        panel_pregunta4.setLayout(panel_pregunta4Layout);
        panel_pregunta4Layout.setHorizontalGroup(
            panel_pregunta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pregunta4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rbnSI_pregunta4)
                .addGap(18, 18, 18)
                .addComponent(rbnNO_pregunta4)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panel_pregunta4Layout.setVerticalGroup(
            panel_pregunta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pregunta4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_pregunta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnSI_pregunta4)
                    .addComponent(rbnNO_pregunta4)))
        );

        jLabel8.setText("¿Confías en las compras en línea?");

        pregunta5.add(rbnSI_pregunta5);
        rbnSI_pregunta5.setSelected(true);
        rbnSI_pregunta5.setText("SI");

        pregunta5.add(rbnNO_pregunta5);
        rbnNO_pregunta5.setText("NO");

        javax.swing.GroupLayout panel_pregunta5Layout = new javax.swing.GroupLayout(panel_pregunta5);
        panel_pregunta5.setLayout(panel_pregunta5Layout);
        panel_pregunta5Layout.setHorizontalGroup(
            panel_pregunta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pregunta5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rbnSI_pregunta5)
                .addGap(18, 18, 18)
                .addComponent(rbnNO_pregunta5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_pregunta5Layout.setVerticalGroup(
            panel_pregunta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pregunta5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_pregunta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnSI_pregunta5)
                    .addComponent(rbnNO_pregunta5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jContinuar.setText("Continuar");
        jContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(panel_pregunta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel_pregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(114, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(panel_pregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(panel_pregunta5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel_pregunta4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jContinuar)
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_pregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_pregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_pregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_pregunta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_pregunta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jContinuar)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Preguntas", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPresupuestoActionPerformed(evt);
            }
        });

        jLabel9.setText("Ingresa tu presupuesto maximo en USD");

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel9)
                        .addGap(43, 43, 43)
                        .addComponent(jPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(462, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Presupuesto", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Precio ($)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Recomendaciones", jPanel4);

        jTabbedPane2.setSelectedIndex(2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPresupuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPresupuestoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        presupuesto = Double.parseDouble(jPresupuesto.getText());
        jTable1.removeAll();
        jTabbedPane2.setSelectedIndex(2);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object rowData[] = new Object[3];
        String opcion1 = "";
        int pesoMax = 0;
        String apple = String.format("\"%s\"", "Apple");
        String HP = String.format("\"%s\"", "HP");
        String razer = String.format("\"%s\"", "Razer");
        String msi = String.format("\"%s\"", "MSI");
        String dell = String.format("\"%s\"", "Dell");
        String lenovo = String.format("\"%s\"", "Lenovo");
        String asus = String.format("\"%s\"", "Asus");
        String acer = String.format("\"%s\"", "Acer");
        String usoL = String.format("\"%s\"", elclient.getActividades());
        try {
            //la siguiente linea se debe modificar con el user y el password de neo4j
                    Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost/?user=neo4j,password=123,debug=true,noSsl,flatten=[-1,100,1000]"); 
                    try (Statement stmt = con.createStatement()) {
                        if (elclient.isViaja()){
                            pesoMax = 6;
                        } else {
                            pesoMax = 100;
                        }
                        if (elclient.isApariencia()){
                            if (!elclient.isExperiencia()){
                             ResultSet rs = stmt.executeQuery("match (n:Laptop)\n" +
                            "where n.precio < "+presupuesto +" AND n.peso < " +pesoMax +" AND n.uso = "+usoL+ " AND (n.marca = "+apple+" OR n.marca = "+HP +" OR n.marca = "+razer+" OR n.marca =" +msi+") \n" +
                            "return n.nombre AS nombre, n.marca AS marca, n.precio AS precio");
                             while (rs.next()){
                                opcion1 = opcion1 + "\n" +rs.getString("marca") +" " +rs.getString("nombre");
                                rowData[0] = rs.getString("marca");
                                rowData[1] = rs.getString("nombre");
                                rowData[2] = ""+rs.getString("precio");
                                model.addRow(rowData);
                                } //else {   opcion1 = "No hay laptops con esas especificaciones";
                            } else {
                                ResultSet rs = stmt.executeQuery("match (n:Laptop)\n" +
                            "where n.precio < "+presupuesto +" AND n.peso < " +pesoMax +" AND n.uso = "+usoL+ " AND (n.marca = "+apple+" OR n.marca = "+HP +" OR n.marca =" +msi+" OR n.marca = "+lenovo+") \n" +
                            "return n.nombre AS nombre, n.marca AS marca, n.precio AS precio");
                             while (rs.next()){
                                opcion1 = opcion1 + "\n" +rs.getString("marca") +" " +rs.getString("nombre");
                                rowData[0] = rs.getString("marca");
                                rowData[1] = rs.getString("nombre");
                                rowData[2] = ""+rs.getString("precio");
                                model.addRow(rowData);
                                }
                            }
                            if (!elclient.isCompras_online()){
                            ResultSet rs = stmt.executeQuery("match (n:Laptop)\n" +
                            "where n.precio < "+presupuesto +" AND n.peso < " +pesoMax +" AND n.uso = "+usoL+ " AND (n.marca = " + HP +" OR n.marca = " + apple + ")\n" +
                            "return n.nombre AS nombre, n.marca AS marca, n.precio AS precio");
                             while (rs.next()){
                                opcion1 = opcion1 + "\n" +rs.getString("marca") +" " +rs.getString("nombre");
                                rowData[0] = rs.getString("marca");
                                rowData[1] = rs.getString("nombre");
                                rowData[2] = ""+rs.getString("precio");
                                model.addRow(rowData);
                                }
                        }
                        }
                        if (!elclient.isApariencia()){
                            if (!elclient.isCompras_online()){
                            ResultSet rs = stmt.executeQuery("match (n:Laptop)\n" +
                            "where n.precio < "+presupuesto +" AND n.peso < " +pesoMax +" AND n.uso = "+usoL+ " AND (n.marca = " + HP +" OR n.marca = " + acer +""
                                    + "OR n.marca = " + dell +" OR n.marca = " + apple + ")\n" +    
                            "return n.nombre AS nombre, n.marca AS marca, n.precio AS precio");
                             while (rs.next()){
                                opcion1 = opcion1 + "\n" +rs.getString("marca") +" " +rs.getString("nombre");
                                rowData[0] = rs.getString("marca");
                                rowData[1] = rs.getString("nombre");
                                rowData[2] = ""+rs.getString("precio");
                                model.addRow(rowData);
                                }
                        } else {
                            ResultSet rs = stmt.executeQuery("match (n:Laptop)\n" +
                            "where n.precio < "+presupuesto +" AND n.peso < " +pesoMax +" AND n.uso = "+usoL+ " \n" +
                            "return n.nombre AS nombre, n.marca AS marca, n.precio AS precio");
                             while (rs.next()){
                                opcion1 = opcion1 + "\n" +rs.getString("marca") +" " +rs.getString("nombre") + rs.getString("precio");
                                rowData[0] = rs.getString("marca");
                                rowData[1] = rs.getString("nombre");
                                rowData[2] = ""+rs.getString("precio");
                                model.addRow(rowData);
                                }
                            }
                        }
                        
                        /*
                        if (elclient.isViaja() && elclient.isApariencia() && elclient.getActividades().equals("design") && 
                                elclient.isExperiencia() && elclient.isCompras_online()){
                            String brand = String.format("\"%s\"", "Apple");
                             ResultSet rs = stmt.executeQuery("match (n:Laptop {marca: "+brand+"})\n" +
                            "where n.precio < "+presupuesto +" AND n.peso <6 \n" +
                            "return n.nombre AS nombre, n.marca AS marca, n.precio AS precio");
                             while (rs.next()){
                                opcion1 = opcion1 + "\n" +rs.getString("marca") +" " +rs.getString("nombre");
                                } //else {   opcion1 = "No hay laptops con esas especificaciones";
                        }
                        */
                        
                    }
                    con.close();
                }catch (Exception ex){
                    
                    }
        //jTextArea1.setText(opcion1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContinuarActionPerformed
        // TODO add your handling code here:
        String uso = "";
        if (rbnOP1_pregunta2.isSelected()){
            uso = "gaming";
        } else {
            if (rbnOP2_pregunta2.isSelected()){
                uso = "diseno";
            }
            else {
                if (rbnOP3_pregunta2.isSelected() || rbnOP4_pregunta2.isSelected()){
                    uso = "regular";
                }
            }
        }
        elclient = new Cliente(rbnSI_pregunta1.isSelected(), rbnSI_pregunta3.isSelected(), rbnSI_pregunta5.isSelected(), uso, rbnSI_pregunta4.isSelected());
        try {
            //la siguiente linea se debe modificar con el user y el password de neo4j
                    Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost/?user=neo4j,password=123,debug=true,noSsl,flatten=[-1,100,1000]"); 
                    try (Statement stmt = con.createStatement()) {
                        String usoL = String.format("\"%s\"", elclient.getActividades());
                        String id = String.format("\"%s\"", "Cliente");
                        stmt.executeQuery("CREATE (n: Usuario {name: "+id+"})");
                        stmt.executeQuery("match (n: Usuario)"
                                            + "match (m: activity {name: "+usoL+"})"
                                + "create (n)-[:LIKES]->(m)");
                    }
                    con.close();
                }catch (Exception ex){
                    ex.printStackTrace();
                    }
        jTabbedPane2.setSelectedIndex(1);
        
    }//GEN-LAST:event_jContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Test_de_Personalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Test_de_Personalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Test_de_Personalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Test_de_Personalidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Test_de_Personalidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jPresupuesto;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel_pregunta1;
    private javax.swing.JPanel panel_pregunta2;
    private javax.swing.JPanel panel_pregunta3;
    private javax.swing.JPanel panel_pregunta4;
    private javax.swing.JPanel panel_pregunta5;
    private javax.swing.ButtonGroup pregunta1;
    private javax.swing.ButtonGroup pregunta2;
    private javax.swing.ButtonGroup pregunta3;
    private javax.swing.ButtonGroup pregunta4;
    private javax.swing.ButtonGroup pregunta5;
    private javax.swing.JRadioButton rbnNO_pregunta1;
    private javax.swing.JRadioButton rbnNO_pregunta3;
    private javax.swing.JRadioButton rbnNO_pregunta4;
    private javax.swing.JRadioButton rbnNO_pregunta5;
    private javax.swing.JRadioButton rbnOP1_pregunta2;
    private javax.swing.JRadioButton rbnOP2_pregunta2;
    private javax.swing.JRadioButton rbnOP3_pregunta2;
    private javax.swing.JRadioButton rbnOP4_pregunta2;
    private javax.swing.JRadioButton rbnSI_pregunta1;
    private javax.swing.JRadioButton rbnSI_pregunta3;
    private javax.swing.JRadioButton rbnSI_pregunta4;
    private javax.swing.JRadioButton rbnSI_pregunta5;
    // End of variables declaration//GEN-END:variables
}
