/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import java.util.Date;

public abstract class Contenido implements Sujeto {

    private int id;
    private String titulo;
    private Date fecha;

    public Contenido(int id, String titulo, Date fecha) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
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


    @Override
    public String toString() {
        return "{" + "id=" + id + ", titulo=" + titulo + ", fecha=" + fecha + '}';
    }

}
