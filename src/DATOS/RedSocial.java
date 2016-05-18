/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATOS;

import java.util.ArrayList;

/**
 *
 * @author inteldemo
 */
public class RedSocial {
    protected ArrayList<Usuario> usuarios= new ArrayList<Usuario>();
    protected ArrayList<Evento> eventos= new ArrayList<Evento>();

    public RedSocial(ArrayList<Usuario> usuarios,ArrayList<Evento> eventos) {
        this.usuarios=usuarios;
        this.eventos=eventos;
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    
    
}
