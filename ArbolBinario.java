import java.util.ArrayList;

public class ArbolBinario {
    Nodo inicial;        


    public ArbolBinario() {
        this.inicial =null;
    }

    
    public void insertar(int n) {
        if (this.inicial == null) {
            this.inicial = new Nodo(n);
        }else{
            this.inicial.insertar(n);
        }

        
    }

    public void getPreorden(AccionEj a){
        this.preorden(inicial, a);
    }


    public void preorden(Nodo n , AccionEj a){
        if (n == null) {
            return;
        }else{
            n.getPreorden(a ,n);
            
            

        }

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


 
    @Override
    public String toString() {

        return this.inicial.toString();

    }



 
 



}
