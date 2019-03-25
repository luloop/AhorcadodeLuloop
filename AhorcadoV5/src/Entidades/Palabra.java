/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Excepciones.DiccionaUsado;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Palabra
{

    //<editor-fold desc="Atributos">
    private String palabra;
    private int dificultad;
    private String pista;
    // </editor-fold>

    //<editor-fold desc="Constructores">
    public Palabra(String palabra, int difi, String pista)
    {
        setPalabra(palabra);
        this.dificultad = difi;
        this.pista = pista;
    }

    public Palabra()
    {
    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    public String getPalabra()
    {
        return this.palabra;
    }

    public void setPalabra(String palabra)
    {
        boolean esNumero = false;
        if (palabra != null)
        {
            for (int i = 0; i < palabra.length(); i++)
            {
                if (Character.isAlphabetic(palabra.charAt(i)))
                {
                    continue;
                }
                else
                {
                    esNumero = true;
                    break;
                }
            }

        }

        if (esNumero == false)
        {
            this.palabra = palabra;
        }
        else
        {
            //mensaje de error, manejo de error?
        }

    }

    public int getDificultad()
    {
        return this.dificultad;
    }

    public void setDificultad(int size)
    {
        this.dificultad = size;
    }

    public String getPista()
    {
        return this.pista;
    }

    public void setPista(String pista)
    {
        this.pista = pista;
    }

//</editor-fold>
//<editor-fold desc="Metodo">
    @Override
    public String toString()
    {
        return this.palabra + " " + this.pista;
    }
  
    public String toString2()
    {
        return this.palabra;
    }

    /**
     * devuelve un array con lo espacio completo cuando encuentra una letra o no
     *
     * @param letra
     * @param palabra
     * @return
     */
    public boolean contieneLetras(char letraIngresada, int palabraLetra)
    {
        boolean respuesta = false;

        if (letraIngresada == this.getPalabra().charAt(palabraLetra))
        {
            respuesta = true;

        }

        return respuesta;
    }

    public String inicarLetras()
    {
        String resp = " ";
        for (int i = 0; i < this.palabra.length(); i++)
        {
            resp += " - ";
        }
        return resp;
    }

    public boolean validaAcierto(int contadorAciertos) 
    {
        boolean resp = false;

        if (contadorAciertos == this.palabra.length())
        {
            resp = true;
        }

        return resp;
    }

// </editor-fold>
}
