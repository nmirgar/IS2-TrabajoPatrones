package twitchupo;

import java.util.*;

public abstract class Contenido implements Sujeto {

    private int id;
    private String titulo;
    private Date fecha;
    private ArrayList <Observador> observadores;

    public Contenido(int id, String titulo, Date fecha, Usuario u) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        
        if(u instanceof Streamer){
            Streamer s = (Streamer) u;
            this.observadores = new ArrayList<>(s.getSuscriptores());
        }
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
    
    // Patron observador
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