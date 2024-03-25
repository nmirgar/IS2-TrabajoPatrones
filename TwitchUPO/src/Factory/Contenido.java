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
    private String nickname;

    public Contenido(int id, String titulo, Date fecha, String nickname) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.nickname = nickname;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", titulo=" + titulo + ", fecha=" + fecha + ", nickname=" + nickname + '}';
    }

}
