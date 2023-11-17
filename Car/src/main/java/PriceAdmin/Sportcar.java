/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PriceAdmin;

/**
 *
 * @author osama
 */
public class Sportcar extends Car{
    private int modelyear;
     private int modelnumber;

public Sportcar(){
    
    
}

public Sportcar(int modelyear ){
    
    this.modelyear=modelyear;
}
public Sportcar(int modelyear ,  int modelnumber ){
    
    this(modelyear);
    this.modelnumber=modelnumber;
}

    @Override
    public double calcualtePrice(){
    
    return 2000*0.20+2000;
    
}

    @Override
 public void DescribeCar(){
     System.out.println("");
     
 }
    public boolean equals(Sportcar r){
        
        
        return e.getnumeng()== r.e.getnumeng() ;
    
        
    }





}

