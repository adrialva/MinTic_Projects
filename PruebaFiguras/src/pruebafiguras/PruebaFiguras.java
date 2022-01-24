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
public class PruebaFiguras {

    /**
     * @param args the command line arguments
     */
    
    public void testArea(){
        Cuadrado c = new Cuadrado();
        c.modAlto(5);
        c.calArea();
        //assertEquals(16,c.calArea());
    }
    public static void main(String[] args) {
        IRectangulo r= new Rectangulo();
        Rectangulo rec = new Rectangulo();
        r.modAlto(5);
        r.modAncho(4);
        r.calArea();
        rec.imprimir(r.calArea());
        r=new Cuadrado();
        r.modAncho(4);
        r.calArea();
        r.imprimir(r.calArea());
        //System.out.println(r.calArea());
        //assertEquals(16, r.calArea());
// TODO code application logic here
    }
    
}
