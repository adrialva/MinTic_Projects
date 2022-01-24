package democolecciones;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
/**
 *
 * @author ADRIANA
 */
public class DemoColecciones {

    public static void main(String[] args) {
        //PARAMETRIZADAS
        //List <String> ejemploObjetoListaLink = new LinkedList<>();
        List ejemploObjetoListaLink = new LinkedList();
        ejemploObjetoListaLink.add("elemento1");
        ejemploObjetoListaLink.add("elemento2");
        ejemploObjetoListaLink.add("elemento3");
        ejemploObjetoListaLink.add("elemento3");
        System.out.println("Lista linked list");
        mostrar_elementos(ejemploObjetoListaLink);
        System.out.println(ejemploObjetoListaLink);//con formato
        
        //PARAMETRIZADAS
        //List <String> ejemploObejetoListaArray = new ArrayList<>();
        List ejemploObejetoListaArray = new ArrayList();
        ejemploObejetoListaArray.add("elemento1");
        ejemploObejetoListaArray.add("elemento2");
        ejemploObejetoListaArray.add("elemento3");
        ejemploObejetoListaArray.add("elemento3");
        System.out.println("Lista array list");
        mostrar_elementos(ejemploObejetoListaArray);
        System.out.println(ejemploObejetoListaArray);
        
        //PARAMETRIZADAS
        //Set <String> ejemploObjetoConjuntoHashSet = new HashSet<>();
        Set ejemploObjetoConjuntoHashSet = new HashSet();
        ejemploObjetoConjuntoHashSet.add("elemento1");
        ejemploObjetoConjuntoHashSet.add("elemento3");
        ejemploObjetoConjuntoHashSet.add("elemento2");
        ejemploObjetoConjuntoHashSet.add("elemento2");
        System.out.println("Conjunto tipo hash");
        mostrar_elementos(ejemploObjetoConjuntoHashSet);
        System.out.println(ejemploObjetoConjuntoHashSet);
        
        //PARAMETRIZADAS
        //SortedSet <String> ejemploObjetoConjuntoTreeSet = new TreeSet<>();
        SortedSet ejemploObjetoConjuntoTreeSet = new TreeSet();
        ejemploObjetoConjuntoTreeSet.add("elemento1");
        ejemploObjetoConjuntoTreeSet.add("elemento3");
        ejemploObjetoConjuntoTreeSet.add("elemento2");
        ejemploObjetoConjuntoTreeSet.add("elemento2");
        System.out.println("Conjunto tipo tree");
        mostrar_elementos(ejemploObjetoConjuntoTreeSet);
        System.out.println(ejemploObjetoConjuntoTreeSet);

        //PARAMETRIZADAS
        //Map<String, String>ejemploObjetoMapaHash = new HashMap<>();
        Map ejemploObjetoMapaHash = new HashMap();
        ejemploObjetoMapaHash.put("clave1", "valor1");
        ejemploObjetoMapaHash.put("clave2", "valor2");
        ejemploObjetoMapaHash.put("clave3", "valor3");
        ejemploObjetoMapaHash.put("clave3", "valor3");
        System.out.println("Mapa tipo hash");
        mostrar_elementos(ejemploObjetoMapaHash.keySet());
        System.out.println(ejemploObjetoMapaHash.keySet());
        mostrar_elementos(ejemploObjetoMapaHash.values());
        System.out.println(ejemploObjetoMapaHash.values());
        
        //PARAMETRIZADAS
        //SortedMap<String, String>ejemploObjetoMapaTree = new TreeMap<>();
        SortedMap ejemploObjetoMapaTree = new TreeMap();
        ejemploObjetoMapaTree.put("clave1", "valor1");
        ejemploObjetoMapaTree.put("clave2", "valor2");
        ejemploObjetoMapaTree.put("clave3", "valor3");
        ejemploObjetoMapaTree.put("clave3", "valor3");
        System.out.println("Mapa tipo hash");
        mostrar_elementos(ejemploObjetoMapaTree.keySet());
        System.out.println(ejemploObjetoMapaTree.keySet());
        mostrar_elementos(ejemploObjetoMapaTree.values());
        System.out.println(ejemploObjetoMapaTree.values());
        }
    public static void mostrar_elementos(Collection coll) {
        Iterator iter = coll.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
