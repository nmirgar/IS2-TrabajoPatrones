/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import twitchupo.Twitch;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class FactoriaContenido {

    public static void crearContenido(String tipoContenido, String userNickname) {
        Twitch t = Twitch.create(); //SINGLETON

        String titulo;
        Date fecha;

        Scanner sc = new Scanner(System.in);

        switch (tipoContenido) {
            case "Directo":
                System.out.println("Título del directo");
                titulo = sc.nextLine();
                fecha = new Date();

                Directo d = new Directo(t.getDirectos().size(), titulo, fecha, userNickname);

                t.añadirDirecto(d);

                break;

            case "VOD":
                t.listarDirectos(userNickname);
                System.out.println("Título el ID del directo");
                int id;
                id = sc.nextInt();

                //porque un VOD al final es un directo resubido
                Directo daux = t.getDirecto(id);
                titulo = daux.getTitulo();
                fecha = daux.getFecha();

                VOD vod = new VOD(t.getDirectos().size(), titulo, fecha, userNickname);

                t.añadirVOD(vod);

                break;

            case "Clip":
                System.out.println("Título del Clip");
                titulo = sc.nextLine();

                fecha = new Date();

                int duracion;
                System.out.println("Seleccione la duracion");
                duracion = sc.nextInt();

                Clip c = new Clip(t.getDirectos().size(), titulo, fecha, userNickname, duracion);

                t.añadirClip(c);

                break;
        }

    }

}
