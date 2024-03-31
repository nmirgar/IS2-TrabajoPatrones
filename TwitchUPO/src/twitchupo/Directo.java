/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import java.util.Date;

public class Directo extends Contenido{
    
    private Streamer streamer;
    
    //Patron state

    public Directo(int id, String titulo, Date fecha, Streamer streamer) {
        super(id, titulo, fecha, streamer);
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
