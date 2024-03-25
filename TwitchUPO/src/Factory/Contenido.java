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
public abstract class Contenido {

    private int id;
    private String titulo;
    private Date fecha;
    private String userNickname;

    public Contenido(int id, String titulo, Date fecha, String userNickname) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.userNickname = userNickname;
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

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", titulo=" + titulo + ", fecha=" + fecha + ", nickname=" + userNickname + '}';
    }

}
