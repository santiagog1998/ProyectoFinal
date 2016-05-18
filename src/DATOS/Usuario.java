/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author LAURA
 */
public class Usuario {
    private String name; 
    private int edad; 
    private String correo; 
    private String nick; 
    private String password; 
    private ArrayList<Direccion>Ubicaciones;
    private String genero; 
    
    
    
    
   // ArrayList<Direccion>Ubicaciones= new ArrayList<Direccion>(); 

    public Usuario(String name, int edad, String correo, String nick, String password, ArrayList<Direccion> Ubicaciones, String genero) {
        this.name = name;
        this.edad = edad;
        this.correo = correo;
        this.nick = nick;
        this.password = password;
        this.Ubicaciones = Ubicaciones;
        this.genero = genero;
    }
    File archivosUser=new File ("usuarios.txt");
    
    
}
