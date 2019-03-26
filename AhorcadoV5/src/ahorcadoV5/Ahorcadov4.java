/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadoV5;

import forms.frmTodoElJuego;
import Entidades.Diccionario;
import Entidades.ListaUsuarios;


/**
 *
 * @author capacita_mecon
 */
public final class Ahorcadov4
{

    public static frmTodoElJuego ini;
    public static String USUARIO_ARCH = "Usuarios.xml";
    public static String DICC_ARCH = "Diccionario.xml";

    public static void main(String[] args)
    {
      //generarLIstas();
       ini = new frmTodoElJuego();
       ini.setVisible(true);
    }

    /**
     * Automatiza la generacion de listas y la guarda en archivo
     */
    public static void generarLIstas()
    {
        Diccionario lista = new Diccionario();
       // ListaUsuarios listaUser = new ListaUsuarios();
       // listaUser.generar();
        //ListaUsuarios.guardarUsuarios(listaUser, USUARIO_ARCH);
        lista.generar();
        Diccionario.guardarArchivoDiccionario(lista, DICC_ARCH);
    }

    /**
     * Cambia nombre de archivos
     *
     * @param archivo
     */
    public static void cambiarNombreArchivousuario(String archivo)
    {
        USUARIO_ARCH = archivo;
    }

    public static void cambiarNombreArchivoDiccionario(String archivo)
    {
        DICC_ARCH = archivo;
    }

}
