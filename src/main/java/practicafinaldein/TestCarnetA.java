package practicafinaldein;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import static practicafinaldein.TestCarnetB.preguntaActual;

/**
 * @date 2 feb. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class TestCarnetA extends javax.swing.JFrame {

    
    public TestCarnetA() {
        initComponents();
        buttonGroup.add(jrb_opcionA);
        buttonGroup.add(jrb_opcionB);
        buttonGroup.add(jrb_opcionC);
        
        numeroPreguntas = (Integer) CarnetAPantalla.opcionElegidaA.get(1);
        this.getNumerosRandom(numeroPreguntas);
        this.getPreguntas(numeroPreguntas);
        this.asignarPreguntas(preguntaActual);
    }
    
    public static Map preguntaA = new HashMap();
    public static Map respuestaA = new HashMap();
    public static Map incorrecta1A = new HashMap();
    public static Map incorrecta2A = new HashMap();
    static int preguntaActual = 0;
    static int numeroPreguntas;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
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

        jPanel1.setBackground(new java.awt.Color(248, 249, 249));

        jrb_opcionA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrb_opcionA.setForeground(new java.awt.Color(102, 102, 102));
        jrb_opcionA.setText("OPCIÓN A");

        jrb_opcionB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrb_opcionB.setForeground(new java.awt.Color(102, 102, 102));
        jrb_opcionB.setText("OPCIÓN B");

        jrb_opcionC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrb_opcionC.setForeground(new java.awt.Color(102, 102, 102));
        jrb_opcionC.setText("OPCIÓN C");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_opcionA)
                    .addComponent(jrb_opcionC)
                    .addComponent(jrb_opcionB)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_opcionA)
                .addGap(18, 18, 18)
                .addComponent(jrb_opcionB)
                .addGap(18, 18, 18)
                .addComponent(jrb_opcionC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jp_fondoFrameLayout = new javax.swing.GroupLayout(jp_fondoFrame);
        jp_fondoFrame.setLayout(jp_fondoFrameLayout);
        jp_fondoFrameLayout.setHorizontalGroup(
            jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fondoFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fondoFrameLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fondoFrameLayout.createSequentialGroup()
                        .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jb_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(340, 340, 340))))
            .addGroup(jp_fondoFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_pregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_fondoFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_fondoFrameLayout.setVerticalGroup(
            jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fondoFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jl_pregunta)
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jp_fondoFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jp_fondoFrame.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jl_cerrarMouseClicked

    private void jl_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jl_minimizarMouseClicked

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        ElegirCategoriaPantalla elegirCategoria = new ElegirCategoriaPantalla();
        CarnetAPantalla.opcionElegidaA.clear();
        elegirCategoria.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_siguienteActionPerformed
        if (jrb_opcionA.isSelected() && jrb_opcionA.getText().equals("")) {
            
        } else if (jrb_opcionB.isSelected() && jrb_opcionA.getText().equals("")) {

        } else if (jrb_opcionC.isSelected() && jrb_opcionA.getText().equals("")) {

        }
        
    }//GEN-LAST:event_jb_siguienteActionPerformed
    
    private void getPreguntas (Integer num){
        Connection conexion = null;
        int cont = 1;
        try {
            conexion = ConexionDDBB.ConectarDBSQLITE();

            for (int i = 0; i < arrayNumeros.length; i++){
                String sentenciaBuscar = "SELECT pregunta, respuesta, incorrecta1, incorrecta2 FROM carnet_a WHERE id = '" 
                + arrayNumeros[i] + "';";
                var sentencia = conexion.prepareStatement(sentenciaBuscar);
                var resultado = sentencia.executeQuery();
                if (resultado.next()) {
                    preguntaA.put(i, resultado.getString("pregunta"));
                    respuestaA.put(i, resultado.getString("respuesta"));
                    incorrecta1A.put(i, resultado.getString("incorrecta1"));
                    incorrecta2A.put(i, resultado.getString("incorrecta2"));
                    
                    System.out.println("PREGUNTA: " + resultado.getString("pregunta"));
                    System.out.println("RESPUESTA: " + resultado.getString("respuesta"));
                    System.out.println("INCORRECTA1: " + resultado.getString("incorrecta1"));
                    System.out.println("INCORRECTA2: " + resultado.getString("incorrecta2"));
                    System.out.println(cont);
                    System.out.println("--------------------------------------------------------------------------------------------------------");

                    cont++;
                }
            }
            System.out.println("Se hizo todo bien");
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
            aleatorio = (int) (Math.random() * 31);
            for (int x = 0; x < arrayNumeros.length; x++) {
                if (arrayNumeros[x] == aleatorio) {
                    existe = true;
                    contador--;
                    break;  
                }
            }
            if(!existe){
                arrayNumeros[contador] = aleatorio;
                System.out.println("Numero Random " + contador + " :" + aleatorio);
            }
            contador++;
        }
    }
    
    private void asignarPreguntas (Integer num) {
        jl_pregunta.setText((String) preguntaA.get(num));
        jrb_opcionA.setText((String) respuestaA.get(num));
        jrb_opcionB.setText((String) incorrecta1A.get(num));
        jrb_opcionC.setText((String) incorrecta2A.get(num));
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
            java.util.logging.Logger.getLogger(TestCarnetA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestCarnetA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestCarnetA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestCarnetA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestCarnetA().setVisible(true);
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
    private javax.swing.JLabel jl_minimizar;
    private javax.swing.JLabel jl_pregunta;
    private javax.swing.JPanel jp_fondoFrame;
    private javax.swing.JRadioButton jrb_opcionA;
    private javax.swing.JRadioButton jrb_opcionB;
    private javax.swing.JRadioButton jrb_opcionC;
    // End of variables declaration//GEN-END:variables
}
