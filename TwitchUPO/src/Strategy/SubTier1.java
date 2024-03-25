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
public class SubTier1 extends Suscriptor implements EstrategiaSubs {

    private double precio;

    public SubTier1(int id, String userNickname, String contraseña, String biografia, String correo, Streamer streamerSuscrito) {
        super(id, userNickname, contraseña, biografia, correo, streamerSuscrito);
        this.precio = super.precioT1;
    }

    @Override
    public void pagarSuscripcion() {
        System.out.println("El usuario" + this.getUserNickname() + "se ha suscrito a" + this.getStreamerSuscrito().getUserNickname() + " con Tier 1 pagando: " + this.precio + "€");

    }
}
