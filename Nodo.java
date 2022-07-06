import java.util.ArrayList;

/**
 * nodo
 */
public class Nodo {
    Comp valor;

    Nodo izq;
    Nodo der;

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public Nodo(int v) {
        this.valor = v;
        this.izq = null;
        this.der = null;

    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public void insertar(Comparable n) {
        // verificamos que no sea igual
        if (this.getValor().compareTo(n) < 0) {
            // verificamos si va a la izq

                if (this.getIzq() == null) {
                    // creamos
                    this.izq = new Nodo(n);
                } else {
                    // insertamos
                    this.izq.insertar(n);
                }

          
                if (this.getDer() == null) {
                    // creamos
                    this.der = new Nodo(n);
                } else {
                    this.der.insertar(n);
                }
            

        }

    }

    /*
      public void insertar(Comparable n) {
      //verificamos que no sea igual
        if ( this.getValor().compareto(n) <0 {
        //verificamos si va a la izq
        
        if (this.getIzq() == null) {
        //creamos
        this.izq = new Nodo(n);
        } else{
        //insertamos
        this.izq.insertar(n);
        }
        
        }else{
        if (der == null) {
        //creamos
        this.der = new Nodo(n);
        }else{
        this.der.insertar(n);
        }
        }
        
        }
        
    
    
      
      
     */

     public void recorro(Accion a){
         
     }




     /*
      
     public void recorroImprimir(AccionEj a, ArrayList<Object> s) {
         
        s.add(getValor());
        a.ejecutarNodo(getValor());
        recorrerNodo(a, getIzq(), s);
        recorrerNodo(a, getDer(), s);
        
    }
    
    @Override
    public String toString() {
        
        return String.valueOf(this.getValor());
        
    }
    
    public void recorrerNodo(AccionEj a, Nodo n, ArrayList<Object> s) {

        if (n == null) {
            return;
        } else {
            
            n.recorroImprimir(a, s);

        }
    }
    
    */
}