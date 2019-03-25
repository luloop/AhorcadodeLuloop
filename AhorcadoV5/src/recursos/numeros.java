/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author luloop
 */
public class numeros
{
    public static void calcularPrimosHasta(String mensaje)
    {
        int numeroIngresado = 0;

        System.out.print(mensaje);
        numeroIngresado = leerConsolaInt();

        //  System.out.print("el numero es" + numeroIngresado);
        for (int i = 2; i < numeroIngresado; i++)
        {
            if (esPrimo(i))
            {
                System.out.println(i);
            }
        }

    }

    //recibe un numero cualquiera
    //verifica si es primo 
    //devuelve true o false
    public static boolean esPrimo(int numero)
    {
        boolean esprimo = true;
        for (int i = 2; i < numero; i++)
        {
            if (numero % i == 0)
            {
                esprimo = false;
                break;
            }
        }
        return esprimo;
    }

    private static int leerConsolaInt()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
