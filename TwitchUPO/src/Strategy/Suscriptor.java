/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

import twitchupo.Streamer;
import twitchupo.Usuario;

/**
 *
 * @author nuria
 */
public abstract class Suscriptor extends Usuario {

    private Streamer streamerSuscrito;

    private EstrategiaSubs estrategiaSubs;

    public final double precioPrime = 0.00;
    public final double precioT1 = 4.99;
    public final double precioT2 = 9.99;
    public final double precioT3 = 24.99;

    public Suscriptor(int id, String userNickname, String contraseña, String biografia, String correo, Streamer streamerSuscrito) {
        super(id, userNickname, contraseña, biografia, correo);
        this.streamerSuscrito = streamerSuscrito;
        //La sub por defecto es la Tier1
        this.estrategiaSubs = new SubTier1(this.getId(), this.getUserNickname(), this.getContraseña(), this.getBiografia(), this.getCorreo(), this.getStreamerSuscrito());
    }

    public Streamer getStreamerSuscrito() {
        return streamerSuscrito;
    }

    public EstrategiaSubs getEstrategiaSubs() {
        return estrategiaSubs;
    }

    public void setEstrategiaSubs(EstrategiaSubs estrategiaSubs) {
        this.estrategiaSubs = estrategiaSubs;
    }

    //Metodo cambiar suscripcion
    public void cambiarSuscripcion(String tipoSub) {

        switch (tipoSub) {
            case "Prime":
                if (!(estrategiaSubs instanceof SubPrime)) {
                    setEstrategiaSubs(new SubPrime(this.getId(), this.getUserNickname(), this.getContraseña(), this.getBiografia(), this.getCorreo(), this.getStreamerSuscrito()));
                }
                break;
            case "Tier1":
                if (!(estrategiaSubs instanceof SubTier1)) {
                    setEstrategiaSubs(new SubTier1(this.getId(), this.getUserNickname(), this.getContraseña(), this.getBiografia(), this.getCorreo(), this.getStreamerSuscrito()));
                }
                break;
            case "Tier2":
                if (!(estrategiaSubs instanceof SubTier2)) {
                    setEstrategiaSubs(new SubTier2(this.getId(), this.getUserNickname(), this.getContraseña(), this.getBiografia(), this.getCorreo(), this.getStreamerSuscrito()));
                }
                break;
            case "Tier3":
                if (!(estrategiaSubs instanceof SubTier3)) {
                    setEstrategiaSubs(new SubTier3(this.getId(), this.getUserNickname(), this.getContraseña(), this.getBiografia(), this.getCorreo(), this.getStreamerSuscrito()));
                }
                break;
        }
    }

    private void pagar() {
        estrategiaSubs.pagarSuscripcion();
    }

    @Override
    public String toString() {
        return "Suscriptor" + super.toString() + "streamerSuscrito=" + streamerSuscrito + ", estrategiaSubs=" + estrategiaSubs + '}';
    }

}
