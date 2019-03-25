/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.Scanner;

/**
 *
 * @author luloop
 */
public class consola
{

    /**
     * Pide en Consola y Recibe un String
     */
    public static String leerString()
    {

        Scanner lector = new Scanner(System.in);
        String aux;
        aux = lector.next();

        return aux;
    }

    /**
     * Ingresa numero por consola
     *
     *
     */
    public static int leerInt()
    {
        Scanner lector = new Scanner(System.in);
        int aux = -1;
        String Ingresado;
        Ingresado = lector.next();

        try
        {
            aux = Integer.parseInt(Ingresado);
        } catch (NumberFormatException nfe)
        {
            throw new NumberFormatException("NAN");
        }

        return aux;

    }

    public static int leerInt(String mensaje)
    {
        System.out.println(mensaje);
        Scanner lector = new Scanner(System.in);
        int aux = -1;
        String Ingresado;
        Ingresado = lector.next();

        try
        {
            aux = Integer.parseInt(Ingresado);
        } catch (NumberFormatException nfe)
        {
            throw new NumberFormatException("NAN");
        }

        return aux;
    }

    public static float leerFloat()
    {
        Scanner lector = new Scanner(System.in);
        float aux = -1;
        String Ingresado;
        Ingresado = lector.next();

        try
        {
            aux = Float.parseFloat(Ingresado);
        } catch (NumberFormatException nfe)
        {

        }

        return aux;

    }

    public static float leerFloat(String mensaje)
    {
        System.out.println(mensaje);
        Scanner lector = new Scanner(System.in);
        float aux = -1;
        String Ingresado;
        Ingresado = lector.next();

        try
        {
            aux = Float.parseFloat(Ingresado);
        } catch (NumberFormatException nfe)
        {

        }

        return aux;

    }

}
