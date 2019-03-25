/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Excepciones.ClaveIncorrecta;
import Excepciones.UsuarioNoEncontrado;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author luloop
 */
public class ListaUsuarios
{

    //<editor-fold desc="Atributos">
    private ArrayList<Usuario> lista;

    // </editor-fold>
    //<editor-fold desc="Constructores">
    public ListaUsuarios()
    {
        lista = new ArrayList<Usuario>();
    }
    // </editor-fold>    

    //<editor-fold desc="Get-Set">
    public ArrayList<Usuario> getLista()
    {
        return lista;
    }

    public void setLista(ArrayList<Usuario> lista)
    {
        this.lista = lista;
    }
    //</editor-fold>

    //<editor-fold desc="Metodo">
    public void generar()
    {
        for (int i = 0; i < 15; i++)
        {
            getLista().add(new Usuario(recursos.randoms.Nombre(), recursos.randoms.Apellido(), Integer.toString(recursos.randoms.Entero(0, 10))));
        }
    }

    /**
     * Agregar al Arraylist
     *
     * @param nuevoUsuario
     */
    public void agregar(Usuario nuevoUsuario)
    {
        if (nuevoUsuario != null)
        {
            getLista().add(nuevoUsuario);
        }

    }

    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        String movies = "";
        for (Usuario usuario : getLista())
        {
            movies += usuario.toString2() + "\n";
        }
        return movies;
    }

    ////////////////////////////////////////// ARCHIVOS
    /**
     *
     * @param lista
     * @param nombreArchivo
     */
    public static boolean guardarUsuarios(ListaUsuarios lista, String nombreArchivo)
    {
        XMLEncoder encoder = null;
        boolean resp = true;

        try
        {
            FileOutputStream file = new FileOutputStream(nombreArchivo);
            BufferedOutputStream salida = new BufferedOutputStream(file);
            encoder = new XMLEncoder(salida);
            resp = true;
        }
        catch (FileNotFoundException fileNotFound)
        {
            fileNotFound.getMessage();
            System.out.println("ERROR- tu archivo no esta");
        }

        encoder.writeObject(lista);
        encoder.close();

        return resp;

    }

    /**
     * Lee Archivo xml recibe por parametro un string el cual es el archivo a
     * buscar y devuelve un elemento LISTA DE USUARIO el cual contiene un array
     * de usuarios
     *
     * @param nombreArchivo
     * @return
     */
    public static ListaUsuarios cargarUsuarios(String nombreArchivo)
    {
        XMLDecoder decoder = null;
        try

        {
            FileInputStream mm = new FileInputStream(nombreArchivo);

            BufferedInputStream aa = new BufferedInputStream(mm);

            decoder = new XMLDecoder(aa);

        }
        catch (FileNotFoundException fileNotFound)
        {
            fileNotFound.getMessage();
            System.out.println("ERROR- tu archivo no esta");
        }

        ListaUsuarios nuevo = (ListaUsuarios) decoder.readObject();

        return nuevo;

    }

    /**
     *
     * @param nombre
     * @param clave
     * @return Usuario tomado del arraylist
     * @throws UsuarioNoEncontrado
     * @throws ClaveIncorrecta
     */
    public Usuario validarListaUsuarios(String nombre, String clave) throws UsuarioNoEncontrado, ClaveIncorrecta
    {
        boolean claveFlag = false;
        boolean usuario = false;
        Usuario resp = null;

        for (int i = 0; i < this.lista.size(); i++)
        {
            Usuario usuar = this.lista.get(i);

            if (nombre.compareToIgnoreCase(usuar.getNombre()) == 0)
            {
                usuario = true;
                if (clave.compareToIgnoreCase(usuar.getClave()) == 0)
                {
                    claveFlag = true;
                    resp = usuar;

                    break;
                }
            }
        }
        if (!usuario)
        {
            throw new Excepciones.UsuarioNoEncontrado("usuario no encontrado");
        }
        else if (!claveFlag)
        {
            throw new Excepciones.ClaveIncorrecta("Clave Incorrecta");
        }

        return resp;

    }

    /**
     *
     * @param nombre
     * @return
     * @throws UsuarioNoEncontrado
     */
    public boolean validarListaNombre(String nombre)
    {
        boolean usuario = false;

        for (int i = 0; i < this.lista.size(); i++)
        {
            Usuario usuar = this.lista.get(i);

            if (nombre.compareToIgnoreCase(usuar.getNombre()) == 0)
            {
                usuario = true;
            }
        }

        return usuario;

    }

    /////////////////////////////// ALTA BAJA MODIFICACION
    public boolean baja(Usuario listaUsuario, String nombre, String pin) throws UsuarioNoEncontrado, ClaveIncorrecta
    {
        boolean resp = false;

        listaUsuario = this.validarListaUsuarios(nombre, pin);
        int i = this.getLista().indexOf(listaUsuario);

        if (listaUsuario != null)
        {
            System.out.println("Baja: \n" + this.getLista().remove(i).toString2());
            resp = true;
        }
        return resp;
    }

    /**
     *
     * @param flag
     * @param nombre
     * @return
     * @throws UsuarioNoEncontrado
     * @throws ClaveIncorrecta
     */
    public boolean alta(boolean flag, String nombre)
    {
        if (this.validarListaNombre(nombre))
        {
            flag = true;
        }
        return flag;
    }

    /**
     *
     * @param listaUsuario
     * @param nombre
     * @param pin
     * @param mail
     * @return
     * @throws UsuarioNoEncontrado
     * @throws ClaveIncorrecta
     */
    public boolean modificacion(Usuario listaUsuario, String nombre, String pin, String mail) throws UsuarioNoEncontrado, ClaveIncorrecta
    {
        boolean resp = false;
        listaUsuario = this.validarListaUsuarios(nombre, pin);
        if (listaUsuario != null)
        {
            int i = this.getLista().indexOf(listaUsuario);
            this.getLista().set(i, new Usuario(nombre, pin, mail));
            resp = true;

        }
        return resp;
    }
    /////////////////////////////

    public void ranking()
    {
        this.lista.sort(armarRanking);

    }
/**
 * 
 */
    public static final Comparator<Usuario> armarRanking = (Usuario user1, Usuario user2) ->

    {
        return (int) Math.signum(user2.getCantidadVecesGanadas() - user1.getCantidadVecesGanadas());
    };
/**
 * 
 * @param nombre
 * @return 
 */
    public boolean actualizarPuntos(Usuario nombre)
    {
        boolean usuario = false;

        for (int i = 0; i < this.lista.size(); i++)
        {
            Usuario usuar = this.lista.get(i);

            if (nombre.getNombre().compareToIgnoreCase(usuar.getNombre()) == 0)
            {
                usuar.setCantidadVecesGanadas(nombre.getCantidadVecesGanadas());
            }
        }

        return usuario;

    }

// </editor-fold>
}
