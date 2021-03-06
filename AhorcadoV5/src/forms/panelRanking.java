/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Entidades.ListaUsuarios;
import Entidades.Usuario;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import static java.util.Collections.list;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;

/**
 *
 * @author luloop
 */
public class panelRanking extends javax.swing.JPanel
{

    private ListaUsuarios listaFinal;
    private Usuario ganador;
    private int resp;
    private JLabel[] lblGanadores;

    /**
     * Creates new form panelRanking
     */
    public panelRanking(Usuario ganadorExt)
    {
        this.listaFinal = ListaUsuarios.cargarUsuarios(ahorcadoV5.Ahorcadov4.USUARIO_ARCH);
        this.lblGanadores = new JLabel[10];
        initComponents();
        this.lblPuntajes.setIcon(new ImageIcon("puntajes-25.png"));
        this.lblPuntajes.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        this.volverAlPrincipio.setIcon(new ImageIcon("botones-34.png"));
        this.gameOver.setIcon(new ImageIcon("gameover-38.gif"));

        this.volverAlPrincipio.setRolloverIcon(new ImageIcon("botones-35.png"));
        this.volverAjugar.setIcon(new ImageIcon("botones-36.png"));
        this.volverAjugar.setRolloverIcon(new ImageIcon("botones-37.png"));

        this.ganador = ganadorExt;
        rankearUsuario();
        imprimirRanking();
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

        jLabel1 = new javax.swing.JLabel();
        volverAlPrincipio = new javax.swing.JButton();
        lblPuntajes = new javax.swing.JLabel();
        volverAjugar = new javax.swing.JButton();
        gameOver = new javax.swing.JLabel();
        panelLista = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setBackground(null);
        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(528, 565));
        setMinimumSize(new java.awt.Dimension(528, 565));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(528, 565));

        volverAlPrincipio.setBorder(null);
        volverAlPrincipio.setBorderPainted(false);
        volverAlPrincipio.setContentAreaFilled(false);
        volverAlPrincipio.setFocusPainted(false);
        volverAlPrincipio.setMaximumSize(new java.awt.Dimension(121, 35));
        volverAlPrincipio.setMinimumSize(new java.awt.Dimension(121, 35));
        volverAlPrincipio.setPreferredSize(new java.awt.Dimension(121, 35));
        volverAlPrincipio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                volverAlPrincipioActionPerformed(evt);
            }
        });

        lblPuntajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajes.setMaximumSize(new java.awt.Dimension(520, 121));
        lblPuntajes.setMinimumSize(new java.awt.Dimension(520, 121));
        lblPuntajes.setPreferredSize(new java.awt.Dimension(520, 121));

        volverAjugar.setBorder(null);
        volverAjugar.setBorderPainted(false);
        volverAjugar.setContentAreaFilled(false);
        volverAjugar.setFocusPainted(false);
        volverAjugar.setMaximumSize(new java.awt.Dimension(121, 35));
        volverAjugar.setMinimumSize(new java.awt.Dimension(121, 35));
        volverAjugar.setPreferredSize(new java.awt.Dimension(121, 35));
        volverAjugar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                volverAjugarActionPerformed(evt);
            }
        });

        gameOver.setToolTipText("");
        gameOver.setMaximumSize(new java.awt.Dimension(238, 139));
        gameOver.setMinimumSize(new java.awt.Dimension(238, 139));
        gameOver.setPreferredSize(new java.awt.Dimension(238, 139));

        panelLista.setBackground(null);
        panelLista.setOpaque(false);

        javax.swing.GroupLayout panelListaLayout = new javax.swing.GroupLayout(panelLista);
        panelLista.setLayout(panelListaLayout);
        panelListaLayout.setHorizontalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelListaLayout.setVerticalGroup(
            panelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gameOver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(volverAlPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(volverAjugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPuntajes, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPuntajes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gameOver, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(volverAlPrincipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(volverAjugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void volverAlPrincipioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_volverAlPrincipioActionPerformed
    {//GEN-HEADEREND:event_volverAlPrincipioActionPerformed
        this.setVisible(false);
        this.resp = 0;
    }//GEN-LAST:event_volverAlPrincipioActionPerformed

    private void volverAjugarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_volverAjugarActionPerformed
    {//GEN-HEADEREND:event_volverAjugarActionPerformed
        this.setVisible(false);
        this.resp = 1;

    }//GEN-LAST:event_volverAjugarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameOver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPuntajes;
    private javax.swing.JPanel panelLista;
    private javax.swing.JButton volverAjugar;
    private javax.swing.JButton volverAlPrincipio;
    // End of variables declaration//GEN-END:variables

    private void rankearUsuario()
    {
        if (this.listaFinal.validarListaNombre(this.ganador.getNombre()))
        {
            this.listaFinal.actualizarPuntos(this.ganador);
            this.listaFinal.getLista().sort(ListaUsuarios.armarRanking);
            ListaUsuarios.guardarUsuarios(listaFinal, ahorcadoV5.Ahorcadov4.USUARIO_ARCH);
        }
    }

    private void imprimirRanking()
    {
        //AJUSTES DE PISTA
        this.panelLista.setOpaque(false);

        //   this.panelLista.getViewport().setOpaque(false);
        this.listaFinal.ranking();
        Container cp = this.panelLista;
        GridLayout gl = new GridLayout(7, 1);
        gl.setHgap(8);
        gl.setVgap(8);
        cp.setLayout(gl);

        for (int i = 0; i < 7; i++)
        {
            this.lblGanadores[i] = new JLabel();

            if (this.listaFinal.getLista().get(i).getNombre().compareToIgnoreCase(this.ganador.getNombre()) == 0)
            {
                this.lblGanadores[i].setForeground(new Color(21, 175, 18));
            }
            else
            {
                this.lblGanadores[i].setForeground(new Color(255, 255, 255));
            }
            cp.add(this.lblGanadores[i]);
            this.lblGanadores[i].setFont(new Font("Tahoma", 1, 20));
            this.lblGanadores[i].setText(this.listaFinal.getLista().get(i).toString3(i + 1));
            this.lblGanadores[i].setVisible(true);

        }

    }

    public int getResp()
    {
        return resp;
    }

}
