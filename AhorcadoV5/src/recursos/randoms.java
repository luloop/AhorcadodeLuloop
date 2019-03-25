/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author luloop
 */
public class randoms
{

     public static int Entero() //MODIFICAR ENUM
    {
        Random random = new Random();
        int numero = random.nextInt();
        return numero;
    }
     
    public static int Entero(int min, int max) //MODIFICAR ENUM
    {
        Random random = new Random();
        int numero = random.nextInt(max + 1 - min) + min;
        return numero;
    }

    public static float Float()
    {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        float numero = random.nextFloat();
        return numero;
    }

    public static String Nombre()
    {
        String[] inicio =
        {
            "Lolo", "Lala", "Carolina", "Marco", "Cecilia","Marina", "Marta", "Mabel"
        };

        return inicio[java.util.concurrent.ThreadLocalRandom.current().nextInt(inicio.length)];
    }

    public static String Apellido()
    {
        String[] inicio =
        {"Rizzi", "Perez", "Gomez", "Lopez", "Fernandez", "Batana", "Apellido", "Mendez", "Martinez",
        };

        return inicio[java.util.concurrent.ThreadLocalRandom.current().nextInt(inicio.length)];
    }
    
    public static String Sexo()
    {
        String[] inicio =
        {"Femenino", "Masculino", "no Binario",
        };

        return inicio[java.util.concurrent.ThreadLocalRandom.current().nextInt(inicio.length)];
    }
    
    
/*
    public static ERaza getRandom() //MODIFICAR ENUM
    {
        return ERaza.values()[(int) (Math.random() * ERaza.values().length)];
    }
 */


}
