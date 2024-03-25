/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import java.util.Date;

/**
 *
 * @author nuria
 */
public class Clip extends Contenido {

    private int duracion;

    public Clip(int id, String titulo, Date fecha, String userNickname, int duracion) {
        super(id, titulo, fecha, userNickname);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Clip" + super.toString() + "duracion=" + duracion + '}';
    }

}
