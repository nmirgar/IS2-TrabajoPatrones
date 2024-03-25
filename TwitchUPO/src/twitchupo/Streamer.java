/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import Strategy.Suscriptor;
import java.util.List;

/**
 *
 * @author nuria
 */
public class Streamer extends Usuario {

    private List<Usuario> seguidores;
    private List<Suscriptor> suscriptores;

    public Streamer(int id, String userNickname, String contraseña, String biografia, String correo) {
        super(id, userNickname, contraseña, biografia, correo);
    }

    public List<Usuario> getSeguidores() {
        return seguidores;
    }

    public List<Suscriptor> getSuscriptores() {
        return suscriptores;
    }

    //Añadir gente
    public void añadirSeguidor(Usuario usu) {
        this.seguidores.add(usu);
    }

    public void añadirSuscriptor(Suscriptor sub) {
        this.suscriptores.add(sub);
    }

    //Se va gente
    public void bajarSeguidor(Usuario usu) {
        this.seguidores.remove(usu);
    }

    public void bajarSuscriptor(Suscriptor sub) {
        this.suscriptores.remove(sub);
    }

    @Override
    public String toString() {
        return "Streamer" + super.toString();
    }

}
