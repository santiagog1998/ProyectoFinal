/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import java.io.File;


public class Comentario {
    private Usuario comentarista; 
    private String texto; 

    public Comentario(String texto) {
        this.texto = texto;
    }

    public Comentario() {
        
    }
    File comentarios=new File("comentarios.txt");
        
    
    
    
}
