/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author luloop
 */
public class UsuarioNoEncontrado extends Exception
{

    public UsuarioNoEncontrado(String msg)
    {
        super(msg);
    }
}
