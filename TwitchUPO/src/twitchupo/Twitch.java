/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import Factory.Clip;
import Factory.Directo;
import Factory.VOD;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nuria
 */
public class Twitch {

    private final List<Directo> directos;
    private final List<VOD> vods;
    private final List<Clip> clips;

    private final List<Usuario> usuarios;
    private final List<Streamer> streamers;

    public static Twitch twitch; //Para el patron SINGLETON

    private Twitch() {
        this.directos = new ArrayList<>();
        this.vods = new ArrayList<>();
        this.clips = new ArrayList<>();

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
    public void hacerDirecto(String titulo, Date fecha, Streamer streamer) {
        Directo d = new Directo(directos.size(), titulo, fecha, streamer);
        //State boolean en directo o lo que queramos hacer -> boolean online true
        this.directos.add(d);
    }

    public void subirVOD(String titulo, Date fecha, Streamer streamer) {
        VOD vod = new VOD(vods.size(), titulo, fecha, streamer);
        this.vods.add(vod);
    }

    public void hacerClip(String titulo, Date fecha, int duracion, Usuario usuario) {
        Clip c = new Clip(clips.size(),titulo, fecha, duracion, usuario);
        this.clips.add(c);
    }

    //Eliminar Contenido
    public void borrarDirecto(Directo d) {
        this.directos.remove(d);
    }

    public void borrarVOD(VOD vod) {
        this.vods.remove(vod);
    }

    public void borrarClip(Clip c) {
        this.clips.remove(c);
    }

    //Listar Contenido
    public void listarDirectos(Streamer streamer) {
        Iterator it = directos.iterator();
        while (it.hasNext()) {
            Directo d = (Directo) it.next();
            if (d.getStreamer().getUserNickname().equals(streamer.getUserNickname())) {
                System.out.println(d);
            }
        }
    }

    public void listarVODs(Streamer streamer) {
        Iterator it = vods.iterator();
        while (it.hasNext()) {
            VOD v = (VOD) it.next();
            if (v.getStreamer().getUserNickname().equals(streamer.getUserNickname())) {
                System.out.println(v);
            }
        }
    }

    public void listarClips(Streamer streamer) {
        Iterator it = clips.iterator();
        while (it.hasNext()) {
            Clip c = (Clip) it.next();
            if (c.getUsuario().getUserNickname().equals(streamer.getUserNickname())) {
                System.out.println(c);
            }
        }
    }

    //Acceder a un contenido concreto pot su id
    public Directo getDirecto(int id) {
        Iterator it = directos.iterator();
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
        Iterator it = vods.iterator();
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
        Iterator it = clips.iterator();
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
        Iterator it = usuarios.iterator();
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

    //Buscar streamer
    public Streamer buscarStreamer(Streamer streamer) {
        Iterator it = streamers.iterator();
        Streamer s = null;
        boolean exito = false;
        while (it.hasNext() && !exito) {
            s = (Streamer) it.next();
            if (s.getUserNickname().equals(streamer.getUserNickname())) {
                exito = true;
            }
        }
        return s;
    }

}
