package forms;

import Entidades.ListaUsuarios;
import Entidades.Usuario;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author capacita_mecon
 */
public class frmNivel extends javax.swing.JDialog
{

    private int nivelElegido = 0;
    private boolean nivelStatus = false;
    private boolean usuarioStatus = false;
    public boolean isDialogResult = false;
    public boolean isCancel = false;

    public frmNivel(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        this.setContentPane(new JLabel(new ImageIcon("fondoNivel.jpg")));
        initComponents();

        this.btnCancelar.setIcon(new ImageIcon("botones-15.png"));
        this.btnCancelar.setRolloverIcon(new ImageIcon("botones-16.png"));
        this.btnAceptar.setIcon(new ImageIcon("botones-13.png"));
        this.btnAceptar.setDisabledIcon(new ImageIcon("botones-14.png"));

        this.btnFacil.setIcon(new ImageIcon("niveles-27.png"));
        this.btnNormal.setIcon(new ImageIcon("niveles-30.png"));
        this.btnDificil.setIcon(new ImageIcon("niveles-31.png"));

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
        btnFacil = new javax.swing.JButton();
        btnNormal = new javax.swing.JButton();
        btnDificil = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        btnFacil.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnFacil.setBorder(null);
        btnFacil.setBorderPainted(false);
        btnFacil.setContentAreaFilled(false);
        btnFacil.setFocusPainted(false);
        btnFacil.setMaximumSize(new java.awt.Dimension(131, 120));
        btnFacil.setMinimumSize(new java.awt.Dimension(131, 120));
        btnFacil.setPreferredSize(new java.awt.Dimension(131, 120));
        btnFacil.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnFacilMouseClicked(evt);
            }
        });
        btnFacil.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFacilActionPerformed(evt);
            }
        });

        btnNormal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnNormal.setBorder(null);
        btnNormal.setBorderPainted(false);
        btnNormal.setContentAreaFilled(false);
        btnNormal.setFocusPainted(false);
        btnNormal.setMaximumSize(new java.awt.Dimension(131, 120));
        btnNormal.setMinimumSize(new java.awt.Dimension(131, 120));
        btnNormal.setPreferredSize(new java.awt.Dimension(131, 120));
        btnNormal.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNormalActionPerformed(evt);
            }
        });

        btnDificil.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnDificil.setBorder(null);
        btnDificil.setBorderPainted(false);
        btnDificil.setContentAreaFilled(false);
        btnDificil.setFocusPainted(false);
        btnDificil.setMaximumSize(new java.awt.Dimension(131, 120));
        btnDificil.setMinimumSize(new java.awt.Dimension(131, 120));
        btnDificil.setPreferredSize(new java.awt.Dimension(131, 120));
        btnDificil.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDificilActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setEnabled(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnFacil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDificil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFacil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDificil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacilMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnFacilMouseClicked
    {//GEN-HEADEREND:event_btnFacilMouseClicked

    }//GEN-LAST:event_btnFacilMouseClicked

    private void btnFacilActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFacilActionPerformed
    {//GEN-HEADEREND:event_btnFacilActionPerformed
        this.nivelStatus = true;
        this.btnFacil.setIcon(new ImageIcon("niveles-28.png"));
        this.btnNormal.setIcon(new ImageIcon("niveles-30.png"));
        this.btnDificil.setIcon(new ImageIcon("niveles-31.png"));
        this.nivelElegido = 0;
        btnAceptar.setEnabled(true);
    }//GEN-LAST:event_btnFacilActionPerformed

    private void btnNormalActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNormalActionPerformed
    {//GEN-HEADEREND:event_btnNormalActionPerformed
        this.nivelStatus = true;
        this.btnFacil.setIcon(new ImageIcon("niveles-27.png"));
        this.btnNormal.setIcon(new ImageIcon("niveles-29.png"));
        this.btnDificil.setIcon(new ImageIcon("niveles-31.png"));
        this.nivelElegido = 1;
        btnAceptar.setEnabled(true);
    }//GEN-LAST:event_btnNormalActionPerformed

    private void btnDificilActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDificilActionPerformed
    {//GEN-HEADEREND:event_btnDificilActionPerformed
        this.nivelStatus = true;
        this.btnFacil.setIcon(new ImageIcon("niveles-27.png"));
        this.btnNormal.setIcon(new ImageIcon("niveles-30.png"));
        this.btnDificil.setIcon(new ImageIcon("niveles-32.png"));
        this.nivelElegido = 2;
        btnAceptar.setEnabled(true);
    }//GEN-LAST:event_btnDificilActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAceptarActionPerformed
    {//GEN-HEADEREND:event_btnAceptarActionPerformed
        this.isDialogResult = true;
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.isCancel = true;
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        this.btnAceptar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(frmNivel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmNivel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmNivel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmNivel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmNivel dialog = new frmNivel(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDificil;
    private javax.swing.JButton btnFacil;
    private javax.swing.JButton btnNormal;
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the nivel
     */
    public int getNivel()
    {
        return nivelElegido;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel)
    {
        this.nivelElegido = nivel;
    }

    /**
     * @return the nivelElegido
     */
    public boolean isNivelElegido()
    {
        return nivelStatus;
    }

    /**
     * @param nivelElegido the nivelElegido to set
     */
    public void setNivelElegido(boolean nivelElegido)
    {
        this.nivelStatus = nivelElegido;
    }

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
