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
public class Suscriptor {

    private Usuario usuario;
    private Streamer streamerSuscrito;
    private EstrategiaSubs estrategiaSubs;

    public Suscriptor(Usuario usuario, Streamer streamerSuscrito) {
        this.usuario = usuario;
        this.streamerSuscrito = streamerSuscrito;

        //La sub por defecto es la Tier1
        this.estrategiaSubs = new SubTier1();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Streamer getStreamerSuscrito() {
        return streamerSuscrito;
    }    

    public void setEstrategiaSubs(EstrategiaSubs estrategiaSubs) {
        this.estrategiaSubs = estrategiaSubs;
    }

    public EstrategiaSubs getEstrategiaSubs() {
        return estrategiaSubs;
    }

    //Metodo ESTRATEGIA cambiar suscripcion
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
        return "Suscriptor{" + "usuario=" + usuario.getUserNickname() + ", streamerSuscrito=" + streamerSuscrito + ", estrategiaSubs=" + estrategiaSubs + '}';
    }

}
