/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nuria
 */
public class Usuario {

    int id;
    String userNickname;
    String contraseña;
    String biografia;
    String correo;

    //Lista sigo, y suscrito
    //Lista suscriptores
    
    public Usuario(int id, String userNickname, String contraseña, String biografia, String correo) {
        this.id = id;
        this.userNickname = userNickname;
        this.contraseña = contraseña;
        this.biografia = biografia;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void seguir(Streamer streamer) {
        streamer.añadirSeguidor(this);
    }

    public void dejarDeSeguir(Streamer streamer) {
        streamer.bajarSeguidor(this);
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", userNickname=" + userNickname + ", contrase\u00f1a=" + contraseña + ", biografia=" + biografia + ", correo=" + correo + '}';
    }

}
