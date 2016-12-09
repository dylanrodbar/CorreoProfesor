package interfaz;
import java.util.ArrayList;
import principal.Grupo;
import principal.Estudiante;

public class VentanaProfesor extends javax.swing.JFrame {
    private VentanaPrincipal venPrincipal;
    private ArrayList<Grupo> gruposP;
    public VentanaProfesor(VentanaPrincipal venPrin) {
        
        
        initComponents();
        
        
        this.venPrincipal = venPrin;
        
        //Se indica el nombre del profesor que inició sesión
        labelProfesor.setText(venPrincipal.getPrincipal().getNombreProfesorActual()
                              + " " + venPrincipal.getPrincipal().getApellidoProfesorActual());
        //Se obtienen los grupos del profesor actual
        
        //Se obtienen los grupos correspondientes al profesor que inició sesión
        gruposP = venPrincipal.getPrincipal().getProfesorActual().getGrupos();
        
        cargarGrupos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBienvenido = new javax.swing.JLabel();
        labelProfesor = new javax.swing.JLabel();
        comboGrupos = new javax.swing.JComboBox<>();
        labelGrupos = new javax.swing.JLabel();
        botonEnviarCorreo = new javax.swing.JButton();
        botonAgregarGrupo = new javax.swing.JButton();
        labelNombreEstudiante = new javax.swing.JLabel();
        labelApellidoEstudiante = new javax.swing.JLabel();
        labelCedulaEstudiante = new javax.swing.JLabel();
        labelCorreoEstudiante = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        botonAgregarEstudiante = new javax.swing.JButton();
        labelAEstudiante = new javax.swing.JLabel();
        botonModificarEstudiante = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelBienvenido.setText("Bienvenido(a): ");

        comboGrupos.setToolTipText("");

        labelGrupos.setText("Grupos:");

        botonEnviarCorreo.setText("Enviar Correo");
        botonEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarCorreoActionPerformed(evt);
            }
        });

        botonAgregarGrupo.setText("Agregar Nuevo Grupo");
        botonAgregarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarGrupoActionPerformed(evt);
            }
        });

        labelNombreEstudiante.setText("Nombre Estudiante:");

        labelApellidoEstudiante.setText("Apellido Estudiante:");

        labelCedulaEstudiante.setText("Cédula Estudiante:");

        labelCorreoEstudiante.setText("Correo Estudiante:");

        botonAgregarEstudiante.setText("Agregar Estudiante");
        botonAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarEstudianteActionPerformed(evt);
            }
        });

        labelAEstudiante.setText("Agregar un estudiante");

        botonModificarEstudiante.setText("Modificar Estudiante");
        botonModificarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarEstudianteActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar Datos de su Cuenta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelBienvenido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelGrupos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboGrupos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(botonEnviarCorreo)
                            .addComponent(botonAgregarGrupo)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelCorreoEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNombreEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelApellidoEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelCedulaEstudiante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(labelAEstudiante)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(botonAgregarEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(botonModificarEstudiante)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelGrupos))
                        .addGap(31, 31, 31)
                        .addComponent(botonAgregarGrupo)
                        .addGap(29, 29, 29)
                        .addComponent(botonEnviarCorreo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelAEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombreEstudiante)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelApellidoEstudiante)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCedulaEstudiante)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCorreoEstudiante)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarEstudiante)
                    .addComponent(botonModificarEstudiante))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarCorreoActionPerformed
        //Se abre la ventana para enviar correos
        new VentanaCorreo(this, comboGrupos.getSelectedIndex()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonEnviarCorreoActionPerformed

    private void botonAgregarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarGrupoActionPerformed
        //Se abre la ventana para añadir grupos
        new VentanaAgregarGrupo(this).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonAgregarGrupoActionPerformed

    private void botonAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarEstudianteActionPerformed
        //Se llama al método para añadir a un nuevo estudiante
        venPrincipal.getPrincipal().getProfesorActual().getGrupo(comboGrupos.getSelectedIndex()).annadirEstudiante(Integer.parseInt(txtCedula.getText()), 
                                                                                        txtNombre.getText(), txtApellido.getText(), txtCorreo.getText());
    }//GEN-LAST:event_botonAgregarEstudianteActionPerformed

    private void botonModificarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarEstudianteActionPerformed
       Estudiante estudiante = venPrincipal.getPrincipal().getProfesorActual().getGrupo(comboGrupos.getSelectedIndex()).getEstudianteCedula(Integer.parseInt(txtCedula.getText()));
       
       //Se advierte que el estudiante digitado no existe
       if(estudiante == null)
            System.out.println("");
       
       //Se modifican los datos del estudiante
       else{
           estudiante.setNombre(txtNombre.getText());
           estudiante.setApellido(txtApellido.getText());
           estudiante.setCorreo(txtCorreo.getText());
           
       }
    }//GEN-LAST:event_botonModificarEstudianteActionPerformed

    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VentanaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaProfesor(new VentanaPrincipal()).setVisible(true);
               
               
            }
        });
    }
    
    public VentanaPrincipal getVentanaPrincipal(){
        return venPrincipal;
    }
    
    //cargarGrupos: método encargado de asignar los grupos del profesor actual al combo box de grupos
    //Entradas: ninguna
    //Salidas: ninguna
    public void cargarGrupos(){
        for(Grupo grupo: gruposP){
            comboGrupos.addItem(grupo.getNombre());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarEstudiante;
    private javax.swing.JButton botonAgregarGrupo;
    private javax.swing.JButton botonEnviarCorreo;
    private javax.swing.JButton botonModificarEstudiante;
    private javax.swing.JComboBox<String> comboGrupos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelAEstudiante;
    private javax.swing.JLabel labelApellidoEstudiante;
    private javax.swing.JLabel labelBienvenido;
    private javax.swing.JLabel labelCedulaEstudiante;
    private javax.swing.JLabel labelCorreoEstudiante;
    private javax.swing.JLabel labelGrupos;
    private javax.swing.JLabel labelNombreEstudiante;
    private javax.swing.JLabel labelProfesor;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
