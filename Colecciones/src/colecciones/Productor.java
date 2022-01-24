
package colecciones;
import java.util.List; // INTERFACE 
import java.util.ArrayList; // IMPLEMENTACION DE LIST
import java.util.LinkedList; //IMPLEMENTACION DE LIST

//MUESTRAN LO MISMO EN LA TERMINAL PERO INTERNAMENTE FUNCIONAN DIFERENTE --> SUS DIFERENCIAS SON:
//ENTRE ARRAYLIST(VECTORES) Y LINKENDLIST(NODOS)--> TIENEN LAS MISMAS FUNCIONALIDADES PORQUE IMPLEMENTARON
//LA MISMA INTERFACE QUE ES LIST --> LIST ES IUNA VARIAVLE POLIMORFICA!! ES MUCHO MEJOR
// MUESTRAN LO MISMO EN LA TERMINAL PERO INTERNAMENTE FUNCIONAN DIFERENTE
public class Productor {
    public List getListaCadenas(){
        List lista =  new ArrayList();
        lista.add("Elemento Uno");
        lista.add("Elemento Dos");
        lista.add("Elemento Tres");
        return lista;
    }
}
