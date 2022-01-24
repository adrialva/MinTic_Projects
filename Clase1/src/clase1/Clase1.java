/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;
import java.util.Scanner;
/**
 *
 * @author ADRIANA
 */
public class Clase1 {
    static int bono=500000;
    static int anio=23;
    public static double calcularPorcentajeBono(int anios,float bono) {
//resultado 150000
        double porcentaje=0;
        
        // tu código acá
        if (anios >= 10){
            porcentaje=0.30;    
        }
        else if(anios>=5 && anios<10){
            porcentaje=0.20;
        }
        else if(anios>=3 && anios<5){
            porcentaje=0.10;
        }
        else if(anios<3){ // se puede solo el else 
            porcentaje=0.05;
        }
        return porcentaje*bono;

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcularPorcentajeBono(anio,bono);
        float pi=3.14f;
        float pi1 =(float)3.14;
        double pi2 = 3.14;
        //Scanner entrada = new Scanner (System.in);
        String nombre;
        
        //System.out.println("Ingrese su nombre ");
        //nombre = entrada.next();
        //System.out.print(Math.pow(2, 2));
// TODO code application logic here
    }
    
}
