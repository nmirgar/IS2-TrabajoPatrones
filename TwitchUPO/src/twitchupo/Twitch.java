/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Twitch {

    private List<Directo> directos;
    private List<VOD> vods;
    private List<Clip> clips;
    private List<Contenido> contenido;

    private List<Usuario> usuarios;
    private List<Streamer> streamers;

    public static Twitch twitch; //Para el patron SINGLETON

    private Twitch() {
        this.directos = new ArrayList<>();
        this.vods = new ArrayList<>();
        this.clips = new ArrayList<>();
        this.contenido = new ArrayList<>();
<<<<<<< HEAD

=======
>>>>>>> fd20228d40be074209691926c87a51ca9e733db6
        this.usuarios = new ArrayList<>();
        this.streamers = new ArrayList<>();
    }

    //Metodo de unica instancia - SINGLETON
    public static Twitch create() {
        if (twitch == null) {
            twitch = new Twitch();
        }
        return twitch;
    }

    public List<Directo> getDirectos() {
        return directos;
    }

    public List<Contenido> getContenido() {
        return contenido;
    }

    public List<VOD> getVods() {
        return vods;
    }

    public List<Clip> getClips() {
        return clips;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Streamer> getStreamers() {
        return streamers;
    }
    

    //Añadir contenido
    public void hacerDirecto(Directo d) {
        this.directos.add(d);
        this.contenido.add(d);
        d.notificarObservador(d);
        
    }

    public void subirVOD(VOD vod) {
        this.vods.add(vod);
        this.contenido.add(vod);
        vod.notificarObservador(vod);
        

    }

    public void hacerClip(Clip c) {
        this.clips.add(c);
        this.contenido.add(c);
        c.notificarObservador(c);
        
    }

    //Eliminar Contenido
    public void borrarDirecto(Directo d) {
        this.directos.remove(d);
        this.contenido.remove(d);
    }

    public void borrarVOD(VOD vod) {
        this.vods.remove(vod);
        this.contenido.remove(vod);
    }

    public void borrarClip(Clip c) {
        this.clips.remove(c);
        this.contenido.remove(c);

    }

    //Listar Contenido
    public void listarDirectos(Streamer streamer) {
        Iterator<Directo> it = directos.iterator();
        while (it.hasNext()) {
            Directo d = (Directo) it.next();
            if (d.getStreamer().getUserNickname().equals(streamer.getUserNickname())) {
                System.out.println(d);
            }
        }
    }

    public void listarVODs(Streamer streamer) {
        Iterator<VOD> it = vods.iterator();
        while (it.hasNext()) {
            VOD v = (VOD) it.next();
            if (v.getStreamer().getUserNickname().equals(streamer.getUserNickname())) {
                System.out.println(v);
            }
        }
    }

    public void listarClips(Streamer streamer) {
        Iterator<Clip> it = clips.iterator();
        while (it.hasNext()) {
            Clip c = (Clip) it.next();
            if (c.getUsuario().getUserNickname().equals(streamer.getUserNickname())) {
                System.out.println(c);
            }
        }
    }

    //Acceder a un contenido concreto pot su id
    public Directo getDirecto(int id) {
        Iterator<Directo> it = directos.iterator();
        boolean exito = false;
        Directo d = null;
        while (it.hasNext() && !exito) {
            d = (Directo) it.next();
            if (d.getId() == id) {
                exito = true;
            }
        }
        return d;
    }

    public VOD getVod(int id) {
        Iterator<VOD> it = vods.iterator();
        boolean exito = false;
        VOD v = null;
        while (it.hasNext() && !exito) {
            v = (VOD) it.next();
            if (v.getId() == id) {
                exito = true;
            }
        }
        return v;
    }

    public Clip getClip(int id) {
        Iterator<Clip> it = clips.iterator();
        boolean exito = false;
        Clip c = null;
        while (it.hasNext() && !exito) {
            c = (Clip) it.next();
            if (c.getId() == id) {
                exito = true;
            }
        }
        return c;
    }

    //Añadir o quitar gente
    public void añadirUsuario(Usuario u) {
        this.usuarios.add(u);
    }

    public void eliminarUsuario(Usuario u) {
        this.usuarios.remove(u);
    }

    //Añadir o quitar streamers
    public void añadirStreamer(Streamer s) {
        this.streamers.add(s);
    }

    public void eliminarStreamer(Streamer s) {
        this.streamers.remove(s);
    }

    //Buscar Usuario
    public Usuario buscarUsuario(Usuario usuario) {
        Iterator<Usuario> it = usuarios.iterator();
        Usuario u = null;
        boolean exito = false;
        while (it.hasNext() && !exito) {
            u = (Usuario) it.next();
            if (u.getUserNickname().equals(usuario.getUserNickname())) {
                exito = true;
            }
        }
        return u;
    }


}
