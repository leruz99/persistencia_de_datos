package org.example;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.getConection()){

        }catch (Exception e){
            System.out.println(e);
        }
    }
}