/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;


public class Evento {
    private String nombre; 
    private String tipo; 
    private Usuario creador; 
    private Date fecha; 
    private Image image; 
    private Comentario descripcion; 
    private ArrayList<Usuario> asistentes; 

    public Evento(String nombre, String tipo, Usuario creador, Date fecha, Image image, Comentario descripcion, ArrayList<Usuario> asistentes) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.creador = creador;
        this.fecha = fecha;
        this.image = image;
        this.descripcion = descripcion;
        this.asistentes = asistentes;
    }


    File archivoEvents=new File ("eventos.txt");
    
    
    
    
    
}
