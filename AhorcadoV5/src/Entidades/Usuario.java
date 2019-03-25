/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Excepciones.ClaveIncorrecta;
import Excepciones.UsuarioNoEncontrado;

/**
 *
 * @author Usuario
 */
public class Usuario
{

    //<editor-fold desc="Atributos">
    private String nombre;
    private int cantidadVecesJugadas;
    private int cantidadVecesGanadas;
    private String clave;
    private String mail;

    // </editor-fold>
    //<editor-fold desc="Constructores">
    public Usuario()
    {

    }

    public Usuario(String nombre, String clave, String mail)
    {
        this.nombre = nombre;
        this.cantidadVecesJugadas = 0;
        this.cantidadVecesGanadas = 0;
        this.clave = clave;
        this.mail = mail;
    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    public String getClave()
    {
        return clave;
    }

    public void setClave(String clave)
    {
        this.clave = clave;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getCantidadVecesJugadas()
    {
        return cantidadVecesJugadas;
    }

    public void setCantidadVecesJugadas(int cantidadVecesJugadas)
    {
        this.cantidadVecesJugadas = cantidadVecesJugadas;
    }

    public int getCantidadVecesGanadas()
    {
        return cantidadVecesGanadas;
    }

    public void setCantidadVecesGanadas(int cantidadVecesGanadas)
    {
        this.cantidadVecesGanadas = cantidadVecesGanadas;
    }

    public String getMail()
    {
        return mail;
    }

    public void setMail(String mail)
    {
        this.mail = mail;
    }

    //</editor-fold>
//<editor-fold desc="Metodo">
    @Override
    public String toString()
    {
        return this.getNombre();
    }

    public String toString2()
    {
        return this.getNombre() + " " + this.getClave();
    }
    public String toString3(int i)
    {
        StringBuilder buffer = new StringBuilder();       
        
        buffer.append(recursos.formato.tabParaListados(i, 8));
        buffer.append(recursos.formato.tabParaListados(this.getNombre().toUpperCase(), 20));
        buffer.append(recursos.formato.tabParaListados(getCantidadVecesGanadas(), 10));
        
        return  buffer.toString();
    }

// </editor-fold>
    public boolean validarUnUsuario(String nombre, String clave) 
    {
        boolean resp = false;

        if (nombre.compareTo(this.nombre) == 0)
        {
            if (clave == this.clave)
            {
                resp = true;
            }
        }

        return resp;

    }

    public boolean validarUnUsuario(Usuario usuario) 
    {
        boolean resp = false;

        if (usuario.nombre.compareTo(this.nombre) == 0)
        {
            if (usuario.clave == this.clave)
            {
                resp = true;
            }
        }

        return resp;

    }
}
    
