import java.util.ArrayList;
import java.util.Collections;

public class OrdenarAsc implements AccionEj {

    @Override
    public void ejecutarNodo(ArbolBinario nodo) {
        
        ArrayList<Object> salida = new ArrayList<>();

        //alida.addAll(nodo.getNumsOrd());

        nodo.getPreordenOrdenado(salida);    
        System.out.println(salida);


    }
    
}
