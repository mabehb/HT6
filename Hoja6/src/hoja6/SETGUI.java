/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

/**
 *
 * @author Ma. Belen
 */
public class SETGUI extends javax.swing.JPanel {

    /**
     * Creates new form SETGUI
     */
    public SETGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    Factory factory = new Factory();
    AbstractSet desarrolladores = null;
    int eleccion;
    int conjunto1;
    int conjunto2;
    int conjunto3;
    String nombre;
    int java;
    int web;
    int celulares;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hashSetRB = new javax.swing.JRadioButton();
        linkedHashSetRB = new javax.swing.JRadioButton();
        treeSetRB = new javax.swing.JRadioButton();
        botonContinuar = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        javaCB = new javax.swing.JCheckBox();
        webCB = new javax.swing.JCheckBox();
        celCB = new javax.swing.JCheckBox();
        botonRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grandeTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        wcnojTA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jwcTA = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jnowTA = new javax.swing.JTextArea();
        grandeLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        wocnojTA = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel2FocusGained(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setText("Desarrolladores");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, -1, -1));

        jLabel2.setText("Seleccione la implementación deseada:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 91, -1, -1));

        buttonGroup2.add(hashSetRB);
        hashSetRB.setText("HashSet");
        hashSetRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashSetRBActionPerformed(evt);
            }
        });
        jPanel2.add(hashSetRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 129, -1, -1));

        buttonGroup2.add(linkedHashSetRB);
        linkedHashSetRB.setText("LinkedHashSet");
        linkedHashSetRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkedHashSetRBActionPerformed(evt);
            }
        });
        jPanel2.add(linkedHashSetRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 166, -1, -1));

        buttonGroup2.add(treeSetRB);
        treeSetRB.setText("TreeSet");
        treeSetRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treeSetRBActionPerformed(evt);
            }
        });
        jPanel2.add(treeSetRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 203, -1, -1));

        botonContinuar.setText("Continuar");
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });
        jPanel2.add(botonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jInternalFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 350, 310));

        add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 500, 400));

        jInternalFrame2.setVisible(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Ingrese el nombre del desarrollador:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 92, -1, -1));

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 121, 313, -1));

        jLabel5.setText("Ambientes en los que ha desarrollado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 156, -1, -1));

        javaCB.setText("Java");
        jPanel1.add(javaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 181, -1, -1));

        webCB.setText("Web");
        jPanel1.add(webCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 218, -1, -1));

        celCB.setText("Celulares");
        jPanel1.add(celCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 259, -1, -1));

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 110, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 12, 321, 17));

        jButton1.setText("Resultados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel9.setText("Desarrolladores");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 38, -1, -1));

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        add(jInternalFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 390, 360));

        grandeTA.setColumns(20);
        grandeTA.setRows(5);
        jScrollPane1.setViewportView(grandeTA);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, -1, 610));

        wcnojTA.setColumns(20);
        wcnojTA.setRows(5);
        jScrollPane2.setViewportView(wcnojTA);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, 610));

        jwcTA.setColumns(20);
        jwcTA.setRows(5);
        jScrollPane3.setViewportView(jwcTA);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 610));

        jnowTA.setColumns(20);
        jnowTA.setRows(5);
        jScrollPane4.setViewportView(jnowTA);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 610));

        grandeLabel.setText("grupo más grande");
        add(grandeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, -1, -1));

        jLabel8.setText("Java, Web y Celulares ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel3.setText("Desarrolladores con Experiencia en:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel10.setText("Java pero no Web");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel11.setText("Web y Celulares. No Java");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        wocnojTA.setColumns(20);
        wocnojTA.setRows(5);
        jScrollPane6.setViewportView(wocnojTA);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, 610));

        jLabel12.setText("Web o Celulares. No Java");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Grupo más Grande:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 980, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 2, 40, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void hashSetRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashSetRBActionPerformed
        // TODO add your handling code here
        eleccion=1;
        System.out.println(eleccion);
    }//GEN-LAST:event_hashSetRBActionPerformed

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        // TODO add your handling code here:
        desarrolladores=factory.implementacion(eleccion);
        jInternalFrame1.dispose();
        System.out.println("usando implementacion " +eleccion);
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void linkedHashSetRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkedHashSetRBActionPerformed
        // TODO add your handling code here:
        eleccion=2;
        System.out.println(eleccion);
    }//GEN-LAST:event_linkedHashSetRBActionPerformed

    private void treeSetRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treeSetRBActionPerformed
        // TODO add your handling code here:
        eleccion=3;
        System.out.println(eleccion);
    }//GEN-LAST:event_treeSetRBActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        // TODO add your handling code here:
        if (javaCB.isSelected()){
            conjunto1=1;
        }
        if (webCB.isSelected()){
            conjunto2=1;
        }
        if (celCB.isSelected()){
            conjunto3=1;
        }
        System.out.println(jTextField1.getText());
        System.out.println(conjunto1+" "+conjunto2+" "+conjunto3);
        Desarrollador desarrollador= new Desarrollador (jTextField1.getText(), conjunto1, conjunto2, conjunto3);
        desarrolladores.add(desarrollador);
        conjunto1=0;
        conjunto2=0;
        conjunto3=0;
        javaCB.setSelected(false);
        webCB.setSelected(false);
        celCB.setSelected(false);
        jTextField1.setText("");
        jLabel6.setText("El desarrollador ha sido registrado");
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        jLabel6.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jPanel2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusGained
        // TODO add your handling code here:
        jPanel1.setEnabled(false);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jPanel2FocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Iterator<Desarrollador> itr= desarrolladores.iterator();
        jInternalFrame2.dispose();
         while (itr.hasNext()){
            nombre= itr.next().getNombre();
            System.out.println(nombre);
            jwcTA.append(nombre+"\n");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox celCB;
    private javax.swing.JLabel grandeLabel;
    private javax.swing.JTextArea grandeTA;
    private javax.swing.JRadioButton hashSetRB;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox javaCB;
    private javax.swing.JTextArea jnowTA;
    private javax.swing.JTextArea jwcTA;
    private javax.swing.JRadioButton linkedHashSetRB;
    private javax.swing.JRadioButton treeSetRB;
    private javax.swing.JTextArea wcnojTA;
    private javax.swing.JCheckBox webCB;
    private javax.swing.JTextArea wocnojTA;
    // End of variables declaration//GEN-END:variables

}

