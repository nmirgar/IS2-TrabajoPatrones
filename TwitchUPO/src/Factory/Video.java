/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Factory;

/**
 *
 * @author nuria
 */
public class Video implements FactoriaContenido{

    @Override
    public Clip crearClip() {
        return new Clip();
     }

    @Override
    public VOD subirVOD() {
        return new VOD();
    }

    @Override
    public Directo abrirDirecto() {
        return new Directo();
    }

}
