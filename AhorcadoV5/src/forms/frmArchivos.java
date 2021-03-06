/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.io.File;
import javafx.scene.control.ButtonType;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author luloop
 */
public class frmArchivos extends javax.swing.JDialog
{

    private boolean isDialog = false;
    private boolean isCancel= false;
    private String nombreArchivoNUevo = null;
    int returnVal;
    String nombreArchivoOriginal;

    /**
     * Creates new form frmArchivos
     */
    private frmArchivos(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    public frmArchivos(java.awt.Frame parent, boolean modal, String Original)
    {
        this(parent, modal);
        this.nombreArchivoOriginal = Original;
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

        elegirArchivo = new javax.swing.JFileChooser();

        setMaximumSize(new java.awt.Dimension(602, 397));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        elegirArchivo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                elegirArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(elegirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(elegirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void elegirArchivoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_elegirArchivoActionPerformed
    {//GEN-HEADEREND:event_elegirArchivoActionPerformed

        if (evt.getActionCommand().equals(javax.swing.JFileChooser.APPROVE_SELECTION))
        {
            System.out.println("You chose to open this file: " + elegirArchivo.getSelectedFile().getName());
            this.nombreArchivoNUevo = elegirArchivo.getSelectedFile().getName();
            setIsDialog(true);
            this.setVisible(false);
        } else if (evt.getActionCommand().equals(javax.swing.JFileChooser.CANCEL_SELECTION))
        {
            this.nombreArchivoNUevo = this.nombreArchivoOriginal;
            this.setIsCancel(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_elegirArchivoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

        this.elegirArchivo.setCurrentDirectory(new File(".\\AhorcadoV2"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("xml", "xml");
        this.elegirArchivo.setSelectedFile(new File(this.nombreArchivoOriginal));
        elegirArchivo.setFileFilter(filter);
       
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
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmArchivos dialog = new frmArchivos(new javax.swing.JFrame(), true);
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
    private javax.swing.JFileChooser elegirArchivo;
    // End of variables declaration//GEN-END:variables

    public boolean isIsDialog()
    {
        return isDialog;
    }

    public void setIsDialog(boolean isDialog)
    {
        this.isDialog = isDialog;
    }

    public String getNombreArchivoNUevo()
    {
        return nombreArchivoNUevo;
    }

    public void setNombreArchivoNUevo(String nombreArchivoNUevo)
    {
        this.nombreArchivoNUevo = nombreArchivoNUevo;
    }

    public boolean isIsCancel()
    {
        return isCancel;
    }

    public void setIsCancel(boolean isCancel)
    {
        this.isCancel = isCancel;
    }
}
