/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploreto4;

import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * @author ADRIANA
 */
public class Base {
    private SortedSet<String> direcciones;
    
    public Base(){
        direcciones= new TreeSet<>();
    }
    public void addDireccion(String direccion){
        direcciones.add(direccion);
    }
    public void mostrarDirecciones(){
        System.out.println(direcciones);
    }
}
