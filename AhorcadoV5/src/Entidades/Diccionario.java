/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Excepciones.DiccionaUsado;
import Excepciones.PalabraNoEncontrada;
import java.awt.Container;
import java.awt.GridLayout;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JLabel;

public class Diccionario
{

    //<editor-fold desc="Atributos">
    private ArrayList<Palabra> lista;

    // </editor-fold>
    //<editor-fold desc="Constructores">

    public Diccionario()
    {
        lista = new ArrayList<Palabra>();
    }

    // </editor-fold>    
    //<editor-fold desc="Get-Set">
    //</editor-fold>
    //<editor-fold desc="Metodo">
    public void generar()
    {
        getLista().add(new Palabra("PARACAIDAS", 1, "Artefacto de tela resistente o de otra materia análoga, que se extiende en el aire en forma de sombrilla grande, cuya función es la de moderar la velocidad de caída de un cuerpo que se arroja desde una aeronave"));
        getLista().add(new Palabra("DECORACION", 2, "Arte que estudia la combinación de elementos ornamentales y la acomodación del espacio interior"));
        getLista().add(new Palabra("MATRIMONIO", 1, "Antigua institución social, presente en gran cantidad de culturas, que establece un vínculo conyugal entre personas naturales, reconocido y consolidado por medio de prácticas comunitarias y normas legales, consuetudinarias, religiosas o morales"));
        getLista().add(new Palabra("REDITO", 2, "Renta, utilidad o beneficio renovable que rinde un capital"));
        getLista().add(new Palabra("CUENTA", 0, "Cálculo u operación aritmética.\nCada una de las bolas ensartadas que componen el rosario"));
        getLista().add(new Palabra("OVULO", 1, "Células sexuales o gametos femeninos.1​ Son células grandes, esféricas e inmóviles."));
        getLista().add(new Palabra("TECHO", 0, "Parte superior de un edificio, construcción, habitáculo, etc., que lo cubre y cierra"));
        getLista().add(new Palabra("HORA", 0, "Tiempo que equivale a 60 minutos, es decir, 3600 segundos"));
        getLista().add(new Palabra("VIOLIN", 0, "Instrumento musical de cuerda, el más pequeño y agudo entre los de su clase, que se compone de una caja de resonancia en forma de 8, un mástil sin trastes y cuatro cuerdas que se hacen sonar con un arco"));
        getLista().add(new Palabra("CINTA", 0, "Tira de tela u otro material de propiedades semejantes que sirve para atar, ceñir o adornar"));
        getLista().add(new Palabra("CUERDA", 1, "Conjunto de hilos entrelazados que forman un solo cuerpo largo y flexible que sirve para atar, suspender pesos, etc."));
        getLista().add(new Palabra("ZAPATILLA", 1, "Calzado cómodo y ligero, de paño, piel, etc., y con suela delgada, que se usa para estar en casa"));
        getLista().add(new Palabra("VENTILADOR", 2, "Instrumento o aparato con aspas giratorias que impulsa o remueve el aire"));

    }
///////////////////////////////////Override

    @Override
    public String toString()
    {
        String movies = "";
        for (Palabra palabra : this.getLista())
        {
            movies += palabra.toString() + "\n";
        }
        return movies;
    }

///////////////////////////////////ARCHIVO
    /**
     *
     *
     */
    public static void guardarArchivoDiccionario(Diccionario lista, String nombreArchivo)
    {
        XMLEncoder encoder = null;

        try
        {
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            BufferedOutputStream salida = new BufferedOutputStream(file);
            encoder = new XMLEncoder(salida);
        }
        catch (FileNotFoundException fileNotFound)
        {
            fileNotFound.getMessage();
            System.out.println("ERROR- tu archivo no esta");
        }

        encoder.writeObject(lista);
        encoder.close();

    }

    /**
     *
     *
     */
    public static Diccionario cargarDiccionario(String nombreArchivo)
    {
        XMLDecoder decoder = null;

        try
        {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(nombreArchivo)));
        }
        catch (FileNotFoundException fileNotFound)
        {
            fileNotFound.getMessage();
            System.out.println("ERROR- tu archivo no esta");
        }

        Diccionario nuevo = (Diccionario) decoder.readObject();

        return nuevo;

    }

/////////////////////////////////// ABM
    /**
     *
     * @param nombre
     * @param pista
     */
    public void agregarPalabra(String nombre, int nivel, String pista) throws PalabraNoEncontrada
    {
        if (nombre.length() < 15)
        {
            this.getLista().add(new Palabra(nombre, nivel, pista));
        }

        else
        {
            throw new PalabraNoEncontrada("Palabra muy Larga, reintentar");
        }

    }

    /**
     *
     * @param nombre
     * @throws PalabraNoEncontrada
     */
    public void quitarPalabra(String nombre) throws PalabraNoEncontrada
    {
        boolean encontarda = false;

        for (Palabra palabra : getLista())
        {
            if (nombre.compareToIgnoreCase(palabra.getPalabra())==0)
            {
                this.getLista().remove(palabra);
                encontarda = true;
            }
        }

        if (encontarda == false)
        {
            throw new PalabraNoEncontrada(" La palabra encontrada no se encuentra en el diccionarios");
        }

    }

    /**
     * RANDOM elige un index al azar del arraylist de palabras y lo devuelve
     *
     * @return
     */
    public Palabra elegirPalabraRandom() 
    {
        int i = recursos.randoms.Entero(0, this.getLista().size() - 1);
        return this.getLista().get(i);
    }

    /**
     * Arma copia de diccionario filtrando por nivel, y sumandole el nivel
     * anterior, para mas placer
     *
     * @param nivel
     * @return nuevo Diccionario
     */
    public Diccionario armarDiccionarioNivel(int nivel)
    {
        Diccionario nuevoDic = new Diccionario();

        for (Palabra palabra : this.getLista())
        {
            if (palabra.getDificultad() == nivel)
            {
                nuevoDic.getLista().add(palabra);
            }
            if (nivel != 0 && palabra.getDificultad() == (nivel - 1))
            {
                nuevoDic.getLista().add(palabra);
            }
        }
        return nuevoDic;

    }
    public static final Comparator<Palabra> armarDiccionarioAlfabetico = (Palabra palabra2, Palabra palabra) ->
    {
      return palabra2.getPalabra().compareToIgnoreCase(palabra.getPalabra());
    } ;

    public ArrayList<Palabra> getLista()
    {
        return lista;
    }

    public void setLista(ArrayList<Palabra> lista)
    {
        this.lista = lista;
    }


}

// </editor-fold>

