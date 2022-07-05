
/**
 * nodo
 */
public class Nodo extends Comp {
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

    public void insertar(Nodo n) {
        //verificamos que no sea igual
        if ( n.getValor() != this.valor) {
            //verificamos si va a la izq
            
            if (compareTo(n) > 0 ) {
                if (izq == null) {
                    //creamos
                    this.izq = new Nodo(n.getValor());
                }    else{
                    //insertamos
                    this.izq.insertar(n);
                }

            }else{
                if (der == null) {
                    //creamos
                    this.der = new Nodo(n.getValor());
                }else{
                    this.der.insertar(n);
                }
            }

        }
        
    }



    
    public void recorroImprimir(Nodo n){
        
        System.out.println(n.getValor());   
        recorroImprimir(n.getIzq());
        recorroImprimir(n.getDer());
    }


   


    @Override
    public int compareTo(Nodo o) {
        return this.valor - o.getValor();
    }


    @Override
    public String toString() {

        return String.valueOf(this.getValor());

    }  
  


    
  


  


  

  
    
}