import java.util.HashMap;

//El banco solo puede ser accedido desde Twich y este mantendrá un registro de los saldos
//(posteriormenete veremos si de algo más) de todos los usuarios de Twich
//A su vez este tendrá la logica para actualizar todos sus atributos (de momento saldo)
class Banco {
     

    //Hasmap que relaciona al usuario con el saldo que tiene
    private static HashMap<Usuario, Double> saldos = new HashMap<>();

    public static void cobrarSuscriptor(Usuario usuario, double cobro){
        saldos.computeIfPresent(usuario,(key, val) -> val - cobro);
    }

    //con este método podríamos lo haríamos de forma manual
    public static void pagarStreamer(Usuario usuario, double cobro){

      
    }

    // El streamer o twich deberñia de tener una lista de suscriptores, así la recorremos y 
    // vamos pagando al streamer a la vez que se le retira el dinero a los suscriptores
    // la fachada (Twich) solo pueda acceder a este método
    public static void pagarStreamer(Usuario usuario){

    }
}
