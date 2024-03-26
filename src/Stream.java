public class Stream {

    Usuario u;
    Stream(Usuario u){
        this.u = u;
    }
    public void algo(){
        if(u != null)
            System.out.println("Algo");
        
    }
}
