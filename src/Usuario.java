import java.util.*;
public class Usuario{

    ArrayList <Seguidor> seguidos = new ArrayList <Seguidor> ();
    ArrayList <Suscriptores> suscritos = new ArrayList <Suscriptores> ();
    Stream streamer;
    Usuario(){
        
    }

    //Se pasa Streamer
    public void seguir(Stream s){
        Seguidor seg = new Seguidor(s, this);
        seguidos.add(seg);
    }

    public void suscribir(Stream s){
        Suscriptores seg = new Suscriptores(s, this);
        suscritos.add(seg);
    }

    public void serStreamer(){
        streamer = new Stream(this);
    }

}