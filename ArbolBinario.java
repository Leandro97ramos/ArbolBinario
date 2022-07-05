import java.util.ArrayList;

public class ArbolBinario {
    //valor que va a tomar el arbol
    Nodo inicial;        


    public ArbolBinario() {
        //inicializo en null
        this.inicial =null;
    }

    
    //al insertar verifico que sea el primer numero
    public void insertar(int n) {
        if (this.inicial == null) {
            //creo mi nodo padre
            this.inicial = new Nodo(n);
        }else{
            //inserto valor en el arbol
            this.inicial.insertar(n);
        }

        
    }

    //obtengo el arbol el arbol
    public void getArbolBinario(AccionEj a){
        
        //ejecuto 
        this.recorrerArbol(inicial, a);


    }



    //recorro el arbol
    public void recorrerArbol(Nodo n , AccionEj a){
        //revisar este punto
        if (n == null) {
            return;
        }else{
            ArrayList<Object> salida = new ArrayList<>();
            //recorro el nodo
            n.recorrerNodo(a ,n,salida);
            
            //recorrer Arr y ejecutar Accion
            System.out.println(salida);


        }

    }


  


/*
 


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


*/

@Override
public String toString() {
    
    return this.inicial.toString();
    
}



 
 



}
