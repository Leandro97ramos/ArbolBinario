import java.util.ArrayList;
import java.util.Collections;

public class OrdenarDesc implements AccionEj  {
    

    @Override
    public void ejecutarNodo(ArbolBinario nodo) {
        
        ArrayList<Object> salida = new ArrayList<>();

        //alida.addAll(nodo.getNumsOrd());

        nodo.getPreordenOrdenado(salida);    
        Collections.reverse(salida);
        System.out.println(salida);


    }
    
}


