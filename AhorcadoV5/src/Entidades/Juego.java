/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Excepciones.DiccionaUsado;
import Excepciones.maxFallos;

/**
 *
 * @author luloop
 */
public class Juego
{

    //<editor-fold desc="Atributos">
    private boolean gameOver;
    private boolean nextLevel;
    private int contadorFallos;
    private int contadorAciertos;
    private int cantidadMaximaDFallos;
    private Palabra elegida;
    private Diccionario granDiccionario;
    private Diccionario filtrado;
    private Usuario usuario;
    // </editor-fold>
    //<editor-fold desc="Constructores">

    public Juego()
    {
    }

    public Juego(Usuario usuario, int nivel) throws DiccionaUsado
    {
        this.granDiccionario = Diccionario.cargarDiccionario(ahorcadoV5.Ahorcadov4.DICC_ARCH);
        this.filtrado = granDiccionario.armarDiccionarioNivel(nivel);
        this.cantidadMaximaDFallos = this.cantidadFallos(nivel);
        this.elegida = this.filtrado.elegirPalabraRandom();
        this.filtrado.getLista().sort(Diccionario.armarDiccionarioAlfabetico);
        this.usuario = usuario;
        contadorFallos = 0;
        contadorAciertos = 0;
        gameOver = false;
        nextLevel = true; // PORQUE
    }
    // </editor-fold>    
    
    //<editor-fold desc="Get-Set">
    public boolean isGameOver()
    {
        return gameOver;
    }

    public void setGameOver(boolean gameOver)
    {
        this.gameOver = gameOver;
    }

    public boolean isNextLevel()
    {
        return nextLevel;
    }

    public void setNextLevel(boolean nextLevel)
    {
        this.nextLevel = nextLevel;
    }

    public int getContadorFallos()
    {
        return contadorFallos;
    }

    public void setContadorFallos(int contadorFallos)
    {
        this.contadorFallos = contadorFallos;
    }

    public int getContadorAciertos()
    {
        return contadorAciertos;
    }

    public void setContadorAciertos(int contadorAciertos)
    {
        this.contadorAciertos = contadorAciertos;
    }

    public int getCantidadMaximaDFallos()
    {
        return cantidadMaximaDFallos;
    }

    public void setCantidadMaximaDFallos(int cantidadMaximaDFallos)
    {
        this.cantidadMaximaDFallos = cantidadMaximaDFallos;
    }

    public Palabra getElegida()
    {
        return elegida;
    }

    public void setElegida(Palabra elegida)
    {
        this.elegida = elegida;
    }

    public Diccionario getFiltrado()
    {
        return filtrado;
    }

    public void setFiltrado(Diccionario filtrado)
    {
        this.filtrado = filtrado;
    }

    public Usuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }

    //</editor-fold>
    //<editor-fold desc="Metodo">
    public int cantidadFallos(int nivel)
    {
        int cantidadFallos = 0;
        switch (nivel)
        {
            case 0:
                cantidadFallos = 10;
                break;
            case 1:
                cantidadFallos = 7;
                break;
            case 2:
                cantidadFallos = 5;
                break;
        }
        return cantidadFallos;
    }

    public boolean palabraCompletaBack(int nivel) throws maxFallos
    {
        boolean resp = true;
        if (this.contadorFallos == this.cantidadMaximaDFallos)
        {
            this.gameOver = true;
            throw new maxFallos("maximo de intentos fallidos");
        }
        return resp;
    }

    public boolean proximaPalabra() throws DiccionaUsado
    {
        boolean resp = false;
        this.filtrado.getLista().remove(this.elegida);// remuevo de la lista la palabra ya usada

        if (this.filtrado.getLista().isEmpty())
        {
            this.gameOver=true;
            throw new DiccionaUsado("GANASTEEEE \n FELICITACIONES");
        }
        else
        {
            this.contadorAciertos = 0;
            this.contadorFallos = 0;
            this.elegida = this.filtrado.elegirPalabraRandom();
         
           //  this.usuario.setCantidadVecesGanadas(this.usuario.getCantidadVecesGanadas() + 1);
            resp = true;

        }
        return resp;
    }

    public boolean validarAciertoJuego()
    {
        boolean resp = false;

        if (this.elegida.validaAcierto(this.contadorAciertos))
        {
            resp = true;
        }
        return resp;
    }

    // </editor-fold>
}
