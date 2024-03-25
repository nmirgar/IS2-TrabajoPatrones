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
public class SubTier1 implements EstrategiaSubs {

    private final double precioT1 = 4.99;

    @Override
    public void pagarSuscripcion(Suscriptor sub, Streamer streamer) {
        System.out.println("El usuario" + sub.getUserNickname() + "se ha suscrito a" + streamer.getUserNickname() + " con Tier 1 pagando: " + precioT1 + "€");
        
    }
}
