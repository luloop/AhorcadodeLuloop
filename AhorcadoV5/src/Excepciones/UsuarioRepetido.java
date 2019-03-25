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
public class UsuarioRepetido extends Exception
{

    public UsuarioRepetido(String msg)
    {
        super(msg);
    }
}
