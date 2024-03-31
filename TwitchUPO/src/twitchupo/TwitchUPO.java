/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twitchupo;


public class TwitchUPO {

    public static void main(String[] args) {
        Twitch t = Twitch.create();

        t.añadirUsuario(new Usuario(1, "pGarMar", "", "Pepe Garcia Martinez", "pgarmar@alu.upo.es"));
        t.añadirUsuario(new Usuario(2, "fSanchez", "", "Fran Sanchez", "fsan100102@gmail.com"));
        t.añadirUsuario(new Usuario(3, "LucyGG", "", "Lucia Gomez Gomez", "lucyGG10291@gmail.com"));
        Streamer s = new Streamer(1, "Illojuan", "", "Illo, soy Juan, tengo un canal en Youtube que se llama LMDShow y aquí hago directos de cosas. Soy de Málaga y llevo a mi espalda 29 años de jolgorio.", "illojuan@gmail.com");
        t.añadirStreamer(s);

        Usuario u = t.getUsuarios().get(0);
        u.suscribirse(s);
        int x = s.getSuscriptores().indexOf(u);
        Suscriptor sub = s.getSuscriptores().get(x);
        sub.cambiarSuscripcion("Tier2");
        sub.getEstrategiaSubs().pagarSuscripcion(sub, s);
        s.conectarse();
        FactoriaContenido fc = new FactoriaContenido();
        fc.crearContenido("Directo", s);
        s.desconectarse();
        
    }
    
}
