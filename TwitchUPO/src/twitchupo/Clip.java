/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import java.util.Date;

public class Clip extends Contenido {

    private int duracion;
    private Usuario usuario; //Los clips los puede generar cualquiera

    public Clip(int id, String titulo, Date fecha, int duracion, Usuario usuario) {
        super(id, titulo, fecha, usuario);
        this.duracion = duracion;
        this.usuario = usuario;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    

    @Override
    public String toString() {
        return "Clip" + super.toString() + "duracion=" + duracion + '}' + "Creado por: " + usuario.getUserNickname();
    }

}
