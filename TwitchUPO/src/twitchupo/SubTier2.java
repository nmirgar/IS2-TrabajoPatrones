/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

public class SubTier2 implements EstrategiaSubs {

    private static final double precioT2 = 9.99;

    public static double getPrecioT2() {
        return precioT2;
    }

    @Override
    public void pagarSuscripcion(Suscriptor sub, Streamer streamer) {
        System.out.println("El usuario" + sub.getStreamerSuscrito().getUserNickname() + "se ha suscrito a" + sub.getUsuario().getUserNickname() + " con Tier 2 pagando: " + precioT2 + "€");

    }

}
