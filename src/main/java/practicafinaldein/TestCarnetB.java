package practicafinaldein;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

/**
 * @date 2 feb. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class TestCarnetB extends javax.swing.JFrame {

    
    public TestCarnetB() {
        initComponents();
        buttonGroup.add(jrb_opcionA);
        buttonGroup.add(jrb_opcionB);
        buttonGroup.add(jrb_opcionC);
        
        numeroPreguntas = (Integer) CarnetBPantalla.opcionElegidaB.get(1);
        this.getNumerosRandom(numeroPreguntas);
        this.getPreguntas(numeroPreguntas);
        this.asignarPreguntas(preguntaActual);
    }
    
    public static Map preguntaB = new HashMap();
    public static Map respuestaB = new HashMap();
    public static Map incorrecta1B = new HashMap();
    public static Map incorrecta2B = new HashMap();
    public static Map aprobadoSuspendidoB = new HashMap();
    static int preguntasAcertadasB = 0;
    static int numeroPreguntas;
    static int preguntaActual = 0;
    static int [] arrayNumeros;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jp_fondoFrame = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jl_minimizar = new javax.swing.JLabel();
        jl_cerrar = new javax.swing.JLabel();
        jl_pregunta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jrb_opcionA = new javax.swing.JRadioButton();
        jrb_opcionB = new javax.swing.JRadioButton();
        jrb_opcionC = new javax.swing.JRadioButton();
        jb_salir = new javax.swing.JButton();
        jb_siguiente = new javax.swing.JButton();
        jl_informacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_fondoFrame.setBackground(new java.awt.Color(248, 249, 249));
        jp_fondoFrame.setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel3.setBackground(new java.awt.Color(248, 249, 249));

        jl_minimizar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jl_minimizar.setForeground(new java.awt.Color(153, 153, 153));
        jl_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_minimizar.setText("-");
        jl_minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jl_minimizar.setMaximumSize(new java.awt.Dimension(25, 25));
        jl_minimizar.setMinimumSize(new java.awt.Dimension(25, 25));
        jl_minimizar.setPreferredSize(new java.awt.Dimension(25, 25));
        jl_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_minimizarMouseClicked(evt);
            }
        });

        jl_cerrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jl_cerrar.setForeground(new java.awt.Color(153, 153, 153));
        jl_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_cerrar.setText("X");
        jl_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jl_cerrar.setMaximumSize(new java.awt.Dimension(25, 25));
        jl_cerrar.setMinimumSize(new java.awt.Dimension(25, 25));
        jl_cerrar.setPreferredSize(new java.awt.Dimension(25, 25));
        jl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_cerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jl_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jl_pregunta.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jl_pregunta.setForeground(new java.awt.Color(102, 102, 102));
        jl_pregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_pregunta.setText("¿PREGUNTA?");
        jl_pregunta.setPreferredSize(new java.awt.Dimension(520, 30));

        jPanel1.setBackground(new java.awt.Color(248, 249, 249));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 135));

        jrb_opcionA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrb_opcionA.setForeground(new java.awt.Color(102, 102, 102));
        jrb_opcionA.setText("OPCIÓN A");
        jrb_opcionA.setPreferredSize(new java.awt.Dimension(120, 29));

        jrb_opcionB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrb_opcionB.setForeground(new java.awt.Color(102, 102, 102));
        jrb_opcionB.setText("OPCIÓN B");
        jrb_opcionB.setPreferredSize(new java.awt.Dimension(125, 29));

        jrb_opcionC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrb_opcionC.setForeground(new java.awt.Color(102, 102, 102));
        jrb_opcionC.setText("OPCIÓN C");
        jrb_opcionC.setPreferredSize(new java.awt.Dimension(125, 29));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_opcionC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jrb_opcionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrb_opcionA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_opcionA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jrb_opcionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jrb_opcionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jb_salir.setBackground(new java.awt.Color(204, 204, 204));
        jb_salir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(80, 80, 80));
        jb_salir.setText("SALIR");
        jb_salir.setBorder(null);
        jb_salir.setBorderPainted(false);
        jb_salir.setMaximumSize(new java.awt.Dimension(200, 50));
        jb_salir.setMinimumSize(new java.awt.Dimension(200, 50));
        jb_salir.setName(""); // NOI18N
        jb_salir.setPreferredSize(new java.awt.Dimension(200, 50));
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });

        jb_siguiente.setBackground(new java.awt.Color(204, 204, 204));
        jb_siguiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb_siguiente.setForeground(new java.awt.Color(80, 80, 80));
        jb_siguiente.setText("SIGUIENTE");
        jb_siguiente.setBorder(null);
        jb_siguiente.setBorderPainted(false);
        jb_siguiente.setMaximumSize(new java.awt.Dimension(200, 50));
        jb_siguiente.setMinimumSize(new java.awt.Dimension(200, 50));
        jb_siguiente.setName(""); // NOI18N
        jb_siguiente.setPreferredSize(new java.awt.Dimension(200, 50));
        jb_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_siguienteActionPerformed(evt);
            }
        });

        jl_informacion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jl_informacion.setForeground(new java.awt.Color(153, 0, 0));
        jl_informacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_informacion.setPreferredSize(new java.awt.Dimension(0, 30));

        javax.swing.GroupLayout jp_fondoFrameLayout = new javax.swing.GroupLayout(jp_fondoFrame);
        jp_fondoFrame.setLayout(jp_fondoFrameLayout);
        jp_fondoFrameLayout.setHorizontalGroup(
            jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fondoFrameLayout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addGroup(jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fondoFrameLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fondoFrameLayout.createSequentialGroup()
                        .addGroup(jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_fondoFrameLayout.createSequentialGroup()
                                .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jb_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(340, 340, 340))))
            .addGroup(jp_fondoFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fondoFrameLayout.createSequentialGroup()
                .addContainerGap(525, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(525, Short.MAX_VALUE))
        );
        jp_fondoFrameLayout.setVerticalGroup(
            jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fondoFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jl_pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jl_informacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jp_fondoFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jp_fondoFrame.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_siguienteActionPerformed
        jl_informacion.setText("");
        if (buttonGroup.getSelection() != null ) { 
            if (numeroPreguntas > (preguntaActual + 1)) {
                if (jrb_opcionA.isSelected() && jrb_opcionA.getText().equals("<html><p style=\"width:250px\">" + respuestaB.get(preguntaActual) + "</p></html>")) {
                    preguntasAcertadasB++;
                } else if (jrb_opcionB.isSelected() && jrb_opcionB.getText().equals("<html><p style=\"width:250px\">" + respuestaB.get(preguntaActual) + "</p></html>")) {
                    preguntasAcertadasB++;
                } else if (jrb_opcionC.isSelected() && jrb_opcionC.getText().equals("<html><p style=\"width:250px\">" + respuestaB.get(preguntaActual) + "</p></html>")) {
                    preguntasAcertadasB++;
                }
                preguntaActual++;
                this.asignarPreguntas(preguntaActual);
            } else if (numeroPreguntas == (preguntaActual + 1)) {
                if (jrb_opcionA.isSelected() && jrb_opcionA.getText().equals("<html><p style=\"width:250px\">" + respuestaB.get(preguntaActual) + "</p></html>")) {
                    preguntasAcertadasB++;
                } else if (jrb_opcionB.isSelected() && jrb_opcionB.getText().equals("<html><p style=\"width:250px\">" + respuestaB.get(preguntaActual) + "</p></html>")) {
                    preguntasAcertadasB++;
                } else if (jrb_opcionC.isSelected() && jrb_opcionC.getText().equals("<html><p style=\"width:250px\">" + respuestaB.get(preguntaActual) + "</p></html>")) {
                    preguntasAcertadasB++;
                }
                preguntaActual++;
                
                if (preguntasAcertadasB >= (numeroPreguntas - 3)) {
                    aprobadoSuspendidoB.put(1, "Enhorabuena, has acertado " + preguntasAcertadasB + " preguntas." );
                    aprobadoSuspendidoB.put(2, "aprobado");
                    LlamadaDeClases pantalla = new LlamadaDeClases();
                    pantalla.aprobadoPantallaB(this);
                    preguntasAcertadasB = 0;
                    preguntaActual = 0;
                } else {
                    aprobadoSuspendidoB.put(1, "Lo sentimos, tuviste " + (numeroPreguntas - preguntasAcertadasB) + " preguntas falladas." );
                    aprobadoSuspendidoB.put(2, "suspendido");
                    LlamadaDeClases pantalla = new LlamadaDeClases();
                    pantalla.aprobadoPantallaB(this);
                    preguntasAcertadasB = 0;
                    preguntaActual = 0;
                }
            }
        } else {
            String mensaje = "Tienes que seleccionar alguna de las opciones.";
            jl_informacion.setText(mensaje);
        }
        buttonGroup.clearSelection();
        CarnetBPantalla.opcionElegidaB.clear();
    }//GEN-LAST:event_jb_siguienteActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        ElegirCategoriaPantalla elegirCategoria = new ElegirCategoriaPantalla();
        CarnetBPantalla.opcionElegidaB.clear();
        elegirCategoria.setVisible(true);
        this.setVisible(false);
        preguntasAcertadasB = 0;
        preguntaActual = 0;
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jl_cerrarMouseClicked

    private void jl_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jl_minimizarMouseClicked
    
    private void getPreguntas (Integer num){
        Connection conexion = null;
        int cont = 1;
        try {
            conexion = ConexionDDBB.ConectarDBSQLITE();

            for (int i = 0; i < arrayNumeros.length; i++){
                String sentenciaBuscar = "SELECT pregunta, respuesta, incorrecta1, incorrecta2 FROM carnet_b WHERE id = '" 
                + arrayNumeros[i] + "';";
                var sentencia = conexion.prepareStatement(sentenciaBuscar);
                var resultado = sentencia.executeQuery();
                if (resultado.next()) {
                    preguntaB.put(i, resultado.getString("pregunta"));
                    respuestaB.put(i, resultado.getString("respuesta"));
                    incorrecta1B.put(i, resultado.getString("incorrecta1"));
                    incorrecta2B.put(i, resultado.getString("incorrecta2"));
                    cont++;
                }
            }
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar preguntas");
            System.out.println(ex);
        }
    }
    
    private void getNumerosRandom (Integer num) {
        int contador = 0;
        int aleatorio;
        arrayNumeros = new int [num];
        while (contador < num) {
            boolean existe = false;
            aleatorio = (int) (Math.random() * 51);
            for (int x = 0; x < arrayNumeros.length; x++) {
                if (arrayNumeros[x] == aleatorio) {
                    existe = true;
                    contador--;
                    break;  
                }
            }
            if(!existe){
                arrayNumeros[contador] = aleatorio;
            }
            contador++;
        }
    }
    
    private void asignarPreguntas (Integer num) {
        String pregunta = (String) preguntaB.get(num);
        String opcionA = (String) respuestaB.get(num);
        String opcionB = (String) incorrecta1B.get(num);
        String opcionC = (String) incorrecta2B.get(num);
        
        jl_pregunta.setText("<html><p style=\"width:800px\"><center>" + pregunta + "</center></p></html>");
        jrb_opcionA.setText("<html><p style=\"width:250px\">" + opcionA + "</p></html>");
        jrb_opcionB.setText("<html><p style=\"width:250px\">" + opcionB + "</p></html>");
        jrb_opcionC.setText("<html><p style=\"width:250px\">" + opcionC + "</p></html>");
    }
    
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
            java.util.logging.Logger.getLogger(TestCarnetB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestCarnetB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestCarnetB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestCarnetB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestCarnetB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jb_salir;
    private javax.swing.JButton jb_siguiente;
    private javax.swing.JLabel jl_cerrar;
    private javax.swing.JLabel jl_informacion;
    private javax.swing.JLabel jl_minimizar;
    private javax.swing.JLabel jl_pregunta;
    private javax.swing.JPanel jp_fondoFrame;
    private javax.swing.JRadioButton jrb_opcionA;
    private javax.swing.JRadioButton jrb_opcionB;
    private javax.swing.JRadioButton jrb_opcionC;
    // End of variables declaration//GEN-END:variables
}
