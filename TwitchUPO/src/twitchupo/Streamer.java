/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Streamer extends Usuario implements Estado {

    private List<Usuario> seguidores;
    private List<Suscriptor> suscriptores;

    private List<Contenido> contenidoSubido;

    private double sueldo = 0;
    private String estado = DESCONECTADO;

<<<<<<< HEAD
=======
    
>>>>>>> fd20228d40be074209691926c87a51ca9e733db6
    public Streamer(int id, String userNickname, String contraseña, String biografia, String correo) {
        super(id, userNickname, contraseña, biografia, correo);
        this.seguidores = new ArrayList<Usuario>();
        this.suscriptores = new ArrayList<Suscriptor>();
        this.contenidoSubido = new ArrayList<Contenido>();
<<<<<<< HEAD
=======
    }
    public Streamer(Usuario u){
        super(u.getId(), u.getUserNickname(), u.getContraseña(), u.getBiografia(), u.getCorreo());
        this.seguidores = new ArrayList<Usuario>();
        this.suscriptores = new ArrayList<Suscriptor>();
        this.contenidoSubido = new ArrayList<Contenido>();
>>>>>>> fd20228d40be074209691926c87a51ca9e733db6
    }
    public List<Usuario> getSeguidores() {
        return seguidores;
    }

     public List<Contenido> getContenidoSubido() {
        return contenidoSubido;
    }

    public List<Suscriptor> getSuscriptores() {
        return suscriptores;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado() {
        if(estado.equals(DESCONECTADO)){
            this.estado = conectarse();
        }else if(estado.equals(CONECTADO)){ 
            this.estado = desconectarse();
        }
    }

    //Añadir gente - desde USUARIO
    public void añadirSeguidor(Usuario usu) {
        this.seguidores.add(usu);
    }

    public void añadirSuscriptor(Suscriptor sub) {
        this.suscriptores.add(sub);
    }

    //Banneo gente / te deja de seguir gente
    public void bajarSeguidor(Usuario usu) {
        this.seguidores.remove(usu);
    }

    public void bajarSuscriptor(Suscriptor sub) {
        this.suscriptores.remove(sub);
    }
<<<<<<< HEAD

=======
>>>>>>> fd20228d40be074209691926c87a51ca9e733db6
    //Contenido
    public void subirContenido(Contenido d){
        this.contenidoSubido.add(d);
    }

<<<<<<< HEAD
    //Conectarse / desconectarse
    public String conectarse(){
        StreamerConectarse sc = new StreamerConectarse();
        return sc.conectarse();
    }
    public String desconectarse(){
        StreamerDesconectarse sd = new StreamerDesconectarse();
        return sd.desconectarse();
    }

    //Cobrar
=======
    public String conectarse() {
        StreamerConectarse sc = new StreamerConectarse();
        this.estado = sc.conectarse();
        return this.estado;
    }

    public String desconectarse() {
        StreamerDesconectarse sd = new StreamerDesconectarse();
        this.estado = sd.desconectarse();
        return this.estado;
    }
>>>>>>> fd20228d40be074209691926c87a51ca9e733db6
    public double cobrar() {
        Suscriptor s;
        Iterator<Suscriptor> it = suscriptores.iterator();
        while (it.hasNext()) {
            s = (Suscriptor) it.next();
            if (s.getEstrategiaSubs() instanceof SubTier1) {
                sueldo += SubTier1.getPrecioT1()/ 2;
            } else if (s.getEstrategiaSubs() instanceof SubTier2) {
                sueldo += SubTier2.getPrecioT2() / 2;
            } else if (s.getEstrategiaSubs() instanceof SubTier3) {
                sueldo += SubTier3.getPrecioT3() / 2;
            } else {
                sueldo += 1;

            }
        }
        return sueldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado() {
        if (estado.equals(DESCONECTADO)) {
            this.estado = conectarse();
        } else if (estado.equals(CONECTADO)) {
            this.estado = desconectarse();
        }
    }

    @Override
    public String toString() {
        return "Streamer" + super.toString() + "Sueldo: " + sueldo;
    }

<<<<<<< HEAD
}
=======
    

}
>>>>>>> fd20228d40be074209691926c87a51ca9e733db6
