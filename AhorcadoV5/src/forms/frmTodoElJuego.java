/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Excepciones.DiccionaUsado;
import Entidades.ListaUsuarios;
import Entidades.Usuario;
import Excepciones.ClaveIncorrecta;
import Excepciones.UsuarioNoEncontrado;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Usuario
 */
public class frmTodoElJuego extends javax.swing.JFrame
{

    //<editor-fold desc="Atributos">
//    Color marron = new Color(63, 51, 49);
    panelJuegoNuevo jugar;
    frmNivel nivel;
    Container cp = null;
    Container cr = null;
    KeyEvent lele;

    private ListaUsuarios listaUsu;
    private Usuario usuarioElegido;

    // </editor-fold>
    public frmTodoElJuego()
    {
        this.setContentPane(new JLabel(new ImageIcon("fondo.jpg")));
        initComponents();
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

        jpJuego = new javax.swing.JPanel();
        jpLogIn = new javax.swing.JPanel();
        btnConfig = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        lblConf = new javax.swing.JLabel();
        jpRanking = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 620));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jpJuego.setMaximumSize(new java.awt.Dimension(900, 600));
        jpJuego.setMinimumSize(new java.awt.Dimension(900, 600));
        jpJuego.setOpaque(false);
        jpJuego.setPreferredSize(new java.awt.Dimension(900, 600));
        jpJuego.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jpJuegoMouseClicked(evt);
            }
        });
        jpJuego.addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentHidden(java.awt.event.ComponentEvent evt)
            {
                jpJuegoComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                jpJuegoComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jpJuegoLayout = new javax.swing.GroupLayout(jpJuego);
        jpJuego.setLayout(jpJuegoLayout);
        jpJuegoLayout.setHorizontalGroup(
            jpJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpJuegoLayout.setVerticalGroup(
            jpJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpLogIn.setMaximumSize(new java.awt.Dimension(700, 500));
        jpLogIn.setMinimumSize(new java.awt.Dimension(700, 500));
        jpLogIn.setOpaque(false);
        jpLogIn.setPreferredSize(new java.awt.Dimension(700, 500));

        btnConfig.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConfig.setToolTipText("");
        btnConfig.setBorder(null);
        btnConfig.setBorderPainted(false);
        btnConfig.setContentAreaFilled(false);
        btnConfig.setFocusPainted(false);
        btnConfig.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                btnConfigStateChanged(evt);
            }
        });
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                btnConfigMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                btnConfigMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                btnConfigMouseReleased(evt);
            }
        });
        btnConfig.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnConfigActionPerformed(evt);
            }
        });

        btnJugar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnJugar.setBorder(null);
        btnJugar.setBorderPainted(false);
        btnJugar.setContentAreaFilled(false);
        btnJugar.setFocusPainted(false);
        btnJugar.setMaximumSize(new java.awt.Dimension(105, 55));
        btnJugar.setMinimumSize(new java.awt.Dimension(105, 55));
        btnJugar.setPreferredSize(new java.awt.Dimension(105, 55));
        btnJugar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnJugarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Rockwell Condensed", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setToolTipText("");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(240, 240, 240));
        lblUsuario.setText("Usuario");

        lblPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(240, 240, 240));
        lblPass.setText("Clave");

        Password.setText("jPasswordField1");
        Password.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PasswordActionPerformed(evt);
            }
        });

        lblConf.setText("lblConf");
        lblConf.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                lblConfMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jpLogInLayout = new javax.swing.GroupLayout(jpLogIn);
        jpLogIn.setLayout(jpLogInLayout);
        jpLogInLayout.setHorizontalGroup(
            jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLogInLayout.createSequentialGroup()
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLogInLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLogInLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblConf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpLogInLayout.createSequentialGroup()
                        .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnJugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addGap(315, 315, 315))
            .addGroup(jpLogInLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpLogInLayout.setVerticalGroup(
            jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLogInLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPass, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpLogInLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLogInLayout.createSequentialGroup()
                                    .addComponent(lblConf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20))
                                .addComponent(btnConfig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jpRanking.setBackground(new java.awt.Color(27, 34, 88));
        jpRanking.setMaximumSize(new java.awt.Dimension(700, 500));
        jpRanking.setMinimumSize(new java.awt.Dimension(700, 500));
        jpRanking.setOpaque(false);
        jpRanking.setPreferredSize(new java.awt.Dimension(700, 500));
        jpRanking.addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                jpRankingComponentShown(evt);
            }
        });

        javax.swing.GroupLayout jpRankingLayout = new javax.swing.GroupLayout(jpRanking);
        jpRanking.setLayout(jpRankingLayout);
        jpRankingLayout.setHorizontalGroup(
            jpRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpRankingLayout.setVerticalGroup(
            jpRankingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        btnCerrar.setText("jButton1");
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setFocusPainted(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jpRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(51, Short.MAX_VALUE)
                    .addComponent(jpJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(jpLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(110, 110, 110)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpRanking, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(jpJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jpLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(60, 60, 60)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
//iconos
        this.btnCerrar.setIcon(new ImageIcon("cerrar-10.png"));
        this.btnCerrar.setRolloverIcon(new ImageIcon("cerrar-11.png"));
        this.btnConfig.setIcon(new ImageIcon("usuario-04.png"));
        this.btnConfig.setRolloverIcon(new ImageIcon("usuario-05.png"));
        this.btnConfig.setPressedIcon(new ImageIcon("usuario-06.png"));
        this.btnJugar.setIcon(new ImageIcon("jugarBtn-07.png"));
        this.btnJugar.setRolloverIcon(new ImageIcon("jugarBtn-08.png"));
        this.btnJugar.setRolloverSelectedIcon(new ImageIcon("jugarBtn-09.png"));

//titulo
        this.lblTitulo.setIcon(new ImageIcon("logo.png"));
        String buffer = "settings" + ".png";
        ImageIcon horca = new ImageIcon(buffer);
//dibujo juego
        this.lblConf.setIcon(horca);
        this.lblConf.setSize(35, 35);

        this.jpLogIn.setVisible(true);
        this.jpRanking.setVisible(false);

        this.jpJuego.setVisible(false);
        this.Password.setForeground(new Color(178, 178, 178));// TODO add your handling code here:
        this.Password.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                limpiarPassText();
            }

            @Override
            public void focusLost(FocusEvent e)
            {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        this.Password.addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    jugarTodo();
                }
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }//GEN-LAST:event_formWindowOpened

    private void jpJuegoComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_jpJuegoComponentShown
    {//GEN-HEADEREND:event_jpJuegoComponentShown

    }//GEN-LAST:event_jpJuegoComponentShown

    private void jpRankingComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_jpRankingComponentShown
    {//GEN-HEADEREND:event_jpRankingComponentShown

    }//GEN-LAST:event_jpRankingComponentShown

    private void jpJuegoComponentHidden(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_jpJuegoComponentHidden
    {//GEN-HEADEREND:event_jpJuegoComponentHidden

    }//GEN-LAST:event_jpJuegoComponentHidden

    private void jpJuegoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jpJuegoMouseClicked
    {//GEN-HEADEREND:event_jpJuegoMouseClicked


    }//GEN-LAST:event_jpJuegoMouseClicked

    private void lblConfMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblConfMouseReleased
    {//GEN-HEADEREND:event_lblConfMouseReleased
        frmAbmDiccionario nuevoDiccionario = new frmAbmDiccionario(this, true);
        nuevoDiccionario.setVisible(true);
        if (nuevoDiccionario.isDialog)
        {

        }
        else if (nuevoDiccionario.isCancel)
        {

        }
    }//GEN-LAST:event_lblConfMouseReleased

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnJugarActionPerformed
    {//GEN-HEADEREND:event_btnJugarActionPerformed
        jugarTodo();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnConfigActionPerformed
    {//GEN-HEADEREND:event_btnConfigActionPerformed

        this.btnConfig.setBackground(new Color(35, 44, 105));
        this.btnConfig.setIcon(new ImageIcon("usuario-06.png"));

        frmNuevoUsuario nuevoUsuario = new frmNuevoUsuario(this, true, 0);
        nuevoUsuario.setVisible(true);
        if (nuevoUsuario.isIsDialog())
        {
            System.out.println("Usuario Cargado");
        }
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnConfigMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnConfigMouseReleased
    {//GEN-HEADEREND:event_btnConfigMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfigMouseReleased

    private void btnConfigMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnConfigMousePressed
    {//GEN-HEADEREND:event_btnConfigMousePressed

    }//GEN-LAST:event_btnConfigMousePressed

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnConfigMouseClicked
    {//GEN-HEADEREND:event_btnConfigMouseClicked

    }//GEN-LAST:event_btnConfigMouseClicked

    private void btnConfigStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_btnConfigStateChanged
    {//GEN-HEADEREND:event_btnConfigStateChanged
        this.btnConfig.setBackground(new Color(35, 44, 105));
        this.btnConfig.setIcon(new ImageIcon("usuario-06.png"));
        this.btnConfig.setBorder(null);
        this.btnConfig.setBorderPainted(false);
    }//GEN-LAST:event_btnConfigStateChanged

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PasswordActionPerformed
    {//GEN-HEADEREND:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCerrarActionPerformed
    {//GEN-HEADEREND:event_btnCerrarActionPerformed
        frmAceptarCancelar cerrar = new frmAceptarCancelar(this, true, "Seguro desea salir?");
        cerrar.setVisible(true);
        if (cerrar.isDialogResult == true)
        {
            this.removeAll();
            this.dispose();
            System.exit(0);
        }


    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmTodoElJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmTodoElJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmTodoElJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmTodoElJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmTodoElJuego().setVisible(true);
            }
        });
    }

    //<editor-fold desc="Constructores">
    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    //</editor-fold>
    //<editor-fold desc="Metodo">
    private void volverInicio()
    {
        this.jpLogIn.setVisible(true);
        this.jpRanking.setVisible(false);
        this.jpJuego.setVisible(false);
        this.textUsuario.setText("");
        this.Password.setText("");
    }

    private void limpiarPassText()
    {
        this.Password.setForeground(new Color(0, 0, 0));
        this.Password.setText("");
    }

    private void mostrarPuntaje()
    {
        this.jpLogIn.setVisible(false);
        this.jpRanking.setVisible(true);
        this.jpJuego.setVisible(false);
        //    this.jpRanking.setBackground(marron);// TODO add your handling code here:
        ////////////////////
        //   this.getContentPane().setBackground(marron);
        cr = this.jpRanking;
        GridLayout gl = new GridLayout(1, 1);
        cr.setLayout(gl);
        panelRanking nuevoRanking = new panelRanking(this.usuarioElegido);
        cr.add(nuevoRanking);
        nuevoRanking.addComponentListener(new ComponentListener()
        {
            @Override
            public void componentResized(ComponentEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e)
            {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentHidden(ComponentEvent e)
            {
                if (nuevoRanking.getResp() == 0)
                {
                    volverInicio();
                }
                if (nuevoRanking.getResp() == 1)
                {
                    jugarTodo();
                }
            }
        });
        nuevoRanking.setVisible(true);

    }

    private void empezarJuego() throws DiccionaUsado
    {
        this.jpJuego.setVisible(true);
        //  this.getContentPane().setBackground(marron);
        this.jugar = new panelJuegoNuevo(this.nivel.getNivel(), this.usuarioElegido);
        this.jugar.addComponentListener(new ComponentListener()
        {
            @Override
            public void componentResized(ComponentEvent e)
            {
                //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentMoved(ComponentEvent e)
            {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e)
            {

            }

            @Override
            public void componentHidden(ComponentEvent e)
            {
                mostrarPuntaje();
            }
        });

        cp.add(jugar);

        //    this.jugar.limpiarJuego();
    }

    private boolean ingresarUsuario() throws UsuarioNoEncontrado, ClaveIncorrecta
    {
        boolean resp = false;
        this.listaUsu = ListaUsuarios.cargarUsuarios(ahorcadoV5.Ahorcadov4.USUARIO_ARCH);
        this.usuarioElegido = listaUsu.validarListaUsuarios(this.textUsuario.getText(), this.Password.getText());
        if (this.usuarioElegido != null)
        {
            resp = true;
        }

        return resp;

    }

    private void jugarTodo()
    {
        try
        {
            if (ingresarUsuario())
            {
                this.jpLogIn.setVisible(false);
                nivel = new frmNivel(this, true);
                nivel.setVisible(true);
                if (cp != null && cr != null)
                {
                    cp.removeAll();//////////////////container very importaNTE   
                    cr.removeAll();

                }

                cp = this.jpJuego;
                GridLayout gl = new GridLayout(1, 1);
                cp.setLayout(gl);

                if (nivel.isDialogResult)
                {
                    try
                    {
                        empezarJuego();
                    }
                    catch (DiccionaUsado ex)
                    {
                        Logger.getLogger(frmTodoElJuego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    nivel.dispose();
                    this.usuarioElegido = null;
                    volverInicio();
                }

            }
        }
        catch (UsuarioNoEncontrado | ClaveIncorrecta ex)
        {
            frmAceptar cerrar = new frmAceptar(this, true, ex.getMessage());
            cerrar.setVisible(true);
            
        }
    }

    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnJugar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpJuego;
    private javax.swing.JPanel jpLogIn;
    private javax.swing.JPanel jpRanking;
    private javax.swing.JLabel lblConf;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
