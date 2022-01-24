/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listparametrizadas;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author ADRIANA
 */
// PARAMETRIZADA <> pagina 42

public class ListParametrizadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> lista1 = new ArrayList<>();
        lista1.add("AA");
        lista1.add("BB");
        System.out.println(lista1);
        lista1.remove(0);
        System.out.println(lista1);
        lista1.size();
        List<String> lista2 = new LinkedList<>();
        lista2.add("CC");
        lista2.add("DD");
        System.out.println(lista2);
        lista2.remove(1);
        System.out.println(lista2);
        lista2.addAll(lista1);
        lista2.size();
        System.out.println(lista2);
        
    }
    
}
