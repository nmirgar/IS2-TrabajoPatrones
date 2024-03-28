/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import java.util.*;

public class Suscriptor implements Observador {

    private Usuario usuario;
    private ArrayList<Streamer> suscripciones; // Streamers suscritos
    private EstrategiaSubs estrategiaSubs;

    public Suscriptor(Usuario usuario, Streamer streamerSuscrito) {
        this.usuario = usuario;
        this.suscripciones.add(streamerSuscrito);
        this.estrategiaSubs = new SubTier1(); // La sub por defecto es la Tier1
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ArrayList<Streamer> getStreamersSuscritos() {
        return suscripciones;
    }

    public void setEstrategiaSubs(EstrategiaSubs estrategiaSubs) {
        this.estrategiaSubs = estrategiaSubs;
    }

    public EstrategiaSubs getEstrategiaSubs() {
        return estrategiaSubs;
    }

    // Suscribirse - quitar suscripcion
    public void suscribirse(Streamer streamer) {
        this.suscripciones.add(streamer);
        estrategiaSubs.pagarSuscripcion(this, streamer);
        streamer.añadirSuscriptor(this);
    }

    public void cancelarSuscripcion(Streamer streamer) {
        this.suscripciones.remove(streamer);
        streamer.bajarSuscriptor(this);
    }

    // Renovar sub
    public void renovarSub(Streamer streamer) {
        Iterator<Streamer> it = this.getStreamersSuscritos().iterator();
        Streamer s = null;
        boolean exito = false;
        while (it.hasNext() && !exito) {
            s = (Streamer) it.next();
            if (s == streamer) {
                estrategiaSubs.pagarSuscripcion(this, s);
                exito = true;
            }
        }

    }

    // Metodo ESTRATEGIA cambiar suscripcion
    public void cambiarSuscripcion(String tipoSub) {

        switch (tipoSub) {
            case "Prime":
                if (!(estrategiaSubs instanceof SubPrime)) {
                    setEstrategiaSubs(new SubPrime());
                }
                break;
            case "Tier1":
                if (!(estrategiaSubs instanceof SubTier1)) {
                    setEstrategiaSubs(new SubTier1());
                }
                break;
            case "Tier2":
                if (!(estrategiaSubs instanceof SubTier2)) {
                    setEstrategiaSubs(new SubTier2());
                }
                break;
            case "Tier3":
                if (!(estrategiaSubs instanceof SubTier3)) {
                    setEstrategiaSubs(new SubTier3());
                }
                break;
        }
    }

    // Notificacion contenido
    public void update(Streamer s, Contenido c) {

        System.out.println(
                "\nEl Streamer " + s.getUserNickname() + "acaba de subir nuevo contenido: " + c.getTitulo());
    }

    @Override
    public String toString() {
        return "Suscriptor{" + "usuario=" + usuario.getUserNickname() + ", streamerSuscrito=" + suscripciones
                + ", estrategiaSubs=" + estrategiaSubs + '}';
    }

}