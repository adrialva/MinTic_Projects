/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafiguras;

/**
 *
 * @author ADRIANA
 */
public class Cuadrado implements IRectangulo{
    public int alto;
    public int ancho;
    
    @Override
    public int calArea(){
        int area;
        area=alto*alto;
        //System.out.println("calAreaCua"+area);
        return area;
    }
    @Override
    public void modAncho(int ancho){
        alto=ancho;
    }
    @Override
    public void modAlto(int alto){
        ancho=alto;
    }
    @Override
    public void imprimir(int area){
        System.out.println(area);
    }
}
