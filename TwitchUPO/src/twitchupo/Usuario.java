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

    private List<Streamer> seguidos; //Sigo a streamers
    private List<Streamer> suscritos; //Me suscribo a streamers

    public Usuario(int id, String userNickname, String contraseña, String biografia, String correo) {
        this.id = id;
        this.userNickname = userNickname;
        this.contraseña = contraseña;
        this.biografia = biografia;
        this.correo = correo;
        this.seguidos = new ArrayList<Streamer>();
        this.suscritos = new ArrayList<Streamer>();
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

    public List<Streamer> getSuscritos() {
        return suscritos;
    }
    

    //Seguir -  dejar de seguir
    public void seguir(Streamer streamer) {       
        streamer.añadirSeguidor(this);
        this.seguidos.add(streamer);
    }

    public void dejarDeSeguir(Streamer streamer) {
        streamer.bajarSeguidor(this);
        this.seguidos.remove(streamer);
    }
    
    //Suscribirse - quitar suscripcion
    public void suscribirse(Streamer streamer){
        Suscriptor sub = new Suscriptor(this, streamer);
        streamer.añadirSuscriptor(sub);        
        this.suscritos.add(streamer);
        
    }
    
    public void cancelarSuscripcion(Streamer streamer){
        Suscriptor sub = new Suscriptor(this, streamer);
        streamer.bajarSuscriptor(sub);
        this.suscritos.remove(streamer);
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", userNickname=" + userNickname + ", contrase\u00f1a=" + contraseña + ", biografia=" + biografia + ", correo=" + correo + '}';
    }

}
