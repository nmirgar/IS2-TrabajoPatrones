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
        Usuario u2 = t.getUsuarios().get(1);
        Usuario u3 = t.getUsuarios().get(2);
        Suscriptor sub = new Suscriptor(u, s);
        u3.seguir(s);
        System.out.println("\nSeguidores antes de dejar de seguir\n" + s.getSeguidores() + "\n");
        u3.dejarDeSeguir(s);
        System.out.println("\nSeguidores despues de dejar de seguir" + s.getSeguidores()+ "\n");

        Suscriptor sub2 = new Suscriptor(u2, s);
        System.out.println("\nSuscriptores: " + s.getSuscriptores()+ "\n");
        sub2.cancelarSuscripcion(s);
        System.out.println("\nDespues de cancelar suscripcion" + s.getSuscriptores()+ "\n");
       
        sub.cambiarSuscripcion("Tier2");
        sub.getEstrategiaSubs().pagarSuscripcion(sub, s);
        s.setEstado();
        System.out.println(s.getEstado());
        FactoriaContenido.crearContenido("Directo", s);
        FactoriaContenido.crearContenido("VOD", s);
        FactoriaContenido.crearContenido("Clip", s);
        s.setEstado();
        System.out.println(s.getEstado());
        
        System.out.println();
        t.listarDirectos(s);
        System.out.println();
        t.listarClips(s);
        System.out.println();
        t.listarVODs(s);
            
        System.out.println("Usuario: " + t.buscarUsuario(u));
        System.out.println("Streamer:" + t.buscarUsuario(s));
        
        t.borrarDirecto(t.getDirecto(0));
        t.borrarClip(t.getClip(0));
        t.borrarVOD(t.getVod(0));

        t.eliminarStreamer(s);
        t.eliminarUsuario(u);


    }
    
}
