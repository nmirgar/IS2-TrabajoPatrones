import java.util.ArrayList;
import java.util.List;

public class Twich{

    public static Twich twich = null;
  

    private static final double SUSCRIPCION_PRIME = 0.0;
    private static final double SUSCRIPCION_TIER1 = 5.0;
    private static final double SUSCRIPCION_TIER2 = 10.0;
    private static final double SUSCRIPCION_TIER3 = 15.0;

    private List<Usuario> usuarios;
    private List<Stream> streams;

    

    //Patrón Singleton para que solo exista un Twich en la app
    private Twich(){
        usuarios = new ArrayList<Usuario>();
        streams = new ArrayList<Stream>();
      
    }

    public static Twich getInstance(){
        if(twich == null){
            twich = new Twich();
        }
        return twich;
    }

    //Patron Fachada para que este sea el que coordina las acciones que llevan los usuarios
    //Los métodos siguientes serán públicos y estos serán llamados desde el main.
    //La lógica de cobro estará en la clase de banco por tantos los que se definan en esta clase deberán 
    //de llamar a los de Banco según el tipo de pago/cobro


    //Segin el tipo de usuario cobraremos diferente, para ello al usar el patron estrategia estaremos heredando el 
    //tipo usuario y podremos determinar que tipo es con un método que devuelva el tipo en cada caso
    // OTRA FORMA
    //En la clase de Banco se aclara que es posible prescindir de este método si al pagar al streamer
    //ejecutamos los cobros a los suscriptores de manera automática
    public void retirarDinero(Usuario usuario){

        //Si el usuario es prime (sería de una clase heredada no se cobra nada)

        //Si el usuario es tier1
        Banco.cobrarSuscriptor(usuario, SUSCRIPCION_TIER1);
        // Si el usuario es tier2
        Banco.cobrarSuscriptor(usuario, SUSCRIPCION_TIER2);
        // Si el usuario es tier3
        Banco.cobrarSuscriptor(usuario, SUSCRIPCION_TIER3);

    }

    //En este caso el tipo de usuario deberia de ser streamer
    //no hemos definido el ususuario streamer así que dejamos así el método
    public void ingresarDinero(Usuario usuario){
        Banco.pagarStreamer(usuario, SUSCRIPCION_PRIME);
    }
}