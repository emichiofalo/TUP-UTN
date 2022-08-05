/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sky.pi.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author SkylakeFrost
 */
public class Menu extends javax.swing.JFrame {

    public JLabel getLblMainTitle() {
        return lblMainTitle;
    }

    public void setLblMainTitle(JLabel lblMainTitle) {
        this.lblMainTitle = lblMainTitle;
    }

    public JButton getBtnListaProfesores() {
        return btnListaProfesores;
    }

    public void setBtnListaProfesores(JButton btnListaProfesores) {
        this.btnListaProfesores = btnListaProfesores;
    }

    public JButton getBtnListaAlumnos() {
        return btnListaAlumnos;
    }

    public void setBtnListaAlumnos(JButton btnListaAlumnos) {
        this.btnListaAlumnos = btnListaAlumnos;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JButton getBtnListaCarreras() {
        return btnListaCarreras;
    }

    public void setBtnListaCarreras(JButton btnListaCarreras) {
        this.btnListaCarreras = btnListaCarreras;
    }

    public JButton getBtnCursados() {
        return btnCursados;
    }

    public void setBtnCursados(JButton btnCursados) {
        this.btnCursados = btnCursados;
    }

    public JButton getBtnInscripciones() {
        return btnInscripciones;
    }

    public void setBtnInscripciones(JButton btnInscripciones) {
        this.btnInscripciones = btnInscripciones;
    }

    public JButton getBtnMaterias() {
        return btnMaterias;
    }

    public void setBtnMaterias(JButton btnMaterias) {
        this.btnMaterias = btnMaterias;
    }

    public JLabel getSelectAlumnos() {
        return selectAlumnos;
    }

    public void setSelectAlumnos(JLabel selectAlumnos) {
        this.selectAlumnos = selectAlumnos;
    }

    public JLabel getSelectCarrera() {
        return selectCarrera;
    }

    public void setSelectCarrera(JLabel selectCarrera) {
        this.selectCarrera = selectCarrera;
    }

    public JLabel getSelectCursado() {
        return selectCursado;
    }

    public void setSelectCursado(JLabel selectCursado) {
        this.selectCursado = selectCursado;
    }

    public JLabel getSelectInsc() {
        return selectInsc;
    }

    public void setSelectInsc(JLabel selectInsc) {
        this.selectInsc = selectInsc;
    }

    public JLabel getSelectMat() {
        return selectMat;
    }

    public void setSelectMat(JLabel selectMat) {
        this.selectMat = selectMat;
    }

    public JLabel getSelectProf() {
        return selectProf;
    }

    public void setSelectProf(JLabel selectProf) {
        this.selectProf = selectProf;
    }

  

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setResizable(false);
       
        selectInsc.setVisible(false);
        selectCarrera.setVisible(false);
        selectCursado.setVisible(false);
        selectInsc.setVisible(false);
        selectMat.setVisible(false);
        selectProf.setVisible(false);

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnListaProfesores = new javax.swing.JButton();
        btnMaterias = new javax.swing.JButton();
        btnCursados = new javax.swing.JButton();
        btnInscripciones = new javax.swing.JButton();
        btnListaAlumnos = new javax.swing.JButton();
        btnListaCarreras = new javax.swing.JButton();
        selectProf = new javax.swing.JLabel();
        selectInsc = new javax.swing.JLabel();
        selectAlumnos = new javax.swing.JLabel();
        selectMat = new javax.swing.JLabel();
        selectCarrera = new javax.swing.JLabel();
        selectCursado = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        lblMainTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/dashboard.png"))); // NOI18N
        jLabel1.setText("SGA2020-Prog2");

        btnListaProfesores.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnListaProfesores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/profesores.png"))); // NOI18N
        btnListaProfesores.setText("Lista Profesores");
        btnListaProfesores.setBorderPainted(false);
        btnListaProfesores.setContentAreaFilled(false);
        btnListaProfesores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/profesoresHover.png"))); // NOI18N

        btnMaterias.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/materias.png"))); // NOI18N
        btnMaterias.setText("Lista Materias");
        btnMaterias.setBorder(null);
        btnMaterias.setBorderPainted(false);
        btnMaterias.setContentAreaFilled(false);
        btnMaterias.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/materiaHover.png"))); // NOI18N

        btnCursados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCursados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/cursos.png"))); // NOI18N
        btnCursados.setText("Lista Cursados");
        btnCursados.setBorderPainted(false);
        btnCursados.setContentAreaFilled(false);
        btnCursados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/cursosHover.png"))); // NOI18N

        btnInscripciones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnInscripciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/inscripciones.png"))); // NOI18N
        btnInscripciones.setText("Inscripciones");
        btnInscripciones.setBorderPainted(false);
        btnInscripciones.setContentAreaFilled(false);
        btnInscripciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/inscripcionesHover.png"))); // NOI18N

        btnListaAlumnos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnListaAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/alumnos.png"))); // NOI18N
        btnListaAlumnos.setText("Lista Alumnos");
        btnListaAlumnos.setBorder(null);
        btnListaAlumnos.setBorderPainted(false);
        btnListaAlumnos.setContentAreaFilled(false);
        btnListaAlumnos.setDefaultCapable(false);
        btnListaAlumnos.setRequestFocusEnabled(false);
        btnListaAlumnos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/alumnosHover.png"))); // NOI18N

        btnListaCarreras.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnListaCarreras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/carreras.png"))); // NOI18N
        btnListaCarreras.setText("Lista Carreras");
        btnListaCarreras.setBorderPainted(false);
        btnListaCarreras.setContentAreaFilled(false);
        btnListaCarreras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/carrerasHover.png"))); // NOI18N

        selectProf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/menuSelection.png"))); // NOI18N

        selectInsc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/menuSelection.png"))); // NOI18N

        selectAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/menuSelection.png"))); // NOI18N

        selectMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/menuSelection.png"))); // NOI18N

        selectCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/menuSelection.png"))); // NOI18N

        selectCursado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sky/pi/images/menuSelection.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListaProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInscripciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCursados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectProf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectInsc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectMat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCursado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListaAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListaProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(selectProf, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCursados, javax.swing.GroupLayout.PREFERRED_SIZE, 72, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInscripciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(selectMat, javax.swing.GroupLayout.PREFERRED_SIZE, 72, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectCursado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListaCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(selectCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 77, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        mainPanel.setBackground(new java.awt.Color(102, 204, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(686, 100));
        mainPanel.setLayout(new java.awt.CardLayout());

        lblMainTitle.setBackground(new java.awt.Color(51, 153, 255));
        lblMainTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblMainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainTitle.setText("Main Title");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addComponent(lblMainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblMainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCursados;
    private javax.swing.JButton btnInscripciones;
    private javax.swing.JButton btnListaAlumnos;
    private javax.swing.JButton btnListaCarreras;
    private javax.swing.JButton btnListaProfesores;
    private javax.swing.JButton btnMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMainTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel selectAlumnos;
    private javax.swing.JLabel selectCarrera;
    private javax.swing.JLabel selectCursado;
    private javax.swing.JLabel selectInsc;
    private javax.swing.JLabel selectMat;
    private javax.swing.JLabel selectProf;
    // End of variables declaration//GEN-END:variables
}
