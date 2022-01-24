/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gorila;

/**
 *
 * @author ADRIANA
 */
public class Gorila extends Animal{
    private double peso;
    private double altura;
    private double peso2= peso/1000; //gramos
    
    public Gorila(double peso, double altura){
        this.peso=peso; ///kilogramos
        this.altura=altura;
    }
    public double getIMC(){
        double imc=0;
        imc= peso / Math.pow(altura, altura);
        return imc;
    }
    public double getPesoAlims(){ //pasar a gramos 
        int  tam = alimsIngeridos.length;
        double suma = 0;
        
        //Realice la suma de los pesos de los alimentos almacenados en el vector
        for (int i = 0; i<tam; i++){
            
        }
        return Math.floor(suma);//no elimine esta operacion de parte entera
    }
    
    
}
