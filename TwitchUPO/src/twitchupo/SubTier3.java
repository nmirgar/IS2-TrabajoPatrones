/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

public class SubTier3 implements EstrategiaSubs {

    private static final double precioT3 = 24.99;

    public static double getPrecioT3() {
        return precioT3;
    }

    @Override
    public void pagarSuscripcion(Suscriptor sub, Streamer streamer) {
        System.out.println("El usuario " + sub.getUsuario().getUserNickname() + " se ha suscrito a " + streamer.getUserNickname() + " con Tier 3 pagando: " + precioT3 + "€");

    }
}
