package twitchupo;

public class StreamerConectarse implements Estado{
    public  String conectarse(){
        return CONECTADO;
    }
    public  String desconectarse(){
        return null;
    }
}
