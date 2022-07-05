import java.util.ArrayList;

/**
 * nodo
 */
public class Nodo {
    int valor;
  


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


    public Nodo(int v){
        this.valor = v ;
        this.izq=null;
        this.der =null;

    }
    public int getValor() {
        return valor;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }

    public void insertar(int n) {
        //verificamos que no sea igual
        if ( this.getValor() !=  n) {
            //verificamos si va a la izq
            
            if (valor > n ) {
                if (this.getIzq() == null) {
                    //creamos
                    this.izq = new Nodo(n);
                }    else{
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
        
    }




    public void recorroImprimir(AccionEj a){
        
        
        a.ejecutarNodo(getValor());
        getPreorden(a, getIzq());
        getPreorden(a, getDer());
    
      
    }


   



    @Override
    public String toString() {

        return String.valueOf(this.getValor());

    }


    public void getPreorden(AccionEj a, Nodo n) {
    
        if (n == null) {
            return;
        }else{

            n.recorroImprimir(a );
         

        }
    }  
  


    
  


  


  

  
    
}