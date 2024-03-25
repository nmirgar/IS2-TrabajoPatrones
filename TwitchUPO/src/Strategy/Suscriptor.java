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
public class Suscriptor extends Usuario {

    private Streamer streamerSuscrito;

    private EstrategiaSubs estrategiaSubs;
    

    public Suscriptor(int id, String userNickname, String contraseña, String biografia, String correo, Streamer streamerSuscrito) {
        super(id, userNickname, contraseña, biografia, correo);
        this.streamerSuscrito = streamerSuscrito;
        //La sub por defecto es la Tier1
        this.estrategiaSubs = new SubTier1();
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

    private void pagar() {
        estrategiaSubs.pagarSuscripcion(this, this.getStreamerSuscrito());
    }

    @Override
    public String toString() {
        return "Suscriptor" + super.toString() + "streamerSuscrito=" + streamerSuscrito + ", estrategiaSubs=" + estrategiaSubs + '}';
    }

}
