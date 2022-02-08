package practicafinaldein;

/**
 *
 * @author Jhoan López
 */
public class BienvenidosPantalla extends javax.swing.JFrame {

    /**
     * Creates new form BienvenidosPantalla
     */
    public BienvenidosPantalla() {
        initComponents();

        asignarImg.asignarImagenes("Bienvenidos.png", jl_bienvenido);
    }
    
    AsignarImagen asignarImg = new AsignarImagen();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_fondoFrame = new javax.swing.JPanel();
        jl_bienvenido = new javax.swing.JLabel();
        jb_empezar = new javax.swing.JButton();
        jp_textoInformativo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jl_minimizar = new javax.swing.JLabel();
        jl_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_fondoFrame.setBackground(new java.awt.Color(248, 249, 249));
        jp_fondoFrame.setPreferredSize(new java.awt.Dimension(1200, 600));

        jl_bienvenido.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jl_bienvenido.setForeground(new java.awt.Color(51, 51, 51));
        jl_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_bienvenido.setMaximumSize(new java.awt.Dimension(610, 55));
        jl_bienvenido.setMinimumSize(new java.awt.Dimension(610, 55));
        jl_bienvenido.setName(""); // NOI18N
        jl_bienvenido.setPreferredSize(new java.awt.Dimension(610, 55));

        jb_empezar.setBackground(new java.awt.Color(204, 204, 204));
        jb_empezar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jb_empezar.setForeground(new java.awt.Color(80, 80, 80));
        jb_empezar.setText("EMPEZAR");
        jb_empezar.setBorder(null);
        jb_empezar.setBorderPainted(false);
        jb_empezar.setMaximumSize(new java.awt.Dimension(200, 50));
        jb_empezar.setMinimumSize(new java.awt.Dimension(200, 50));
        jb_empezar.setName(""); // NOI18N
        jb_empezar.setPreferredSize(new java.awt.Dimension(200, 50));
        jb_empezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_empezarActionPerformed(evt);
            }
        });

        jp_textoInformativo.setBackground(new java.awt.Color(248, 249, 249));
        jp_textoInformativo.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TU AUTOESCULA ONLINE DE CONFIAZA,");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CONTAMOS CON MÁS DE 3000 TEST");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EN DIFERENTES CATEGORÍAS COMO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CARNET B (COCHE) O CARNET A (MOTO),");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("¡GRACIAS POR CONFIAR EN NOSOTROS!");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AQUÍ TE AYUDAREMOS A CUMPLIR TUS OBJETIVOS.");

        javax.swing.GroupLayout jp_textoInformativoLayout = new javax.swing.GroupLayout(jp_textoInformativo);
        jp_textoInformativo.setLayout(jp_textoInformativoLayout);
        jp_textoInformativoLayout.setHorizontalGroup(
            jp_textoInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_textoInformativoLayout.setVerticalGroup(
            jp_textoInformativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_textoInformativoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout jp_fondoFrameLayout = new javax.swing.GroupLayout(jp_fondoFrame);
        jp_fondoFrame.setLayout(jp_fondoFrameLayout);
        jp_fondoFrameLayout.setHorizontalGroup(
            jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fondoFrameLayout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addGroup(jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp_textoInformativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(295, 295, 295))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fondoFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fondoFrameLayout.createSequentialGroup()
                        .addComponent(jb_empezar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(500, 500, 500))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fondoFrameLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        jp_fondoFrameLayout.setVerticalGroup(
            jp_fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fondoFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jl_bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(90, 90, 90)
                .addComponent(jp_textoInformativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jb_empezar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jp_fondoFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_empezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_empezarActionPerformed
        ElegirCategoriaPantalla elegirCat = new ElegirCategoriaPantalla();
        this.setVisible(false);
        elegirCat.setVisible(true);
    }//GEN-LAST:event_jb_empezarActionPerformed

    private void jl_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jl_minimizarMouseClicked

    private void jl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jl_cerrarMouseClicked

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
            java.util.logging.Logger.getLogger(BienvenidosPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BienvenidosPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BienvenidosPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BienvenidosPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BienvenidosPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jb_empezar;
    private javax.swing.JLabel jl_bienvenido;
    private javax.swing.JLabel jl_cerrar;
    private javax.swing.JLabel jl_minimizar;
    private javax.swing.JPanel jp_fondoFrame;
    private javax.swing.JPanel jp_textoInformativo;
    // End of variables declaration//GEN-END:variables
}
