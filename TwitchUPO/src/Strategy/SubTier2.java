/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import Factory.Directo;
import twitchupo.Streamer;

/**
 *
 * @author nuria
 */
public class SubTier2 implements EstrategiaSubs {

    public final double precioT2 = 9.99;

    @Override
    public void pagarSuscripcion(Suscriptor sub, Streamer streamer) {
        System.out.println("El usuario" + sub.getStreamerSuscrito().getUserNickname() + "se ha suscrito a" + sub.getUsuario().getUserNickname() + " con Tier 2 pagando: " + precioT2 + "€");

    }

}
