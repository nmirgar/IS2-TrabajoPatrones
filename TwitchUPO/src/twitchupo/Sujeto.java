package twitchupo;

public interface Sujeto {
    public void registrarObservador(Observador o);
    public void eliminarObservador(Observador o);
    public void notificarObservador(Contenido c);
}
