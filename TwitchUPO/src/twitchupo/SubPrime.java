/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;


public class SubPrime implements EstrategiaSubs {

    public static final double precioPrime = 0.00;

    @Override
    public void pagarSuscripcion(Suscriptor sub, Streamer streamer) {
        System.out.println("El usuario" + sub.getUsuario().getUserNickname() + "se ha suscrito a" + streamer.getUserNickname() + " con Prime pagando: " + precioPrime + "€");

    }

}