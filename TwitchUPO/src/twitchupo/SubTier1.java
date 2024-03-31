/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;



public class SubTier1 implements EstrategiaSubs {

    private static final double precioT1 = 4.99;

    public static double getPrecioT1() {
        return precioT1;
    }
    

    @Override
    public void pagarSuscripcion(Suscriptor sub, Streamer streamer) {
        System.out.println("El usuario " + sub.getSuscriptor().getUserNickname() + " se ha suscrito a " + streamer.getUserNickname() + " con Tier 1 pagando: " + precioT1 + "€");
        
    }
}
