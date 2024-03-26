/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import java.util.Date;
import twitchupo.Streamer;

/**
 *
 * @author nuria
 */
public class Directo extends Contenido {
    
    private Streamer streamer;
    //Patron state

    public Directo(int id, String titulo, Date fecha, Streamer streamer) {
        super(id, titulo, fecha);
        this.streamer = streamer;
    }

    public Streamer getStreamer() {
        return streamer;
    }

    @Override
    public String toString() {
        return "Directo" + super.toString();
    }

}
