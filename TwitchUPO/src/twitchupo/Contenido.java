/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import java.util.*;

public abstract class Contenido implements Sujeto {

    private int id;
    private String titulo;
    private Date fecha;
    private ArrayList <Observador> observadores;

    public Contenido(int id, String titulo, Date fecha) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    public void notificarObservador(Contenido c) {

      
        switch (c) {
            case Directo d -> {
                Iterator <Suscriptor> it = d.getStreamer().getSuscriptores().iterator();
                while(it.hasNext()){
                    Suscriptor s = (Suscriptor) it.next();
                    if (observadores.contains(s)) {
                        s.update(d.getStreamer(), d);
                    }
                }
                
            }      
            case VOD v -> {
                Iterator <Suscriptor> it = v.getStreamer().getSuscriptores().iterator();
                while (it.hasNext()) {
                    Suscriptor s = (Suscriptor) it.next();
                    if(observadores.contains(s)){
                        s.update(v.getStreamer(), v);
                    }
                }
                
            }
            case Clip clip ->{
                Usuario u = clip.getUsuario();
                if( u instanceof Streamer){
                    Streamer str = (Streamer) u;
                    Iterator <Suscriptor> it = str.getSuscriptores().iterator();
                    while (it.hasNext()) {
                        Suscriptor s = (Suscriptor) it.next();
                        if (observadores.contains(s)) {
                            s.update(str, clip);
                        }
                    }

                }
            }
            default ->{
            }
                
        }

        
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", titulo=" + titulo + ", fecha=" + fecha + '}';
    }

}
