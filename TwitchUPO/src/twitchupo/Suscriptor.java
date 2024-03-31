/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;
import java.util.*;

public class Suscriptor implements Observador {

    private Usuario usuario;
    private ArrayList<Streamer> streamerSuscrito;
    private EstrategiaSubs estrategiaSubs;

    public Suscriptor(Usuario usuario, Streamer streamerSuscrito) {
        this.usuario = usuario;
        this.streamerSuscrito = new ArrayList<>();
        this.streamerSuscrito.add(streamerSuscrito);
        // La sub por defecto es la Tier1
        this.estrategiaSubs = new SubTier1();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ArrayList<Streamer> getStreamerSuscrito() {
        return streamerSuscrito;
    }

    public void setEstrategiaSubs(EstrategiaSubs estrategiaSubs) {
        this.estrategiaSubs = estrategiaSubs;
    }

    public EstrategiaSubs getEstrategiaSubs() {
        return estrategiaSubs;
    }

    // Metodo ESTRATEGIA cambiar suscripcion
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

    public void pagar() {
        Iterator<Streamer> it = this.getStreamerSuscrito().iterator();
        while (it.hasNext()) {
            estrategiaSubs.pagarSuscripcion(this, (Streamer) it.next());
        }
        
    }

    public void update(Streamer s, Contenido c){
        switch (c){
            case Directo d -> System.out.println("\nEl Streamer " + s.getUserNickname() + " acaba de subir un nuevo directo: " + c.getTitulo() +".\n");
            case VOD v -> System.out.println("\nEl Streamer " + s.getUserNickname() + " acaba de subir un nuevo VOD: " + c.getTitulo() +".\n");
            case Clip clip -> System.out.println("\nEl Streamer " + s.getUserNickname() + " acaba de subir un nuevo Clip: " + c.getTitulo() + ".\n");
            default -> System.out.println("\nEl Streamer " + s.getUserNickname() + " acaba de subir nuevo contenido: " + c.getTitulo() + ".\n");
        }
    }

    @Override
    public String toString() {
        return "Suscriptor{" + "usuario=" + usuario.getUserNickname() + ", streamerSuscrito=" + streamerSuscrito
                + ", estrategiaSubs=" + estrategiaSubs + '}';
    }

}
