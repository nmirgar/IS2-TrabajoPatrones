/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import java.util.*;

public class Suscriptor extends Usuario implements Observador {

    private ArrayList<Streamer> suscripciones; //Streamer suscritos
    private EstrategiaSubs estrategiaSubs;

    public Suscriptor(Usuario u, Streamer s) {
        super(u.getId(), u.getUserNickname(), u.getContraseña(), u.getBiografia(), u.getCorreo());
        this.suscripciones = new ArrayList<>();
        this.suscripciones.add(s);
        // La sub por defecto es la Tier1
        this.estrategiaSubs = new SubTier1();
        suscribirse(s);
    }

    public Suscriptor getSuscriptor() {
        return this;
    }

    public ArrayList<Streamer> getsuscripciones() {
        return suscripciones;
    }

    public void setEstrategiaSubs(EstrategiaSubs estrategiaSubs) {
        this.estrategiaSubs = estrategiaSubs;
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
        Iterator<Streamer> it = suscripciones.iterator();
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

    public EstrategiaSubs getEstrategiaSubs() {
        return estrategiaSubs;
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



    public void update(Streamer s, Contenido c) {
        switch (c) {
            case Directo d -> System.out.println("\nEl Streamer " + s.getUserNickname()
                    + " acaba de subir un nuevo directo: " + c.getTitulo() + ".\n");
            case VOD v -> System.out.println(
                    "\nEl Streamer " + s.getUserNickname() + " acaba de subir un nuevo VOD: " + c.getTitulo() + ".\n");
            case Clip clip -> System.out.println(
                    "\nEl Streamer " + s.getUserNickname() + " acaba de subir un nuevo Clip: " + c.getTitulo() + ".\n");
            default -> System.out.println("\nEl Streamer " + s.getUserNickname() + " acaba de subir nuevo contenido: "
                    + c.getTitulo() + ".\n");
        }
    }

    @Override
    public String toString() {
        return "Suscriptor{" + "usuario=" + this.getUserNickname() + ", suscripciones=" + suscripciones
                + ", estrategiaSubs=" + estrategiaSubs + '}';
    }

}
