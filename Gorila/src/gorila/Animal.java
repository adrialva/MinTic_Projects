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
public class Animal {
    protected double peso;
    protected double altura;
    protected Alimento alimsIngeridos[];

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setAlimsIngeridos(Alimento alimsIngeridos[]){
        this.alimsIngeridos = alimsIngeridos;
    }

    public Alimento[] getAlimsIngeridos(){
        return this.alimsIngeridos;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getAltura(){
        return this.altura;
    }
    
    public double getIMC(){
        return this.peso/(this.altura*this.altura);
    }
}
