package forms;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author capacita_mecon
 */
public class frmAceptarCancelar extends javax.swing.JDialog
{

    public boolean isDialogResult = false;
    public boolean isCancel = false;

    public frmAceptarCancelar(java.awt.Frame parent, boolean modal, String texto)
    {
        super(parent, modal);
        this.setContentPane(new JLabel(new ImageIcon("optionPane.jpg")));
        // this.setContentPane(new JLabel(new ImageIcon("optionPane.png")));
        initComponents();
        this.textoMsj.setText(texto.toUpperCase());
        this.textoMsj.setOpaque(false);
        jScrollPane1.setBackground(new Color(0, 0, 0));
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        this.setOpacity((float) 0.90);
        this.btnCancelar.setIcon(new ImageIcon("botones-15.png"));
        this.btnCancelar.setRolloverIcon(new ImageIcon("botones-16.png"));
        this.btnAceptar.setIcon(new ImageIcon("botones-13.png"));
        this.btnAceptar.setDisabledIcon(new ImageIcon("botones-14.png"));
        this.btnAceptar.setRolloverIcon(new ImageIcon("botones-14.png"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jCheckBox1 = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoMsj = new javax.swing.JTextArea();

        jCheckBox1.setText("jCheckBox1");

        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(331, 195));
        setMinimumSize(new java.awt.Dimension(331, 195));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(331, 195));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setFocusPainted(false);
        btnAceptar.setMaximumSize(new java.awt.Dimension(121, 35));
        btnAceptar.setMinimumSize(new java.awt.Dimension(121, 35));
        btnAceptar.setPreferredSize(new java.awt.Dimension(121, 35));
        btnAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setMaximumSize(new java.awt.Dimension(121, 35));
        btnCancelar.setMinimumSize(new java.awt.Dimension(121, 35));
        btnCancelar.setPreferredSize(new java.awt.Dimension(121, 35));
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setInheritsPopupMenu(true);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(520, 135));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(520, 135));
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(520, 135));
        jScrollPane1.setRequestFocusEnabled(false);
        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        textoMsj.setEditable(false);
        textoMsj.setBackground(new java.awt.Color(35, 44, 105));
        textoMsj.setColumns(20);
        textoMsj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textoMsj.setForeground(new java.awt.Color(255, 255, 255));
        textoMsj.setLineWrap(true);
        textoMsj.setRows(2);
        textoMsj.setToolTipText("");
        textoMsj.setWrapStyleWord(true);
        textoMsj.setAutoscrolls(false);
        textoMsj.setBorder(null);
        textoMsj.setCaretColor(new java.awt.Color(153, 0, 204));
        textoMsj.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textoMsj.setKeymap(null);
        textoMsj.setMaximumSize(new java.awt.Dimension(259, 80));
        textoMsj.setMinimumSize(new java.awt.Dimension(259, 80));
        textoMsj.setOpaque(false);
        textoMsj.setPreferredSize(new java.awt.Dimension(259, 80));
        textoMsj.setRequestFocusEnabled(false);
        textoMsj.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(textoMsj);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        this.isDialogResult = true;
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.isCancel = true;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmAceptarCancelar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmAceptarCancelar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmAceptarCancelar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmAceptarCancelar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmAceptarCancelar dialog = new frmAceptarCancelar(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textoMsj;
    // End of variables declaration//GEN-END:variables

    public boolean isIsDialogResult()
    {
        return isDialogResult;
    }

    public void setIsDialogResult(boolean isDialogResult)
    {
        this.isDialogResult = isDialogResult;
    }

    //<editor-fold desc="Atributos">
    // </editor-fold>
    //<editor-fold desc="Constructores">
    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    //</editor-fold>
    //<editor-fold desc="Metodo">
    // </editor-fold>
}
