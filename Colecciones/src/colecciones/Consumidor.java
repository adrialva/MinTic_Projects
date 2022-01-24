/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author ADRIANA
 */
public class Consumidor {
    public void imprimir(){
        Productor pro= new Productor();
        List tempLista = pro.getListaCadenas();
        System.out.println("El tamaño es: "+ tempLista.size());
        
        for(int i =0; i< tempLista.size(); i++){
            String st = (String) tempLista.get(i);
            System.out.println(st);
        }
    }
    public static void main (String[] args){
        Consumidor con = new Consumidor(); //EJEMPLO CON ARRAYLIST
        con.imprimir();
        
        
        Colecciones colec = new Colecciones(); // EJEMPLO CON LINKEDLIST --> SON LO MISMO
        List tempLista2 = colec.getListaCadenas();
        System.out.println("El tamaño es: "+ tempLista2.size());
        
        for(int i =0; i< tempLista2.size(); i++){
            String st = (String) tempLista2.get(i);
            System.out.println(st);
        }
                
    }
}
