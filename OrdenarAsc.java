import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OrdenarAsc implements AccionEj {

    @Override
    public void ejecutarNodo(Object nodo) {
        
        ArrayList<Object> salida = new ArrayList<>();

        salida.add(nodo);

        System.out.println(salida);


    }
    
}
