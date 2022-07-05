import java.util.ArrayList;

public class ArbolBinario extends Comp{
    Nodo inicial;        


    public ArbolBinario() {
        this.inicial =null;
    }

    
    public void insertar(Nodo n) {
        if (this.inicial == null) {
            this.inicial = new Nodo(n.getValor());
        }else{
            this.inicial.insertar(n);
        }

        
    }

    public void getPreorden(){
        this.preorden(inicial);
    }

    public void preorden(Nodo n){
        if (n == null) {
            return;
        }else{
            mostrarArbolPreorden(n);
        }

    }


    
    public void mostrarArbolPreorden(Nodo n) {
        System.out.println(n.getValor());
        preorden(n.getIzq());
        preorden(n.getDer());
        
    }


    @Override
    public String toString() {

        return this.getNumsOrd().toString();

    }



 



    
    public void getPreordenOrdenado(ArrayList<Object> salida){
        this.preordenOrdenado(this.inicial , salida);
    }


    public void preordenOrdenado(Nodo n , ArrayList<Object> s){
        if (n == null) {
            return;
        }else{
            mostrarArbolPreorden(n , s);
        }

    }


    
    public void mostrarArbolPreorden(Nodo n, ArrayList<Object> s) {
        s.add(n.getValor());
        preordenOrdenado(n.getIzq(), s);
        preordenOrdenado(n.getDer(), s);
        
    }


 /**
  * 
  * @param Nodo
  * @return Arrlist nodo
 */
    public ArrayList<Integer> getNumsOrd() {
        ArrayList<Integer> salida = new ArrayList<>();

       // getPreordenOrdenado(salida);

        return salida;
    }



public int compareTo(Nodo o) {
    return this.inicial.compareTo(o) ;
}




 



}
