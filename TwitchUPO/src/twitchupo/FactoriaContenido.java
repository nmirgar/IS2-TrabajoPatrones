/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package twitchupo;

import java.util.Date;
import java.util.Scanner;

public class FactoriaContenido {
    private static Twitch t = null;
    private static String titulo;
    private static Date fecha;

    public static void crearContenido(String tipoContenido, Streamer streamer) {
        t = Twitch.create(); // SINGLETON

        switch (tipoContenido) {
            case "Directo" -> {

                Scanner sc = new Scanner(System.in);
                System.out.println("Título del directo");
                titulo = sc.nextLine();
                fecha = new Date();

                Directo d = new Directo(t.getDirectos().size(), titulo, fecha, streamer);

                t.hacerDirecto(d);
            }

            case "VOD" -> {
                Scanner sc = new Scanner(System.in);
                t.listarDirectos(streamer);
                System.out.println("Título el ID del directo");
                int id;
                id = sc.nextInt();

                // porque un VOD al final es un directo resubido
                Directo daux = t.getDirecto(id);
                titulo = daux.getTitulo();
                fecha = daux.getFecha();

                VOD vod = new VOD(t.getDirectos().size(), titulo, fecha, streamer);

                t.subirVOD(vod);
            }

            case "Clip" -> {
                Scanner sc = new Scanner(System.in);

                System.out.println("Título del Clip");
                titulo = sc.nextLine();

                fecha = new Date();

                int duracion;
                System.out.println("Seleccione la duracion");
                duracion = sc.nextInt();

                Clip c = new Clip(t.getDirectos().size(), titulo, fecha, duracion, streamer);

                t.hacerClip(c);
            }

        }
    }

}
