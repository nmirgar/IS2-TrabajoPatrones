/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private int id;
    private String userNickname;
    private String contraseña;
    private String biografia;
    private String correo;

<<<<<<< HEAD
    private List<Streamer> seguidos; // Sigo a streamers
=======
    private List<Streamer> seguidos; //Sigo a streamers

>>>>>>> fd20228d40be074209691926c87a51ca9e733db6

    public Usuario(int id, String userNickname, String contraseña, String biografia, String correo) {
        this.id = id;
        this.userNickname = userNickname;
        this.contraseña = contraseña;
        this.biografia = biografia;
        this.correo = correo;
        this.seguidos = new ArrayList<Streamer>();
<<<<<<< HEAD

=======
>>>>>>> fd20228d40be074209691926c87a51ca9e733db6
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

    public List<Streamer> getSeguidos() {
        return seguidos;
    }

<<<<<<< HEAD
    // Seguir - dejar de seguir
    public void seguir(Streamer streamer) {

=======
    //Seguir -  dejar de seguir
    public void seguir(Streamer streamer) {       
>>>>>>> fd20228d40be074209691926c87a51ca9e733db6
        streamer.añadirSeguidor(this);
        this.seguidos.add(streamer);
    }

    public void dejarDeSeguir(Streamer streamer) {
        streamer.bajarSeguidor(this);
        this.seguidos.remove(streamer);
    }
<<<<<<< HEAD
=======
    
   
>>>>>>> fd20228d40be074209691926c87a51ca9e733db6

    @Override
    public String toString() {
        return "{" + "id=" + id + ", userNickname=" + userNickname + ", contrase\u00f1a=" + contraseña + ", biografia="
                + biografia + ", correo=" + correo + '}';
    }

}
