/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

/**
 *
 * @author nuria
 */
public class Seguidor extends Usuario {

    private Streamer streamerSeguido;

    public Seguidor(int id, String userNickname, String contraseña, String biografia, String correo, Streamer streamerSeguido) {
        super(id, userNickname, contraseña, biografia, correo);
        this.streamerSeguido = streamerSeguido;
    }

    public void seguir() {
        streamerSeguido.añadirSeguidor(this);
    }

    public void dejarDeSeguir() {
        streamerSeguido.bajarSeguidor(this);
    }

    @Override
    public String toString() {
        return "Seguidor" + super.toString() + "streamerSeguido=" + streamerSeguido + '}';
    }

}
