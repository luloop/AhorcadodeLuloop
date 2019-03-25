/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Entidades.Diccionario;
import Entidades.Juego;
import Entidades.ListaUsuarios;
import Entidades.Usuario;
import Excepciones.DiccionaUsado;
import Excepciones.maxFallos;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.plaf.ButtonUI;

/**
 *
 * @author Usuario
 */
public class panelJuegoNuevo extends javax.swing.JPanel
{

    int jnivel;
    JLabel[] letras;
    ImageIcon[] horca;
    JButton[] botones = new JButton[27];
    Juego juego;
    Usuario usuarioActivo;
    // Color marron = new Color(63, 51, 49);
    char tecla;

    public panelJuegoNuevo()
    {

    }

    public panelJuegoNuevo(int nivel, Usuario user) throws DiccionaUsado
    {
        escucharTeclado(); //ESTO NO ANDA
//        

        this.jnivel = nivel;
        this.usuarioActivo = user;
        initComponents();
        empezarTodo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblFallidas = new javax.swing.JLabel();
        jIntentos = new javax.swing.JTextField();
        barProg = new javax.swing.JProgressBar();
        jPanAhoracado = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jpanLetras = new javax.swing.JPanel();
        jPnPalabra = new javax.swing.JPanel();
        jugandoUsuario = new javax.swing.JLabel();
        btnRendirse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPista = new javax.swing.JTextArea();

        setBackground(java.awt.Color.white);
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(920, 620));
        setMinimumSize(new java.awt.Dimension(920, 620));
        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(920, 620));

        lblFallidas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFallidas.setForeground(new java.awt.Color(255, 255, 255));
        lblFallidas.setText("Letras Fallidas :");

        jIntentos.setEditable(false);
        jIntentos.setBackground(new java.awt.Color(0, 0, 0));
        jIntentos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jIntentos.setForeground(new java.awt.Color(255, 255, 255));
        jIntentos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jIntentos.setToolTipText("");
        jIntentos.setAutoscrolls(false);
        jIntentos.setBorder(null);
        jIntentos.setOpaque(false);
        jIntentos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jIntentosActionPerformed(evt);
            }
        });

        barProg.setBackground(java.awt.Color.white);
        barProg.setMaximumSize(new java.awt.Dimension(146, 14));
        barProg.setMinimumSize(new java.awt.Dimension(146, 14));
        barProg.setString("");

        jPanAhoracado.setMaximumSize(new java.awt.Dimension(300, 419));
        jPanAhoracado.setMinimumSize(new java.awt.Dimension(300, 419));
        jPanAhoracado.setOpaque(false);

        lblImagen.setMaximumSize(new java.awt.Dimension(300, 419));
        lblImagen.setMinimumSize(new java.awt.Dimension(300, 419));
        lblImagen.setPreferredSize(new java.awt.Dimension(300, 419));

        javax.swing.GroupLayout jPanAhoracadoLayout = new javax.swing.GroupLayout(jPanAhoracado);
        jPanAhoracado.setLayout(jPanAhoracadoLayout);
        jPanAhoracadoLayout.setHorizontalGroup(
            jPanAhoracadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanAhoracadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanAhoracadoLayout.setVerticalGroup(
            jPanAhoracadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanAhoracadoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpanLetras.setMaximumSize(new java.awt.Dimension(500, 160));
        jpanLetras.setMinimumSize(new java.awt.Dimension(500, 160));
        jpanLetras.setOpaque(false);
        jpanLetras.setPreferredSize(new java.awt.Dimension(500, 160));

        javax.swing.GroupLayout jpanLetrasLayout = new javax.swing.GroupLayout(jpanLetras);
        jpanLetras.setLayout(jpanLetrasLayout);
        jpanLetrasLayout.setHorizontalGroup(
            jpanLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpanLetrasLayout.setVerticalGroup(
            jpanLetrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPnPalabra.setOpaque(false);

        javax.swing.GroupLayout jPnPalabraLayout = new javax.swing.GroupLayout(jPnPalabra);
        jPnPalabra.setLayout(jPnPalabraLayout);
        jPnPalabraLayout.setHorizontalGroup(
            jPnPalabraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPnPalabraLayout.setVerticalGroup(
            jPnPalabraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jugandoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jugandoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnRendirse.setBorder(null);
        btnRendirse.setBorderPainted(false);
        btnRendirse.setContentAreaFilled(false);
        btnRendirse.setFocusPainted(false);
        btnRendirse.setMaximumSize(new java.awt.Dimension(121, 35));
        btnRendirse.setMinimumSize(new java.awt.Dimension(121, 35));
        btnRendirse.setPreferredSize(new java.awt.Dimension(121, 35));
        btnRendirse.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRendirseActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(null);
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(520, 135));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(520, 135));
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(520, 135));
        jScrollPane1.setRequestFocusEnabled(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        jTextPista.setBackground(new java.awt.Color(35, 44, 105));
        jTextPista.setColumns(20);
        jTextPista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextPista.setForeground(new java.awt.Color(255, 255, 255));
        jTextPista.setLineWrap(true);
        jTextPista.setRows(2);
        jTextPista.setToolTipText("");
        jTextPista.setWrapStyleWord(true);
        jTextPista.setBorder(null);
        jTextPista.setCaretColor(new java.awt.Color(153, 0, 204));
        jTextPista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextPista.setKeymap(null);
        jTextPista.setMaximumSize(new java.awt.Dimension(530, 61));
        jTextPista.setMinimumSize(new java.awt.Dimension(530, 61));
        jTextPista.setOpaque(false);
        jTextPista.setPreferredSize(new java.awt.Dimension(530, 160));
        jScrollPane1.setViewportView(jTextPista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jugandoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanAhoracado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFallidas, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRendirse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addComponent(jpanLetras, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPnPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jPnPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnRendirse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFallidas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanAhoracado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jugandoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        //iniciarABC();
        //inicarPalabra();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRendirseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRendirseActionPerformed
    {//GEN-HEADEREND:event_btnRendirseActionPerformed
        int resp = JOptionPane.showConfirmDialog(this, " Te rendiste la palabra \n SEGURO");
        // 0=yes, 1=no, 2=cancel
        if (resp == 0)
        {
            JOptionPane.showMessageDialog(this, " Te rendiste la palabra era!\n" + this.juego.getElegida().getPalabra().toUpperCase());
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnRendirseActionPerformed

    private void jIntentosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jIntentosActionPerformed
    {//GEN-HEADEREND:event_jIntentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIntentosActionPerformed
///////////////////////////////////////////////////////////////////////////////////////////////////////

    private void empezarTodo()
    {
        // usuarioProvisorioHastaQueLoHaga = new Usuario();
        try
        {
            this.juego = new Juego(this.usuarioActivo, this.jnivel);
            System.out.println(this.juego.getFiltrado().toString());
            this.iniciarABC();
            this.btnRendirse.setIcon(new ImageIcon("rendirse-40.png"));
            this.btnRendirse.setRolloverIcon(new ImageIcon("rendirse-41.png"));
            this.btnRendirse.setPressedIcon(new ImageIcon("rendirse-41.png"));
            this.inicarPalabra();
            this.actualizarHorca(0);
            this.jugandoUsuario.setText("Usuario: " + this.usuarioActivo.toString() + "  Puntos: " + this.usuarioActivo.getCantidadVecesGanadas());
            this.jugandoUsuario.setVisible(true);

        }
        catch (DiccionaUsado ex)
        {
            System.out.println("algo no funciono");
        }        // TODO add your handling code here:
    }

    /**
     * GRAFICA agrega o cambia la palabra en juego
     */
    public void inicarPalabra()
    {

        //AJUSTES DE PISTA
        jScrollPane1.setBackground(new Color(0, 0, 0));
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        Container cp = this.jPnPalabra;
        GridLayout gl = new GridLayout(1, this.juego.getElegida().getPalabra().length());
        gl.setHgap(2);
        gl.setVgap(2);
        cp.setLayout(gl);
        this.letras = new JLabel[this.juego.getElegida().getPalabra().length()]; // hace un vector del largo de la palabra

        for (int i = 0; i < this.juego.getElegida().getPalabra().length(); i++)
        {
            this.letras[i] = new JLabel();
            cp.add(this.letras[i]);

            this.letras[i].setText(" ___ ");
            this.letras[i].setForeground(new Color(255, 255, 255));

            if (this.juego.getElegida().getPalabra().length() > 8)
            {
                this.letras[i].setFont(new java.awt.Font("Tahoma", 1, 15));
            }
            else
            {
                this.letras[i].setFont(new java.awt.Font("Tahoma", 1, 20));
            }
            this.letras[i].setVisible(true);

        }

    }

    /**
     * inicia el teclado
     *
     */
    public void iniciarABC()
    {
        Container cp = this.jpanLetras;
        GridLayout gl = new GridLayout(3, 7);
        gl.setHgap(2);
        gl.setVgap(2);
        cp.setLayout(gl);
        cp.setMaximumSize(new Dimension(530, 200));

        // cp.setBackground(new Color(63, 51, 49));
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        //centrar iconos

        for (int i = 0; i < letras.length(); i++)
        {
            botones[i] = new JButton();
            cp.add(botones[i]);
            botones[i].setText(String.valueOf(letras.charAt(i)));
            botones[i].setVisible(true);
            botones[i].setForeground(new Color(255, 255, 255));
            botones[i].setFont(new Font("Tahoma", 1, 20));
            botones[i].setBorder(null);
            botones[i].setContentAreaFilled(false);
            botones[i].setFocusPainted(false);

            botones[i].addActionListener(new ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    try
                    {
                        presionarTeclado(evt);
                    }
                    catch (DiccionaUsado e)
                    {
                        sonido(1);
                        gameOver(e.getMessage(), 12);
                    }
                    catch (maxFallos ex)
                    {
                        sonido(2);
                        gameOver(ex.getMessage(), 99);
                    }

                }
            });

        }
    }

    /**
     * Accion que realiza cuando presiona alguna letra
     *
     * @param evt
     * @throws DiccionaUsado
     * @throws Excepciones.maxFallos
     */
    public void presionarTeclado(java.awt.event.ActionEvent evt) throws DiccionaUsado, maxFallos
    {
        JButton evento = (JButton) evt.getSource();
        boolean coincide = false;
        int i;

        evento.setEnabled(false);

        System.out.println("A pretado el boton " + evento.getActionCommand());
        evento.setContentAreaFilled(false);

        for (i = 0; i < this.juego.getElegida().getPalabra().length(); i++)
        {
            if (this.juego.getElegida().contieneLetras(evento.getText().charAt(0), i)) //compara la letra en la ubicacion
            {
                this.letras[i].setText(" " + evento.getText() + " ");
                coincide = true;
                this.juego.setContadorAciertos(this.juego.getContadorAciertos() + 1);

            }
        }
        if (!coincide)//SI NO COINCIDE NINGUNA
        {
            this.juego.setContadorFallos(this.juego.getContadorFallos() + 1);
            jIntentos.setText(Integer.toString(this.juego.getContadorFallos()));//incrementa muetras el contandor de fallos
            String aux = lblFallidas.getText();
            aux += evento.getText() + "  ";
            lblFallidas.setText(aux);
        }

        if (this.juego.validarAciertoJuego())
        {
            sonido(3);
            JOptionPane.showMessageDialog(this, " Excelente!\n" + this.juego.getElegida().getPalabra().toUpperCase());
            if (this.juego.proximaPalabra())
            {
                limpiarJuego();
            }
        }
        else
        {
            this.validarFallos();
        }

    }

    /**
     * Accion que realiza cuando presiona alguna letra
     *
     * @throws DiccionaUsado
     * @throws Excepciones.maxFallos
     */
    public void presionarTecla(char tecla) throws DiccionaUsado, maxFallos //NO ANDA
    {

        boolean coincide = false;
        int i;

        System.out.println("A pretado el boton " + tecla);

        for (i = 0; i < this.juego.getElegida().getPalabra().length(); i++)
        {
            if (this.juego.getElegida().contieneLetras(tecla, i)) //compara la letra en la ubicacion
            {
                this.letras[i].setText(" " + tecla + " ");
                coincide = true;
                this.juego.setContadorAciertos(this.juego.getContadorAciertos() + 1);
            }
        }
        if (!coincide)//SI NO COINCIDE NINGUNA
        {
            this.juego.setContadorFallos(this.juego.getContadorFallos() + 1);
            jIntentos.setText(Integer.toString(this.juego.getContadorFallos()));
            String aux = lblFallidas.getText();
            aux += tecla + "  ";
            lblFallidas.setText(aux);
        }

        if (this.juego.validarAciertoJuego())
        {
            JOptionPane.showMessageDialog(this, " Excelente!\n" + this.juego.getElegida().getPalabra().toUpperCase());
            if (this.juego.proximaPalabra())
            {
                limpiarJuego();
            }
        }
        else
        {
            this.validarFallos();
        }

    }

    public void validarFallos() throws maxFallos
    {
        System.out.println("cantidad maxima de fallos " + this.juego.getCantidadMaximaDFallos());
        System.out.println("contador fallos " + this.juego.getContadorFallos());
        this.juego.palabraCompletaBack(this.jnivel);//si falla termina
        this.actualizarHorca((this.juego.getContadorFallos()));

        this.barProg.setMaximum(this.juego.getCantidadMaximaDFallos());
        this.barProg.setValue(this.juego.getContadorFallos());
      
        switch (this.jnivel)
        {
            case 0:
                if (this.juego.getContadorFallos() == 3)
                {
                    actualizarPista();
                }
                break;
            case 1:
                if (this.juego.getContadorFallos() == 3)
                {
                    actualizarPista();

                }
                break;
            case 2:
                if (this.juego.getContadorFallos() == 4)
                {
                    actualizarPista();
                }
                break;
        }
    }


    public void actualizarHorca(int intento)
    {
        Container cp = this.jPanAhoracado;
        GridLayout gl = new GridLayout(1, 1);
        cp.setLayout(gl);
        int[] facil =
        {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 8
        };
        int[] normal =
        {
            0, 1, 2, 5, 6, 7, 8, 8
        };
        int[] dificil =
        {
            0, 1, 2, 5, 7, 8
        };
        String buffer = null;

        this.horca = new ImageIcon[this.juego.getCantidadMaximaDFallos()];

        try
        {
            switch (this.jnivel)
            {
                case 2:
                    buffer = "jpg\\horca" + dificil[intento] + ".png";
                    break;
                case 1:
                    buffer = "jpg\\horca" + normal[intento] + ".png";
                    break;
                case 0:
                    buffer = "jpg\\horca" + facil[intento] + ".png";
                    break;
            }

            horca[intento] = new ImageIcon(buffer);
            lblImagen.setIcon(horca[intento]);
            cp.add(lblImagen);

        }
        catch (Exception e)
        {

        }

    }

    /**
     * FRONT PISTA
     */
    public void actualizarPista()
    {
        this.jTextPista.setText(this.juego.getElegida().getPista());
    }

    /**
     * FRON GAME OVER GAME OVER SALE Y VUELVE A EMPEZAR
     */
    public void gameOver(String respuesta, int numero)
    {
        if (this.juego.isGameOver())
        {
            this.lblImagen.setIcon(new ImageIcon("jpg\\horca" + numero + ".png"));
            this.barProg.setValue(this.juego.getCantidadMaximaDFallos());
            JOptionPane.showMessageDialog(this, respuesta);
            ListaUsuarios listausuario = ListaUsuarios.cargarUsuarios(ahorcadov4.Ahorcadov4.USUARIO_ARCH);
            listausuario.actualizarPuntos(this.usuarioActivo);
            ListaUsuarios.guardarUsuarios(listausuario, ahorcadov4.Ahorcadov4.USUARIO_ARCH);

            this.setVisible(false);

        }

    }

    public void limpiarJuego()
    {
        this.barProg.setValue(0);
        this.actualizarPuntos();
        this.actualizarHorca(0);
        this.jPnPalabra.removeAll();
        this.jpanLetras.removeAll();
        this.lblFallidas.setText("Letras Fallidas : ");
        this.jIntentos.setText(" ");
        this.jTextPista.setText(" ");
        this.inicarPalabra();
        this.iniciarABC();

    }

    private void actualizarPuntos()
    {
        switch (jnivel)
        {
            case 0:
                this.usuarioActivo.setCantidadVecesGanadas(this.usuarioActivo.getCantidadVecesGanadas() + 1);
                break;
            case 1:
                this.usuarioActivo.setCantidadVecesGanadas(this.usuarioActivo.getCantidadVecesGanadas() + 2);
                break;
            case 2:
                this.usuarioActivo.setCantidadVecesGanadas(this.usuarioActivo.getCantidadVecesGanadas() + 3);
                break;
        }
        this.jugandoUsuario.setText("Usuario: " + this.usuarioActivo.toString() + "  Puntos: " + this.usuarioActivo.getCantidadVecesGanadas());
        this.jugandoUsuario.setVisible(true);
    }

    private void escucharTeclado()
    {
        this.addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent ke)
            {
                if (Character.isAlphabetic(ke.getKeyChar()))
                {
                    tecla = ke.getKeyChar();
                    try
                    {
                        presionarTecla(tecla);
                    }
                    catch (DiccionaUsado ex)
                    {
                        // Logger.getLogger(juegoNuevo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    catch (maxFallos ex)
                    {
                        // Logger.getLogger(juegoNuevo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    ke.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent ke)
            {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            }

            @Override
            public void keyReleased(KeyEvent ke)
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public void sonido(int tipo)
    {
        String archSonido = "miniWin.wav";;

        switch (tipo)
        {
            case 1:
                archSonido = "claps.wav";
                break;
            case 2:
                archSonido = "gameOver.wav";
                break;
            case 3:
                archSonido = "miniWin.wav";
                break;

        }

        System.out.println("Reproduccir sonido");
        try
        {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(archSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
        catch (IOException | UnsupportedAudioFileException | LineUnavailableException e)
        {
            System.out.println(e.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barProg;
    private javax.swing.JButton btnRendirse;
    private javax.swing.JTextField jIntentos;
    private javax.swing.JPanel jPanAhoracado;
    private javax.swing.JPanel jPnPalabra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextPista;
    private javax.swing.JPanel jpanLetras;
    private javax.swing.JLabel jugandoUsuario;
    private javax.swing.JLabel lblFallidas;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
