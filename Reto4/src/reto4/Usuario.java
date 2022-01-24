package reto4;

import java.util.SortedSet;
import java.util.TreeSet;

public class Usuario{
    private SortedSet<String> telefonos;
    
    public Usuario(){
        telefonos = new TreeSet<>();
    }
    public void addTelefono(String telefono){
        telefonos.add(telefono);
    }
    public void mostrarTelefonos(){
        System.out.println(telefonos);
    }
}