import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> vector;
        ArbolBinario arb = new ArbolBinario();

        OrdenarAsc oAsc = new OrdenarAsc();
        OrdenarDesc oDesc = new OrdenarDesc();
        imprimirPantalla i = new imprimirPantalla();

/*
 
Nodo n1 = new Nodo(15);
Nodo n3 = new Nodo(10);
Nodo n4 = new Nodo(5);
Nodo n5 = new Nodo(25);
Nodo n6 = new Nodo(14);
Nodo n2 = new Nodo(100);
*/
int n1 = 15;
int n3 = 10;
int n4 = 5;
int n5 = 25;
int n6 = 14;
int n2 = 100;
  
        arb.insertar(n1);
        arb.insertar(n3);
        arb.insertar(n4);
        arb.insertar(n5);
        arb.insertar(n6 );
        arb.insertar(n2);

      /* 
      oAsc.ejecutarNodo(arb);
      oDesc.ejecutarNodo(arb);
      */
      
        arb.getArbolBinario(oAsc);
        System.out.println("---------");
        arb.getArbolBinario(oDesc);
  


    }
}
