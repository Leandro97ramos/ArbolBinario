import java.util.ArrayList;
import java.util.Collections;

public class OrdenarDesc implements AccionEj  {
    

    public void ejecutarNodo(Object nodo) {
        

        ArrayList<Object> salida = new ArrayList<>();



        salida.add(nodo);
        
        Collections.reverse(salida);
       

        System.out.println(salida);


    }
    
}


