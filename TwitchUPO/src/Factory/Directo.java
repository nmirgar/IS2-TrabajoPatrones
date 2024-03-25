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
public class Directo extends Contenido {

    public Directo(int id, String titulo, Date fecha, String userNickname) {
        super(id, titulo, fecha, userNickname);
    }

    @Override
    public String toString() {
        return "Directo" + super.toString();
    }

}
