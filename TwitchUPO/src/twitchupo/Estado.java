package twitchupo;

public interface Estado {

    public static final String CONECTADO = "conectado";
    public static final String DESCONECTADO ="desconectado";
    public  String conectarse();
    public  String desconectarse();
}