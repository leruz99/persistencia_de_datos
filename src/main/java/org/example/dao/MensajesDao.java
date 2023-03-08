package org.example.dao;

import org.example.Conexion;
import org.example.model.Mensajes;

import java.sql.*;

public class MensajesDao {
    public static void crearMensajeBD(Mensajes mensajes){
        Conexion dbConect = new Conexion();
        try(Connection connection = dbConect.getConection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje,fecha_mensaje) VALUES (?,?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, mensajes.getMensaje());
                ps.setString(2, mensajes.getAutorMensaje());
                ps.setString(3,mensajes.getFecheMensaje());
                ps.executeUpdate();
                System.out.println("Mensaje creado");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }


    }
    public static void leerMensajesBD(){
        Conexion dbConect = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try(Connection connection = dbConect.getConection()){
            String query = "SELECT * FROM mensajes";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("Id: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: "+ rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println(" ");
            }

        }catch (SQLException e){
            System.out.println("Error al momento de recuperar los mensajes ");
            System.out.println(e);
        }

    }
    public static void brrarMensaje(int idMensaje){
        Conexion dbConect = new Conexion();
        try(Connection connection = dbConect.getConection()){
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, idMensaje );
                ps.executeUpdate();
                System.out.println("Mensaje Borrado exitosamente");

            }catch (SQLException xe){
                System.out.println(xe);
            }
        }catch (SQLException e){

            System.out.println(e);
        }

    }
    public static void actualizarMensaje(Mensajes mensajes){

    }

}
