import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Cine {
    private Queue <Pelicula> entradas;

    public Cine(){
        entradas =new LinkedList<Pelicula>();
    }

    public void encolar (Pelicula entrada) {//ENTRADA->Aux  que se le pasa por parametro al metodo .add
        entradas.add(entrada);
    }

    public Object desencolar()throws Exception {
        if (entradas.isEmpty()){
            throw new Exception("No hay elementos en la cola");
        }else {
            return entradas.poll();
        }

    }
    public int tamanio()throws Exception{

        if (!entradas.isEmpty()){
            entradas.peek().setEstado(true);
        }else{
            throw new Exception("No hay elementos que observar");
        }
        return 10;
    }
    public boolean esVacia(){
        if (entradas.isEmpty()){
            return true;
        }else {
            return false;
        }
    }






    //cree un método para listar los elementos que seran desplegados en una textArea.



    public String listapelicula(){
        String texto= "";
        for(Pelicula a:entradas) { //Es un for automatico, aux automaticamente se actualiza al primero//
            texto+=a.toString();
        }return texto;
    }
    public String impresionn(int entradas,int i){
        if(i==1){
            return "La pelicula Batman" + " tiene " + entradas +"disponibles";
        }
        if(i==2){
            return "La pelicula Xmen" + " tiene " + entradas +"disponibles";
        }
        if(i==3){
            return "La pelicula Mario" + " tiene " + entradas +"disponibles";
        }
        return "";
    }


}
