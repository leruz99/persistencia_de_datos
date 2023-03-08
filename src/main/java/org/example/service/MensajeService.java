package org.example.service;

import org.example.dao.MensajesDao;
import org.example.model.Mensajes;

import java.util.Scanner;

public class MensajeService {

    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Escribe el nombre");
        String nombreAutor = sc.nextLine();
        System.out.println("Escribe la fecha");
        String fecaheAutor = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombreAutor);
        registro.setFecheMensaje(fecaheAutor);
        MensajesDao.crearMensajeBD(registro);

    }
    public static void listarMensajes(){
        MensajesDao.leerMensajesBD();

    }
    public static void  borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Id del mensaje a borrar");
        int id = sc.nextInt();

        MensajesDao.brrarMensaje(id);


    }
    public static void editarMensaje(){

    }
}
