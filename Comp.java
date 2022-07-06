import java.util.ArrayList;

public  class Comp implements Comparable<Object>{

    ArrayList<Object> obj = new ArrayList<>();
 

    public void addObject(Object o){

    }
    
    public abstract int compareTo(Object o){
        obj.compareTo(o);
    }

 
}
