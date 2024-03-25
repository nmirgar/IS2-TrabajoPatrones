/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import Factory.Clip;
import Factory.Directo;
import Factory.VOD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author nuria
 */
public class Twitch {

    private List<Directo> directos;
    private List<VOD> vods;
    private List<Clip> clips;

    private List<Usuario> usuarios;
    private List<Streamer> streamers;

    public static Twitch twitch; //Para el patron SINGLETON

    private Twitch() {
        this.directos = new ArrayList<>();
        this.vods = new ArrayList<>();
        this.clips = new ArrayList<>();
    }

    //Metodo de unica instancia
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

    //Añadir contenido
    public void añadirDirecto(Directo d) {
        this.directos.add(d);
    }

    public void añadirVOD(VOD vod) {
        this.vods.add(vod);
    }

    public void añadirClip(Clip c) {
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
    public void listarDirectos(String userNickname) {
        Iterator it = directos.iterator();
        while (it.hasNext()) {
            Directo d = (Directo) it.next();
            if (d.getUserNickname().equals(userNickname)) {
                System.out.println(d);
            }
        }
    }

    public void listarVODs(String userNickname) {
        Iterator it = vods.iterator();
        while (it.hasNext()) {
            VOD v = (VOD) it.next();
            if (v.getUserNickname().equals(userNickname)) {
                System.out.println(v);
            }
        }
    }

    public void listarClips(String userNickname) {
        Iterator it = clips.iterator();
        while (it.hasNext()) {
            Clip c = (Clip) it.next();
            if (c.getUserNickname().equals(userNickname)) {
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

    //Añadir / quitar streamers
    public void añadirStreamer(Streamer s) {
        this.streamers.add(s);
    }

    public void eliminarStreamer(Streamer s) {
        this.streamers.remove(s);
    }

    //Buscar Usuario
    public Usuario buscarUsuario(String userNickname) {
        Iterator it = usuarios.iterator();
        Usuario u = null;
        boolean exito = false;
        while (it.hasNext() && !exito) {
            u = (Usuario) it.next();
            if (u.getUserNickname().equals(userNickname)) {
                exito = true;
            }
        }
        return u;
    }

    //Buscar streamer
    public Streamer buscarStreamer(String userNickname) {
        Iterator it = streamers.iterator();
        Streamer s = null;
        boolean exito = false;
        while (it.hasNext() && !exito) {
            s = (Streamer) it.next();
            if (s.getUserNickname().equals(userNickname)) {
                exito = true;
            }
        }
        return s;
    }

}
